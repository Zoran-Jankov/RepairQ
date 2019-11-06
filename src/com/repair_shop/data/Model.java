package com.repair_shop.data;

/** 
 * Class Model extends class GeneralProperty and represents 
 * a device model with associated information about that model.
 * <p>
 * Inherits fields:
 * <p>
 * (int) ID number - must be unique
 * <p>
 * (String) Model name - must be unique
 * <p>
 * (String) Model description
 * <p>
 * 
 * Has fields are:
 * <p>
 * (Property) Model device type
 * <p>
 * (Property) Model manufacturer
 * <p>
 * 				
 * @author Zoran Jankov
 * @version 1.3
 * @since 2019-10-03
 */

public class Model extends Property
{
	private Property deviceType;
	private Property manufacturer;
	
	/**
	 * Getter for model device type.
	 * @return Model device type.
	 */
	public Property getDeviceType()
	{
		return deviceType;
	}
	
	/**
	 * Setter for model device type.
	 * @param deviceType - Model device type.
	 */
	public void setDeviceType(Property deviceType)
	{
		this.deviceType = deviceType;
	}
	
	/**
	 * Getter for model manufacturer.
	 * @return Model manufacturer.
	 */
	public Property getManufacturer()
	{
		return manufacturer;
	}
	
	/**
	 * Setter for model manufacturer.
	 * @param manufacturer - Model manufacturer.
	 */
	public void setManufacturer(Property manufacturer)
	{
		this.manufacturer = manufacturer;	
	}
	
	@Override
	public void createReferences()
	{
		deviceType.addReference(this);
		manufacturer.addReference(this);
	}
	
	@Override
	public void deleteReferences()
	{
		deviceType.removeReference(this.getID());
		manufacturer.addReference(this);
	}
	
	@Override
	public boolean isReferencable()
	{
		return true;
	}
}