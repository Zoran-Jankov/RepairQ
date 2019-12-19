package main.java.com.yankov.repair_shop.data.entity;

import main.java.com.yankov.repair_shop.data.EntityType;

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
 * @author Zoran Jankov
 */
public class Model extends Property
{
	private DeviceType deviceType;
	private Brand brand;
	
	@Override
	public EntityType getEntityType()
	{
		return EntityType.MODEL;
	}
	
	/**
	 * Getter for model device type.
	 * @return Model device type.
	 */
	public DeviceType getDeviceType()
	{
		return deviceType;
	}
	
	/**
	 * Setter for model device type.
	 * @param deviceType - Model device type.
	 */
	public void setDeviceType(DeviceType deviceType)
	{
		this.deviceType = deviceType;
	}
	
	/**
	 * Getter for model manufacturer.
	 * @return Model manufacturer.
	 */
	public Brand getBrand()
	{
		return brand;
	}
	
	/**
	 * Setter for model manufacturer.
	 * @param brand - Model manufacturer.
	 */
	public void setBrand(Brand brand)
	{
		this.brand = brand;	
	}
	
	@Override
	public void createReferences()
	{
		deviceType.addReference(this);
		brand.addReference(this);
	}
	
	@Override
	public void deleteReferences()
	{
		deviceType.removeReference(this.getId());
		brand.addReference(this);
	}
}