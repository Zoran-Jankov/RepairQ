package main.java.com.zoran_jankov.repair_shop.data.entity;

import main.java.com.zoran_jankov.repair_shop.data.EntityType;
import main.java.com.zoran_jankov.repair_shop.data.component.BasicInfo;
import main.java.com.zoran_jankov.repair_shop.data.reference.DevceTypeReferenceMap;
import main.java.com.zoran_jankov.repair_shop.data.reference.EntityReferenceMap;

/**
 * Class DeviceType represents a device type.
 * 
 * @author Zoran Jankov
 */
public class DeviceType extends AbstractEntity
{
	private BasicInfo deviceType;
	private DevceTypeReferenceMap reference;
	
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

	@Override
	public EntityReferenceMap getReferenceMap()
	{
		return reference;
	}
}