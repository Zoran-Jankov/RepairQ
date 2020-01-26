package main.java.com.yankov.repair_shop.data.entity;

import main.java.com.yankov.repair_shop.data.EntityType;
import main.java.com.yankov.repair_shop.data.component.BasicInfo;

/**
 * Class DeviceType represents a device type.
 * 
 * @author Zoran Jankov
 */
public class DeviceType extends AbstractEntity
{
	private BasicInfo deviceType;
	
	@Override
	public EntityType getType()
	{
		return EntityType.DEVICE_TYPE;
	}
	
	public BasicInfo getBrand()
	{
		return deviceType;
	}
	
	public void setBrand(BasicInfo deviceType)
	{
		this.deviceType = deviceType;
	}
	
	@Override
	public String getDisplayName()
	{
		return deviceType.getPropertyName();
	}
}