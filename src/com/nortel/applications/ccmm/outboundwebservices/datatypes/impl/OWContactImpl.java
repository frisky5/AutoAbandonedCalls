/*
 * XML Type:  OWContact
 * Namespace: http://datatypes.outboundwebservices.ccmm.applications.nortel.com
 * Java type: com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact
 *
 * Automatically generated - do not modify.
 */
package com.nortel.applications.ccmm.outboundwebservices.datatypes.impl;
/**
 * An XML OWContact(@http://datatypes.outboundwebservices.ccmm.applications.nortel.com).
 *
 * This is a complex type.
 */
public class OWContactImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact
{
    private static final long serialVersionUID = 1L;
    
    public OWContactImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACTID$0 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "ContactID");
    private static final javax.xml.namespace.QName CAMPAIGNNAME$2 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "CampaignName");
    private static final javax.xml.namespace.QName ADDRESS$4 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "Address");
    private static final javax.xml.namespace.QName CUSTOMFIELDLIST$6 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "CustomFieldList");
    private static final javax.xml.namespace.QName EMAILADDRESS$8 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "EmailAddress");
    private static final javax.xml.namespace.QName FIRSTNAME$10 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "FirstName");
    private static final javax.xml.namespace.QName LASTNAME$12 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "LastName");
    private static final javax.xml.namespace.QName PHONENUMBER$14 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "PhoneNumber");
    private static final javax.xml.namespace.QName PREFERREDAGENTID$16 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "PreferredAgentID");
    private static final javax.xml.namespace.QName PREFERREDAGENTSPECIFIED$18 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "PreferredAgentSpecified");
    private static final javax.xml.namespace.QName TITLE$20 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "Title");
    private static final javax.xml.namespace.QName SKILLSETID$22 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "SkillsetID");
    
    
    /**
     * Gets the "ContactID" element
     */
    public long getContactID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTID$0, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "ContactID" element
     */
    public org.apache.xmlbeans.XmlLong xgetContactID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CONTACTID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ContactID" element
     */
    public void setContactID(long contactID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACTID$0);
            }
            target.setLongValue(contactID);
        }
    }
    
    /**
     * Sets (as xml) the "ContactID" element
     */
    public void xsetContactID(org.apache.xmlbeans.XmlLong contactID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CONTACTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(CONTACTID$0);
            }
            target.set(contactID);
        }
    }
    
    /**
     * Gets the "CampaignName" element
     */
    public java.lang.String getCampaignName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAMPAIGNNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CampaignName" element
     */
    public org.apache.xmlbeans.XmlString xgetCampaignName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CAMPAIGNNAME$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "CampaignName" element
     */
    public boolean isSetCampaignName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAMPAIGNNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "CampaignName" element
     */
    public void setCampaignName(java.lang.String campaignName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAMPAIGNNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAMPAIGNNAME$2);
            }
            target.setStringValue(campaignName);
        }
    }
    
    /**
     * Sets (as xml) the "CampaignName" element
     */
    public void xsetCampaignName(org.apache.xmlbeans.XmlString campaignName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CAMPAIGNNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CAMPAIGNNAME$2);
            }
            target.set(campaignName);
        }
    }
    
    /**
     * Unsets the "CampaignName" element
     */
    public void unsetCampaignName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAMPAIGNNAME$2, 0);
        }
    }
    
    /**
     * Gets the "Address" element
     */
    public com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress target = null;
            target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress)get_store().find_element_user(ADDRESS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Address" element
     */
    public boolean isSetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS$4) != 0;
        }
    }
    
    /**
     * Sets the "Address" element
     */
    public void setAddress(com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress address)
    {
        generatedSetterHelperImpl(address, ADDRESS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Address" element
     */
    public com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress addNewAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress target = null;
            target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress)get_store().add_element_user(ADDRESS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "Address" element
     */
    public void unsetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS$4, 0);
        }
    }
    
    /**
     * Gets the "CustomFieldList" element
     */
    public com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCustomField getCustomFieldList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCustomField target = null;
            target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCustomField)get_store().find_element_user(CUSTOMFIELDLIST$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CustomFieldList" element
     */
    public boolean isSetCustomFieldList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMFIELDLIST$6) != 0;
        }
    }
    
    /**
     * Sets the "CustomFieldList" element
     */
    public void setCustomFieldList(com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCustomField customFieldList)
    {
        generatedSetterHelperImpl(customFieldList, CUSTOMFIELDLIST$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CustomFieldList" element
     */
    public com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCustomField addNewCustomFieldList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCustomField target = null;
            target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCustomField)get_store().add_element_user(CUSTOMFIELDLIST$6);
            return target;
        }
    }
    
    /**
     * Unsets the "CustomFieldList" element
     */
    public void unsetCustomFieldList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMFIELDLIST$6, 0);
        }
    }
    
    /**
     * Gets the "EmailAddress" element
     */
    public java.lang.String getEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EmailAddress" element
     */
    public org.apache.xmlbeans.XmlString xgetEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILADDRESS$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "EmailAddress" element
     */
    public boolean isSetEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMAILADDRESS$8) != 0;
        }
    }
    
    /**
     * Sets the "EmailAddress" element
     */
    public void setEmailAddress(java.lang.String emailAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAILADDRESS$8);
            }
            target.setStringValue(emailAddress);
        }
    }
    
    /**
     * Sets (as xml) the "EmailAddress" element
     */
    public void xsetEmailAddress(org.apache.xmlbeans.XmlString emailAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILADDRESS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAILADDRESS$8);
            }
            target.set(emailAddress);
        }
    }
    
    /**
     * Unsets the "EmailAddress" element
     */
    public void unsetEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMAILADDRESS$8, 0);
        }
    }
    
    /**
     * Gets the "FirstName" element
     */
    public java.lang.String getFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTNAME$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FirstName" element
     */
    public org.apache.xmlbeans.XmlString xgetFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIRSTNAME$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "FirstName" element
     */
    public boolean isSetFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FIRSTNAME$10) != 0;
        }
    }
    
    /**
     * Sets the "FirstName" element
     */
    public void setFirstName(java.lang.String firstName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTNAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIRSTNAME$10);
            }
            target.setStringValue(firstName);
        }
    }
    
    /**
     * Sets (as xml) the "FirstName" element
     */
    public void xsetFirstName(org.apache.xmlbeans.XmlString firstName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIRSTNAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FIRSTNAME$10);
            }
            target.set(firstName);
        }
    }
    
    /**
     * Unsets the "FirstName" element
     */
    public void unsetFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FIRSTNAME$10, 0);
        }
    }
    
    /**
     * Gets the "LastName" element
     */
    public java.lang.String getLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTNAME$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LastName" element
     */
    public org.apache.xmlbeans.XmlString xgetLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTNAME$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "LastName" element
     */
    public boolean isSetLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LASTNAME$12) != 0;
        }
    }
    
    /**
     * Sets the "LastName" element
     */
    public void setLastName(java.lang.String lastName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTNAME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTNAME$12);
            }
            target.setStringValue(lastName);
        }
    }
    
    /**
     * Sets (as xml) the "LastName" element
     */
    public void xsetLastName(org.apache.xmlbeans.XmlString lastName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTNAME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LASTNAME$12);
            }
            target.set(lastName);
        }
    }
    
    /**
     * Unsets the "LastName" element
     */
    public void unsetLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LASTNAME$12, 0);
        }
    }
    
    /**
     * Gets the "PhoneNumber" element
     */
    public com.nortel.applications.ccmm.outboundwebservices.datatypes.OWPhoneNumber getPhoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.applications.ccmm.outboundwebservices.datatypes.OWPhoneNumber target = null;
            target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWPhoneNumber)get_store().find_element_user(PHONENUMBER$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PhoneNumber" element
     */
    public boolean isSetPhoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PHONENUMBER$14) != 0;
        }
    }
    
    /**
     * Sets the "PhoneNumber" element
     */
    public void setPhoneNumber(com.nortel.applications.ccmm.outboundwebservices.datatypes.OWPhoneNumber phoneNumber)
    {
        generatedSetterHelperImpl(phoneNumber, PHONENUMBER$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PhoneNumber" element
     */
    public com.nortel.applications.ccmm.outboundwebservices.datatypes.OWPhoneNumber addNewPhoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.applications.ccmm.outboundwebservices.datatypes.OWPhoneNumber target = null;
            target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWPhoneNumber)get_store().add_element_user(PHONENUMBER$14);
            return target;
        }
    }
    
    /**
     * Unsets the "PhoneNumber" element
     */
    public void unsetPhoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PHONENUMBER$14, 0);
        }
    }
    
    /**
     * Gets the "PreferredAgentID" element
     */
    public long getPreferredAgentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFERREDAGENTID$16, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "PreferredAgentID" element
     */
    public org.apache.xmlbeans.XmlLong xgetPreferredAgentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(PREFERREDAGENTID$16, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PreferredAgentID" element
     */
    public void setPreferredAgentID(long preferredAgentID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFERREDAGENTID$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREFERREDAGENTID$16);
            }
            target.setLongValue(preferredAgentID);
        }
    }
    
    /**
     * Sets (as xml) the "PreferredAgentID" element
     */
    public void xsetPreferredAgentID(org.apache.xmlbeans.XmlLong preferredAgentID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(PREFERREDAGENTID$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(PREFERREDAGENTID$16);
            }
            target.set(preferredAgentID);
        }
    }
    
    /**
     * Gets the "PreferredAgentSpecified" element
     */
    public boolean getPreferredAgentSpecified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFERREDAGENTSPECIFIED$18, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "PreferredAgentSpecified" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetPreferredAgentSpecified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PREFERREDAGENTSPECIFIED$18, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PreferredAgentSpecified" element
     */
    public void setPreferredAgentSpecified(boolean preferredAgentSpecified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFERREDAGENTSPECIFIED$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREFERREDAGENTSPECIFIED$18);
            }
            target.setBooleanValue(preferredAgentSpecified);
        }
    }
    
    /**
     * Sets (as xml) the "PreferredAgentSpecified" element
     */
    public void xsetPreferredAgentSpecified(org.apache.xmlbeans.XmlBoolean preferredAgentSpecified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PREFERREDAGENTSPECIFIED$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PREFERREDAGENTSPECIFIED$18);
            }
            target.set(preferredAgentSpecified);
        }
    }
    
    /**
     * Gets the "Title" element
     */
    public java.lang.String getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Title" element
     */
    public org.apache.xmlbeans.XmlString xgetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "Title" element
     */
    public boolean isSetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TITLE$20) != 0;
        }
    }
    
    /**
     * Sets the "Title" element
     */
    public void setTitle(java.lang.String title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLE$20);
            }
            target.setStringValue(title);
        }
    }
    
    /**
     * Sets (as xml) the "Title" element
     */
    public void xsetTitle(org.apache.xmlbeans.XmlString title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLE$20);
            }
            target.set(title);
        }
    }
    
    /**
     * Unsets the "Title" element
     */
    public void unsetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TITLE$20, 0);
        }
    }
    
    /**
     * Gets the "SkillsetID" element
     */
    public long getSkillsetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SKILLSETID$22, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "SkillsetID" element
     */
    public org.apache.xmlbeans.XmlLong xgetSkillsetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(SKILLSETID$22, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SkillsetID" element
     */
    public void setSkillsetID(long skillsetID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SKILLSETID$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SKILLSETID$22);
            }
            target.setLongValue(skillsetID);
        }
    }
    
    /**
     * Sets (as xml) the "SkillsetID" element
     */
    public void xsetSkillsetID(org.apache.xmlbeans.XmlLong skillsetID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(SKILLSETID$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(SKILLSETID$22);
            }
            target.set(skillsetID);
        }
    }
}
