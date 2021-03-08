/*
 * An XML document type.
 * Localname: OutboundLogin
 * Namespace: http://nortel.com/CCMMOutboundWebservices/
 * Java type: com.nortel.ccmmoutboundwebservices.OutboundLoginDocument
 *
 * Automatically generated - do not modify.
 */
package com.nortel.ccmmoutboundwebservices.impl;
/**
 * A document containing one OutboundLogin(@http://nortel.com/CCMMOutboundWebservices/) element.
 *
 * This is a complex type.
 */
public class OutboundLoginDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.ccmmoutboundwebservices.OutboundLoginDocument
{
    private static final long serialVersionUID = 1L;
    
    public OutboundLoginDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OUTBOUNDLOGIN$0 = 
        new javax.xml.namespace.QName("http://nortel.com/CCMMOutboundWebservices/", "OutboundLogin");
    
    
    /**
     * Gets the "OutboundLogin" element
     */
    public com.nortel.ccmmoutboundwebservices.OutboundLoginDocument.OutboundLogin getOutboundLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.ccmmoutboundwebservices.OutboundLoginDocument.OutboundLogin target = null;
            target = (com.nortel.ccmmoutboundwebservices.OutboundLoginDocument.OutboundLogin)get_store().find_element_user(OUTBOUNDLOGIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OutboundLogin" element
     */
    public void setOutboundLogin(com.nortel.ccmmoutboundwebservices.OutboundLoginDocument.OutboundLogin outboundLogin)
    {
        generatedSetterHelperImpl(outboundLogin, OUTBOUNDLOGIN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OutboundLogin" element
     */
    public com.nortel.ccmmoutboundwebservices.OutboundLoginDocument.OutboundLogin addNewOutboundLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.ccmmoutboundwebservices.OutboundLoginDocument.OutboundLogin target = null;
            target = (com.nortel.ccmmoutboundwebservices.OutboundLoginDocument.OutboundLogin)get_store().add_element_user(OUTBOUNDLOGIN$0);
            return target;
        }
    }
    /**
     * An XML OutboundLogin(@http://nortel.com/CCMMOutboundWebservices/).
     *
     * This is a complex type.
     */
    public static class OutboundLoginImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.ccmmoutboundwebservices.OutboundLoginDocument.OutboundLogin
    {
        private static final long serialVersionUID = 1L;
        
        public OutboundLoginImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName USERNAME$0 = 
            new javax.xml.namespace.QName("http://nortel.com/CCMMOutboundWebservices/", "username");
        private static final javax.xml.namespace.QName PASSWORD$2 = 
            new javax.xml.namespace.QName("http://nortel.com/CCMMOutboundWebservices/", "password");
        
        
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
        
        /**
         * Gets the "password" element
         */
        public java.lang.String getPassword()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PASSWORD$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "password" element
         */
        public org.apache.xmlbeans.XmlString xgetPassword()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PASSWORD$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "password" element
         */
        public boolean isSetPassword()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PASSWORD$2) != 0;
            }
        }
        
        /**
         * Sets the "password" element
         */
        public void setPassword(java.lang.String password)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PASSWORD$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PASSWORD$2);
                }
                target.setStringValue(password);
            }
        }
        
        /**
         * Sets (as xml) the "password" element
         */
        public void xsetPassword(org.apache.xmlbeans.XmlString password)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PASSWORD$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PASSWORD$2);
                }
                target.set(password);
            }
        }
        
        /**
         * Unsets the "password" element
         */
        public void unsetPassword()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PASSWORD$2, 0);
            }
        }
    }
}
