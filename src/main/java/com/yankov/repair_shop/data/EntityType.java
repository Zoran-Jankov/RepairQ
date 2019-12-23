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
	MARKETING,
	LEGAL_ENTITY,
	DEVICE,
	MODEL,
	DEVICE_TYPE,
	BRAND,
	USER;
	
	public static void checkForNullValue(EntityType entityType) throws NullPointerException
	{
		if(entityType == null)
			throw new NullPointerException("EntityType is null");
	}
	
	public static boolean hasDisplayName(EntityType entityType)
	{
		switch (entityType)
		{
        	case NOTIFICATION:
        	case SERVICE:
        	case TICKET:
        	case DEVICE:
        		return false;
        		
        	default:
        		return true;
		}
	}
	
	public static boolean hasDisplayName(Entity entity)
	{
		return hasDisplayName(entity.getEntityType());
	}
	
	
	
	public static boolean makesReferences(Entity entity)
	{
		EntityType entityType = entity.getEntityType();
		
		switch (entityType)
		{
        	case NOTIFICATION:
        	case SERVICE:
        	case TICKET:
        	case CLIENT:
        	case DEVICE:
        	case MODEL:
        		return true;
        		
        	default:
        		return false;
		}
	}
	
	public static boolean isAProperty(EntityType entityType)
	{
		switch (entityType)
		{
        	case NOTIFICATION_TYPE:
        	case MARKETING:
        	case STATUS:
        	case DEVICE_TYPE:
        	case BRAND:
        		return true;
        		
        	default:
        		return false;
		}
	}
}