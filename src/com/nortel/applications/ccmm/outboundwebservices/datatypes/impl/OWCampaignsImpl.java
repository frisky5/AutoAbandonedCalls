/*
 * XML Type:  OWCampaigns
 * Namespace: http://datatypes.outboundwebservices.ccmm.applications.nortel.com
 * Java type: com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaigns
 *
 * Automatically generated - do not modify.
 */
package com.nortel.applications.ccmm.outboundwebservices.datatypes.impl;
/**
 * An XML OWCampaigns(@http://datatypes.outboundwebservices.ccmm.applications.nortel.com).
 *
 * This is a complex type.
 */
public class OWCampaignsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.applications.ccmm.outboundwebservices.datatypes.OWCampaigns
{
    private static final long serialVersionUID = 1L;
    
    public OWCampaignsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CAMPAIGNLIST$0 = 
        new javax.xml.namespace.QName("http://datatypes.outboundwebservices.ccmm.applications.nortel.com", "CampaignList");
    
    
    /**
     * Gets the "CampaignList" element
     */
    public com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign getCampaignList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign target = null;
            target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign)get_store().find_element_user(CAMPAIGNLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CampaignList" element
     */
    public boolean isSetCampaignList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAMPAIGNLIST$0) != 0;
        }
    }
    
    /**
     * Sets the "CampaignList" element
     */
    public void setCampaignList(com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign campaignList)
    {
        generatedSetterHelperImpl(campaignList, CAMPAIGNLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CampaignList" element
     */
    public com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign addNewCampaignList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign target = null;
            target = (com.nortel.applications.ccmm.outboundwebservices.datatypes.ArrayOfOWCampaign)get_store().add_element_user(CAMPAIGNLIST$0);
            return target;
        }
    }
    
    /**
     * Unsets the "CampaignList" element
     */
    public void unsetCampaignList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAMPAIGNLIST$0, 0);
        }
    }
}
