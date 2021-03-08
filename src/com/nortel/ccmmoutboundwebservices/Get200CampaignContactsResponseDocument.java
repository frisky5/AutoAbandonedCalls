/*
 * An XML document type.
 * Localname: Get200CampaignContactsResponse
 * Namespace: http://nortel.com/CCMMOutboundWebservices/
 * Java type: com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.nortel.ccmmoutboundwebservices;


/**
 * A document containing one Get200CampaignContactsResponse(@http://nortel.com/CCMMOutboundWebservices/) element.
 *
 * This is a complex type.
 */
public interface Get200CampaignContactsResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Get200CampaignContactsResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9A05BCC39A615456DE332861F219A457").resolveHandle("get200campaigncontactsresponse4354doctype");
    
    /**
     * Gets the "Get200CampaignContactsResponse" element
     */
    com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument.Get200CampaignContactsResponse getGet200CampaignContactsResponse();
    
    /**
     * Sets the "Get200CampaignContactsResponse" element
     */
    void setGet200CampaignContactsResponse(com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument.Get200CampaignContactsResponse get200CampaignContactsResponse);
    
    /**
     * Appends and returns a new empty "Get200CampaignContactsResponse" element
     */
    com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument.Get200CampaignContactsResponse addNewGet200CampaignContactsResponse();
    
    /**
     * An XML Get200CampaignContactsResponse(@http://nortel.com/CCMMOutboundWebservices/).
     *
     * This is a complex type.
     */
    public interface Get200CampaignContactsResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Get200CampaignContactsResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9A05BCC39A615456DE332861F219A457").resolveHandle("get200campaigncontactsresponse29b0elemtype");
        
        /**
         * Gets the "Get200CampaignContactsResult" element
         */
        com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContacts getGet200CampaignContactsResult();
        
        /**
         * True if has "Get200CampaignContactsResult" element
         */
        boolean isSetGet200CampaignContactsResult();
        
        /**
         * Sets the "Get200CampaignContactsResult" element
         */
        void setGet200CampaignContactsResult(com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContacts get200CampaignContactsResult);
        
        /**
         * Appends and returns a new empty "Get200CampaignContactsResult" element
         */
        com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContacts addNewGet200CampaignContactsResult();
        
        /**
         * Unsets the "Get200CampaignContactsResult" element
         */
        void unsetGet200CampaignContactsResult();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument.Get200CampaignContactsResponse newInstance() {
              return (com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument.Get200CampaignContactsResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument.Get200CampaignContactsResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument.Get200CampaignContactsResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument newInstance() {
          return (com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.ccmmoutboundwebservices.Get200CampaignContactsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
