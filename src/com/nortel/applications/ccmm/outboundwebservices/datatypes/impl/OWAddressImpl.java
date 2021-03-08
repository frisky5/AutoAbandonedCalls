/*
 * XML Type:  OWAddress
 * Namespace: http://datatypes.outboundwebservices.ccmm.applications.nortel.com
 * Java type: com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress
 *
 * Automatically generated - do not modify.
 */
package com.nortel.applications.ccmm.outboundwebservices.datatypes.impl;
/**
 * An XML OWAddress(@http://datatypes.outboundwebservices.ccmm.applications.nortel.com).
 *
 * This is a complex type.
 */
public class OWAddressImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.applications.ccmm.outboundwebservices.datatypes.OWAddress
{
    private static final long serialVersionUID = 1L;
    
    public OWAddressImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESSLINE1$0 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "AddressLine1");
    private static final javax.xml.namespace.QName ADDRESSLINE2$2 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "AddressLine2");
    private static final javax.xml.namespace.QName ADDRESSLINE3$4 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "AddressLine3");
    private static final javax.xml.namespace.QName ADDRESSLINE4$6 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "AddressLine4");
    private static final javax.xml.namespace.QName ADDRESSLINE5$8 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "AddressLine5");
    private static final javax.xml.namespace.QName COUNTRY$10 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "Country");
    private static final javax.xml.namespace.QName POSTCODE$12 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "PostCode");
    
    
    /**
     * Gets the "AddressLine1" element
     */
    public java.lang.String getAddressLine1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSLINE1$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AddressLine1" element
     */
    public org.apache.xmlbeans.XmlString xgetAddressLine1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESSLINE1$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "AddressLine1" element
     */
    public boolean isSetAddressLine1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESSLINE1$0) != 0;
        }
    }
    
    /**
     * Sets the "AddressLine1" element
     */
    public void setAddressLine1(java.lang.String addressLine1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSLINE1$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESSLINE1$0);
            }
            target.setStringValue(addressLine1);
        }
    }
    
    /**
     * Sets (as xml) the "AddressLine1" element
     */
    public void xsetAddressLine1(org.apache.xmlbeans.XmlString addressLine1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESSLINE1$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESSLINE1$0);
            }
            target.set(addressLine1);
        }
    }
    
    /**
     * Unsets the "AddressLine1" element
     */
    public void unsetAddressLine1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESSLINE1$0, 0);
        }
    }
    
    /**
     * Gets the "AddressLine2" element
     */
    public java.lang.String getAddressLine2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSLINE2$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AddressLine2" element
     */
    public org.apache.xmlbeans.XmlString xgetAddressLine2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESSLINE2$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "AddressLine2" element
     */
    public boolean isSetAddressLine2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESSLINE2$2) != 0;
        }
    }
    
    /**
     * Sets the "AddressLine2" element
     */
    public void setAddressLine2(java.lang.String addressLine2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSLINE2$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESSLINE2$2);
            }
            target.setStringValue(addressLine2);
        }
    }
    
    /**
     * Sets (as xml) the "AddressLine2" element
     */
    public void xsetAddressLine2(org.apache.xmlbeans.XmlString addressLine2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESSLINE2$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESSLINE2$2);
            }
            target.set(addressLine2);
        }
    }
    
    /**
     * Unsets the "AddressLine2" element
     */
    public void unsetAddressLine2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESSLINE2$2, 0);
        }
    }
    
    /**
     * Gets the "AddressLine3" element
     */
    public java.lang.String getAddressLine3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSLINE3$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AddressLine3" element
     */
    public org.apache.xmlbeans.XmlString xgetAddressLine3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESSLINE3$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "AddressLine3" element
     */
    public boolean isSetAddressLine3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESSLINE3$4) != 0;
        }
    }
    
    /**
     * Sets the "AddressLine3" element
     */
    public void setAddressLine3(java.lang.String addressLine3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSLINE3$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESSLINE3$4);
            }
            target.setStringValue(addressLine3);
        }
    }
    
    /**
     * Sets (as xml) the "AddressLine3" element
     */
    public void xsetAddressLine3(org.apache.xmlbeans.XmlString addressLine3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESSLINE3$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESSLINE3$4);
            }
            target.set(addressLine3);
        }
    }
    
    /**
     * Unsets the "AddressLine3" element
     */
    public void unsetAddressLine3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESSLINE3$4, 0);
        }
    }
    
    /**
     * Gets the "AddressLine4" element
     */
    public java.lang.String getAddressLine4()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSLINE4$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AddressLine4" element
     */
    public org.apache.xmlbeans.XmlString xgetAddressLine4()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESSLINE4$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "AddressLine4" element
     */
    public boolean isSetAddressLine4()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESSLINE4$6) != 0;
        }
    }
    
    /**
     * Sets the "AddressLine4" element
     */
    public void setAddressLine4(java.lang.String addressLine4)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSLINE4$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESSLINE4$6);
            }
            target.setStringValue(addressLine4);
        }
    }
    
    /**
     * Sets (as xml) the "AddressLine4" element
     */
    public void xsetAddressLine4(org.apache.xmlbeans.XmlString addressLine4)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESSLINE4$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESSLINE4$6);
            }
            target.set(addressLine4);
        }
    }
    
    /**
     * Unsets the "AddressLine4" element
     */
    public void unsetAddressLine4()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESSLINE4$6, 0);
        }
    }
    
    /**
     * Gets the "AddressLine5" element
     */
    public java.lang.String getAddressLine5()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSLINE5$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AddressLine5" element
     */
    public org.apache.xmlbeans.XmlString xgetAddressLine5()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESSLINE5$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "AddressLine5" element
     */
    public boolean isSetAddressLine5()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESSLINE5$8) != 0;
        }
    }
    
    /**
     * Sets the "AddressLine5" element
     */
    public void setAddressLine5(java.lang.String addressLine5)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSLINE5$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESSLINE5$8);
            }
            target.setStringValue(addressLine5);
        }
    }
    
    /**
     * Sets (as xml) the "AddressLine5" element
     */
    public void xsetAddressLine5(org.apache.xmlbeans.XmlString addressLine5)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESSLINE5$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESSLINE5$8);
            }
            target.set(addressLine5);
        }
    }
    
    /**
     * Unsets the "AddressLine5" element
     */
    public void unsetAddressLine5()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESSLINE5$8, 0);
        }
    }
    
    /**
     * Gets the "Country" element
     */
    public java.lang.String getCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Country" element
     */
    public org.apache.xmlbeans.XmlString xgetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "Country" element
     */
    public boolean isSetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNTRY$10) != 0;
        }
    }
    
    /**
     * Sets the "Country" element
     */
    public void setCountry(java.lang.String country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRY$10);
            }
            target.setStringValue(country);
        }
    }
    
    /**
     * Sets (as xml) the "Country" element
     */
    public void xsetCountry(org.apache.xmlbeans.XmlString country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRY$10);
            }
            target.set(country);
        }
    }
    
    /**
     * Unsets the "Country" element
     */
    public void unsetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNTRY$10, 0);
        }
    }
    
    /**
     * Gets the "PostCode" element
     */
    public java.lang.String getPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCODE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PostCode" element
     */
    public org.apache.xmlbeans.XmlString xgetPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POSTCODE$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "PostCode" element
     */
    public boolean isSetPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POSTCODE$12) != 0;
        }
    }
    
    /**
     * Sets the "PostCode" element
     */
    public void setPostCode(java.lang.String postCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCODE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTCODE$12);
            }
            target.setStringValue(postCode);
        }
    }
    
    /**
     * Sets (as xml) the "PostCode" element
     */
    public void xsetPostCode(org.apache.xmlbeans.XmlString postCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POSTCODE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POSTCODE$12);
            }
            target.set(postCode);
        }
    }
    
    /**
     * Unsets the "PostCode" element
     */
    public void unsetPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POSTCODE$12, 0);
        }
    }
}
