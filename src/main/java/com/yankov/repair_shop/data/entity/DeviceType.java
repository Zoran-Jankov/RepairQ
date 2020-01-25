package main.java.com.yankov.repair_shop.data.entity;

import main.java.com.yankov.repair_shop.data.EntityType;
import main.java.com.yankov.repair_shop.data.component.Property;

/**
 * Class DeviceType extends abstract class Property and represents
 * a device type.
 * 
 * @author Zoran Jankov
 */
public class DeviceType extends Property
{
	/**
	 * Returns EntityType.DEVICE_TYPE enum.
	 * @return (enum EntityType) DEVICE_TYPE
	 */
	@Override
	public EntityType getEntityType()
	{
		return EntityType.DEVICE_TYPE;
	}
	
	public String getDeviceType()
	{
		return getPropertyName();
	}
}