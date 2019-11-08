package com.repair_shop.utility;

import com.repair_shop.controller.ClientRegistrationController;
import com.repair_shop.controller.PropertyRegistrationController;
import com.repair_shop.controller.WindowController;

public class WindowClontrollerFactory
{
	public static WindowController createController(WindowController owner, DataType dataType)
	{
		if(DataType.isAClient(dataType))
		{
			return new ClientRegistrationController(owner, dataType);
		}
		else if(DataType.isAProperty(dataType))
		{
			return new PropertyRegistrationController(owner, dataType);
		}
		else
		{
			return null;
		}
	}
}