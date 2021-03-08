/*
 * An XML document type.
 * Localname: GetCampaignsResponse
 * Namespace: http://nortel.com/CCMMOutboundWebservices/
 * Java type: com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.nortel.ccmmoutboundwebservices.impl;
/**
 * A document containing one GetCampaignsResponse(@http://nortel.com/CCMMOutboundWebservices/) element.
 *
 * This is a complex type.
 */
public class GetCampaignsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetCampaignsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCAMPAIGNSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://nortel.com/CCMMOutboundWebservices/", "GetCampaignsResponse");
    
    
    /**
     * Gets the "GetCampaignsResponse" element
     */
    public com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument.GetCampaignsResponse getGetCampaignsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument.GetCampaignsResponse target = null;
            target = (com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument.GetCampaignsResponse)get_store().find_element_user(GETCAMPAIGNSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetCampaignsResponse" element
     */
    public void setGetCampaignsResponse(com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument.GetCampaignsResponse getCampaignsResponse)
    {
        generatedSetterHelperImpl(getCampaignsResponse, GETCAMPAIGNSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetCampaignsResponse" element
     */
    public com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument.GetCampaignsResponse addNewGetCampaignsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument.GetCampaignsResponse target = null;
            target = (com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument.GetCampaignsResponse)get_store().add_element_user(GETCAMPAIGNSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetCampaignsResponse(@http://nortel.com/CCMMOutboundWebservices/).
     *
     * This is a complex type.
     */
    public static class GetCampaignsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument.GetCampaignsResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetCampaignsResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETCAMPAIGNSRESULT$0 = 
            new javax.xml.namespace.QName("http://nortel.com/CCMMOutboundWebservices/", "GetCampaignsResult");
        
        
        /**
         * Gets the "GetCampaignsResult" element
         */
        public com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaigns getGetCampaignsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaigns target = null;
                target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaigns)get_store().find_element_user(GETCAMPAIGNSRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "GetCampaignsResult" element
         */
        public boolean isSetGetCampaignsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETCAMPAIGNSRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetCampaignsResult" element
         */
        public void setGetCampaignsResult(com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaigns getCampaignsResult)
        {
            generatedSetterHelperImpl(getCampaignsResult, GETCAMPAIGNSRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetCampaignsResult" element
         */
        public com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaigns addNewGetCampaignsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaigns target = null;
                target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaigns)get_store().add_element_user(GETCAMPAIGNSRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "GetCampaignsResult" element
         */
        public void unsetGetCampaignsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETCAMPAIGNSRESULT$0, 0);
            }
        }
    }
}
