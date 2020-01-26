package main.java.com.yankov.repair_shop.data.component;

/** 
 * Class BasicInfo represents a basic information of various entity classes.
 * 
 * @author Zoran Jankov
 * @version 1.2
 * @since 2019-10-15
 */

public abstract class BasicInfo
{
	private String name;
	private String description;
	
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