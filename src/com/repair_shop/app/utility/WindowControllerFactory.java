package com.repair_shop.app.utility;

import com.repair_shop.app.controller.LoginDialogController;
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
		
			case LOGIN_DIALOG:
				return new LoginDialogController();
			default:
			{
			return null;
			}
		}	
	}
}