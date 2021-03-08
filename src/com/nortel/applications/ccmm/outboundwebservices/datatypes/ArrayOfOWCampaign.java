/*
 * XML Type:  ArrayOfOWCampaign
 * Namespace: http://datatypes.outboundwebservices.ccmm.applications.nortel.com
 * Java type: com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign
 *
 * Automatically generated - do not modify.
 */
package com.nortel.applications.ccmm.outboundwebservices.datatypes;


/**
 * An XML ArrayOfOWCampaign(@http://datatypes.outboundwebservices.ccmm.applications.nortel.com).
 *
 * This is a complex type.
 */
public interface ArrayOfOWCampaign extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArrayOfOWCampaign.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9A05BCC39A615456DE332861F219A457").resolveHandle("arrayofowcampaign3af6type");
    
    /**
     * Gets array of all "OWCampaign" elements
     */
    com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign[] getOWCampaignArray();
    
    /**
     * Gets ith "OWCampaign" element
     */
    com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign getOWCampaignArray(int i);
    
    /**
     * Tests for nil ith "OWCampaign" element
     */
    boolean isNilOWCampaignArray(int i);
    
    /**
     * Returns number of "OWCampaign" element
     */
    int sizeOfOWCampaignArray();
    
    /**
     * Sets array of all "OWCampaign" element
     */
    void setOWCampaignArray(com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign[] owCampaignArray);
    
    /**
     * Sets ith "OWCampaign" element
     */
    void setOWCampaignArray(int i, com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign owCampaign);
    
    /**
     * Nils the ith "OWCampaign" element
     */
    void setNilOWCampaignArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OWCampaign" element
     */
    com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign insertNewOWCampaign(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OWCampaign" element
     */
    com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign addNewOWCampaign();
    
    /**
     * Removes the ith "OWCampaign" element
     */
    void removeOWCampaign(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign newInstance() {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
