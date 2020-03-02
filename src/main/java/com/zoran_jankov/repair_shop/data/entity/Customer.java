package main.java.com.zoran_jankov.repair_shop.data.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;

import main.java.com.zoran_jankov.repair_shop.data.EntityType;
import main.java.com.zoran_jankov.repair_shop.data.component.CompanyInfo;
import main.java.com.zoran_jankov.repair_shop.data.component.ContactInfo;
import main.java.com.zoran_jankov.repair_shop.data.component.PersonalInfo;

/** 
 * Class Client represents a client 
 * with associated information about that client.
 * @author Zoran Jankov
 */
@Entity
public class Customer extends AbstractEntity
{
	@Embedded
	private PersonalInfo personalInfo;
	@Embedded
	private ContactInfo contactInfo;
	@Embedded
	private CompanyInfo companyInfo;
	
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
	
	@Override
	public String getDisplayName()
	{	
		return super.getDisplayName() + " " + personalInfo.toString();
	}
}