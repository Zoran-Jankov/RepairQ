package com.zoran_jankov.repairq.data.embeddable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

/**
 * The abstract class Person is a abstract entity data class 
 * that represents personal information about a person.
 * 
 * @author Zoran Jankov
 */
@Data
@Embeddable
public class PersonalInfo
{
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(name = "last_name", nullable = false)
	private String lastName;
	
	public String getDispalyName()
	{
		return firstName + " " + lastName;
	}
}