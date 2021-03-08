/*
 * XML Type:  OWContact
 * Namespace: http://datatypes.outboundwebservices.ccmm.applications.nortel.com
 * Java type: com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact
 *
 * Automatically generated - do not modify.
 */
package com.nortel.applications.ccmm.outboundwebservices.datatypes;


/**
 * An XML OWContact(@http://datatypes.outboundwebservices.ccmm.applications.nortel.com).
 *
 * This is a complex type.
 */
public interface OWContact extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OWContact.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9A05BCC39A615456DE332861F219A457").resolveHandle("owcontactde06type");
    
    /**
     * Gets the "ContactID" element
     */
    long getContactID();
    
    /**
     * Gets (as xml) the "ContactID" element
     */
    org.apache.xmlbeans.XmlLong xgetContactID();
    
    /**
     * Sets the "ContactID" element
     */
    void setContactID(long contactID);
    
    /**
     * Sets (as xml) the "ContactID" element
     */
    void xsetContactID(org.apache.xmlbeans.XmlLong contactID);
    
    /**
     * Gets the "CampaignName" element
     */
    java.lang.String getCampaignName();
    
    /**
     * Gets (as xml) the "CampaignName" element
     */
    org.apache.xmlbeans.XmlString xgetCampaignName();
    
    /**
     * True if has "CampaignName" element
     */
    boolean isSetCampaignName();
    
    /**
     * Sets the "CampaignName" element
     */
    void setCampaignName(java.lang.String campaignName);
    
    /**
     * Sets (as xml) the "CampaignName" element
     */
    void xsetCampaignName(org.apache.xmlbeans.XmlString campaignName);
    
    /**
     * Unsets the "CampaignName" element
     */
    void unsetCampaignName();
    
    /**
     * Gets the "Address" element
     */
    com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress getAddress();
    
    /**
     * True if has "Address" element
     */
    boolean isSetAddress();
    
    /**
     * Sets the "Address" element
     */
    void setAddress(com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress address);
    
    /**
     * Appends and returns a new empty "Address" element
     */
    com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress addNewAddress();
    
    /**
     * Unsets the "Address" element
     */
    void unsetAddress();
    
    /**
     * Gets the "CustomFieldList" element
     */
    com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCustomField getCustomFieldList();
    
    /**
     * True if has "CustomFieldList" element
     */
    boolean isSetCustomFieldList();
    
    /**
     * Sets the "CustomFieldList" element
     */
    void setCustomFieldList(com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCustomField customFieldList);
    
    /**
     * Appends and returns a new empty "CustomFieldList" element
     */
    com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCustomField addNewCustomFieldList();
    
    /**
     * Unsets the "CustomFieldList" element
     */
    void unsetCustomFieldList();
    
    /**
     * Gets the "EmailAddress" element
     */
    java.lang.String getEmailAddress();
    
    /**
     * Gets (as xml) the "EmailAddress" element
     */
    org.apache.xmlbeans.XmlString xgetEmailAddress();
    
    /**
     * True if has "EmailAddress" element
     */
    boolean isSetEmailAddress();
    
    /**
     * Sets the "EmailAddress" element
     */
    void setEmailAddress(java.lang.String emailAddress);
    
    /**
     * Sets (as xml) the "EmailAddress" element
     */
    void xsetEmailAddress(org.apache.xmlbeans.XmlString emailAddress);
    
    /**
     * Unsets the "EmailAddress" element
     */
    void unsetEmailAddress();
    
    /**
     * Gets the "FirstName" element
     */
    java.lang.String getFirstName();
    
    /**
     * Gets (as xml) the "FirstName" element
     */
    org.apache.xmlbeans.XmlString xgetFirstName();
    
    /**
     * True if has "FirstName" element
     */
    boolean isSetFirstName();
    
    /**
     * Sets the "FirstName" element
     */
    void setFirstName(java.lang.String firstName);
    
    /**
     * Sets (as xml) the "FirstName" element
     */
    void xsetFirstName(org.apache.xmlbeans.XmlString firstName);
    
    /**
     * Unsets the "FirstName" element
     */
    void unsetFirstName();
    
    /**
     * Gets the "LastName" element
     */
    java.lang.String getLastName();
    
    /**
     * Gets (as xml) the "LastName" element
     */
    org.apache.xmlbeans.XmlString xgetLastName();
    
    /**
     * True if has "LastName" element
     */
    boolean isSetLastName();
    
    /**
     * Sets the "LastName" element
     */
    void setLastName(java.lang.String lastName);
    
    /**
     * Sets (as xml) the "LastName" element
     */
    void xsetLastName(org.apache.xmlbeans.XmlString lastName);
    
    /**
     * Unsets the "LastName" element
     */
    void unsetLastName();
    
    /**
     * Gets the "PhoneNumber" element
     */
    com.nortel.applications.ccmm.outboundwebservices.datatypes.OWPhoneNumber getPhoneNumber();
    
    /**
     * True if has "PhoneNumber" element
     */
    boolean isSetPhoneNumber();
    
    /**
     * Sets the "PhoneNumber" element
     */
    void setPhoneNumber(com.nortel.applications.ccmm.outboundwebservices.datatypes.OWPhoneNumber phoneNumber);
    
    /**
     * Appends and returns a new empty "PhoneNumber" element
     */
    com.nortel.applications.ccmm.outboundwebservices.datatypes.OWPhoneNumber addNewPhoneNumber();
    
    /**
     * Unsets the "PhoneNumber" element
     */
    void unsetPhoneNumber();
    
    /**
     * Gets the "PreferredAgentID" element
     */
    long getPreferredAgentID();
    
    /**
     * Gets (as xml) the "PreferredAgentID" element
     */
    org.apache.xmlbeans.XmlLong xgetPreferredAgentID();
    
    /**
     * Sets the "PreferredAgentID" element
     */
    void setPreferredAgentID(long preferredAgentID);
    
    /**
     * Sets (as xml) the "PreferredAgentID" element
     */
    void xsetPreferredAgentID(org.apache.xmlbeans.XmlLong preferredAgentID);
    
    /**
     * Gets the "PreferredAgentSpecified" element
     */
    boolean getPreferredAgentSpecified();
    
    /**
     * Gets (as xml) the "PreferredAgentSpecified" element
     */
    org.apache.xmlbeans.XmlBoolean xgetPreferredAgentSpecified();
    
    /**
     * Sets the "PreferredAgentSpecified" element
     */
    void setPreferredAgentSpecified(boolean preferredAgentSpecified);
    
    /**
     * Sets (as xml) the "PreferredAgentSpecified" element
     */
    void xsetPreferredAgentSpecified(org.apache.xmlbeans.XmlBoolean preferredAgentSpecified);
    
    /**
     * Gets the "Title" element
     */
    java.lang.String getTitle();
    
    /**
     * Gets (as xml) the "Title" element
     */
    org.apache.xmlbeans.XmlString xgetTitle();
    
    /**
     * True if has "Title" element
     */
    boolean isSetTitle();
    
    /**
     * Sets the "Title" element
     */
    void setTitle(java.lang.String title);
    
    /**
     * Sets (as xml) the "Title" element
     */
    void xsetTitle(org.apache.xmlbeans.XmlString title);
    
    /**
     * Unsets the "Title" element
     */
    void unsetTitle();
    
    /**
     * Gets the "SkillsetID" element
     */
    long getSkillsetID();
    
    /**
     * Gets (as xml) the "SkillsetID" element
     */
    org.apache.xmlbeans.XmlLong xgetSkillsetID();
    
    /**
     * Sets the "SkillsetID" element
     */
    void setSkillsetID(long skillsetID);
    
    /**
     * Sets (as xml) the "SkillsetID" element
     */
    void xsetSkillsetID(org.apache.xmlbeans.XmlLong skillsetID);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact newInstance() {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
