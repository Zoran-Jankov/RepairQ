package com.repair_shop.utility;

import com.repair_shop.controller.DeviceRegistrationController;
import com.repair_shop.data.DataType;

public class Run
{
	public static void main(String[] args)
	{
		new DeviceRegistrationController(null, DataType.CLIENT);
	}
}