/*
 * An XML document type.
 * Localname: OutboundLogin
 * Namespace: http://nortel.com/CCMMOutboundWebservices/
 * Java type: com.nortel.ccmmoutboundwebservices.OutboundLoginDocument
 *
 * Automatically generated - do not modify.
 */
package com.nortel.ccmmoutboundwebservices;


/**
 * A document containing one OutboundLogin(@http://nortel.com/CCMMOutboundWebservices/) element.
 *
 * This is a complex type.
 */
public interface OutboundLoginDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OutboundLoginDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8A6B2204B47FE9F8FDAF548B0FD9D057").resolveHandle("outboundlogin8b0ddoctype");
    
    /**
     * Gets the "OutboundLogin" element
     */
    com.nortel.ccmmoutboundwebservices.OutboundLoginDocument.OutboundLogin getOutboundLogin();
    
    /**
     * Sets the "OutboundLogin" element
     */
    void setOutboundLogin(com.nortel.ccmmoutboundwebservices.OutboundLoginDocument.OutboundLogin outboundLogin);
    
    /**
     * Appends and returns a new empty "OutboundLogin" element
     */
    com.nortel.ccmmoutboundwebservices.OutboundLoginDocument.OutboundLogin addNewOutboundLogin();
    
    /**
     * An XML OutboundLogin(@http://nortel.com/CCMMOutboundWebservices/).
     *
     * This is a complex type.
     */
    public interface OutboundLogin extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OutboundLogin.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8A6B2204B47FE9F8FDAF548B0FD9D057").resolveHandle("outboundlogin5748elemtype");
        
        /**
         * Gets the "username" element
         */
        java.lang.String getUsername();
        
        /**
         * Gets (as xml) the "username" element
         */
        org.apache.xmlbeans.XmlString xgetUsername();
        
        /**
         * True if has "username" element
         */
        boolean isSetUsername();
        
        /**
         * Sets the "username" element
         */
        void setUsername(java.lang.String username);
        
        /**
         * Sets (as xml) the "username" element
         */
        void xsetUsername(org.apache.xmlbeans.XmlString username);
        
        /**
         * Unsets the "username" element
         */
        void unsetUsername();
        
        /**
         * Gets the "password" element
         */
        java.lang.String getPassword();
        
        /**
         * Gets (as xml) the "password" element
         */
        org.apache.xmlbeans.XmlString xgetPassword();
        
        /**
         * True if has "password" element
         */
        boolean isSetPassword();
        
        /**
         * Sets the "password" element
         */
        void setPassword(java.lang.String password);
        
        /**
         * Sets (as xml) the "password" element
         */
        void xsetPassword(org.apache.xmlbeans.XmlString password);
        
        /**
         * Unsets the "password" element
         */
        void unsetPassword();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.nortel.ccmmoutboundwebservices.OutboundLoginDocument.OutboundLogin newInstance() {
              return (com.nortel.ccmmoutboundwebservices.OutboundLoginDocument.OutboundLogin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.nortel.ccmmoutboundwebservices.OutboundLoginDocument.OutboundLogin newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.nortel.ccmmoutboundwebservices.OutboundLoginDocument.OutboundLogin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.nortel.ccmmoutboundwebservices.OutboundLoginDocument newInstance() {
          return (com.nortel.ccmmoutboundwebservices.OutboundLoginDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.nortel.ccmmoutboundwebservices.OutboundLoginDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.nortel.ccmmoutboundwebservices.OutboundLoginDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.nortel.ccmmoutboundwebservices.OutboundLoginDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.ccmmoutboundwebservices.OutboundLoginDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.nortel.ccmmoutboundwebservices.OutboundLoginDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.ccmmoutboundwebservices.OutboundLoginDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.nortel.ccmmoutboundwebservices.OutboundLoginDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.ccmmoutboundwebservices.OutboundLoginDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.nortel.ccmmoutboundwebservices.OutboundLoginDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.ccmmoutboundwebservices.OutboundLoginDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.nortel.ccmmoutboundwebservices.OutboundLoginDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.ccmmoutboundwebservices.OutboundLoginDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.nortel.ccmmoutboundwebservices.OutboundLoginDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.ccmmoutboundwebservices.OutboundLoginDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.nortel.ccmmoutboundwebservices.OutboundLoginDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.ccmmoutboundwebservices.OutboundLoginDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.nortel.ccmmoutboundwebservices.OutboundLoginDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.ccmmoutboundwebservices.OutboundLoginDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.nortel.ccmmoutboundwebservices.OutboundLoginDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.ccmmoutboundwebservices.OutboundLoginDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.nortel.ccmmoutboundwebservices.OutboundLoginDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.ccmmoutboundwebservices.OutboundLoginDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.nortel.ccmmoutboundwebservices.OutboundLoginDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.ccmmoutboundwebservices.OutboundLoginDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.nortel.ccmmoutboundwebservices.OutboundLoginDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.ccmmoutboundwebservices.OutboundLoginDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.nortel.ccmmoutboundwebservices.OutboundLoginDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.ccmmoutboundwebservices.OutboundLoginDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.nortel.ccmmoutboundwebservices.OutboundLoginDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.ccmmoutboundwebservices.OutboundLoginDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.ccmmoutboundwebservices.OutboundLoginDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.ccmmoutboundwebservices.OutboundLoginDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.ccmmoutboundwebservices.OutboundLoginDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.ccmmoutboundwebservices.OutboundLoginDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
