package com.repair_shop.app.utility;

import com.repair_shop.app.controller.ClientRegistrationController;
import com.repair_shop.app.controller.DeviceRegistrationController;
import com.repair_shop.app.controller.ModelRegistrationController;
import com.repair_shop.app.controller.PropertyRegistrationController;
import com.repair_shop.app.controller.TicketRegistrationController;
import com.repair_shop.app.controller.WindowController;
import com.repair_shop.data.DataType;

public class DialogClontrollerFactory
{
	public static InputDialogController createController(WindowController owner, DataType dataType)
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
				if(DataType.isAProperty(dataType))
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