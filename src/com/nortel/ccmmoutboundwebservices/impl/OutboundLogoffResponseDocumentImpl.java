/*
 * An XML document type.
 * Localname: OutboundLogoffResponse
 * Namespace: http://nortel.com/CCMMOutboundWebservices/
 * Java type: com.nortel.ccmmoutboundwebservices.OutboundLogoffResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.nortel.ccmmoutboundwebservices.impl;
/**
 * A document containing one OutboundLogoffResponse(@http://nortel.com/CCMMOutboundWebservices/) element.
 *
 * This is a complex type.
 */
public class OutboundLogoffResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.ccmmoutboundwebservices.OutboundLogoffResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public OutboundLogoffResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OUTBOUNDLOGOFFRESPONSE$0 = 
        new javax.xml.namespace.QName("http://nortel.com/CCMMOutboundWebservices/", "OutboundLogoffResponse");
    
    
    /**
     * Gets the "OutboundLogoffResponse" element
     */
    public com.nortel.ccmmoutboundwebservices.OutboundLogoffResponseDocument.OutboundLogoffResponse getOutboundLogoffResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.ccmmoutboundwebservices.OutboundLogoffResponseDocument.OutboundLogoffResponse target = null;
            target = (com.nortel.ccmmoutboundwebservices.OutboundLogoffResponseDocument.OutboundLogoffResponse)get_store().find_element_user(OUTBOUNDLOGOFFRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OutboundLogoffResponse" element
     */
    public void setOutboundLogoffResponse(com.nortel.ccmmoutboundwebservices.OutboundLogoffResponseDocument.OutboundLogoffResponse outboundLogoffResponse)
    {
        generatedSetterHelperImpl(outboundLogoffResponse, OUTBOUNDLOGOFFRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OutboundLogoffResponse" element
     */
    public com.nortel.ccmmoutboundwebservices.OutboundLogoffResponseDocument.OutboundLogoffResponse addNewOutboundLogoffResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.ccmmoutboundwebservices.OutboundLogoffResponseDocument.OutboundLogoffResponse target = null;
            target = (com.nortel.ccmmoutboundwebservices.OutboundLogoffResponseDocument.OutboundLogoffResponse)get_store().add_element_user(OUTBOUNDLOGOFFRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML OutboundLogoffResponse(@http://nortel.com/CCMMOutboundWebservices/).
     *
     * This is a complex type.
     */
    public static class OutboundLogoffResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.ccmmoutboundwebservices.OutboundLogoffResponseDocument.OutboundLogoffResponse
    {
        private static final long serialVersionUID = 1L;
        
        public OutboundLogoffResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
