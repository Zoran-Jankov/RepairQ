package main.java.com.zoran_jankov.repair_shop.data.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import main.java.com.zoran_jankov.repair_shop.data.EntityType;
import main.java.com.zoran_jankov.repair_shop.data.embeddable.BasicInfo;

/** 
 * Class Model represents a device model with associated 
 * information about that model.
 *
 * @author Zoran Jankov
 */
@Entity
@Table(name = "model")
public class Model extends AbstractEntity
{
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id", nullable = false)
	private DeviceType deviceType;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id", nullable = false)
	private Brand brand;
	
	@Embedded
	private BasicInfo model;
	
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
	
	@Override
	public String getDisplayName()
	{
		return model.getName();
	}
}