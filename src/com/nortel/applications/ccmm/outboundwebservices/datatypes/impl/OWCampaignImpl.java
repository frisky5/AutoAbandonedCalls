/*
 * XML Type:  OWCampaign
 * Namespace: http://datatypes.outboundwebservices.ccmm.applications.nortel.com
 * Java type: com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign
 *
 * Automatically generated - do not modify.
 */
package com.nortel.applications.ccmm.outboundwebservices.datatypes.impl;
/**
 * An XML OWCampaign(@http://datatypes.outboundwebservices.ccmm.applications.nortel.com).
 *
 * This is a complex type.
 */
public class OWCampaignImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign
{
    private static final long serialVersionUID = 1L;
    
    public OWCampaignImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "ID");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "Name");
    private static final javax.xml.namespace.QName DESCRIPTION$4 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "Description");
    private static final javax.xml.namespace.QName NUMBEROFCONTACTS$6 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "NumberOfContacts");
    private static final javax.xml.namespace.QName NUMBEROFCONTACTSPROCESSED$8 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "NumberOfContactsProcessed");
    private static final javax.xml.namespace.QName DATECREATED$10 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "DateCreated");
    private static final javax.xml.namespace.QName OWNER$12 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "Owner");
    private static final javax.xml.namespace.QName STARTDATETIME$14 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "StartDateTime");
    private static final javax.xml.namespace.QName SKILLSET$16 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "Skillset");
    private static final javax.xml.namespace.QName STATUS$18 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "Status");
    private static final javax.xml.namespace.QName STARTOFRUN$20 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "StartOfRun");
    private static final javax.xml.namespace.QName PRIORITY$22 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "Priority");
    private static final javax.xml.namespace.QName LOADCONTACTSPERINTERVAL$24 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "LoadContactsPerInterval");
    private static final javax.xml.namespace.QName DIALINGPREFIX$26 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "DialingPrefix");
    private static final javax.xml.namespace.QName AUTODIALTIMEOUT$28 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "AutoDialTimeOut");
    private static final javax.xml.namespace.QName MINIMUMRINGTIME$30 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "MinimumRingTime");
    private static final javax.xml.namespace.QName LOCKED$32 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "Locked");
    private static final javax.xml.namespace.QName DISPOSITIONCODES$34 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "DispositionCodes");
    private static final javax.xml.namespace.QName NUMBEROFCONTACTSCLOSED$36 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "NumberOfContactsClosed");
    
    
    /**
     * Gets the "ID" element
     */
    public long getID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "ID" element
     */
    public org.apache.xmlbeans.XmlLong xgetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(ID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ID" element
     */
    public void setID(long id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
            }
            target.setLongValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "ID" element
     */
    public void xsetID(org.apache.xmlbeans.XmlLong id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(ID$0);
            }
            target.set(id);
        }
    }
    
    /**
     * Gets the "Name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$2) != 0;
        }
    }
    
    /**
     * Sets the "Name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$2);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "Name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$2);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "Name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$2, 0);
        }
    }
    
    /**
     * Gets the "Description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$4) != 0;
        }
    }
    
    /**
     * Sets the "Description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$4);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "Description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$4);
            }
            target.set(description);
        }
    }
    
    /**
     * Unsets the "Description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$4, 0);
        }
    }
    
    /**
     * Gets the "NumberOfContacts" element
     */
    public long getNumberOfContacts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFCONTACTS$6, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumberOfContacts" element
     */
    public org.apache.xmlbeans.XmlLong xgetNumberOfContacts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(NUMBEROFCONTACTS$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NumberOfContacts" element
     */
    public void setNumberOfContacts(long numberOfContacts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFCONTACTS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFCONTACTS$6);
            }
            target.setLongValue(numberOfContacts);
        }
    }
    
    /**
     * Sets (as xml) the "NumberOfContacts" element
     */
    public void xsetNumberOfContacts(org.apache.xmlbeans.XmlLong numberOfContacts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(NUMBEROFCONTACTS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(NUMBEROFCONTACTS$6);
            }
            target.set(numberOfContacts);
        }
    }
    
    /**
     * Gets the "NumberOfContactsProcessed" element
     */
    public long getNumberOfContactsProcessed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFCONTACTSPROCESSED$8, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumberOfContactsProcessed" element
     */
    public org.apache.xmlbeans.XmlLong xgetNumberOfContactsProcessed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(NUMBEROFCONTACTSPROCESSED$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NumberOfContactsProcessed" element
     */
    public void setNumberOfContactsProcessed(long numberOfContactsProcessed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFCONTACTSPROCESSED$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFCONTACTSPROCESSED$8);
            }
            target.setLongValue(numberOfContactsProcessed);
        }
    }
    
    /**
     * Sets (as xml) the "NumberOfContactsProcessed" element
     */
    public void xsetNumberOfContactsProcessed(org.apache.xmlbeans.XmlLong numberOfContactsProcessed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(NUMBEROFCONTACTSPROCESSED$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(NUMBEROFCONTACTSPROCESSED$8);
            }
            target.set(numberOfContactsProcessed);
        }
    }
    
    /**
     * Gets the "DateCreated" element
     */
    public java.util.Calendar getDateCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATECREATED$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DateCreated" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDateCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATECREATED$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DateCreated" element
     */
    public void setDateCreated(java.util.Calendar dateCreated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATECREATED$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATECREATED$10);
            }
            target.setCalendarValue(dateCreated);
        }
    }
    
    /**
     * Sets (as xml) the "DateCreated" element
     */
    public void xsetDateCreated(org.apache.xmlbeans.XmlDateTime dateCreated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATECREATED$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATECREATED$10);
            }
            target.set(dateCreated);
        }
    }
    
    /**
     * Gets the "Owner" element
     */
    public java.lang.String getOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNER$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Owner" element
     */
    public org.apache.xmlbeans.XmlString xgetOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OWNER$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "Owner" element
     */
    public boolean isSetOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OWNER$12) != 0;
        }
    }
    
    /**
     * Sets the "Owner" element
     */
    public void setOwner(java.lang.String owner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNER$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OWNER$12);
            }
            target.setStringValue(owner);
        }
    }
    
    /**
     * Sets (as xml) the "Owner" element
     */
    public void xsetOwner(org.apache.xmlbeans.XmlString owner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OWNER$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OWNER$12);
            }
            target.set(owner);
        }
    }
    
    /**
     * Unsets the "Owner" element
     */
    public void unsetOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OWNER$12, 0);
        }
    }
    
    /**
     * Gets the "StartDateTime" element
     */
    public java.util.Calendar getStartDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATETIME$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "StartDateTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetStartDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(STARTDATETIME$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "StartDateTime" element
     */
    public void setStartDateTime(java.util.Calendar startDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATETIME$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATETIME$14);
            }
            target.setCalendarValue(startDateTime);
        }
    }
    
    /**
     * Sets (as xml) the "StartDateTime" element
     */
    public void xsetStartDateTime(org.apache.xmlbeans.XmlDateTime startDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(STARTDATETIME$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(STARTDATETIME$14);
            }
            target.set(startDateTime);
        }
    }
    
    /**
     * Gets the "Skillset" element
     */
    public com.nortel.applications.ccmm.outboundwebservices.datatypes.OWSkillset getSkillset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.applications.ccmm.outboundwebservices.datatypes.OWSkillset target = null;
            target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWSkillset)get_store().find_element_user(SKILLSET$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Skillset" element
     */
    public boolean isSetSkillset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SKILLSET$16) != 0;
        }
    }
    
    /**
     * Sets the "Skillset" element
     */
    public void setSkillset(com.nortel.applications.ccmm.outboundwebservices.datatypes.OWSkillset skillset)
    {
        generatedSetterHelperImpl(skillset, SKILLSET$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Skillset" element
     */
    public com.nortel.applications.ccmm.outboundwebservices.datatypes.OWSkillset addNewSkillset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.applications.ccmm.outboundwebservices.datatypes.OWSkillset target = null;
            target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWSkillset)get_store().add_element_user(SKILLSET$16);
            return target;
        }
    }
    
    /**
     * Unsets the "Skillset" element
     */
    public void unsetSkillset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SKILLSET$16, 0);
        }
    }
    
    /**
     * Gets the "Status" element
     */
    public com.nortel.applications.ccmm.outboundwebservices.datatypes.OWStatus getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.applications.ccmm.outboundwebservices.datatypes.OWStatus target = null;
            target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWStatus)get_store().find_element_user(STATUS$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Status" element
     */
    public boolean isSetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUS$18) != 0;
        }
    }
    
    /**
     * Sets the "Status" element
     */
    public void setStatus(com.nortel.applications.ccmm.outboundwebservices.datatypes.OWStatus status)
    {
        generatedSetterHelperImpl(status, STATUS$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Status" element
     */
    public com.nortel.applications.ccmm.outboundwebservices.datatypes.OWStatus addNewStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.applications.ccmm.outboundwebservices.datatypes.OWStatus target = null;
            target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWStatus)get_store().add_element_user(STATUS$18);
            return target;
        }
    }
    
    /**
     * Unsets the "Status" element
     */
    public void unsetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUS$18, 0);
        }
    }
    
    /**
     * Gets the "StartOfRun" element
     */
    public boolean getStartOfRun()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTOFRUN$20, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "StartOfRun" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetStartOfRun()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(STARTOFRUN$20, 0);
            return target;
        }
    }
    
    /**
     * Sets the "StartOfRun" element
     */
    public void setStartOfRun(boolean startOfRun)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTOFRUN$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTOFRUN$20);
            }
            target.setBooleanValue(startOfRun);
        }
    }
    
    /**
     * Sets (as xml) the "StartOfRun" element
     */
    public void xsetStartOfRun(org.apache.xmlbeans.XmlBoolean startOfRun)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(STARTOFRUN$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(STARTOFRUN$20);
            }
            target.set(startOfRun);
        }
    }
    
    /**
     * Gets the "Priority" element
     */
    public long getPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIORITY$22, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "Priority" element
     */
    public org.apache.xmlbeans.XmlLong xgetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(PRIORITY$22, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Priority" element
     */
    public void setPriority(long priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIORITY$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIORITY$22);
            }
            target.setLongValue(priority);
        }
    }
    
    /**
     * Sets (as xml) the "Priority" element
     */
    public void xsetPriority(org.apache.xmlbeans.XmlLong priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(PRIORITY$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(PRIORITY$22);
            }
            target.set(priority);
        }
    }
    
    /**
     * Gets the "LoadContactsPerInterval" element
     */
    public long getLoadContactsPerInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOADCONTACTSPERINTERVAL$24, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "LoadContactsPerInterval" element
     */
    public org.apache.xmlbeans.XmlLong xgetLoadContactsPerInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(LOADCONTACTSPERINTERVAL$24, 0);
            return target;
        }
    }
    
    /**
     * Sets the "LoadContactsPerInterval" element
     */
    public void setLoadContactsPerInterval(long loadContactsPerInterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOADCONTACTSPERINTERVAL$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOADCONTACTSPERINTERVAL$24);
            }
            target.setLongValue(loadContactsPerInterval);
        }
    }
    
    /**
     * Sets (as xml) the "LoadContactsPerInterval" element
     */
    public void xsetLoadContactsPerInterval(org.apache.xmlbeans.XmlLong loadContactsPerInterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(LOADCONTACTSPERINTERVAL$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(LOADCONTACTSPERINTERVAL$24);
            }
            target.set(loadContactsPerInterval);
        }
    }
    
    /**
     * Gets the "DialingPrefix" element
     */
    public java.lang.String getDialingPrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIALINGPREFIX$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DialingPrefix" element
     */
    public org.apache.xmlbeans.XmlString xgetDialingPrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIALINGPREFIX$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "DialingPrefix" element
     */
    public boolean isSetDialingPrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIALINGPREFIX$26) != 0;
        }
    }
    
    /**
     * Sets the "DialingPrefix" element
     */
    public void setDialingPrefix(java.lang.String dialingPrefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIALINGPREFIX$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIALINGPREFIX$26);
            }
            target.setStringValue(dialingPrefix);
        }
    }
    
    /**
     * Sets (as xml) the "DialingPrefix" element
     */
    public void xsetDialingPrefix(org.apache.xmlbeans.XmlString dialingPrefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIALINGPREFIX$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DIALINGPREFIX$26);
            }
            target.set(dialingPrefix);
        }
    }
    
    /**
     * Unsets the "DialingPrefix" element
     */
    public void unsetDialingPrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIALINGPREFIX$26, 0);
        }
    }
    
    /**
     * Gets the "AutoDialTimeOut" element
     */
    public long getAutoDialTimeOut()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTODIALTIMEOUT$28, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "AutoDialTimeOut" element
     */
    public org.apache.xmlbeans.XmlLong xgetAutoDialTimeOut()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(AUTODIALTIMEOUT$28, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AutoDialTimeOut" element
     */
    public void setAutoDialTimeOut(long autoDialTimeOut)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTODIALTIMEOUT$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTODIALTIMEOUT$28);
            }
            target.setLongValue(autoDialTimeOut);
        }
    }
    
    /**
     * Sets (as xml) the "AutoDialTimeOut" element
     */
    public void xsetAutoDialTimeOut(org.apache.xmlbeans.XmlLong autoDialTimeOut)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(AUTODIALTIMEOUT$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(AUTODIALTIMEOUT$28);
            }
            target.set(autoDialTimeOut);
        }
    }
    
    /**
     * Gets the "MinimumRingTime" element
     */
    public long getMinimumRingTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIMUMRINGTIME$30, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "MinimumRingTime" element
     */
    public org.apache.xmlbeans.XmlLong xgetMinimumRingTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(MINIMUMRINGTIME$30, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MinimumRingTime" element
     */
    public void setMinimumRingTime(long minimumRingTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIMUMRINGTIME$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINIMUMRINGTIME$30);
            }
            target.setLongValue(minimumRingTime);
        }
    }
    
    /**
     * Sets (as xml) the "MinimumRingTime" element
     */
    public void xsetMinimumRingTime(org.apache.xmlbeans.XmlLong minimumRingTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(MINIMUMRINGTIME$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(MINIMUMRINGTIME$30);
            }
            target.set(minimumRingTime);
        }
    }
    
    /**
     * Gets the "Locked" element
     */
    public boolean getLocked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCKED$32, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Locked" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetLocked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(LOCKED$32, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Locked" element
     */
    public void setLocked(boolean locked)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCKED$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCKED$32);
            }
            target.setBooleanValue(locked);
        }
    }
    
    /**
     * Sets (as xml) the "Locked" element
     */
    public void xsetLocked(org.apache.xmlbeans.XmlBoolean locked)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(LOCKED$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(LOCKED$32);
            }
            target.set(locked);
        }
    }
    
    /**
     * Gets the "DispositionCodes" element
     */
    public com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode getDispositionCodes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode target = null;
            target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode)get_store().find_element_user(DISPOSITIONCODES$34, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DispositionCodes" element
     */
    public boolean isSetDispositionCodes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPOSITIONCODES$34) != 0;
        }
    }
    
    /**
     * Sets the "DispositionCodes" element
     */
    public void setDispositionCodes(com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode dispositionCodes)
    {
        generatedSetterHelperImpl(dispositionCodes, DISPOSITIONCODES$34, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DispositionCodes" element
     */
    public com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode addNewDispositionCodes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode target = null;
            target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode)get_store().add_element_user(DISPOSITIONCODES$34);
            return target;
        }
    }
    
    /**
     * Unsets the "DispositionCodes" element
     */
    public void unsetDispositionCodes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPOSITIONCODES$34, 0);
        }
    }
    
    /**
     * Gets the "NumberOfContactsClosed" element
     */
    public long getNumberOfContactsClosed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFCONTACTSCLOSED$36, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumberOfContactsClosed" element
     */
    public org.apache.xmlbeans.XmlLong xgetNumberOfContactsClosed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(NUMBEROFCONTACTSCLOSED$36, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NumberOfContactsClosed" element
     */
    public void setNumberOfContactsClosed(long numberOfContactsClosed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFCONTACTSCLOSED$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFCONTACTSCLOSED$36);
            }
            target.setLongValue(numberOfContactsClosed);
        }
    }
    
    /**
     * Sets (as xml) the "NumberOfContactsClosed" element
     */
    public void xsetNumberOfContactsClosed(org.apache.xmlbeans.XmlLong numberOfContactsClosed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(NUMBEROFCONTACTSCLOSED$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(NUMBEROFCONTACTSCLOSED$36);
            }
            target.set(numberOfContactsClosed);
        }
    }
}
