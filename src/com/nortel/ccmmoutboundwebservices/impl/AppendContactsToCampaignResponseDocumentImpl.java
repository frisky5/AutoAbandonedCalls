/*
 * An XML document type.
 * Localname: AppendContactsToCampaignResponse
 * Namespace: http://nortel.com/CCMMOutboundWebservices/
 * Java type: com.nortel.ccmmoutboundwebservices.AppendContactsToCampaignResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.nortel.ccmmoutboundwebservices.impl;
/**
 * A document containing one AppendContactsToCampaignResponse(@http://nortel.com/CCMMOutboundWebservices/) element.
 *
 * This is a complex type.
 */
public class AppendContactsToCampaignResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.ccmmoutboundwebservices.AppendContactsToCampaignResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public AppendContactsToCampaignResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPENDCONTACTSTOCAMPAIGNRESPONSE$0 = 
        new javax.xml.namespace.QName("http://nortel.com/CCMMOutboundWebservices/", "AppendContactsToCampaignResponse");
    
    
    /**
     * Gets the "AppendContactsToCampaignResponse" element
     */
    public com.nortel.ccmmoutboundwebservices.AppendContactsToCampaignResponseDocument.AppendContactsToCampaignResponse getAppendContactsToCampaignResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.ccmmoutboundwebservices.AppendContactsToCampaignResponseDocument.AppendContactsToCampaignResponse target = null;
            target = (com.nortel.ccmmoutboundwebservices.AppendContactsToCampaignResponseDocument.AppendContactsToCampaignResponse)get_store().find_element_user(APPENDCONTACTSTOCAMPAIGNRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AppendContactsToCampaignResponse" element
     */
    public void setAppendContactsToCampaignResponse(com.nortel.ccmmoutboundwebservices.AppendContactsToCampaignResponseDocument.AppendContactsToCampaignResponse appendContactsToCampaignResponse)
    {
        generatedSetterHelperImpl(appendContactsToCampaignResponse, APPENDCONTACTSTOCAMPAIGNRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AppendContactsToCampaignResponse" element
     */
    public com.nortel.ccmmoutboundwebservices.AppendContactsToCampaignResponseDocument.AppendContactsToCampaignResponse addNewAppendContactsToCampaignResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.ccmmoutboundwebservices.AppendContactsToCampaignResponseDocument.AppendContactsToCampaignResponse target = null;
            target = (com.nortel.ccmmoutboundwebservices.AppendContactsToCampaignResponseDocument.AppendContactsToCampaignResponse)get_store().add_element_user(APPENDCONTACTSTOCAMPAIGNRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML AppendContactsToCampaignResponse(@http://nortel.com/CCMMOutboundWebservices/).
     *
     * This is a complex type.
     */
    public static class AppendContactsToCampaignResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.ccmmoutboundwebservices.AppendContactsToCampaignResponseDocument.AppendContactsToCampaignResponse
    {
        private static final long serialVersionUID = 1L;
        
        public AppendContactsToCampaignResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName APPENDCONTACTSTOCAMPAIGNRESULT$0 = 
            new javax.xml.namespace.QName("http://nortel.com/CCMMOutboundWebservices/", "AppendContactsToCampaignResult");
        
        
        /**
         * Gets the "AppendContactsToCampaignResult" element
         */
        public int getAppendContactsToCampaignResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPENDCONTACTSTOCAMPAIGNRESULT$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "AppendContactsToCampaignResult" element
         */
        public org.apache.xmlbeans.XmlInt xgetAppendContactsToCampaignResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(APPENDCONTACTSTOCAMPAIGNRESULT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "AppendContactsToCampaignResult" element
         */
        public void setAppendContactsToCampaignResult(int appendContactsToCampaignResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPENDCONTACTSTOCAMPAIGNRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APPENDCONTACTSTOCAMPAIGNRESULT$0);
                }
                target.setIntValue(appendContactsToCampaignResult);
            }
        }
        
        /**
         * Sets (as xml) the "AppendContactsToCampaignResult" element
         */
        public void xsetAppendContactsToCampaignResult(org.apache.xmlbeans.XmlInt appendContactsToCampaignResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(APPENDCONTACTSTOCAMPAIGNRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(APPENDCONTACTSTOCAMPAIGNRESULT$0);
                }
                target.set(appendContactsToCampaignResult);
            }
        }
    }
}
