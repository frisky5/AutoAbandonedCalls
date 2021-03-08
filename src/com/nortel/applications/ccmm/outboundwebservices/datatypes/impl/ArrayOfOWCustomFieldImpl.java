/*
 * XML Type:  ArrayOfOWCustomField
 * Namespace: http://datatypes.outboundwebservices.ccmm.applications.nortel.com
 * Java type: com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCustomField
 *
 * Automatically generated - do not modify.
 */
package com.nortel.applications.ccmm.outboundwebservices.datatypes.impl;
/**
 * An XML ArrayOfOWCustomField(@http://datatypes.outboundwebservices.ccmm.applications.nortel.com).
 *
 * This is a complex type.
 */
public class ArrayOfOWCustomFieldImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCustomField
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfOWCustomFieldImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OWCUSTOMFIELD$0 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "OWCustomField");
    
    
    /**
     * Gets array of all "OWCustomField" elements
     */
    public com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCustomField[] getOWCustomFieldArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OWCUSTOMFIELD$0, targetList);
            com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCustomField[] result = new com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCustomField[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OWCustomField" element
     */
    public com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCustomField getOWCustomFieldArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCustomField target = null;
            target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCustomField)get_store().find_element_user(OWCUSTOMFIELD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "OWCustomField" element
     */
    public boolean isNilOWCustomFieldArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCustomField target = null;
            target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCustomField)get_store().find_element_user(OWCUSTOMFIELD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "OWCustomField" element
     */
    public int sizeOfOWCustomFieldArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OWCUSTOMFIELD$0);
        }
    }
    
    /**
     * Sets array of all "OWCustomField" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setOWCustomFieldArray(com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCustomField[] owCustomFieldArray)
    {
        check_orphaned();
        arraySetterHelper(owCustomFieldArray, OWCUSTOMFIELD$0);
    }
    
    /**
     * Sets ith "OWCustomField" element
     */
    public void setOWCustomFieldArray(int i, com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCustomField owCustomField)
    {
        generatedSetterHelperImpl(owCustomField, OWCUSTOMFIELD$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Nils the ith "OWCustomField" element
     */
    public void setNilOWCustomFieldArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCustomField target = null;
            target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCustomField)get_store().find_element_user(OWCUSTOMFIELD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OWCustomField" element
     */
    public com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCustomField insertNewOWCustomField(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCustomField target = null;
            target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCustomField)get_store().insert_element_user(OWCUSTOMFIELD$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OWCustomField" element
     */
    public com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCustomField addNewOWCustomField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCustomField target = null;
            target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCustomField)get_store().add_element_user(OWCUSTOMFIELD$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "OWCustomField" element
     */
    public void removeOWCustomField(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OWCUSTOMFIELD$0, i);
        }
    }
}
