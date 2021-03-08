/**
 * OutboundUtilityWSCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package OutboundUtilityWS;


/**
 *  OutboundUtilityWSCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class OutboundUtilityWSCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public OutboundUtilityWSCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public OutboundUtilityWSCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for outboundLogin method
     * override this method for handling normal response from outboundLogin operation
     */
    public void receiveResultoutboundLogin(
        com.nortel.ccmmoutboundwebservices.OutboundLoginResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from outboundLogin operation
     */
    public void receiveErroroutboundLogin(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for outboundLogoff method
     * override this method for handling normal response from outboundLogoff operation
     */
    public void receiveResultoutboundLogoff(
        com.nortel.ccmmoutboundwebservices.OutboundLogoffResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from outboundLogoff operation
     */
    public void receiveErroroutboundLogoff(java.lang.Exception e) {
    }
}
