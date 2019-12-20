package main.java.com.yankov.repair_shop.data.entity;

import main.java.com.yankov.repair_shop.data.EntityType;

/**
 * Class NotificationType extends abstract class Property and represents
 * a the type of a notification.
 * 
 * @author Zoran Jankov
 */
public class NotificationType extends Property
{
	/**
	 * Returns EntityType.NOTIFICATION_TYPE enum.
	 * @return (enum EntityType) NOTIFICATION_TYPE
	 */
	@Override
	public EntityType getEntityType()
	{
		return EntityType.NOTIFICATION_TYPE;
	}
	
	public String getNotificationType()
	{
		return getPropertyName();
	}
}