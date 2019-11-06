package com.repair_shop.utility;

public class DataType
{
	public static final byte NOTIFICATION = 0;
	public static final byte NOTIFICATION_TYPE = 1;
	public static final byte SERVICE = 2;
	public static final byte SERVICE_TYPE = 3;
	public static final byte TICKET = 4;
	public static final byte STATUS = 5;
	public static final byte CLIENT = 6;
	public static final byte MARKETING_TYPE = 7;
	public static final byte LEGAL_ENTITY = 8;
	public static final byte DEVICE = 9;
	public static final byte MODEL = 10;
	public static final byte DEVICE_TYPE = 11;
	public static final byte BRAND = 12;
	public static final byte USER = 13;
	public static final byte USER_TYPE = 14;
	
	public static boolean isAProperty(byte type)
	{
		return (type == NOTIFICATION_TYPE)
		    || (type == MARKETING_TYPE)
		    || (type == STATUS)
		    || (type == DEVICE_TYPE)
		    || (type == BRAND);
	}
	
	public static boolean isANotification(byte type)
	{
		return type == NOTIFICATION;
	}
	
	public static boolean isANotificationType(byte type)
	{
		return type == NOTIFICATION_TYPE;
	}
	
	public static boolean isAService(byte type)
	{
		return type == SERVICE;
	}
	
	public static boolean isAServiceType(byte type)
	{
		return type == SERVICE_TYPE;
	}
	
	public static boolean isATicket(byte type)
	{
		return type == TICKET;
	}
	
	public static boolean isAStatus(byte type)
	{
		return type == STATUS;
	}
	
	public static boolean isAClient(byte type)
	{
		return type == CLIENT;
	}
	
	public static boolean isAMatketingType(byte type)
	{
		return type == MARKETING_TYPE;
	}
	
	public static boolean isALegalEntity(byte type)
	{
		return type == LEGAL_ENTITY;
	}
	
	public static boolean isADevice(byte type)
	{
		return type == DEVICE;
	}
	
	public static boolean isAModel(byte type)
	{
		return type == MODEL;
	}
	
	public static boolean isADeviceType(byte type)
	{
		return type == DEVICE_TYPE;
	}
	
	public static boolean isABrand(byte type)
	{
		return type == BRAND;
	}
	
	public static boolean isAUser(byte type)
	{
		return type == USER;
	}
	
	public static boolean isAUserType(byte type)
	{
		return type == USER_TYPE;
	}
}
