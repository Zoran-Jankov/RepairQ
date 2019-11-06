package com.repair_shop.utility;

import com.repair_shop.controller.ClientRegistrationController;
import com.repair_shop.controller.PropetyRegistrationController;
import com.repair_shop.controller.WindowController;

public class WindowClontrollerFactory
{
	public static WindowController createController(WindowController owner, byte newWindowType)
	{
		if(newWindowType == DataType.CLIENT)
		{
			return new ClientRegistrationController(owner);
		}
		
		if(isAPropertyWindow(newWindowType))
		{
			return new PropetyRegistrationController(owner, newWindowType);
		}
		else
		{
			return null;
		}
	}
	
	private static boolean isAPropertyWindow(byte type)
	{
		return (type == DataType.BRAND)
		    || (type == DataType.DEVICE_TYPE)
		    || (type == DataType.MARKETING_TYPE)
		    || (type == DataType.NOTIFICATION_TYPE)
		    || (type == DataType.STATUS);
	}
}
