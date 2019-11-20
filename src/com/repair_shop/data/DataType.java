package com.repair_shop.data;

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
	
	public static boolean hasUniqueString(DataElement dataElement)
	{
		DataType dataType = dataElement.getDataType();
		
		return !(dataType == NOTIFICATION
			  || dataType == SERVICE
			  || dataType == TICKET);
	}
	
	public static boolean makesReferences(DataElement dataElement)
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
	
	public static boolean isANotification(DataType dataType)
	{
		return dataType == NOTIFICATION;
	}
	
	public static boolean isANotificationType(DataType dataType)
	{
		return dataType == NOTIFICATION_TYPE;
	}
	
	public static boolean isAService(DataType dataType)
	{
		return dataType == SERVICE;
	}
	
	public static boolean isAServiceType(DataType dataType)
	{
		return dataType == SERVICE_TYPE;
	}
	
	public static boolean isATicket(DataType dataType)
	{
		return dataType == TICKET;
	}
	
	public static boolean isAStatus(DataType dataType)
	{
		return dataType == STATUS;
	}
	
	public static boolean isAClient(DataType dataType)
	{
		return dataType == CLIENT;
	}
	
	public static boolean isAMatketingType(DataType dataType)
	{
		return dataType == MARKETING_TYPE;
	}
	
	public static boolean isALegalEntity(DataType dataType)
	{
		return dataType == LEGAL_ENTITY;
	}
	
	public static boolean isADevice(DataType dataType)
	{
		return dataType == DEVICE;
	}
	
	public static boolean isAModel(DataType dataType)
	{
		return dataType == MODEL;
	}
	
	public static boolean isADeviceType(DataType dataType)
	{
		return dataType == DEVICE_TYPE;
	}
	
	public static boolean isABrand(DataType dataType)
	{
		return dataType == BRAND;
	}
	
	public static boolean isAUser(DataType dataType)
	{
		return dataType == USER;
	}
}