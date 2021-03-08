/*
 * XML Type:  OWAddress
 * Namespace: http://datatypes.outboundwebservices.ccmm.applications.nortel.com
 * Java type: com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress
 *
 * Automatically generated - do not modify.
 */
package com.nortel.applications.ccmm.outboundwebservices.datatypes;


/**
 * An XML OWAddress(@http://datatypes.outboundwebservices.ccmm.applications.nortel.com).
 *
 * This is a complex type.
 */
public interface OWAddress extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OWAddress.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9A05BCC39A615456DE332861F219A457").resolveHandle("owaddress10datype");
    
    /**
     * Gets the "AddressLine1" element
     */
    java.lang.String getAddressLine1();
    
    /**
     * Gets (as xml) the "AddressLine1" element
     */
    org.apache.xmlbeans.XmlString xgetAddressLine1();
    
    /**
     * True if has "AddressLine1" element
     */
    boolean isSetAddressLine1();
    
    /**
     * Sets the "AddressLine1" element
     */
    void setAddressLine1(java.lang.String addressLine1);
    
    /**
     * Sets (as xml) the "AddressLine1" element
     */
    void xsetAddressLine1(org.apache.xmlbeans.XmlString addressLine1);
    
    /**
     * Unsets the "AddressLine1" element
     */
    void unsetAddressLine1();
    
    /**
     * Gets the "AddressLine2" element
     */
    java.lang.String getAddressLine2();
    
    /**
     * Gets (as xml) the "AddressLine2" element
     */
    org.apache.xmlbeans.XmlString xgetAddressLine2();
    
    /**
     * True if has "AddressLine2" element
     */
    boolean isSetAddressLine2();
    
    /**
     * Sets the "AddressLine2" element
     */
    void setAddressLine2(java.lang.String addressLine2);
    
    /**
     * Sets (as xml) the "AddressLine2" element
     */
    void xsetAddressLine2(org.apache.xmlbeans.XmlString addressLine2);
    
    /**
     * Unsets the "AddressLine2" element
     */
    void unsetAddressLine2();
    
    /**
     * Gets the "AddressLine3" element
     */
    java.lang.String getAddressLine3();
    
    /**
     * Gets (as xml) the "AddressLine3" element
     */
    org.apache.xmlbeans.XmlString xgetAddressLine3();
    
    /**
     * True if has "AddressLine3" element
     */
    boolean isSetAddressLine3();
    
    /**
     * Sets the "AddressLine3" element
     */
    void setAddressLine3(java.lang.String addressLine3);
    
    /**
     * Sets (as xml) the "AddressLine3" element
     */
    void xsetAddressLine3(org.apache.xmlbeans.XmlString addressLine3);
    
    /**
     * Unsets the "AddressLine3" element
     */
    void unsetAddressLine3();
    
    /**
     * Gets the "AddressLine4" element
     */
    java.lang.String getAddressLine4();
    
    /**
     * Gets (as xml) the "AddressLine4" element
     */
    org.apache.xmlbeans.XmlString xgetAddressLine4();
    
    /**
     * True if has "AddressLine4" element
     */
    boolean isSetAddressLine4();
    
    /**
     * Sets the "AddressLine4" element
     */
    void setAddressLine4(java.lang.String addressLine4);
    
    /**
     * Sets (as xml) the "AddressLine4" element
     */
    void xsetAddressLine4(org.apache.xmlbeans.XmlString addressLine4);
    
    /**
     * Unsets the "AddressLine4" element
     */
    void unsetAddressLine4();
    
    /**
     * Gets the "AddressLine5" element
     */
    java.lang.String getAddressLine5();
    
    /**
     * Gets (as xml) the "AddressLine5" element
     */
    org.apache.xmlbeans.XmlString xgetAddressLine5();
    
    /**
     * True if has "AddressLine5" element
     */
    boolean isSetAddressLine5();
    
    /**
     * Sets the "AddressLine5" element
     */
    void setAddressLine5(java.lang.String addressLine5);
    
    /**
     * Sets (as xml) the "AddressLine5" element
     */
    void xsetAddressLine5(org.apache.xmlbeans.XmlString addressLine5);
    
    /**
     * Unsets the "AddressLine5" element
     */
    void unsetAddressLine5();
    
    /**
     * Gets the "Country" element
     */
    java.lang.String getCountry();
    
    /**
     * Gets (as xml) the "Country" element
     */
    org.apache.xmlbeans.XmlString xgetCountry();
    
    /**
     * True if has "Country" element
     */
    boolean isSetCountry();
    
    /**
     * Sets the "Country" element
     */
    void setCountry(java.lang.String country);
    
    /**
     * Sets (as xml) the "Country" element
     */
    void xsetCountry(org.apache.xmlbeans.XmlString country);
    
    /**
     * Unsets the "Country" element
     */
    void unsetCountry();
    
    /**
     * Gets the "PostCode" element
     */
    java.lang.String getPostCode();
    
    /**
     * Gets (as xml) the "PostCode" element
     */
    org.apache.xmlbeans.XmlString xgetPostCode();
    
    /**
     * True if has "PostCode" element
     */
    boolean isSetPostCode();
    
    /**
     * Sets the "PostCode" element
     */
    void setPostCode(java.lang.String postCode);
    
    /**
     * Sets (as xml) the "PostCode" element
     */
    void xsetPostCode(org.apache.xmlbeans.XmlString postCode);
    
    /**
     * Unsets the "PostCode" element
     */
    void unsetPostCode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress newInstance() {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
