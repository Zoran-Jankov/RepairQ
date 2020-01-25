package main.java.com.yankov.repair_shop.data.entity;

import main.java.com.yankov.repair_shop.data.EntityType;
import main.java.com.yankov.repair_shop.data.component.PersonalInfo;

/** 
 * Class Client extends class Person and represents a client 
 * with associated information about that client.
 * <p>
 * Inherits fields:
 * <p>
 * 
 * (int) ID number - must be unique
 * <p>
 * (String) First Name
 * <p>
 * (String) Last Name
 * <p>
 * (String) Primary Phone Number
 * <p>
 * (String) Second Phone Number
 * <p>
 * (String) Email Address
 * <p>
 * (String) Home Address
 * <p>
 * Fields:
 * <p>
 * (Property) Marketing - how did the client find about your business
 * <p>
 * @author Zoran Jankov
 */
public class Client extends PersonalInfo
{
	private Marketing marketing;
	
	@Override
	public EntityType getEntityType()
	{
		return EntityType.CLIENT;
	}
	
	/**
	 * Getter for clients marketing information.
	 * Marketing type describes how did the client find about your business.
	 * @return Clients marketing information.
	 */
	public Marketing getMarketing()
	{
		return marketing;
	}
	
	/**
	 * Setter for clients marketing information.
	 * Marketing type describes how did the client find about your business.
	 * @param marketing - Clients marketing information.
	 */
	public void setMarketing(Marketing marketing)
	{
		this.marketing = marketing;
	}

	@Override
	public String getDisplayName()
	{	
		return getFullName() + " " +getPrimePhoneNumber();
	}
	
	@Override
	public void createReferences()
	{
		marketing.addReference(this);
	}
	
	@Override
	public void deleteReferences()
	{
		marketing.removeReference(this.getId());
	}
}