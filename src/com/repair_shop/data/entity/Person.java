package com.repair_shop.data.entity;

public abstract class Person extends AbstractEntity
{
	private String name;
	private String primePhoneNumber;
	private String alternativePhoneNumber;
	private String email;
	private String address;
	
	/**
	 * Getter for persons first name.
	 * @return (String) Persons first name.
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Setter for persons first name.
	 * @param (String) firstName - Persons first name.
	 */

	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Getter for persons primary phone number.
	 * @return (String) Persons primary phone number.
	 */
	public String getPrimePhoneNumber()
	{
		return primePhoneNumber;
	}
	
	/**
	 * Setter for persons primary phone number.
	 * @param (String) primePhoneNum - Persons primary phone number.
	 */
	public void setPrimePhoneNumber(String primePhoneNumber)
	{
		this.primePhoneNumber = primePhoneNumber;
	}

	/**
	 * Getter for persons secondary phone number.
	 * @return (String) Persons secondary phone number.
	 */
	public String getAlternativePhoneNumber()
	{
		return alternativePhoneNumber;
	}
	
	/**
	 * Setter for persons secondary phone number.
	 * @param (String) secondPhoneNum - Persons secondary phone number.
	 */
	public void setAlternativePhoneNumber(String alternativePhoneNumber)
	{
		this.alternativePhoneNumber = alternativePhoneNumber;
	}
	
	/**
	 * Getter for persons email address.
	 * @return (String) Persons email address.
	 */
	public String getEmail()
	{
		return email;
	}
	
	/**
	 * Setter for persons email address.
	 * @param (String) email - Persons email address.
	 */
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	/**
	 * Getter for persons address.
	 * @return (String) Persons address.
	 */
	public String getAddress()
	{
		return address;
	}
	
	/**
	 * Setter for persons address.
	 * @param (String) address - Persons address.
	 */
	public void setAddress(String address)
	{
		this.address = address;
	}
}