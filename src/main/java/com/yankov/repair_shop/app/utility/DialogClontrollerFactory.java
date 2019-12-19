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
	public static InputDialogController createController(WindowController owner, EntityType dataType)
	{
		switch(dataType)
		{
			case TICKET:
				return new TicketRegistrationController(owner, dataType);
			
			case CLIENT:
				return new ClientRegistrationController(owner, dataType);
			
			case DEVICE:
				return new DeviceRegistrationController(owner, dataType);
				
			case MODEL:
				return new ModelRegistrationController(owner, dataType);
				
			default:
			{
				if(EntityType.isAProperty(dataType))
				{
					return new PropertyRegistrationController(owner, dataType);
				}
				else
				{
					return null;
				}
			}
		}
	}
}