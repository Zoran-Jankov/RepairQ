package main.java.com.zoran_jankov.repair_shop.data.embeddable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ContactInfo
{
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "address")
	private String address;
	
	/**
	 * Getter for person's primary phone number.
	 * @return (String) Person's primary phone number.
	 */
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	
	/**
	 * Setter for person's primary phone number.
	 * @param (String) primePhoneNum - Person's primary phone number.
	 */
	public void setPrimePhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
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