/*
 * An XML document type.
 * Localname: OutboundLoginResponse
 * Namespace: http://nortel.com/CCMMOutboundWebservices/
 * Java type: com.nortel.ccmmoutboundwebservices.OutboundLoginResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.nortel.ccmmoutboundwebservices.impl;
/**
 * A document containing one OutboundLoginResponse(@http://nortel.com/CCMMOutboundWebservices/) element.
 *
 * This is a complex type.
 */
public class OutboundLoginResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.ccmmoutboundwebservices.OutboundLoginResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public OutboundLoginResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OUTBOUNDLOGINRESPONSE$0 = 
        new javax.xml.namespace.QName("http://nortel.com/CCMMOutboundWebservices/", "OutboundLoginResponse");
    
    
    /**
     * Gets the "OutboundLoginResponse" element
     */
    public com.nortel.ccmmoutboundwebservices.OutboundLoginResponseDocument.OutboundLoginResponse getOutboundLoginResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.ccmmoutboundwebservices.OutboundLoginResponseDocument.OutboundLoginResponse target = null;
            target = (com.nortel.ccmmoutboundwebservices.OutboundLoginResponseDocument.OutboundLoginResponse)get_store().find_element_user(OUTBOUNDLOGINRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OutboundLoginResponse" element
     */
    public void setOutboundLoginResponse(com.nortel.ccmmoutboundwebservices.OutboundLoginResponseDocument.OutboundLoginResponse outboundLoginResponse)
    {
        generatedSetterHelperImpl(outboundLoginResponse, OUTBOUNDLOGINRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OutboundLoginResponse" element
     */
    public com.nortel.ccmmoutboundwebservices.OutboundLoginResponseDocument.OutboundLoginResponse addNewOutboundLoginResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.ccmmoutboundwebservices.OutboundLoginResponseDocument.OutboundLoginResponse target = null;
            target = (com.nortel.ccmmoutboundwebservices.OutboundLoginResponseDocument.OutboundLoginResponse)get_store().add_element_user(OUTBOUNDLOGINRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML OutboundLoginResponse(@http://nortel.com/CCMMOutboundWebservices/).
     *
     * This is a complex type.
     */
    public static class OutboundLoginResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.ccmmoutboundwebservices.OutboundLoginResponseDocument.OutboundLoginResponse
    {
        private static final long serialVersionUID = 1L;
        
        public OutboundLoginResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OUTBOUNDLOGINRESULT$0 = 
            new javax.xml.namespace.QName("http://nortel.com/CCMMOutboundWebservices/", "OutboundLoginResult");
        
        
        /**
         * Gets the "OutboundLoginResult" element
         */
        public java.lang.String getOutboundLoginResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTBOUNDLOGINRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OutboundLoginResult" element
         */
        public org.apache.xmlbeans.XmlString xgetOutboundLoginResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OUTBOUNDLOGINRESULT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "OutboundLoginResult" element
         */
        public boolean isSetOutboundLoginResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OUTBOUNDLOGINRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "OutboundLoginResult" element
         */
        public void setOutboundLoginResult(java.lang.String outboundLoginResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTBOUNDLOGINRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OUTBOUNDLOGINRESULT$0);
                }
                target.setStringValue(outboundLoginResult);
            }
        }
        
        /**
         * Sets (as xml) the "OutboundLoginResult" element
         */
        public void xsetOutboundLoginResult(org.apache.xmlbeans.XmlString outboundLoginResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OUTBOUNDLOGINRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OUTBOUNDLOGINRESULT$0);
                }
                target.set(outboundLoginResult);
            }
        }
        
        /**
         * Unsets the "OutboundLoginResult" element
         */
        public void unsetOutboundLoginResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OUTBOUNDLOGINRESULT$0, 0);
            }
        }
    }
}
