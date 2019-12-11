package com.repair_shop.data;

import com.repair_shop.data.entity.Brand;
import com.repair_shop.data.entity.Client;
import com.repair_shop.data.entity.Device;
import com.repair_shop.data.entity.DeviceType;
import com.repair_shop.data.entity.Entity;
import com.repair_shop.data.entity.LegalEntity;
import com.repair_shop.data.entity.Marketing;
import com.repair_shop.data.entity.Model;
import com.repair_shop.data.entity.Notification;
import com.repair_shop.data.entity.NotificationType;
import com.repair_shop.data.entity.Service;
import com.repair_shop.data.entity.ServiceType;
import com.repair_shop.data.entity.Status;
import com.repair_shop.data.entity.Ticket;
import com.repair_shop.data.entity.User;

public class EntityFactory
{
	public static Entity create(DataType dataType)
	{
		switch(dataType)
		{
			case NOTIFICATION:
				return new Notification();
			
			case NOTIFICATION_TYPE:
				return new NotificationType();
			
			case SERVICE:
				return new Service();
				
			case SERVICE_TYPE:
				return new ServiceType();
				
			case TICKET:
				return new Ticket();
			
			case STATUS:
				return new Status();
			
			case CLIENT:
				return new Client();
				
			case MARKETING_TYPE:
				return new Marketing();
			
			case LEGAL_ENTITY:
				return new LegalEntity();
			
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