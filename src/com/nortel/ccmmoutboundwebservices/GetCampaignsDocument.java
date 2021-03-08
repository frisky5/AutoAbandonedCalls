/*
 * An XML document type.
 * Localname: GetCampaigns
 * Namespace: http://nortel.com/CCMMOutboundWebservices/
 * Java type: com.nortel.ccmmoutboundwebservices.GetCampaignsDocument
 *
 * Automatically generated - do not modify.
 */
package com.nortel.ccmmoutboundwebservices;


/**
 * A document containing one GetCampaigns(@http://nortel.com/CCMMOutboundWebservices/) element.
 *
 * This is a complex type.
 */
public interface GetCampaignsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetCampaignsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9A05BCC39A615456DE332861F219A457").resolveHandle("getcampaigns83e7doctype");
    
    /**
     * Gets the "GetCampaigns" element
     */
    com.nortel.ccmmoutboundwebservices.GetCampaignsDocument.GetCampaigns getGetCampaigns();
    
    /**
     * Sets the "GetCampaigns" element
     */
    void setGetCampaigns(com.nortel.ccmmoutboundwebservices.GetCampaignsDocument.GetCampaigns getCampaigns);
    
    /**
     * Appends and returns a new empty "GetCampaigns" element
     */
    com.nortel.ccmmoutboundwebservices.GetCampaignsDocument.GetCampaigns addNewGetCampaigns();
    
    /**
     * An XML GetCampaigns(@http://nortel.com/CCMMOutboundWebservices/).
     *
     * This is a complex type.
     */
    public interface GetCampaigns extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetCampaigns.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9A05BCC39A615456DE332861F219A457").resolveHandle("getcampaigns8a10elemtype");
        
        /**
         * Gets the "sessionKey" element
         */
        java.lang.String getSessionKey();
        
        /**
         * Gets (as xml) the "sessionKey" element
         */
        org.apache.xmlbeans.XmlString xgetSessionKey();
        
        /**
         * True if has "sessionKey" element
         */
        boolean isSetSessionKey();
        
        /**
         * Sets the "sessionKey" element
         */
        void setSessionKey(java.lang.String sessionKey);
        
        /**
         * Sets (as xml) the "sessionKey" element
         */
        void xsetSessionKey(org.apache.xmlbeans.XmlString sessionKey);
        
        /**
         * Unsets the "sessionKey" element
         */
        void unsetSessionKey();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.nortel.ccmmoutboundwebservices.GetCampaignsDocument.GetCampaigns newInstance() {
              return (com.nortel.ccmmoutboundwebservices.GetCampaignsDocument.GetCampaigns) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.nortel.ccmmoutboundwebservices.GetCampaignsDocument.GetCampaigns newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.nortel.ccmmoutboundwebservices.GetCampaignsDocument.GetCampaigns) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.nortel.ccmmoutboundwebservices.GetCampaignsDocument newInstance() {
          return (com.nortel.ccmmoutboundwebservices.GetCampaignsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.nortel.ccmmoutboundwebservices.GetCampaignsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.nortel.ccmmoutboundwebservices.GetCampaignsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.nortel.ccmmoutboundwebservices.GetCampaignsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.ccmmoutboundwebservices.GetCampaignsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.nortel.ccmmoutboundwebservices.GetCampaignsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.ccmmoutboundwebservices.GetCampaignsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.nortel.ccmmoutboundwebservices.GetCampaignsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.ccmmoutboundwebservices.GetCampaignsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.nortel.ccmmoutboundwebservices.GetCampaignsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.ccmmoutboundwebservices.GetCampaignsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.nortel.ccmmoutboundwebservices.GetCampaignsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.ccmmoutboundwebservices.GetCampaignsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.nortel.ccmmoutboundwebservices.GetCampaignsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.ccmmoutboundwebservices.GetCampaignsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.nortel.ccmmoutboundwebservices.GetCampaignsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.ccmmoutboundwebservices.GetCampaignsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.nortel.ccmmoutboundwebservices.GetCampaignsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.ccmmoutboundwebservices.GetCampaignsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.nortel.ccmmoutboundwebservices.GetCampaignsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.ccmmoutboundwebservices.GetCampaignsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.nortel.ccmmoutboundwebservices.GetCampaignsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.ccmmoutboundwebservices.GetCampaignsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.nortel.ccmmoutboundwebservices.GetCampaignsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.ccmmoutboundwebservices.GetCampaignsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.nortel.ccmmoutboundwebservices.GetCampaignsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.ccmmoutboundwebservices.GetCampaignsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.nortel.ccmmoutboundwebservices.GetCampaignsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.ccmmoutboundwebservices.GetCampaignsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.nortel.ccmmoutboundwebservices.GetCampaignsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.ccmmoutboundwebservices.GetCampaignsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.ccmmoutboundwebservices.GetCampaignsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.ccmmoutboundwebservices.GetCampaignsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.ccmmoutboundwebservices.GetCampaignsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.ccmmoutboundwebservices.GetCampaignsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
