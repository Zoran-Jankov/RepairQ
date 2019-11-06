package com.repair_shop.data;

public abstract class Person extends AbstractDataElement
{
	private String firstName;
	private String lastName;
	private String primePhoneNumber;
	private String alternativePhoneNumber;
	private String email;
	private String address;
	
	/**
	 * Getter for persons first name.
	 * @return (String) Persons first name.
	 */
	public String getFirstName()
	{
		return firstName;
	}
	
	/**
	 * Setter for persons first name.
	 * @param (String) firstName - Persons first name.
	 */

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;

	}
	
	/**
	 * Getter for persons last name.
	 * @return (String) Persons last name.
	 */
	public String getLastName()
	{
		return lastName;
	}
	
	/**
	 * Setter for persons last name.
	 * @param (String) lastName - Persons last name.
	 */
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
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
	public void setPrimePhoneNumber(String primePhoneNum)
	{
		this.primePhoneNumber = primePhoneNum;
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