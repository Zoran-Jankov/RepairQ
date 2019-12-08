package com.repair_shop.app;

import com.repair_shop.app.utility.WindowControllerFactory;
import com.repair_shop.app.utility.WindowTag;

public class Run
{
	public static void main(String[] args)
	{
		WindowControllerFactory.createController(WindowTag.LOGIN_DIALOG);
	}
}