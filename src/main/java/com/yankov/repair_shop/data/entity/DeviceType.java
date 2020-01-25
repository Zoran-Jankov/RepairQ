package main.java.com.yankov.repair_shop.data.entity;

import main.java.com.yankov.repair_shop.data.EntityType;
import main.java.com.yankov.repair_shop.data.component.Property;

/**
 * Class DeviceType represents a device type.
 * 
 * @author Zoran Jankov
 */
public class DeviceType extends AbstractEntity
{
	private Property deviceType;
	
	@Override
	public EntityType getType()
	{
		return EntityType.DEVICE_TYPE;
	}
	
	public Property getBrand()
	{
		return deviceType;
	}
	
	public void setBrand(Property deviceType)
	{
		this.deviceType = deviceType;
	}
	
	@Override
	public String getDisplayName()
	{
		return deviceType.getPropertyName();
	}
}