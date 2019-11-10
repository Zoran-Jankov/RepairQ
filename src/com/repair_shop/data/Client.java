package com.repair_shop.data;

import com.repair_shop.utility.DataType;

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
 * 
 * @author Zoran Jankov
 * @version 1.2
 * @since 2019-10-15
 */

public class Client extends Person
{
	private Marketing marketing;
	
	@Override
	public DataType getDataType()
	{
		return DataType.CLIENT;
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
	public String getUniqueString()
	{	
		return getPrimePhoneNumber();
	}
	
	@Override
	public void createReferences()
	{
		marketing.addReference(this);
	}
	
	@Override
	public void deleteReferences()
	{
		marketing.removeReference(this.getID());
	}
	@Override
	public boolean hasUniqueString()
	{
		return true;
	}
	@Override
	public boolean isReferencable()
	{
		return true;
	}

	
}