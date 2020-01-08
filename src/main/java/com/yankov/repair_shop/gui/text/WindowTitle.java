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
	
	public static String NOTIFICATION_UPDATE = "Notification Update";
	public static String NOTIFICATION_TYPE_UPDATE = "Notification Type Update";
	public static String SERVICE_UPDATE = "Service Update";
	public static String SERVICE_TYPE_UPDATE = "Service Type Update";
	public static String TICKET_UPDATE = "Ticket Update";
	public static String STATUS_UPDATE = "Status Update";
	public static String CLIENT_UPDATE = "Client Update";
	public static String MARKETING_UPDATE = "Marketing Update";
	public static String LEGAL_ENTITY_UPDATE = "Lefal Entity Update";
	public static String DEVICE_UPDATE = "Device Update";
	public static String MODEL_UPDATE = "Model Update";
	public static String DEVICE_TYPE_UPDATE = "Device Type Update";
	public static String BRAND_UPDATE = "Brand Update";
	public static String USER_UPDATE = "User Update";
	
	private static String NEW_PROPERTY = "Unknown Property - ERROR";
	private static String PROPERTY_UPDATE ="Unknown Property - ERROR";
	
	public static String getNewPropertyTitle(EntityType entityType)
	{
		switch(entityType)
		{
			case NOTIFICATION_TYPE:
				return NEW_NOTIFICATION_TYPE;
			
			case MARKETING:
				return NEW_MARKETING;
				
			case STATUS:
				return NEW_STATUS;
				
			case DEVICE_TYPE:
				return NEW_DEVICE_TYPE;
				
			case BRAND:
				return NEW_BRAND;
				
			default:
				return NEW_PROPERTY;
		}
	}
	
	public static String getPropertyUpdateTitle(EntityType entityType)
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
				return PROPERTY_UPDATE;
		}
	}
}