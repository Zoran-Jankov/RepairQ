package main.java.com.yankov.repair_shop.data.entity;

import java.util.HashMap;
import java.util.Map;

import main.java.com.yankov.repair_shop.data.EntityType;
import main.java.com.yankov.repair_shop.data.component.CompanyInfo;
import main.java.com.yankov.repair_shop.data.component.ContactInfo;
import main.java.com.yankov.repair_shop.data.component.PersonalInfo;

/** 
 * Class Client represents a client 
 * with associated information about that client.
 * @author Zoran Jankov
 */
public class Customer extends AbstractEntity
{
	public static final EntityType TYPE = EntityType.CUSTOMER;
	
	private PersonalInfo personalInfo;
	private ContactInfo contactInfo;
	private CompanyInfo companyInfo;
	
	private Map<Integer, Ticket> referencedTickets = new HashMap<Integer, Ticket>();
	
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

	public Map<Integer, Ticket> getReferencedTickets()
	{
		return referencedTickets;
	}

	public void setReferencedTickets(Map<Integer, Ticket> referencedTickets)
	{
		this.referencedTickets = referencedTickets;
	}
	
	@Override
	public String getDisplayName()
	{	
		return personalInfo.getUsername();
	}
}