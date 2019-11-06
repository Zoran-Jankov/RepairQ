package com.repair_shop.utility;

import com.repair_shop.controller.ClientRegistrationController;
import com.repair_shop.controller.PropertyRegistrationController;
import com.repair_shop.controller.WindowController;

public class WindowClontrollerFactory
{
	public static WindowController createController(WindowController owner, byte newWindowType)
	{
		if(newWindowType == DataType.CLIENT)
		{
			return new ClientRegistrationController(owner);
		}
		else if(DataType.isAProperty(newWindowType))
		{
			return new PropertyRegistrationController(owner, newWindowType);
		}
		else
		{
			return null;
		}
	}
	
	
}
