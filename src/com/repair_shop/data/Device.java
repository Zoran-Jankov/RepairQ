package com.repair_shop.data;

/** 
 * Class Device inherits DataElement class, and represents a device with
 * associated information about that device.
 * <p>
 * Inherits field:
 * <p>
 * (int) ID number - must be unique
 * <p>
 * Fields:
 * <p>
 * (Model) Device model
 * <p>
 * (Sreing) Device serial number - must be unique
 * <p>
 * 				
 * @author Zoran Jankov
 * @version 1.2
 * @since 2019-10-15
 */

public class Device extends AbstractDataElement
{
	private Model model;
	private String serial;
	
	@Override
	public DataType getDataType()
	{
		return DataType.DEVICE;
	}
	
	/**
	 * Getter for device model.
	 * @return Device model.
	 */
	public Model getModel()
	{
		return model;
	}
	
	/**
	 * Setter for device model.
	 * @param model - Device model.
	 */
	public void setModel(Model model)
	{
		this.model = model;
	}
	
	/**
	 * Getter for device serial number.
	 * @return device serial number.
	 */
	public String getSerial()
	{
		return serial;
	}
	
	/**
	 * Setter for device serial number.
	 * @param serial - Device serial number.
	 */
	public void setSerial(String serial)
	{
		this.serial = serial;
	}

	@Override
	public String getUniqueString()
	{
		return getSerial();
	}
	
	@Override
	public void createReferences()
	{
		model.addReference(this);
	}
	
	@Override
	public void deleteReferences()
	{
		model.removeReference(this.getID());
	}
}