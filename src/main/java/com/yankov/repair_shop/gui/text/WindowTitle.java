package main.java.com.yankov.repair_shop.gui.text;

import main.java.com.yankov.repair_shop.data.EntityType;

public class WindowTitle
{
	public static String LOGIN = "Login";
	public static String MAIN_WINDOW = "Repair Shop Software";
	
	public static String NEW_NOTIFICATION = "New Notification";
	public static String NEW_NOTIFICATION_TYPE = "New Notification Type Registration";
	public static String NEW_SERVICE = "New Service";
	public static String NEW_SERVICE_TYPE = "New Service Type Registration";
	public static String NEW_TICKET = "New Ticket";
	public static String NEW_STATUS = "New Status Registration";
	public static String NEW_CLIENT = "New Client Registration";
	public static String NEW_MARKETING = "New Marketing Registration";
	public static String NEW_LEGAL_ENTITY = "New Lefal Entity Registration";
	public static String NEW_DEVICE = "New Device Registration";
	public static String NEW_MODEL = "New Model Registration";
	public static String NEW_DEVICE_TYPE = "New Device Type Registration";
	public static String NEW_BRAND = "New Brand Registration";
	public static String NEW_USER = "New User Registration";
	
	public static String NOTIFICATION_UPDATE = "New Notification";
	public static String NOTIFICATION_TYPE_UPDATE = "New Notification Type Registration";
	public static String SERVICE_UPDATE = "New Service";
	public static String SERVICE_TYPE_UPDATE = "New Service Type Registration";
	public static String TICKET_UPDATE = "New Ticket";
	public static String STATUS_UPDATE = "New Status Registration";
	public static String CLIENT_UPDATE = "New Client Registration";
	public static String MARKETING_UPDATE = "New Marketing Registration";
	public static String LEGAL_ENTITY_UPDATE = "New Lefal Entity Registration";
	public static String DEVICE_UPDATE = "New Device Registration";
	public static String MODEL_UPDATE = "New Model Registration";
	public static String DEVICE_TYPE_UPDATE = "New Device Type Registration";
	public static String BRAND_UPDATE = "New Brand Registration";
	public static String USER_UPDATE = "New User Registration";
	
	public static String PROPERTY ="Unknown Property - ERROR";
	
	public static String getPropertyTitle(EntityType entityType)
	{
		switch(entityType)
		{
			case NOTIFICATION_TYPE:
				return NOTIFICATION_TYPE_UPDATE;
			
			case MARKETING:
				return MARKETING_UPDATE;
				
			case STATUS:
				return STATUS_UPDATE;
				
			case DEVICE_TYPE:
				return DEVICE_TYPE_UPDATE;
				
			case BRAND:
				return BRAND_UPDATE;
				
			default:
				return PROPERTY;
		}
	}
}