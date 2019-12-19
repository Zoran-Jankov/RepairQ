package main.java.com.yankov.repair_shop.data.entity;

import main.java.com.yankov.repair_shop.data.EntityType;

/**
 * Class Status extends abstract class Property and represents
 * a current ticket status.
 * 
 * @author Zoran Jankov
 */
public class Status extends Property
{
	/**
	 * Returns EntityType.STATUS enum.
	 * @return (enum EntityType) STATUS
	 */
	@Override
	public EntityType getEntityType()
	{
		return EntityType.STATUS;
	}
}