package main.java.com.yankov.repair_shop.data;

import main.java.com.yankov.repair_shop.data.entity.Entity;

public enum EntityType
{
	NOTIFICATION,
	NOTIFICATION_TYPE,
	SERVICE,
	SERVICE_TYPE,
	TICKET,
	STATUS,
	CLIENT,
	MARKETING_TYPE,
	LEGAL_ENTITY,
	DEVICE,
	MODEL,
	DEVICE_TYPE,
	BRAND,
	USER;
	
	public static boolean hasDisplayName(Entity entity)
	{
		EntityType dataType = entity.getEntityType();
		
		return !(dataType == NOTIFICATION
			  || dataType == SERVICE
			  || dataType == TICKET
			  || dataType == DEVICE);
	}
	
	public static boolean makesReferences(Entity entity)
	{
		EntityType dataType = entity.getEntityType();
		
		return (dataType == NOTIFICATION)
			|| (dataType == SERVICE)
			|| (dataType == TICKET)
			|| (dataType == CLIENT)
			|| (dataType == DEVICE)
			|| (dataType == MODEL);
	}
	
	public static boolean isAProperty(EntityType dataType)
	{
		return (dataType == NOTIFICATION_TYPE)
		    || (dataType == MARKETING_TYPE)
		    || (dataType == STATUS)
		    || (dataType == DEVICE_TYPE)
		    || (dataType == BRAND);
	}
}