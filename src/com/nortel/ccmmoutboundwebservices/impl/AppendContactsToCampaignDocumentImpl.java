/*
 * An XML document type.
 * Localname: AppendContactsToCampaign
 * Namespace: http://nortel.com/CCMMOutboundWebservices/
 * Java type: com.nortel.ccmmoutboundwebservices.AppendContactsToCampaignDocument
 *
 * Automatically generated - do not modify.
 */
package com.nortel.ccmmoutboundwebservices.impl;
/**
 * A document containing one AppendContactsToCampaign(@http://nortel.com/CCMMOutboundWebservices/) element.
 *
 * This is a complex type.
 */
public class AppendContactsToCampaignDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.ccmmoutboundwebservices.AppendContactsToCampaignDocument
{
    private static final long serialVersionUID = 1L;
    
    public AppendContactsToCampaignDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPENDCONTACTSTOCAMPAIGN$0 = 
        new javax.xml.namespace.QName("http://nortel.com/CCMMOutboundWebservices/", "AppendContactsToCampaign");
    
    
    /**
     * Gets the "AppendContactsToCampaign" element
     */
    public com.nortel.ccmmoutboundwebservices.AppendContactsToCampaignDocument.AppendContactsToCampaign getAppendContactsToCampaign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.ccmmoutboundwebservices.AppendContactsToCampaignDocument.AppendContactsToCampaign target = null;
            target = (com.nortel.ccmmoutboundwebservices.AppendContactsToCampaignDocument.AppendContactsToCampaign)get_store().find_element_user(APPENDCONTACTSTOCAMPAIGN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AppendContactsToCampaign" element
     */
    public void setAppendContactsToCampaign(com.nortel.ccmmoutboundwebservices.AppendContactsToCampaignDocument.AppendContactsToCampaign appendContactsToCampaign)
    {
        generatedSetterHelperImpl(appendContactsToCampaign, APPENDCONTACTSTOCAMPAIGN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AppendContactsToCampaign" element
     */
    public com.nortel.ccmmoutboundwebservices.AppendContactsToCampaignDocument.AppendContactsToCampaign addNewAppendContactsToCampaign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.ccmmoutboundwebservices.AppendContactsToCampaignDocument.AppendContactsToCampaign target = null;
            target = (com.nortel.ccmmoutboundwebservices.AppendContactsToCampaignDocument.AppendContactsToCampaign)get_store().add_element_user(APPENDCONTACTSTOCAMPAIGN$0);
            return target;
        }
    }
    /**
     * An XML AppendContactsToCampaign(@http://nortel.com/CCMMOutboundWebservices/).
     *
     * This is a complex type.
     */
    public static class AppendContactsToCampaignImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.ccmmoutboundwebservices.AppendContactsToCampaignDocument.AppendContactsToCampaign
    {
        private static final long serialVersionUID = 1L;
        
        public AppendContactsToCampaignImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CAMPAIGNID$0 = 
            new javax.xml.namespace.QName("http://nortel.com/CCMMOutboundWebservices/", "CampaignID");
        private static final javax.xml.namespace.QName CONTACT$2 = 
            new javax.xml.namespace.QName("http://nortel.com/CCMMOutboundWebservices/", "contact");
        private static final javax.xml.namespace.QName SESSIONKEY$4 = 
            new javax.xml.namespace.QName("http://nortel.com/CCMMOutboundWebservices/", "sessionKey");
        private static final javax.xml.namespace.QName PRIORITY$6 = 
            new javax.xml.namespace.QName("http://nortel.com/CCMMOutboundWebservices/", "priority");
        
        
        /**
         * Gets the "CampaignID" element
         */
        public int getCampaignID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAMPAIGNID$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "CampaignID" element
         */
        public org.apache.xmlbeans.XmlInt xgetCampaignID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CAMPAIGNID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CampaignID" element
         */
        public void setCampaignID(int campaignID)
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
                target.setIntValue(campaignID);
            }
        }
        
        /**
         * Sets (as xml) the "CampaignID" element
         */
        public void xsetCampaignID(org.apache.xmlbeans.XmlInt campaignID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CAMPAIGNID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CAMPAIGNID$0);
                }
                target.set(campaignID);
            }
        }
        
        /**
         * Gets the "contact" element
         */
        public com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact getContact()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact target = null;
                target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact)get_store().find_element_user(CONTACT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "contact" element
         */
        public boolean isSetContact()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTACT$2) != 0;
            }
        }
        
        /**
         * Sets the "contact" element
         */
        public void setContact(com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact contact)
        {
            generatedSetterHelperImpl(contact, CONTACT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "contact" element
         */
        public com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact addNewContact()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact target = null;
                target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact)get_store().add_element_user(CONTACT$2);
                return target;
            }
        }
        
        /**
         * Unsets the "contact" element
         */
        public void unsetContact()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTACT$2, 0);
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
        
        /**
         * Gets the "priority" element
         */
        public int getPriority()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIORITY$6, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "priority" element
         */
        public org.apache.xmlbeans.XmlInt xgetPriority()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PRIORITY$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "priority" element
         */
        public void setPriority(int priority)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIORITY$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIORITY$6);
                }
                target.setIntValue(priority);
            }
        }
        
        /**
         * Sets (as xml) the "priority" element
         */
        public void xsetPriority(org.apache.xmlbeans.XmlInt priority)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PRIORITY$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PRIORITY$6);
                }
                target.set(priority);
            }
        }
    }
}
