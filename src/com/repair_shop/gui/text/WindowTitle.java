package com.repair_shop.gui.text;

import com.repair_shop.data.DataType;

public class WindowTitle
{
	public static String LOGIN = "Login";
	public static String MAIN_WINDOW = "Repair Shop Software";
	
	public static String NOTIFICATION = "New Notification";
	public static String NOTIFICATION_TYPE = "Notification Type Registration";
	public static String SERVICE = "New Service";
	public static String SERVICE_TYPE = "Service Type Registration";
	public static String TICKET = "New Ticket";
	public static String STATUS = "Status Registration";
	public static String CLIENT = "Client Registration";
	public static String MARKETING_TYPE = "Marketing Registration";
	public static String LEGAL_ENTITY = "Lefal Entity Registration";
	public static String DEVICE = "Device Registration";
	public static String MODEL = "Model Registration";
	public static String DEVICE_TYPE = "Device Type Registration";
	public static String BRAND = "Brand Registration";
	public static String USER = "User Registration";
	
	public static String PROPERTY ="Unknown Property - ERROR";
	
	public static void setPropertyTitle(DataType dataType)
	{
		switch(dataType)
		{
			case NOTIFICATION_TYPE:
				PROPERTY = NOTIFICATION_TYPE;
				break;
			
			case MARKETING_TYPE:
				PROPERTY = MARKETING_TYPE;
				break;
				
			case STATUS:
				PROPERTY = STATUS;
				break;
				
			case DEVICE_TYPE:
				PROPERTY = DEVICE_TYPE;
				break;
				
			case BRAND:
				PROPERTY = BRAND;
				break;
				
			default:
				break;
		}
	}
}