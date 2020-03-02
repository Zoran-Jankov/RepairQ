package main.java.com.zoran_jankov.repair_shop.data.component;

import javax.persistence.Embeddable;

/** 
 * Class BasicInfo represents a basic information of various entity classes.
 * 
 * @author Zoran Jankov
 * @version 1.2
 * @since 2019-10-15
 */
@Embeddable
public class BasicInfo
{
	private String name;
	private String description;
	
	public BasicInfo(String name, String description)
	{
		this.name = name;
		this.description = description;
	}
	
	/**
	 * Getter for general property name.
	 * @return General property name.
	 */
	public String getPropertyName()
	{
		return name;
	}
	
	/**
	 * Setter for general property name.
	 * @param name - General property name.
	 */
	public void setPropertyName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Getter for general property description.
	 * @return General property description.
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * Setter for general property description.
	 * @param description - General property description.
	 */
	public void setDescription(String description)
	{
		this.description = description;
	}
}