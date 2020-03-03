package main.java.com.zoran_jankov.repair_shop.data.entity;

import javax.persistence.Entity;

import main.java.com.zoran_jankov.repair_shop.data.EntityType;
import main.java.com.zoran_jankov.repair_shop.data.embeddable.BasicInfo;

/**
 * Class DeviceType represents a device type.
 * 
 * @author Zoran Jankov
 */
@Entity
public class DeviceType extends AbstractEntity
{
	private BasicInfo deviceType;
	
	@Override
	public EntityType getType()
	{
		return EntityType.DEVICE_TYPE;
	}
	
	public BasicInfo getDeviceType()
	{
		return deviceType;
	}
	
	public void setDeviceType(BasicInfo deviceType)
	{
		this.deviceType = deviceType;
	}
	
	@Override
	public String getDisplayName()
	{
		return deviceType.getPropertyName();
	}
}