package com.repair_shop.data;

import com.repair_shop.data.entity.Entity;

public enum DataType
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
	
	public static boolean hasUniqueString(Entity dataElement)
	{
		DataType dataType = dataElement.getDataType();
		
		return !(dataType == NOTIFICATION
			  || dataType == SERVICE
			  || dataType == TICKET);
	}
	
	public static boolean makesReferences(Entity dataElement)
	{
		DataType dataType = dataElement.getDataType();
		
		return (dataType == NOTIFICATION)
			|| (dataType == SERVICE)
			|| (dataType == TICKET)
			|| (dataType == CLIENT)
			|| (dataType == DEVICE)
			|| (dataType == MODEL);
	}
	
	public static boolean isAProperty(DataType dataType)
	{
		return (dataType == NOTIFICATION_TYPE)
		    || (dataType == MARKETING_TYPE)
		    || (dataType == STATUS)
		    || (dataType == DEVICE_TYPE)
		    || (dataType == BRAND);
	}
}