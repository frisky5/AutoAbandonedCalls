/*
 * XML Type:  OWPhoneNumber
 * Namespace: http://datatypes.outboundwebservices.ccmm.applications.nortel.com
 * Java type: com.nortel.applications.ccmm.outboundwebservices.datatypes.OWPhoneNumber
 *
 * Automatically generated - do not modify.
 */
package com.nortel.applications.ccmm.outboundwebservices.datatypes.impl;
/**
 * An XML OWPhoneNumber(@http://datatypes.outboundwebservices.ccmm.applications.nortel.com).
 *
 * This is a complex type.
 */
public class OWPhoneNumberImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.applications.ccmm.outboundwebservices.datatypes.OWPhoneNumber
{
    private static final long serialVersionUID = 1L;
    
    public OWPhoneNumberImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTCODE$0 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "IntCode");
    private static final javax.xml.namespace.QName AREACODE$2 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "AreaCode");
    private static final javax.xml.namespace.QName PHONENO$4 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "PhoneNo");
    
    
    /**
     * Gets the "IntCode" element
     */
    public java.lang.String getIntCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IntCode" element
     */
    public org.apache.xmlbeans.XmlString xgetIntCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTCODE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "IntCode" element
     */
    public boolean isSetIntCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTCODE$0) != 0;
        }
    }
    
    /**
     * Sets the "IntCode" element
     */
    public void setIntCode(java.lang.String intCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTCODE$0);
            }
            target.setStringValue(intCode);
        }
    }
    
    /**
     * Sets (as xml) the "IntCode" element
     */
    public void xsetIntCode(org.apache.xmlbeans.XmlString intCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INTCODE$0);
            }
            target.set(intCode);
        }
    }
    
    /**
     * Unsets the "IntCode" element
     */
    public void unsetIntCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTCODE$0, 0);
        }
    }
    
    /**
     * Gets the "AreaCode" element
     */
    public java.lang.String getAreaCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AREACODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AreaCode" element
     */
    public org.apache.xmlbeans.XmlString xgetAreaCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AREACODE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "AreaCode" element
     */
    public boolean isSetAreaCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AREACODE$2) != 0;
        }
    }
    
    /**
     * Sets the "AreaCode" element
     */
    public void setAreaCode(java.lang.String areaCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AREACODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AREACODE$2);
            }
            target.setStringValue(areaCode);
        }
    }
    
    /**
     * Sets (as xml) the "AreaCode" element
     */
    public void xsetAreaCode(org.apache.xmlbeans.XmlString areaCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AREACODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AREACODE$2);
            }
            target.set(areaCode);
        }
    }
    
    /**
     * Unsets the "AreaCode" element
     */
    public void unsetAreaCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AREACODE$2, 0);
        }
    }
    
    /**
     * Gets the "PhoneNo" element
     */
    public java.lang.String getPhoneNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONENO$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PhoneNo" element
     */
    public org.apache.xmlbeans.XmlString xgetPhoneNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONENO$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "PhoneNo" element
     */
    public boolean isSetPhoneNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PHONENO$4) != 0;
        }
    }
    
    /**
     * Sets the "PhoneNo" element
     */
    public void setPhoneNo(java.lang.String phoneNo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONENO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHONENO$4);
            }
            target.setStringValue(phoneNo);
        }
    }
    
    /**
     * Sets (as xml) the "PhoneNo" element
     */
    public void xsetPhoneNo(org.apache.xmlbeans.XmlString phoneNo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONENO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PHONENO$4);
            }
            target.set(phoneNo);
        }
    }
    
    /**
     * Unsets the "PhoneNo" element
     */
    public void unsetPhoneNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PHONENO$4, 0);
        }
    }
}
