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
	private PersonalInfo personalInfo;
	private ContactInfo contactInfo;
	private CompanyInfo companyInfo;
	
	private Map<Integer, Ticket> ticketsReferencingCustomer = new HashMap<Integer, Ticket>();
	
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

	public Map<Integer, Ticket> getTicketsReferencingCustomer()
	{
		return ticketsReferencingCustomer;
	}

	public void setTicketsReferencingCustomer(Map<Integer, Ticket> referencedTickets)
	{
		this.ticketsReferencingCustomer = referencedTickets;
	}
	
	public void addTicketReferencingCustomer(Ticket ticket)
	{
		ticketsReferencingCustomer.put(ticket.getId(), ticket);
	}
	
	public void removeTicketReferencingCustomer(int id)
	{
		ticketsReferencingCustomer.remove(id);
	}
	
	@Override
	public String getDisplayName()
	{	
		return personalInfo.getUsername();
	}
}