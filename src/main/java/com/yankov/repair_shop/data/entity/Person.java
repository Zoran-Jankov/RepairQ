package main.java.com.yankov.repair_shop.data.entity;

/**
 * The abstract class Person is a abstract entity data class 
 * that represents personal information about a person.
 * 
 * @author Zoran Jankov
 * @version 1.8
 */
public abstract class Person extends AbstractEntity
{
	/**
	 * Person's full name
	 */
	private String fullName;
	
	/**
	 * Person's primary phone number
	 */
	private String primePhoneNumber;
	
	/**
	 * Person's alternative phone number
	 */
	private String alternativePhoneNumber;
	
	/**
	 * Person's email address
	 */
	private String email;
	
	/**
	 * Person's home address
	 */
	private String address;
	
	/**
	 * Getter for person's name.
	 * @return (String) Person's full name.
	 */
	public String getFullName()
	{
		return fullName;
	}
	
	/**
	 * Setter for person's full name.
	 * @param (String) firstName - Person's full name.
	 */

	public void setFullName(String name)
	{
		this.fullName = name;
	}
	
	/**
	 * Getter for person's primary phone number.
	 * @return (String) Person's primary phone number.
	 */
	public String getPrimePhoneNumber()
	{
		return primePhoneNumber;
	}
	
	/**
	 * Setter for person's primary phone number.
	 * @param (String) primePhoneNum - Person's primary phone number.
	 */
	public void setPrimePhoneNumber(String primePhoneNumber)
	{
		this.primePhoneNumber = primePhoneNumber;
	}

	/**
	 * Getter for person's secondary phone number.
	 * @return (String) Person's secondary phone number.
	 */
	public String getAlternativePhoneNumber()
	{
		return alternativePhoneNumber;
	}
	
	/**
	 * Setter for person's alternative phone number.
	 * @param (String) alternativePhoneNum - Person's alternative phone number.
	 */
	public void setAlternativePhoneNumber(String alternativePhoneNumber)
	{
		this.alternativePhoneNumber = alternativePhoneNumber;
	}
	
	/**
	 * Getter for person's email address.
	 * @return (String) Person's email address.
	 */
	public String getEmail()
	{
		return email;
	}
	
	/**
	 * Setter for person's email address.
	 * @param (String) email - Person's email address.
	 */
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	/**
	 * Getter for person's home address.
	 * @return (String) Person's home address.
	 */
	public String getAddress()
	{
		return address;
	}
	
	/**
	 * Setter for person's home address.
	 * @param (String) address - Person's home address.
	 */
	public void setAddress(String address)
	{
		this.address = address;
	}
}