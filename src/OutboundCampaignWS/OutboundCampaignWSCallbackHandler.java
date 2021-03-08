/**
 * OutboundCampaignWSCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package OutboundCampaignWS;


/**
 *  OutboundCampaignWSCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class OutboundCampaignWSCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public OutboundCampaignWSCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public OutboundCampaignWSCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for get200CampaignContacts method
     * override this method for handling normal response from get200CampaignContacts operation
     */
    public void receiveResultget200CampaignContacts(
        com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from get200CampaignContacts operation
     */
    public void receiveErrorget200CampaignContacts(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getCampaigns method
     * override this method for handling normal response from getCampaigns operation
     */
    public void receiveResultgetCampaigns(
        com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getCampaigns operation
     */
    public void receiveErrorgetCampaigns(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for appendContactsToCampaign method
     * override this method for handling normal response from appendContactsToCampaign operation
     */
    public void receiveResultappendContactsToCampaign(
        com.nortel.ccmmoutboundwebservices.AppendContactsToCampaignResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from appendContactsToCampaign operation
     */
    public void receiveErrorappendContactsToCampaign(java.lang.Exception e) {
    }
}
