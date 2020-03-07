package main.java.com.zoran_jankov.repair_shop.data.embeddable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * The abstract class Person is a abstract entity data class 
 * that represents personal information about a person.
 * 
 * @author Zoran Jankov
 * @version 1.8
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Embeddable
public class PersonalInfo
{
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	public String getDispalyName()
	{
		return firstName + " " + lastName;
	}
}