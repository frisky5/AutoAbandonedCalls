/*
 * XML Type:  OWDispositioncode
 * Namespace: http://datatypes.outboundwebservices.ccmm.applications.nortel.com
 * Java type: com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode
 *
 * Automatically generated - do not modify.
 */
package com.nortel.applications.ccmm.outboundwebservices.datatypes.impl;
/**
 * An XML OWDispositioncode(@http://datatypes.outboundwebservices.ccmm.applications.nortel.com).
 *
 * This is a complex type.
 */
public class OWDispositioncodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.applications.ccmm.outboundwebservices.datatypes.OWDispositioncode
{
    private static final long serialVersionUID = 1L;
    
    public OWDispositioncodeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "Id");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "Name");
    private static final javax.xml.namespace.QName RETRYTIMEOUT$4 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "RetryTimeOut");
    private static final javax.xml.namespace.QName NUMBERICVALUE$6 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "NumbericValue");
    private static final javax.xml.namespace.QName MAXRETRYCOUNT$8 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "MaxRetryCount");
    private static final javax.xml.namespace.QName DELETABLE$10 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "Deletable");
    private static final javax.xml.namespace.QName CALLREQUIRED$12 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "CallRequired");
    private static final javax.xml.namespace.QName MARKASDELETED$14 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "MarkAsDeleted");
    private static final javax.xml.namespace.QName SAVEAGENTSCRIPT$16 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "SaveAgentScript");
    
    
    /**
     * Gets the "Id" element
     */
    public long getId()
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
     * Gets (as xml) the "Id" element
     */
    public org.apache.xmlbeans.XmlLong xgetId()
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
     * Sets the "Id" element
     */
    public void setId(long id)
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
     * Sets (as xml) the "Id" element
     */
    public void xsetId(org.apache.xmlbeans.XmlLong id)
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
     * Gets the "RetryTimeOut" element
     */
    public long getRetryTimeOut()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETRYTIMEOUT$4, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "RetryTimeOut" element
     */
    public org.apache.xmlbeans.XmlLong xgetRetryTimeOut()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(RETRYTIMEOUT$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RetryTimeOut" element
     */
    public void setRetryTimeOut(long retryTimeOut)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETRYTIMEOUT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETRYTIMEOUT$4);
            }
            target.setLongValue(retryTimeOut);
        }
    }
    
    /**
     * Sets (as xml) the "RetryTimeOut" element
     */
    public void xsetRetryTimeOut(org.apache.xmlbeans.XmlLong retryTimeOut)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(RETRYTIMEOUT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(RETRYTIMEOUT$4);
            }
            target.set(retryTimeOut);
        }
    }
    
    /**
     * Gets the "NumbericValue" element
     */
    public long getNumbericValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERICVALUE$6, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumbericValue" element
     */
    public org.apache.xmlbeans.XmlLong xgetNumbericValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(NUMBERICVALUE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NumbericValue" element
     */
    public void setNumbericValue(long numbericValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERICVALUE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBERICVALUE$6);
            }
            target.setLongValue(numbericValue);
        }
    }
    
    /**
     * Sets (as xml) the "NumbericValue" element
     */
    public void xsetNumbericValue(org.apache.xmlbeans.XmlLong numbericValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(NUMBERICVALUE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(NUMBERICVALUE$6);
            }
            target.set(numbericValue);
        }
    }
    
    /**
     * Gets the "MaxRetryCount" element
     */
    public long getMaxRetryCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXRETRYCOUNT$8, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "MaxRetryCount" element
     */
    public org.apache.xmlbeans.XmlLong xgetMaxRetryCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(MAXRETRYCOUNT$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MaxRetryCount" element
     */
    public void setMaxRetryCount(long maxRetryCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXRETRYCOUNT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXRETRYCOUNT$8);
            }
            target.setLongValue(maxRetryCount);
        }
    }
    
    /**
     * Sets (as xml) the "MaxRetryCount" element
     */
    public void xsetMaxRetryCount(org.apache.xmlbeans.XmlLong maxRetryCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(MAXRETRYCOUNT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(MAXRETRYCOUNT$8);
            }
            target.set(maxRetryCount);
        }
    }
    
    /**
     * Gets the "Deletable" element
     */
    public boolean getDeletable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELETABLE$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Deletable" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetDeletable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DELETABLE$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Deletable" element
     */
    public void setDeletable(boolean deletable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELETABLE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELETABLE$10);
            }
            target.setBooleanValue(deletable);
        }
    }
    
    /**
     * Sets (as xml) the "Deletable" element
     */
    public void xsetDeletable(org.apache.xmlbeans.XmlBoolean deletable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DELETABLE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(DELETABLE$10);
            }
            target.set(deletable);
        }
    }
    
    /**
     * Gets the "CallRequired" element
     */
    public boolean getCallRequired()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALLREQUIRED$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "CallRequired" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetCallRequired()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CALLREQUIRED$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CallRequired" element
     */
    public void setCallRequired(boolean callRequired)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALLREQUIRED$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CALLREQUIRED$12);
            }
            target.setBooleanValue(callRequired);
        }
    }
    
    /**
     * Sets (as xml) the "CallRequired" element
     */
    public void xsetCallRequired(org.apache.xmlbeans.XmlBoolean callRequired)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CALLREQUIRED$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CALLREQUIRED$12);
            }
            target.set(callRequired);
        }
    }
    
    /**
     * Gets the "MarkAsDeleted" element
     */
    public boolean getMarkAsDeleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MARKASDELETED$14, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "MarkAsDeleted" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetMarkAsDeleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(MARKASDELETED$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MarkAsDeleted" element
     */
    public void setMarkAsDeleted(boolean markAsDeleted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MARKASDELETED$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MARKASDELETED$14);
            }
            target.setBooleanValue(markAsDeleted);
        }
    }
    
    /**
     * Sets (as xml) the "MarkAsDeleted" element
     */
    public void xsetMarkAsDeleted(org.apache.xmlbeans.XmlBoolean markAsDeleted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(MARKASDELETED$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(MARKASDELETED$14);
            }
            target.set(markAsDeleted);
        }
    }
    
    /**
     * Gets the "SaveAgentScript" element
     */
    public boolean getSaveAgentScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAVEAGENTSCRIPT$16, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "SaveAgentScript" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetSaveAgentScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SAVEAGENTSCRIPT$16, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SaveAgentScript" element
     */
    public void setSaveAgentScript(boolean saveAgentScript)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAVEAGENTSCRIPT$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SAVEAGENTSCRIPT$16);
            }
            target.setBooleanValue(saveAgentScript);
        }
    }
    
    /**
     * Sets (as xml) the "SaveAgentScript" element
     */
    public void xsetSaveAgentScript(org.apache.xmlbeans.XmlBoolean saveAgentScript)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SAVEAGENTSCRIPT$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SAVEAGENTSCRIPT$16);
            }
            target.set(saveAgentScript);
        }
    }
}
