import java.rmi.RemoteException;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import OutboundCampaignWS.OutboundCampaignWSStub;
import OutboundUtilityWS.OutboundUtilityWSStub;
import com.intersys.jdbc.*;
import com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact;
import com.nortel.applications.ccmm.outboundwebservices.datatypes.OWPhoneNumber;
import com.nortel.applications.ccmm.outboundwebservices.datatypes.impl.OWContactImpl;
import com.nortel.applications.ccmm.outboundwebservices.datatypes.impl.OWPhoneNumberImpl;
import com.nortel.ccmmoutboundwebservices.*;
import com.nortel.ccmmoutboundwebservices.impl.OutboundLoginDocumentImpl;
import org.apache.axis2.AxisFault;

public class Entry {

    public static void main(String... args) {
        String separator = "========================================================================================";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String accsIp = args[0];
        String dbUsername = args[1];
        String dbPassword = args[2];
        String dbName = args[3];
        System.out.println(separator);
        System.out.println(dtf.format(LocalDateTime.now()) + " : " + "Connecting to ACCS Database : ");

        String url = "jdbc:Cache://" + accsIp + ":1972/" + dbName;
        final String query = "SELECT DISTINCT Originator from dbo.eCSRStat WHERE FinalDisposition = 'AB' AND FinalDispositionStamp > DATEADD('day', -1, CURRENT_DATE) AND Originator NOT IN( SELECT Originator FROM dbo.eCSRStat WHERE FinalDisposition != 'AB' AND FinalDispositionStamp > DATEADD('day', -1, CURRENT_DATE))";
        ArrayList<String> phoneNumbers = new ArrayList();

        try {
            CacheDataSource ds = new CacheDataSource();
            ds.setURL(url);
            ds.setUser(dbUsername);
            ds.setPassword(dbPassword);
            Connection dbConnection = ds.getConnection();
            Statement statement = dbConnection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            int counter = 0;
            System.out.println(dtf.format(LocalDateTime.now()) + " : " + "Abandoned Numbers List : ");
            while (rs.next()) {
                phoneNumbers.add(rs.getString(1));
                counter++;
                System.out.println("    " + dtf.format(LocalDateTime.now()) + " : " + "Phone Number " + counter + " : " + rs.getString(1));
            }
            rs.close();
            dbConnection.close();
        } catch (SQLException e) {
            System.out.println(dtf.format(LocalDateTime.now()) + " : " + "SQL Exception occurred, aborting");
            e.printStackTrace();
            System.out.println(separator);
            return;
        }

        System.out.println(separator);
        String loginToken;
        try {
            OutboundLoginDocument outboundLoginDocument = OutboundLoginDocument.Factory.newInstance();
            OutboundLoginDocument.OutboundLogin outboundLogin = OutboundLoginDocument.OutboundLogin.Factory.newInstance();
            outboundLogin.setUsername(args[4]);
            outboundLogin.setPassword(args[5]);
            outboundLoginDocument.setOutboundLogin(outboundLogin);
            System.out.println(dtf.format(LocalDateTime.now()) + " : " + "Getting Login token from ACCS CCMM");
            OutboundUtilityWSStub outboundUtilityWSStub = new OutboundUtilityWSStub();
            OutboundLoginResponseDocument outboundLoginResponseDocument = outboundUtilityWSStub.outboundLogin(outboundLoginDocument);
            loginToken = outboundLoginResponseDocument.getOutboundLoginResponse().getOutboundLoginResult();
            System.out.println(dtf.format(LocalDateTime.now()) + " : " + "Login Token : " + loginToken);

        } catch (AxisFault axisFault) {
            System.out.println(dtf.format(LocalDateTime.now()) + " : " + "Exception Getting login token");
            axisFault.printStackTrace();
            System.out.println(separator);
            return;
        } catch (RemoteException e) {
            System.out.println(dtf.format(LocalDateTime.now()) + " : " + "Exception Getting login token");
            e.printStackTrace();
            System.out.println(separator);
            return;
        }

        try {
            for (int looper = 0; looper < phoneNumbers.size(); looper++) {
                System.out.println(dtf.format(LocalDateTime.now()) + " : " + "Appending Phone Number : " + looper);

                AppendContactsToCampaignDocument appendContactsToCampaignDocument = AppendContactsToCampaignDocument.Factory.newInstance();
                AppendContactsToCampaignDocument.AppendContactsToCampaign appendContactsToCampaign = AppendContactsToCampaignDocument.AppendContactsToCampaign.Factory.newInstance();

                appendContactsToCampaign.setCampaignID(26);
                appendContactsToCampaign.setSessionKey(loginToken);
                appendContactsToCampaign.setPriority(1);

                OWContact owContact = OWContact.Factory.newInstance();
                //owContact.setContactID(8863 + looper);
                owContact.setSkillsetID(10032);
                owContact.setCampaignName("Automatic Abandoned Calls Dialer");

                OWPhoneNumber owPhoneNumber = OWPhoneNumber.Factory.newInstance();
                owPhoneNumber.setPhoneNo(phoneNumbers.get(looper));

                owContact.setPhoneNumber(owPhoneNumber);

                appendContactsToCampaign.setContact(owContact);
                appendContactsToCampaignDocument.setAppendContactsToCampaign(appendContactsToCampaign);
                OutboundCampaignWSStub outboundCampaignWSStub = new OutboundCampaignWSStub();
                AppendContactsToCampaignResponseDocument appendContactsToCampaignResponseDocument = outboundCampaignWSStub.appendContactsToCampaign(appendContactsToCampaignDocument);
                if (appendContactsToCampaignResponseDocument.getAppendContactsToCampaignResponse().getAppendContactsToCampaignResult() != 1) {
                    System.out.println(dtf.format(LocalDateTime.now()) + " : " + "ACCS Failed to add contact to campaign : " + appendContactsToCampaignResponseDocument.getAppendContactsToCampaignResponse().getAppendContactsToCampaignResult());
                }
                TimeUnit.SECONDS.sleep(2);
            }


        } catch (AxisFault axisFault) {
            System.out.println(dtf.format(LocalDateTime.now()) + " : " + "Exception Appending a contact, Aborting");
            axisFault.printStackTrace();
            System.out.println(separator);
        } catch (RemoteException e) {
            System.out.println(dtf.format(LocalDateTime.now()) + " : " + "Exception Appending a contact, Aborting");
            e.printStackTrace();
            System.out.println(separator);
        } catch (InterruptedException e) {
            System.out.println(dtf.format(LocalDateTime.now()) + " : " + "Exception Sleeping for 2 seconds, Aborting");
            e.printStackTrace();
            System.out.println(separator);
        }

        try {
            OutboundLogoffDocument outboundLogoffDocument = OutboundLogoffDocument.Factory.newInstance();
            OutboundLogoffDocument.OutboundLogoff outboundLogoff = OutboundLogoffDocument.OutboundLogoff.Factory.newInstance();
            outboundLogoff.setUsername(args[4]);

            outboundLogoffDocument.setOutboundLogoff(outboundLogoff);
            System.out.println(dtf.format(LocalDateTime.now()) + " : " + "Logging Off from ACCS CCMM");
            OutboundUtilityWSStub outboundUtilityWSStub = new OutboundUtilityWSStub();
            OutboundLogoffResponseDocument outboundLogoffResponseDocument = outboundUtilityWSStub.outboundLogoff(outboundLogoffDocument);
            outboundLogoffResponseDocument.getOutboundLogoffResponse();
            System.out.println(dtf.format(LocalDateTime.now()) + " : " + "Logged Off!");

        } catch (AxisFault axisFault) {
            System.out.println(dtf.format(LocalDateTime.now()) + " : " + "Exception while Logging Off");
            axisFault.printStackTrace();
            System.out.println(separator);
            return;
        } catch (RemoteException e) {
            System.out.println(dtf.format(LocalDateTime.now()) + " : " + "Exception while Logging Off");
            e.printStackTrace();
            System.out.println(separator);
            return;
        }

        System.out.println(separator);
        System.out.println(separator);
    }
}
