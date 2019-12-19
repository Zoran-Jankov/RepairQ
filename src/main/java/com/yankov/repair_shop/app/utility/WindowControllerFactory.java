package main.java.com.yankov.repair_shop.app.utility;

import main.java.com.yankov.repair_shop.app.controller.LoginDialogController;
import main.java.com.yankov.repair_shop.app.controller.MainWindowController;
import main.java.com.yankov.repair_shop.app.controller.WindowController;

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
				return null;
		}	
	}
}