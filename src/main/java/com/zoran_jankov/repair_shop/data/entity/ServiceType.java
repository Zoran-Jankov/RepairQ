package main.java.com.zoran_jankov.repair_shop.data.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;

import main.java.com.zoran_jankov.repair_shop.data.EntityType;
import main.java.com.zoran_jankov.repair_shop.data.embeddable.BasicInfo;

/**
 * Class ServiceType extends abstract class Property and represents
 * a the type of a service.
 * 
 * @author Zoran Jankov
 */
@Entity
public class ServiceType extends AbstractEntity
{
	@Embedded
	private BasicInfo serviceType;
	
	@Column(name = "default_price")
	private int defaultPrice;
	
	/**
	 * Returns EntityType.SERVICE_TYPE enum.
	 * @return (enum EntityType) SERVICE_TYPE
	 */
	@Override
	public EntityType getType()
	{
		return EntityType.SERVICE_TYPE;
	}
	
	public BasicInfo getServiceType()
	{
		return serviceType;
	}

	public void setServiceType(BasicInfo serviceType)
	{
		this.serviceType = serviceType;
	}
	
	/**
	 * Getter for default price of the service type.
	 * @return (int) Default price of the service type
	 */
	public int getDefaultPrice()
	{
		return defaultPrice;
	}

	/**
	 * Setter for default price of the service type.
	 * @param defaultPrice
	 */
	public void setDefaultPrice(int defaultPrice)
	{
		this.defaultPrice = defaultPrice;
	}
}