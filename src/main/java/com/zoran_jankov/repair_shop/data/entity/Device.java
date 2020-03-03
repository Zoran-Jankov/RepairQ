package main.java.com.zoran_jankov.repair_shop.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import main.java.com.zoran_jankov.repair_shop.data.EntityType;

/** 
 * Class Device inherits AbstractEntity class, and represents a device with
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
 * (String) Device serial number - must be unique
 * <p>			
 * @author Zoran Jankov
 */
@Entity
@Table(name = "device")
public class Device extends AbstractEntity
{
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id", nullable=false)
	private Model model;
	
	@Column(name = "serial")
	private String serial;
	
	@Override
	public EntityType getType()
	{
		return EntityType.DEVICE;
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
}