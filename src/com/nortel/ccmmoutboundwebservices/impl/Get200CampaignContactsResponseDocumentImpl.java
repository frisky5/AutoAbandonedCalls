/*
 * An XML document type.
 * Localname: Get200CampaignContactsResponse
 * Namespace: http://nortel.com/CCMMOutboundWebservices/
 * Java type: com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.nortel.ccmmoutboundwebservices.impl;
/**
 * A document containing one Get200CampaignContactsResponse(@http://nortel.com/CCMMOutboundWebservices/) element.
 *
 * This is a complex type.
 */
public class Get200CampaignContactsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public Get200CampaignContactsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GET200CAMPAIGNCONTACTSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://nortel.com/CCMMOutboundWebservices/", "Get200CampaignContactsResponse");
    
    
    /**
     * Gets the "Get200CampaignContactsResponse" element
     */
    public com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument.Get200CampaignContactsResponse getGet200CampaignContactsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument.Get200CampaignContactsResponse target = null;
            target = (com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument.Get200CampaignContactsResponse)get_store().find_element_user(GET200CAMPAIGNCONTACTSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Get200CampaignContactsResponse" element
     */
    public void setGet200CampaignContactsResponse(com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument.Get200CampaignContactsResponse get200CampaignContactsResponse)
    {
        generatedSetterHelperImpl(get200CampaignContactsResponse, GET200CAMPAIGNCONTACTSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Get200CampaignContactsResponse" element
     */
    public com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument.Get200CampaignContactsResponse addNewGet200CampaignContactsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument.Get200CampaignContactsResponse target = null;
            target = (com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument.Get200CampaignContactsResponse)get_store().add_element_user(GET200CAMPAIGNCONTACTSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML Get200CampaignContactsResponse(@http://nortel.com/CCMMOutboundWebservices/).
     *
     * This is a complex type.
     */
    public static class Get200CampaignContactsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument.Get200CampaignContactsResponse
    {
        private static final long serialVersionUID = 1L;
        
        public Get200CampaignContactsResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GET200CAMPAIGNCONTACTSRESULT$0 = 
            new javax.xml.namespace.QName("http://nortel.com/CCMMOutboundWebservices/", "Get200CampaignContactsResult");
        
        
        /**
         * Gets the "Get200CampaignContactsResult" element
         */
        public com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContacts getGet200CampaignContactsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContacts target = null;
                target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContacts)get_store().find_element_user(GET200CAMPAIGNCONTACTSRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Get200CampaignContactsResult" element
         */
        public boolean isSetGet200CampaignContactsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GET200CAMPAIGNCONTACTSRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "Get200CampaignContactsResult" element
         */
        public void setGet200CampaignContactsResult(com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContacts get200CampaignContactsResult)
        {
            generatedSetterHelperImpl(get200CampaignContactsResult, GET200CAMPAIGNCONTACTSRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Get200CampaignContactsResult" element
         */
        public com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContacts addNewGet200CampaignContactsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContacts target = null;
                target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContacts)get_store().add_element_user(GET200CAMPAIGNCONTACTSRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "Get200CampaignContactsResult" element
         */
        public void unsetGet200CampaignContactsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GET200CAMPAIGNCONTACTSRESULT$0, 0);
            }
        }
    }
}
