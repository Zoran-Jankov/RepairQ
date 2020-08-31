package com.zoran_jankov.repairq.data;

import com.zoran_jankov.repairq.data.entity.Brand;
import com.zoran_jankov.repairq.data.entity.Customer;
import com.zoran_jankov.repairq.data.entity.Device;
import com.zoran_jankov.repairq.data.entity.DeviceType;
import com.zoran_jankov.repairq.data.entity.Entity;
import com.zoran_jankov.repairq.data.entity.Model;
import com.zoran_jankov.repairq.data.entity.Notification;
import com.zoran_jankov.repairq.data.entity.Service;
import com.zoran_jankov.repairq.data.entity.ServiceType;
import com.zoran_jankov.repairq.data.entity.Ticket;
import com.zoran_jankov.repairq.data.entity.User;

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
			
			case CUSTOMER:
				return new Customer();
			
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