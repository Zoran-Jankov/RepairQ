package main.java.com.yankov.repair_shop.data.entity;

/** 
 * Class Property inherits DataElement class, and represents a property of various data classes with fields that define those classes.
 * <p>
 * Inherits field:
 * <p>
 * (int) ID number - must be unique
 * <p>
 * Fields:
 * <p>
 * (String) Property name - must be unique
 * <p>
 * (String) Property description
 * <p>
 *		
 * @author Zoran Jankov
 * @version 1.2
 * @since 2019-10-15
 */

public abstract class Property extends AbstractEntity
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

	@Override
	public String getDisplayName()
	{
		return getPropertyName();
	}
}