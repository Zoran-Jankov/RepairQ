package main.java.com.zoran_jankov.repair_shop.data.embeddable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The abstract class Person is a abstract entity data class 
 * that represents personal information about a person.
 * 
 * @author Zoran Jankov
 * @version 1.8
 */
@Embeddable
public class PersonalInfo
{
	@Column(name = "first _name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	@Override
	public String toString()
	{
		return firstName + " " + lastName;
	}
}