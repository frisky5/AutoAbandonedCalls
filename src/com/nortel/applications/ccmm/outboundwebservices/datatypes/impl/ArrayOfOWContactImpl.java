/*
 * XML Type:  ArrayOfOWContact
 * Namespace: http://datatypes.outboundwebservices.ccmm.applications.nortel.com
 * Java type: com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWContact
 *
 * Automatically generated - do not modify.
 */
package com.nortel.applications.ccmm.outboundwebservices.datatypes.impl;
/**
 * An XML ArrayOfOWContact(@http://datatypes.outboundwebservices.ccmm.applications.nortel.com).
 *
 * This is a complex type.
 */
public class ArrayOfOWContactImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWContact
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfOWContactImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OWCONTACT$0 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "OWContact");
    
    
    /**
     * Gets array of all "OWContact" elements
     */
    public com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact[] getOWContactArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OWCONTACT$0, targetList);
            com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact[] result = new com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OWContact" element
     */
    public com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact getOWContactArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact target = null;
            target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact)get_store().find_element_user(OWCONTACT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "OWContact" element
     */
    public boolean isNilOWContactArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact target = null;
            target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact)get_store().find_element_user(OWCONTACT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "OWContact" element
     */
    public int sizeOfOWContactArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OWCONTACT$0);
        }
    }
    
    /**
     * Sets array of all "OWContact" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setOWContactArray(com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact[] owContactArray)
    {
        check_orphaned();
        arraySetterHelper(owContactArray, OWCONTACT$0);
    }
    
    /**
     * Sets ith "OWContact" element
     */
    public void setOWContactArray(int i, com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact owContact)
    {
        generatedSetterHelperImpl(owContact, OWCONTACT$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Nils the ith "OWContact" element
     */
    public void setNilOWContactArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact target = null;
            target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact)get_store().find_element_user(OWCONTACT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OWContact" element
     */
    public com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact insertNewOWContact(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact target = null;
            target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact)get_store().insert_element_user(OWCONTACT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OWContact" element
     */
    public com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact addNewOWContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact target = null;
            target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContact)get_store().add_element_user(OWCONTACT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "OWContact" element
     */
    public void removeOWContact(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OWCONTACT$0, i);
        }
    }
}
