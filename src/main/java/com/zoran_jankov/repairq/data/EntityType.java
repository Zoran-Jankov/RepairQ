package com.zoran_jankov.repairq.data;

import com.zoran_jankov.repairq.data.entity.Entity;

public enum EntityType
{
	NOTIFICATION,
	NOTIFICATION_TYPE,
	SERVICE,
	SERVICE_TYPE,
	TICKET,
	STATUS,
	CUSTOMER,
	MARKETING,
	LEGAL_ENTITY,
	DEVICE,
	MODEL,
	DEVICE_TYPE,
	BRAND,
	USER;
	
	public static boolean hasDisplayName(EntityType type)
	{
		switch (type)
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
		return hasDisplayName(entity.getType());
	}
	
	public static boolean isABasicInfo(EntityType entityType)
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