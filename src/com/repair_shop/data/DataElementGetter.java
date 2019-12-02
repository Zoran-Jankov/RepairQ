package com.repair_shop.data;

public class DataElementGetter
{
	public static DataElement getBrand(String name)
	{
		return DataManager.getByUniqueString(DataType.BRAND, name);
	}
	
	public static DataElement getClient(int id)
	{
		return DataManager.getByID(DataType.CLIENT, id);
	}
	
	public static DataElement getDevice(int id)
	{
		return DataManager.getByID(DataType.DEVICE, id);
	}
	
	public static DataElement getDeviceType(String name)
	{
		return DataManager.getByUniqueString(DataType.DEVICE_TYPE, name);
	}
	
	public static DataElement getLegalEntity(String taxID)
	{
		return DataManager.getByUniqueString(DataType.LEGAL_ENTITY, taxID);
	}
	
	public static Marketing getMarketing(String name)
	{
		return (Marketing) DataManager.getByUniqueString(DataType.MARKETING_TYPE, name);
	}
	
	public static DataElement getModel(String name)
	{
		return DataManager.getByUniqueString(DataType.MODEL, name);
	}
	
	public static DataElement getNotification(int id)
	{
		return DataManager.getByID(DataType.NOTIFICATION, id);
	}
	
	public static DataElement getNotificationType(String name)
	{
		return DataManager.getByUniqueString(DataType.NOTIFICATION_TYPE, name);
	}
	
	public static DataElement getService(int id)
	{
		return DataManager.getByID(DataType.SERVICE, id);
	}
	
	public static DataElement getServiceType(String name)
	{
		return DataManager.getByUniqueString(DataType.SERVICE_TYPE, name);
	}
	
	public static DataElement getStatus(String name)
	{
		return DataManager.getByUniqueString(DataType.STATUS, name);
	}
	
	public static DataElement getTicket(int id)
	{
		return DataManager.getByID(DataType.TICKET, id);
	}
	
	public static DataElement getUser(String name)
	{
		return DataManager.getByUniqueString(DataType.USER, name);
	}
}