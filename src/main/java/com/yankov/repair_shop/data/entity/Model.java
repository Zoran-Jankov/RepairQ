package main.java.com.yankov.repair_shop.data.entity;

import java.util.HashMap;
import java.util.Map;

import main.java.com.yankov.repair_shop.data.EntityType;
import main.java.com.yankov.repair_shop.data.component.BasicInfo;

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
public class Model extends AbstractEntity
{
	private DeviceType deviceType;
	private Brand brand;
	private BasicInfo model;
	
	private Map<Integer, Device> devicesReferencingModel = new HashMap<Integer, Device>();
	
	@Override
	public final EntityType getType()
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
	
	public BasicInfo getModel()
	{
		return model;
	}

	public void setModel(BasicInfo model)
	{
		this.model = model;
	}
	
	public Map<Integer, Device> getDevicesReferencingModel()
	{
		return devicesReferencingModel;
	}

	public void setDevicesReferencingModel(Map<Integer, Device> devicesReferencingModel)
	{
		this.devicesReferencingModel = devicesReferencingModel;
	}
	
	public void addDeviceReferencingModel(Device device)
	{
		devicesReferencingModel.put(device.getId(), device);
	}
	
	public void removeDeviceReferencingModel(int id)
	{
		devicesReferencingModel.remove(id);
	}
	
	@Override
	public String getDisplayName()
	{
		return model.getPropertyName();
	}
	
	@Override
	public void createReferences()
	{
		deviceType.addModelReferencingDeviceType(this);
		brand.addModelReferencingBrand(this);
	}
	
	@Override
	public void deleteReferences()
	{
		deviceType.removeModelReferencingDeviceType(this.getId());
		brand.removeModelReferencingBrand(this.getId());
	}
}