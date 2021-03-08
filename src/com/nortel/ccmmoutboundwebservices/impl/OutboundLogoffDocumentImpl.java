/*
 * An XML document type.
 * Localname: OutboundLogoff
 * Namespace: http://nortel.com/CCMMOutboundWebservices/
 * Java type: com.nortel.ccmmoutboundwebservices.OutboundLogoffDocument
 *
 * Automatically generated - do not modify.
 */
package com.nortel.ccmmoutboundwebservices.impl;
/**
 * A document containing one OutboundLogoff(@http://nortel.com/CCMMOutboundWebservices/) element.
 *
 * This is a complex type.
 */
public class OutboundLogoffDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.ccmmoutboundwebservices.OutboundLogoffDocument
{
    private static final long serialVersionUID = 1L;
    
    public OutboundLogoffDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OUTBOUNDLOGOFF$0 = 
        new javax.xml.namespace.QName("http://nortel.com/CCMMOutboundWebservices/", "OutboundLogoff");
    
    
    /**
     * Gets the "OutboundLogoff" element
     */
    public com.nortel.ccmmoutboundwebservices.OutboundLogoffDocument.OutboundLogoff getOutboundLogoff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.ccmmoutboundwebservices.OutboundLogoffDocument.OutboundLogoff target = null;
            target = (com.nortel.ccmmoutboundwebservices.OutboundLogoffDocument.OutboundLogoff)get_store().find_element_user(OUTBOUNDLOGOFF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OutboundLogoff" element
     */
    public void setOutboundLogoff(com.nortel.ccmmoutboundwebservices.OutboundLogoffDocument.OutboundLogoff outboundLogoff)
    {
        generatedSetterHelperImpl(outboundLogoff, OUTBOUNDLOGOFF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OutboundLogoff" element
     */
    public com.nortel.ccmmoutboundwebservices.OutboundLogoffDocument.OutboundLogoff addNewOutboundLogoff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.ccmmoutboundwebservices.OutboundLogoffDocument.OutboundLogoff target = null;
            target = (com.nortel.ccmmoutboundwebservices.OutboundLogoffDocument.OutboundLogoff)get_store().add_element_user(OUTBOUNDLOGOFF$0);
            return target;
        }
    }
    /**
     * An XML OutboundLogoff(@http://nortel.com/CCMMOutboundWebservices/).
     *
     * This is a complex type.
     */
    public static class OutboundLogoffImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.ccmmoutboundwebservices.OutboundLogoffDocument.OutboundLogoff
    {
        private static final long serialVersionUID = 1L;
        
        public OutboundLogoffImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName USERNAME$0 = 
            new javax.xml.namespace.QName("http://nortel.com/CCMMOutboundWebservices/", "username");
        
        
        /**
         * Gets the "username" element
         */
        public java.lang.String getUsername()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "username" element
         */
        public org.apache.xmlbeans.XmlString xgetUsername()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERNAME$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "username" element
         */
        public boolean isSetUsername()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(USERNAME$0) != 0;
            }
        }
        
        /**
         * Sets the "username" element
         */
        public void setUsername(java.lang.String username)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERNAME$0);
                }
                target.setStringValue(username);
            }
        }
        
        /**
         * Sets (as xml) the "username" element
         */
        public void xsetUsername(org.apache.xmlbeans.XmlString username)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERNAME$0);
                }
                target.set(username);
            }
        }
        
        /**
         * Unsets the "username" element
         */
        public void unsetUsername()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(USERNAME$0, 0);
            }
        }
    }
}
