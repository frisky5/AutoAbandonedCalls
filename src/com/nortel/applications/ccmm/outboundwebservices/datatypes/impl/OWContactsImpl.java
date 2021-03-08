/*
 * XML Type:  OWContacts
 * Namespace: http://datatypes.outboundwebservices.ccmm.applications.nortel.com
 * Java type: com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContacts
 *
 * Automatically generated - do not modify.
 */
package com.nortel.applications.ccmm.outboundwebservices.datatypes.impl;
/**
 * An XML OWContacts(@http://datatypes.outboundwebservices.ccmm.applications.nortel.com).
 *
 * This is a complex type.
 */
public class OWContactsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.applications.ccmm.outboundwebservices.datatypes.OWContacts
{
    private static final long serialVersionUID = 1L;
    
    public OWContactsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACTLIST$0 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "ContactList");
    
    
    /**
     * Gets the "ContactList" element
     */
    public com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWContact getContactList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWContact target = null;
            target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWContact)get_store().find_element_user(CONTACTLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ContactList" element
     */
    public boolean isSetContactList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACTLIST$0) != 0;
        }
    }
    
    /**
     * Sets the "ContactList" element
     */
    public void setContactList(com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWContact contactList)
    {
        generatedSetterHelperImpl(contactList, CONTACTLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ContactList" element
     */
    public com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWContact addNewContactList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWContact target = null;
            target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWContact)get_store().add_element_user(CONTACTLIST$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ContactList" element
     */
    public void unsetContactList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACTLIST$0, 0);
        }
    }
}
