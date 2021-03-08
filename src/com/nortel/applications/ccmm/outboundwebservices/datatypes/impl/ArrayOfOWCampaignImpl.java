/*
 * XML Type:  ArrayOfOWCampaign
 * Namespace: http://datatypes.outboundwebservices.ccmm.applications.nortel.com
 * Java type: com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign
 *
 * Automatically generated - do not modify.
 */
package com.nortel.applications.ccmm.outboundwebservices.datatypes.impl;
/**
 * An XML ArrayOfOWCampaign(@http://datatypes.outboundwebservices.ccmm.applications.nortel.com).
 *
 * This is a complex type.
 */
public class ArrayOfOWCampaignImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfOWCampaignImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OWCAMPAIGN$0 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "OWCampaign");
    
    
    /**
     * Gets array of all "OWCampaign" elements
     */
    public com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign[] getOWCampaignArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OWCAMPAIGN$0, targetList);
            com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign[] result = new com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OWCampaign" element
     */
    public com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign getOWCampaignArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign target = null;
            target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign)get_store().find_element_user(OWCAMPAIGN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "OWCampaign" element
     */
    public boolean isNilOWCampaignArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign target = null;
            target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign)get_store().find_element_user(OWCAMPAIGN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "OWCampaign" element
     */
    public int sizeOfOWCampaignArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OWCAMPAIGN$0);
        }
    }
    
    /**
     * Sets array of all "OWCampaign" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setOWCampaignArray(com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign[] owCampaignArray)
    {
        check_orphaned();
        arraySetterHelper(owCampaignArray, OWCAMPAIGN$0);
    }
    
    /**
     * Sets ith "OWCampaign" element
     */
    public void setOWCampaignArray(int i, com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign owCampaign)
    {
        generatedSetterHelperImpl(owCampaign, OWCAMPAIGN$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Nils the ith "OWCampaign" element
     */
    public void setNilOWCampaignArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign target = null;
            target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign)get_store().find_element_user(OWCAMPAIGN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OWCampaign" element
     */
    public com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign insertNewOWCampaign(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign target = null;
            target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign)get_store().insert_element_user(OWCAMPAIGN$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OWCampaign" element
     */
    public com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign addNewOWCampaign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign target = null;
            target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaign)get_store().add_element_user(OWCAMPAIGN$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "OWCampaign" element
     */
    public void removeOWCampaign(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OWCAMPAIGN$0, i);
        }
    }
}
