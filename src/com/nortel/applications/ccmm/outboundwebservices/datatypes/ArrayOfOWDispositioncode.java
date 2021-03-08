/*
 * XML Type:  ArrayOfOWDispositioncode
 * Namespace: http://datatypes.outboundwebservices.ccmm.applications.nortel.com
 * Java type: com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode
 *
 * Automatically generated - do not modify.
 */
package com.nortel.applications.ccmm.outboundwebservices.datatypes;


/**
 * An XML ArrayOfOWDispositioncode(@http://datatypes.outboundwebservices.ccmm.applications.nortel.com).
 *
 * This is a complex type.
 */
public interface ArrayOfOWDispositioncode extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArrayOfOWDispositioncode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9A05BCC39A615456DE332861F219A457").resolveHandle("arrayofowdispositioncodea24ctype");
    
    /**
     * Gets array of all "OWDispositioncode" elements
     */
    com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode[] getOWDispositioncodeArray();
    
    /**
     * Gets ith "OWDispositioncode" element
     */
    com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode getOWDispositioncodeArray(int i);
    
    /**
     * Tests for nil ith "OWDispositioncode" element
     */
    boolean isNilOWDispositioncodeArray(int i);
    
    /**
     * Returns number of "OWDispositioncode" element
     */
    int sizeOfOWDispositioncodeArray();
    
    /**
     * Sets array of all "OWDispositioncode" element
     */
    void setOWDispositioncodeArray(com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode[] owDispositioncodeArray);
    
    /**
     * Sets ith "OWDispositioncode" element
     */
    void setOWDispositioncodeArray(int i, com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode owDispositioncode);
    
    /**
     * Nils the ith "OWDispositioncode" element
     */
    void setNilOWDispositioncodeArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OWDispositioncode" element
     */
    com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode insertNewOWDispositioncode(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OWDispositioncode" element
     */
    com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode addNewOWDispositioncode();
    
    /**
     * Removes the ith "OWDispositioncode" element
     */
    void removeOWDispositioncode(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode newInstance() {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
