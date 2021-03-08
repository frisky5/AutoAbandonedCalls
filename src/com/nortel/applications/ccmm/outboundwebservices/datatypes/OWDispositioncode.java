/*
 * XML Type:  OWDispositioncode
 * Namespace: http://datatypes.outboundwebservices.ccmm.applications.nortel.com
 * Java type: com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode
 *
 * Automatically generated - do not modify.
 */
package com.nortel.applications.ccmm.outboundwebservices.datatypes;


/**
 * An XML OWDispositioncode(@http://datatypes.outboundwebservices.ccmm.applications.nortel.com).
 *
 * This is a complex type.
 */
public interface OWDispositioncode extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OWDispositioncode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9A05BCC39A615456DE332861F219A457").resolveHandle("owdispositioncode740atype");
    
    /**
     * Gets the "Id" element
     */
    long getId();
    
    /**
     * Gets (as xml) the "Id" element
     */
    org.apache.xmlbeans.XmlLong xgetId();
    
    /**
     * Sets the "Id" element
     */
    void setId(long id);
    
    /**
     * Sets (as xml) the "Id" element
     */
    void xsetId(org.apache.xmlbeans.XmlLong id);
    
    /**
     * Gets the "Name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "Name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * True if has "Name" element
     */
    boolean isSetName();
    
    /**
     * Sets the "Name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "Name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Unsets the "Name" element
     */
    void unsetName();
    
    /**
     * Gets the "RetryTimeOut" element
     */
    long getRetryTimeOut();
    
    /**
     * Gets (as xml) the "RetryTimeOut" element
     */
    org.apache.xmlbeans.XmlLong xgetRetryTimeOut();
    
    /**
     * Sets the "RetryTimeOut" element
     */
    void setRetryTimeOut(long retryTimeOut);
    
    /**
     * Sets (as xml) the "RetryTimeOut" element
     */
    void xsetRetryTimeOut(org.apache.xmlbeans.XmlLong retryTimeOut);
    
    /**
     * Gets the "NumbericValue" element
     */
    long getNumbericValue();
    
    /**
     * Gets (as xml) the "NumbericValue" element
     */
    org.apache.xmlbeans.XmlLong xgetNumbericValue();
    
    /**
     * Sets the "NumbericValue" element
     */
    void setNumbericValue(long numbericValue);
    
    /**
     * Sets (as xml) the "NumbericValue" element
     */
    void xsetNumbericValue(org.apache.xmlbeans.XmlLong numbericValue);
    
    /**
     * Gets the "MaxRetryCount" element
     */
    long getMaxRetryCount();
    
    /**
     * Gets (as xml) the "MaxRetryCount" element
     */
    org.apache.xmlbeans.XmlLong xgetMaxRetryCount();
    
    /**
     * Sets the "MaxRetryCount" element
     */
    void setMaxRetryCount(long maxRetryCount);
    
    /**
     * Sets (as xml) the "MaxRetryCount" element
     */
    void xsetMaxRetryCount(org.apache.xmlbeans.XmlLong maxRetryCount);
    
    /**
     * Gets the "Deletable" element
     */
    boolean getDeletable();
    
    /**
     * Gets (as xml) the "Deletable" element
     */
    org.apache.xmlbeans.XmlBoolean xgetDeletable();
    
    /**
     * Sets the "Deletable" element
     */
    void setDeletable(boolean deletable);
    
    /**
     * Sets (as xml) the "Deletable" element
     */
    void xsetDeletable(org.apache.xmlbeans.XmlBoolean deletable);
    
    /**
     * Gets the "CallRequired" element
     */
    boolean getCallRequired();
    
    /**
     * Gets (as xml) the "CallRequired" element
     */
    org.apache.xmlbeans.XmlBoolean xgetCallRequired();
    
    /**
     * Sets the "CallRequired" element
     */
    void setCallRequired(boolean callRequired);
    
    /**
     * Sets (as xml) the "CallRequired" element
     */
    void xsetCallRequired(org.apache.xmlbeans.XmlBoolean callRequired);
    
    /**
     * Gets the "MarkAsDeleted" element
     */
    boolean getMarkAsDeleted();
    
    /**
     * Gets (as xml) the "MarkAsDeleted" element
     */
    org.apache.xmlbeans.XmlBoolean xgetMarkAsDeleted();
    
    /**
     * Sets the "MarkAsDeleted" element
     */
    void setMarkAsDeleted(boolean markAsDeleted);
    
    /**
     * Sets (as xml) the "MarkAsDeleted" element
     */
    void xsetMarkAsDeleted(org.apache.xmlbeans.XmlBoolean markAsDeleted);
    
    /**
     * Gets the "SaveAgentScript" element
     */
    boolean getSaveAgentScript();
    
    /**
     * Gets (as xml) the "SaveAgentScript" element
     */
    org.apache.xmlbeans.XmlBoolean xgetSaveAgentScript();
    
    /**
     * Sets the "SaveAgentScript" element
     */
    void setSaveAgentScript(boolean saveAgentScript);
    
    /**
     * Sets (as xml) the "SaveAgentScript" element
     */
    void xsetSaveAgentScript(org.apache.xmlbeans.XmlBoolean saveAgentScript);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode newInstance() {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
