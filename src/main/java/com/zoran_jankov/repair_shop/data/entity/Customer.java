package main.java.com.zoran_jankov.repair_shop.data.entity;

import main.java.com.zoran_jankov.repair_shop.data.EntityType;
import main.java.com.zoran_jankov.repair_shop.data.component.CompanyInfo;
import main.java.com.zoran_jankov.repair_shop.data.component.ContactInfo;
import main.java.com.zoran_jankov.repair_shop.data.component.PersonalInfo;
import main.java.com.zoran_jankov.repair_shop.data.reference.EntityReferenceMap;
import main.java.com.zoran_jankov.repair_shop.data.reference.SingleReferenceMap;

/** 
 * Class Client represents a client 
 * with associated information about that client.
 * @author Zoran Jankov
 */
public class Customer extends AbstractEntity
{
	private PersonalInfo personalInfo;
	private ContactInfo contactInfo;
	private CompanyInfo companyInfo;
	private SingleReferenceMap referenceMap = new SingleReferenceMap();
	
	@Override
	public final EntityType getType()
	{
		return EntityType.CUSTOMER;
	}
	
	public PersonalInfo getPersonalInfo()
	{
		return personalInfo;
	}

	public void setPersonalInfo(PersonalInfo personalInfo)
	{
		this.personalInfo = personalInfo;
	}

	public ContactInfo getContactInfo()
	{
		return contactInfo;
	}

	public void setContactInfo(ContactInfo contactInfo)
	{
		this.contactInfo = contactInfo;
	}
	
	public CompanyInfo getCompanyInfo()
	{
		return companyInfo;
	}

	public void setCompanyInfo(CompanyInfo companyInfo)
	{
		this.companyInfo = companyInfo;
	}
	
	public EntityReferenceMap getReferenceMap()
	{
		return (EntityReferenceMap) referenceMap;
	}

	public void setReferenceMap(EntityReferenceMap reference)
	{
		this.referenceMap = (SingleReferenceMap) reference;
	}
	
	@Override
	public String getDisplayName()
	{	
		return super.getDisplayName() + " " + personalInfo.toString();
	}
}