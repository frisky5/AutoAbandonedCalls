/*
 * An XML document type.
 * Localname: Get200CampaignContacts
 * Namespace: http://nortel.com/CCMMOutboundWebservices/
 * Java type: com.nortel.ccmmoutboundwebservices.Get200CampaignContactsDocument
 *
 * Automatically generated - do not modify.
 */
package com.nortel.ccmmoutboundwebservices.impl;
/**
 * A document containing one Get200CampaignContacts(@http://nortel.com/CCMMOutboundWebservices/) element.
 *
 * This is a complex type.
 */
public class Get200CampaignContactsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.ccmmoutboundwebservices.Get200CampaignContactsDocument
{
    private static final long serialVersionUID = 1L;
    
    public Get200CampaignContactsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GET200CAMPAIGNCONTACTS$0 = 
        new javax.xml.namespace.QName("http://nortel.com/CCMMOutboundWebservices/", "Get200CampaignContacts");
    
    
    /**
     * Gets the "Get200CampaignContacts" element
     */
    public com.nortel.ccmmoutboundwebservices.Get200CampaignContactsDocument.Get200CampaignContacts getGet200CampaignContacts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.ccmmoutboundwebservices.Get200CampaignContactsDocument.Get200CampaignContacts target = null;
            target = (com.nortel.ccmmoutboundwebservices.Get200CampaignContactsDocument.Get200CampaignContacts)get_store().find_element_user(GET200CAMPAIGNCONTACTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Get200CampaignContacts" element
     */
    public void setGet200CampaignContacts(com.nortel.ccmmoutboundwebservices.Get200CampaignContactsDocument.Get200CampaignContacts get200CampaignContacts)
    {
        generatedSetterHelperImpl(get200CampaignContacts, GET200CAMPAIGNCONTACTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Get200CampaignContacts" element
     */
    public com.nortel.ccmmoutboundwebservices.Get200CampaignContactsDocument.Get200CampaignContacts addNewGet200CampaignContacts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.ccmmoutboundwebservices.Get200CampaignContactsDocument.Get200CampaignContacts target = null;
            target = (com.nortel.ccmmoutboundwebservices.Get200CampaignContactsDocument.Get200CampaignContacts)get_store().add_element_user(GET200CAMPAIGNCONTACTS$0);
            return target;
        }
    }
    /**
     * An XML Get200CampaignContacts(@http://nortel.com/CCMMOutboundWebservices/).
     *
     * This is a complex type.
     */
    public static class Get200CampaignContactsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.ccmmoutboundwebservices.Get200CampaignContactsDocument.Get200CampaignContacts
    {
        private static final long serialVersionUID = 1L;
        
        public Get200CampaignContactsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CAMPAIGNID$0 = 
            new javax.xml.namespace.QName("http://nortel.com/CCMMOutboundWebservices/", "CampaignID");
        private static final javax.xml.namespace.QName LASTCONTACTID$2 = 
            new javax.xml.namespace.QName("http://nortel.com/CCMMOutboundWebservices/", "LastContactID");
        private static final javax.xml.namespace.QName SESSIONKEY$4 = 
            new javax.xml.namespace.QName("http://nortel.com/CCMMOutboundWebservices/", "sessionKey");
        
        
        /**
         * Gets the "CampaignID" element
         */
        public long getCampaignID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAMPAIGNID$0, 0);
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "CampaignID" element
         */
        public org.apache.xmlbeans.XmlLong xgetCampaignID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CAMPAIGNID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CampaignID" element
         */
        public void setCampaignID(long campaignID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAMPAIGNID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAMPAIGNID$0);
                }
                target.setLongValue(campaignID);
            }
        }
        
        /**
         * Sets (as xml) the "CampaignID" element
         */
        public void xsetCampaignID(org.apache.xmlbeans.XmlLong campaignID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CAMPAIGNID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(CAMPAIGNID$0);
                }
                target.set(campaignID);
            }
        }
        
        /**
         * Gets the "LastContactID" element
         */
        public long getLastContactID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTCONTACTID$2, 0);
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "LastContactID" element
         */
        public org.apache.xmlbeans.XmlLong xgetLastContactID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(LASTCONTACTID$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "LastContactID" element
         */
        public void setLastContactID(long lastContactID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTCONTACTID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTCONTACTID$2);
                }
                target.setLongValue(lastContactID);
            }
        }
        
        /**
         * Sets (as xml) the "LastContactID" element
         */
        public void xsetLastContactID(org.apache.xmlbeans.XmlLong lastContactID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(LASTCONTACTID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(LASTCONTACTID$2);
                }
                target.set(lastContactID);
            }
        }
        
        /**
         * Gets the "sessionKey" element
         */
        public java.lang.String getSessionKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SESSIONKEY$4, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SESSIONKEY$4, 0);
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
                return get_store().count_elements(SESSIONKEY$4) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SESSIONKEY$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SESSIONKEY$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SESSIONKEY$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SESSIONKEY$4);
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
                get_store().remove_element(SESSIONKEY$4, 0);
            }
        }
    }
}
