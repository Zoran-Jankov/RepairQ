package main.java.com.yankov.repair_shop.data.entity;

import java.util.HashMap;
import java.util.Map;

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
	
	private Map<Integer, Model> modelsReferencingDeviceType = new HashMap<Integer, Model>();
	
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
	
	public Map<Integer, Model> getModelsReferencingDeviceType()
	{
		return modelsReferencingDeviceType;
	}

	public void setModelsReferencingDeviceType(Map<Integer, Model> modelsReferencingDeviceType)
	{
		this.modelsReferencingDeviceType = modelsReferencingDeviceType;
	}
	
	public void addModelReferencingDeviceType(Model model)
	{
		modelsReferencingDeviceType.put(model.getId(), model);
	}
	
	public void removeModelReferencingDeviceType(int id)
	{
		modelsReferencingDeviceType.remove(id);
	}
	
	@Override
	public String getDisplayName()
	{
		return deviceType.getPropertyName();
	}
}