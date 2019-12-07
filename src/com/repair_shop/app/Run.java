package com.repair_shop.app;

import com.repair_shop.app.controller.DeviceRegistrationController;
import com.repair_shop.data.DataType;

public class Run
{
	public static void main(String[] args)
	{
		new DeviceRegistrationController(null, DataType.DEVICE);
	}
}