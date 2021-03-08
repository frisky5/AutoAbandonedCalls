/*
 * XML Type:  OWCampaign
 * Namespace: http://datatypes.outboundwebservices.ccmm.applications.nortel.com
 * Java type: com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign
 *
 * Automatically generated - do not modify.
 */
package com.nortel.applications.ccmm.outboundwebservices.datatypes;


/**
 * An XML OWCampaign(@http://datatypes.outboundwebservices.ccmm.applications.nortel.com).
 *
 * This is a complex type.
 */
public interface OWCampaign extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OWCampaign.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9A05BCC39A615456DE332861F219A457").resolveHandle("owcampaignc2f8type");
    
    /**
     * Gets the "ID" element
     */
    long getID();
    
    /**
     * Gets (as xml) the "ID" element
     */
    org.apache.xmlbeans.XmlLong xgetID();
    
    /**
     * Sets the "ID" element
     */
    void setID(long id);
    
    /**
     * Sets (as xml) the "ID" element
     */
    void xsetID(org.apache.xmlbeans.XmlLong id);
    
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
     * Gets the "Description" element
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "Description" element
     */
    org.apache.xmlbeans.XmlString xgetDescription();
    
    /**
     * True if has "Description" element
     */
    boolean isSetDescription();
    
    /**
     * Sets the "Description" element
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "Description" element
     */
    void xsetDescription(org.apache.xmlbeans.XmlString description);
    
    /**
     * Unsets the "Description" element
     */
    void unsetDescription();
    
    /**
     * Gets the "NumberOfContacts" element
     */
    long getNumberOfContacts();
    
    /**
     * Gets (as xml) the "NumberOfContacts" element
     */
    org.apache.xmlbeans.XmlLong xgetNumberOfContacts();
    
    /**
     * Sets the "NumberOfContacts" element
     */
    void setNumberOfContacts(long numberOfContacts);
    
    /**
     * Sets (as xml) the "NumberOfContacts" element
     */
    void xsetNumberOfContacts(org.apache.xmlbeans.XmlLong numberOfContacts);
    
    /**
     * Gets the "NumberOfContactsProcessed" element
     */
    long getNumberOfContactsProcessed();
    
    /**
     * Gets (as xml) the "NumberOfContactsProcessed" element
     */
    org.apache.xmlbeans.XmlLong xgetNumberOfContactsProcessed();
    
    /**
     * Sets the "NumberOfContactsProcessed" element
     */
    void setNumberOfContactsProcessed(long numberOfContactsProcessed);
    
    /**
     * Sets (as xml) the "NumberOfContactsProcessed" element
     */
    void xsetNumberOfContactsProcessed(org.apache.xmlbeans.XmlLong numberOfContactsProcessed);
    
    /**
     * Gets the "DateCreated" element
     */
    java.util.Calendar getDateCreated();
    
    /**
     * Gets (as xml) the "DateCreated" element
     */
    org.apache.xmlbeans.XmlDateTime xgetDateCreated();
    
    /**
     * Sets the "DateCreated" element
     */
    void setDateCreated(java.util.Calendar dateCreated);
    
    /**
     * Sets (as xml) the "DateCreated" element
     */
    void xsetDateCreated(org.apache.xmlbeans.XmlDateTime dateCreated);
    
    /**
     * Gets the "Owner" element
     */
    java.lang.String getOwner();
    
    /**
     * Gets (as xml) the "Owner" element
     */
    org.apache.xmlbeans.XmlString xgetOwner();
    
    /**
     * True if has "Owner" element
     */
    boolean isSetOwner();
    
    /**
     * Sets the "Owner" element
     */
    void setOwner(java.lang.String owner);
    
    /**
     * Sets (as xml) the "Owner" element
     */
    void xsetOwner(org.apache.xmlbeans.XmlString owner);
    
    /**
     * Unsets the "Owner" element
     */
    void unsetOwner();
    
    /**
     * Gets the "StartDateTime" element
     */
    java.util.Calendar getStartDateTime();
    
    /**
     * Gets (as xml) the "StartDateTime" element
     */
    org.apache.xmlbeans.XmlDateTime xgetStartDateTime();
    
    /**
     * Sets the "StartDateTime" element
     */
    void setStartDateTime(java.util.Calendar startDateTime);
    
    /**
     * Sets (as xml) the "StartDateTime" element
     */
    void xsetStartDateTime(org.apache.xmlbeans.XmlDateTime startDateTime);
    
    /**
     * Gets the "Skillset" element
     */
    com.nortel.applications.ccmm.outboundwebservices.datatypes.OWSkillset getSkillset();
    
    /**
     * True if has "Skillset" element
     */
    boolean isSetSkillset();
    
    /**
     * Sets the "Skillset" element
     */
    void setSkillset(com.nortel.applications.ccmm.outboundwebservices.datatypes.OWSkillset skillset);
    
    /**
     * Appends and returns a new empty "Skillset" element
     */
    com.nortel.applications.ccmm.outboundwebservices.datatypes.OWSkillset addNewSkillset();
    
    /**
     * Unsets the "Skillset" element
     */
    void unsetSkillset();
    
    /**
     * Gets the "Status" element
     */
    com.nortel.applications.ccmm.outboundwebservices.datatypes.OWStatus getStatus();
    
    /**
     * True if has "Status" element
     */
    boolean isSetStatus();
    
    /**
     * Sets the "Status" element
     */
    void setStatus(com.nortel.applications.ccmm.outboundwebservices.datatypes.OWStatus status);
    
    /**
     * Appends and returns a new empty "Status" element
     */
    com.nortel.applications.ccmm.outboundwebservices.datatypes.OWStatus addNewStatus();
    
    /**
     * Unsets the "Status" element
     */
    void unsetStatus();
    
    /**
     * Gets the "StartOfRun" element
     */
    boolean getStartOfRun();
    
    /**
     * Gets (as xml) the "StartOfRun" element
     */
    org.apache.xmlbeans.XmlBoolean xgetStartOfRun();
    
    /**
     * Sets the "StartOfRun" element
     */
    void setStartOfRun(boolean startOfRun);
    
    /**
     * Sets (as xml) the "StartOfRun" element
     */
    void xsetStartOfRun(org.apache.xmlbeans.XmlBoolean startOfRun);
    
    /**
     * Gets the "Priority" element
     */
    long getPriority();
    
    /**
     * Gets (as xml) the "Priority" element
     */
    org.apache.xmlbeans.XmlLong xgetPriority();
    
    /**
     * Sets the "Priority" element
     */
    void setPriority(long priority);
    
    /**
     * Sets (as xml) the "Priority" element
     */
    void xsetPriority(org.apache.xmlbeans.XmlLong priority);
    
    /**
     * Gets the "LoadContactsPerInterval" element
     */
    long getLoadContactsPerInterval();
    
    /**
     * Gets (as xml) the "LoadContactsPerInterval" element
     */
    org.apache.xmlbeans.XmlLong xgetLoadContactsPerInterval();
    
    /**
     * Sets the "LoadContactsPerInterval" element
     */
    void setLoadContactsPerInterval(long loadContactsPerInterval);
    
    /**
     * Sets (as xml) the "LoadContactsPerInterval" element
     */
    void xsetLoadContactsPerInterval(org.apache.xmlbeans.XmlLong loadContactsPerInterval);
    
    /**
     * Gets the "DialingPrefix" element
     */
    java.lang.String getDialingPrefix();
    
    /**
     * Gets (as xml) the "DialingPrefix" element
     */
    org.apache.xmlbeans.XmlString xgetDialingPrefix();
    
    /**
     * True if has "DialingPrefix" element
     */
    boolean isSetDialingPrefix();
    
    /**
     * Sets the "DialingPrefix" element
     */
    void setDialingPrefix(java.lang.String dialingPrefix);
    
    /**
     * Sets (as xml) the "DialingPrefix" element
     */
    void xsetDialingPrefix(org.apache.xmlbeans.XmlString dialingPrefix);
    
    /**
     * Unsets the "DialingPrefix" element
     */
    void unsetDialingPrefix();
    
    /**
     * Gets the "AutoDialTimeOut" element
     */
    long getAutoDialTimeOut();
    
    /**
     * Gets (as xml) the "AutoDialTimeOut" element
     */
    org.apache.xmlbeans.XmlLong xgetAutoDialTimeOut();
    
    /**
     * Sets the "AutoDialTimeOut" element
     */
    void setAutoDialTimeOut(long autoDialTimeOut);
    
    /**
     * Sets (as xml) the "AutoDialTimeOut" element
     */
    void xsetAutoDialTimeOut(org.apache.xmlbeans.XmlLong autoDialTimeOut);
    
    /**
     * Gets the "MinimumRingTime" element
     */
    long getMinimumRingTime();
    
    /**
     * Gets (as xml) the "MinimumRingTime" element
     */
    org.apache.xmlbeans.XmlLong xgetMinimumRingTime();
    
    /**
     * Sets the "MinimumRingTime" element
     */
    void setMinimumRingTime(long minimumRingTime);
    
    /**
     * Sets (as xml) the "MinimumRingTime" element
     */
    void xsetMinimumRingTime(org.apache.xmlbeans.XmlLong minimumRingTime);
    
    /**
     * Gets the "Locked" element
     */
    boolean getLocked();
    
    /**
     * Gets (as xml) the "Locked" element
     */
    org.apache.xmlbeans.XmlBoolean xgetLocked();
    
    /**
     * Sets the "Locked" element
     */
    void setLocked(boolean locked);
    
    /**
     * Sets (as xml) the "Locked" element
     */
    void xsetLocked(org.apache.xmlbeans.XmlBoolean locked);
    
    /**
     * Gets the "DispositionCodes" element
     */
    com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode getDispositionCodes();
    
    /**
     * True if has "DispositionCodes" element
     */
    boolean isSetDispositionCodes();
    
    /**
     * Sets the "DispositionCodes" element
     */
    void setDispositionCodes(com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode dispositionCodes);
    
    /**
     * Appends and returns a new empty "DispositionCodes" element
     */
    com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode addNewDispositionCodes();
    
    /**
     * Unsets the "DispositionCodes" element
     */
    void unsetDispositionCodes();
    
    /**
     * Gets the "NumberOfContactsClosed" element
     */
    long getNumberOfContactsClosed();
    
    /**
     * Gets (as xml) the "NumberOfContactsClosed" element
     */
    org.apache.xmlbeans.XmlLong xgetNumberOfContactsClosed();
    
    /**
     * Sets the "NumberOfContactsClosed" element
     */
    void setNumberOfContactsClosed(long numberOfContactsClosed);
    
    /**
     * Sets (as xml) the "NumberOfContactsClosed" element
     */
    void xsetNumberOfContactsClosed(org.apache.xmlbeans.XmlLong numberOfContactsClosed);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign newInstance() {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
