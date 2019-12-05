package com.repair_shop.utility;

import com.repair_shop.controller.ClientRegistrationController;
import com.repair_shop.controller.DeviceRegistrationController;
import com.repair_shop.controller.InputDialogController;
import com.repair_shop.controller.ModelRegistrationController;
import com.repair_shop.controller.PropertyRegistrationController;
import com.repair_shop.controller.TicketRegistrationController;
import com.repair_shop.controller.WindowController;
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