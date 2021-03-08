/*
 * An XML document type.
 * Localname: GetCampaigns
 * Namespace: http://nortel.com/CCMMOutboundWebservices/
 * Java type: com.nortel.ccmmoutboundwebservices.GetCampaignsDocument
 *
 * Automatically generated - do not modify.
 */
package com.nortel.ccmmoutboundwebservices.impl;
/**
 * A document containing one GetCampaigns(@http://nortel.com/CCMMOutboundWebservices/) element.
 *
 * This is a complex type.
 */
public class GetCampaignsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.ccmmoutboundwebservices.GetCampaignsDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetCampaignsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCAMPAIGNS$0 = 
        new javax.xml.namespace.QName("http://nortel.com/CCMMOutboundWebservices/", "GetCampaigns");
    
    
    /**
     * Gets the "GetCampaigns" element
     */
    public com.nortel.ccmmoutboundwebservices.GetCampaignsDocument.GetCampaigns getGetCampaigns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.ccmmoutboundwebservices.GetCampaignsDocument.GetCampaigns target = null;
            target = (com.nortel.ccmmoutboundwebservices.GetCampaignsDocument.GetCampaigns)get_store().find_element_user(GETCAMPAIGNS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetCampaigns" element
     */
    public void setGetCampaigns(com.nortel.ccmmoutboundwebservices.GetCampaignsDocument.GetCampaigns getCampaigns)
    {
        generatedSetterHelperImpl(getCampaigns, GETCAMPAIGNS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetCampaigns" element
     */
    public com.nortel.ccmmoutboundwebservices.GetCampaignsDocument.GetCampaigns addNewGetCampaigns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.ccmmoutboundwebservices.GetCampaignsDocument.GetCampaigns target = null;
            target = (com.nortel.ccmmoutboundwebservices.GetCampaignsDocument.GetCampaigns)get_store().add_element_user(GETCAMPAIGNS$0);
            return target;
        }
    }
    /**
     * An XML GetCampaigns(@http://nortel.com/CCMMOutboundWebservices/).
     *
     * This is a complex type.
     */
    public static class GetCampaignsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.ccmmoutboundwebservices.GetCampaignsDocument.GetCampaigns
    {
        private static final long serialVersionUID = 1L;
        
        public GetCampaignsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SESSIONKEY$0 = 
            new javax.xml.namespace.QName("http://nortel.com/CCMMOutboundWebservices/", "sessionKey");
        
        
        /**
         * Gets the "sessionKey" element
         */
        public java.lang.String getSessionKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SESSIONKEY$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "sessionKey" element
         */
        public org.apache.xmlbeans.XmlString xgetSessionKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SESSIONKEY$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "sessionKey" element
         */
        public boolean isSetSessionKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SESSIONKEY$0) != 0;
            }
        }
        
        /**
         * Sets the "sessionKey" element
         */
        public void setSessionKey(java.lang.String sessionKey)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SESSIONKEY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SESSIONKEY$0);
                }
                target.setStringValue(sessionKey);
            }
        }
        
        /**
         * Sets (as xml) the "sessionKey" element
         */
        public void xsetSessionKey(org.apache.xmlbeans.XmlString sessionKey)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SESSIONKEY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SESSIONKEY$0);
                }
                target.set(sessionKey);
            }
        }
        
        /**
         * Unsets the "sessionKey" element
         */
        public void unsetSessionKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SESSIONKEY$0, 0);
            }
        }
    }
}
