package main.java.com.yankov.repair_shop.data.entity;

import main.java.com.yankov.repair_shop.data.EntityType;
import main.java.com.yankov.repair_shop.data.component.BasicInfo;

/**
 * Class ServiceType extends abstract class Property and represents
 * a the type of a service.
 * 
 * @author Zoran Jankov
 */
public class ServiceType extends BasicInfo
{
	private int defaultPrice;
	
	/**
	 * Returns EntityType.SERVICE_TYPE enum.
	 * @return (enum EntityType) SERVICE_TYPE
	 */
	@Override
	public EntityType getEntityType()
	{
		return EntityType.SERVICE_TYPE;
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