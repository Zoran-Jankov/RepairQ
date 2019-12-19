package main.java.com.yankov.repair_shop.app.utility;

import main.java.com.yankov.repair_shop.app.controller.ClientRegistrationController;
import main.java.com.yankov.repair_shop.app.controller.DeviceRegistrationController;
import main.java.com.yankov.repair_shop.app.controller.InputDialogController;
import main.java.com.yankov.repair_shop.app.controller.ModelRegistrationController;
import main.java.com.yankov.repair_shop.app.controller.PropertyRegistrationController;
import main.java.com.yankov.repair_shop.app.controller.TicketRegistrationController;
import main.java.com.yankov.repair_shop.app.controller.WindowController;
import main.java.com.yankov.repair_shop.data.EntityType;

public class DialogClontrollerFactory
{
	public static InputDialogController createController(WindowController owner, EntityType entityType)
	{
		switch(entityType)
		{
			case TICKET:
				return new TicketRegistrationController(owner, entityType);
			
			case CLIENT:
				return new ClientRegistrationController(owner, entityType);
			
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
}