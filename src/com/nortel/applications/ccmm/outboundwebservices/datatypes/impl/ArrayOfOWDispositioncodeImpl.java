/*
 * XML Type:  ArrayOfOWDispositioncode
 * Namespace: http://datatypes.outboundwebservices.ccmm.applications.nortel.com
 * Java type: com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode
 *
 * Automatically generated - do not modify.
 */
package com.nortel.applications.ccmm.outboundwebservices.datatypes.impl;
/**
 * An XML ArrayOfOWDispositioncode(@http://datatypes.outboundwebservices.ccmm.applications.nortel.com).
 *
 * This is a complex type.
 */
public class ArrayOfOWDispositioncodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWDispositioncode
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfOWDispositioncodeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OWDISPOSITIONCODE$0 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "OWDispositioncode");
    
    
    /**
     * Gets array of all "OWDispositioncode" elements
     */
    public com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode[] getOWDispositioncodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OWDISPOSITIONCODE$0, targetList);
            com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode[] result = new com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OWDispositioncode" element
     */
    public com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode getOWDispositioncodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode target = null;
            target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode)get_store().find_element_user(OWDISPOSITIONCODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "OWDispositioncode" element
     */
    public boolean isNilOWDispositioncodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode target = null;
            target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode)get_store().find_element_user(OWDISPOSITIONCODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "OWDispositioncode" element
     */
    public int sizeOfOWDispositioncodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OWDISPOSITIONCODE$0);
        }
    }
    
    /**
     * Sets array of all "OWDispositioncode" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setOWDispositioncodeArray(com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode[] owDispositioncodeArray)
    {
        check_orphaned();
        arraySetterHelper(owDispositioncodeArray, OWDISPOSITIONCODE$0);
    }
    
    /**
     * Sets ith "OWDispositioncode" element
     */
    public void setOWDispositioncodeArray(int i, com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode owDispositioncode)
    {
        generatedSetterHelperImpl(owDispositioncode, OWDISPOSITIONCODE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Nils the ith "OWDispositioncode" element
     */
    public void setNilOWDispositioncodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode target = null;
            target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode)get_store().find_element_user(OWDISPOSITIONCODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OWDispositioncode" element
     */
    public com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode insertNewOWDispositioncode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode target = null;
            target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode)get_store().insert_element_user(OWDISPOSITIONCODE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OWDispositioncode" element
     */
    public com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode addNewOWDispositioncode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode target = null;
            target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode)get_store().add_element_user(OWDISPOSITIONCODE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "OWDispositioncode" element
     */
    public void removeOWDispositioncode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OWDISPOSITIONCODE$0, i);
        }
    }
}
