package main.java.com.zoran_jankov.repair_shop.app.utility;

import main.java.com.zoran_jankov.repair_shop.app.controller.dialog.CustomerRegistrationController;
import main.java.com.zoran_jankov.repair_shop.app.controller.dialog.DeviceRegistrationController;
import main.java.com.zoran_jankov.repair_shop.app.controller.dialog.InputDialogController;
import main.java.com.zoran_jankov.repair_shop.app.controller.dialog.ModelRegistrationController;
import main.java.com.zoran_jankov.repair_shop.app.controller.dialog.PropertyRegistrationController;
import main.java.com.zoran_jankov.repair_shop.app.controller.dialog.TicketRegistrationController;
import main.java.com.zoran_jankov.repair_shop.app.controller.dialog.WindowController;
import main.java.com.zoran_jankov.repair_shop.data.EntityType;
import main.java.com.zoran_jankov.repair_shop.data.entity.Entity;

public class DialogClontrollerFactory
{
	public static InputDialogController createController(WindowController owner, EntityType entityType)
	{
		switch(entityType)
		{
			case TICKET:
				return new TicketRegistrationController(owner, entityType);
			
			case CUSTOMER:
				return new CustomerRegistrationController(owner, entityType);
			
			case DEVICE:
				return new DeviceRegistrationController(owner, entityType);
				
			case MODEL:
				return new ModelRegistrationController(owner, entityType);
				
			default:
			{
				if(EntityType.isAProperty(entityType))
				{
					return new PropertyRegistrationController(owner, entityType);
				}
				else
				{
					return null;
				}
			}
		}
	}

	public static InputDialogController createController(WindowController owner, Entity entity)
	{
		switch(entity.getType())
		{
			case TICKET:
				return new TicketRegistrationController(owner, entity);
			
			case CUSTOMER:
				return new CustomerRegistrationController(owner, entity);
			
			case DEVICE:
				return new DeviceRegistrationController(owner, entity);
				
			case MODEL:
				return new ModelRegistrationController(owner, entity);
				
			default:
			{
				if(EntityType.isAProperty(entity.getType()))
				{
					return new PropertyRegistrationController(owner, entity);
				}
				else
				{
					return null;
				}
			}
		}
	}
}