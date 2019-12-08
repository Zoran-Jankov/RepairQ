package com.repair_shop.app.utility;

import com.repair_shop.app.controller.MainWindowController;
import com.repair_shop.app.controller.WindowController;

public class WindowControllerFactory
{
	public static WindowController createController(WindowTag window)
	{
		switch(window)
		{
			case MAIN_WINDOW:
				return new MainWindowController();
		
			default:
			{
			return null;
			}
		}	
	}
}