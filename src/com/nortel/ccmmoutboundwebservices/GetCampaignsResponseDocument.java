/*
 * An XML document type.
 * Localname: GetCampaignsResponse
 * Namespace: http://nortel.com/CCMMOutboundWebservices/
 * Java type: com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.nortel.ccmmoutboundwebservices;


/**
 * A document containing one GetCampaignsResponse(@http://nortel.com/CCMMOutboundWebservices/) element.
 *
 * This is a complex type.
 */
public interface GetCampaignsResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetCampaignsResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9A05BCC39A615456DE332861F219A457").resolveHandle("getcampaignsresponsedee6doctype");
    
    /**
     * Gets the "GetCampaignsResponse" element
     */
    com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument.GetCampaignsResponse getGetCampaignsResponse();
    
    /**
     * Sets the "GetCampaignsResponse" element
     */
    void setGetCampaignsResponse(com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument.GetCampaignsResponse getCampaignsResponse);
    
    /**
     * Appends and returns a new empty "GetCampaignsResponse" element
     */
    com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument.GetCampaignsResponse addNewGetCampaignsResponse();
    
    /**
     * An XML GetCampaignsResponse(@http://nortel.com/CCMMOutboundWebservices/).
     *
     * This is a complex type.
     */
    public interface GetCampaignsResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetCampaignsResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9A05BCC39A615456DE332861F219A457").resolveHandle("getcampaignsresponse1330elemtype");
        
        /**
         * Gets the "GetCampaignsResult" element
         */
        com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaigns getGetCampaignsResult();
        
        /**
         * True if has "GetCampaignsResult" element
         */
        boolean isSetGetCampaignsResult();
        
        /**
         * Sets the "GetCampaignsResult" element
         */
        void setGetCampaignsResult(com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaigns getCampaignsResult);
        
        /**
         * Appends and returns a new empty "GetCampaignsResult" element
         */
        com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaigns addNewGetCampaignsResult();
        
        /**
         * Unsets the "GetCampaignsResult" element
         */
        void unsetGetCampaignsResult();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument.GetCampaignsResponse newInstance() {
              return (com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument.GetCampaignsResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument.GetCampaignsResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument.GetCampaignsResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument newInstance() {
          return (com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.ccmmoutboundwebservices.GetCampaignsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
