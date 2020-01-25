package main.java.com.yankov.repair_shop.data;

import main.java.com.yankov.repair_shop.data.entity.Brand;
import main.java.com.yankov.repair_shop.data.entity.Client;
import main.java.com.yankov.repair_shop.data.entity.Device;
import main.java.com.yankov.repair_shop.data.entity.DeviceType;
import main.java.com.yankov.repair_shop.data.entity.Entity;
import main.java.com.yankov.repair_shop.data.entity.Marketing;
import main.java.com.yankov.repair_shop.data.entity.Model;
import main.java.com.yankov.repair_shop.data.entity.Notification;
import main.java.com.yankov.repair_shop.data.entity.Service;
import main.java.com.yankov.repair_shop.data.entity.ServiceType;
import main.java.com.yankov.repair_shop.data.entity.Ticket;
import main.java.com.yankov.repair_shop.data.entity.User;

public class EntityFactory
{
	public static Entity create(EntityType entityType)
	{
		switch(entityType)
		{
			case NOTIFICATION:
				return new Notification();
			
			case SERVICE:
				return new Service();
				
			case SERVICE_TYPE:
				return new ServiceType();
				
			case TICKET:
				return new Ticket();
			
			case CLIENT:
				return new Client();
				
			case MARKETING:
				return new Marketing();
			
			case DEVICE:
				return new Device();
			
			case MODEL:
				return new Model();
				
			case DEVICE_TYPE:
				return new DeviceType();
				
			case BRAND:
				return new Brand();
				
			case USER:
				return new User();
				
			default:
				return null;
		}
	}
}