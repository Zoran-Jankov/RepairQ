package main.java.com.yankov.repair_shop.data.entity;

import main.java.com.yankov.repair_shop.data.EntityType;

/**
 * Class Marketing extends abstract class Property and represents
 * a how did a client find about your business.
 * 
 * @author Zoran Jankov
 */
public class Marketing extends Property
{
	/**
	 * Returns EntityType.MARKETING enum.
	 * @return (enum EntityType) MARKETING
	 */
	@Override
	public EntityType getEntityType()
	{
		return EntityType.MARKETING;
	}
	
	public String getMarketing()
	{
		return getPropertyName();
	}
}