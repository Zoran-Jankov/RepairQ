package com.repair_shop.data.entity;

import com.repair_shop.data.DataType;

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
	private DeviceType deviceType;
	private Brand brand;
	
	@Override
	public DataType getDataType()
	{
		return DataType.MODEL;
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
	public Brand getManufacturer()
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
		deviceType.removeReference(this.getID());
		brand.addReference(this);
	}
}