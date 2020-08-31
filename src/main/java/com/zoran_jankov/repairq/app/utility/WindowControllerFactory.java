package main.java.com.zoran_jankov.repair_shop.app.utility;

import main.java.com.zoran_jankov.repair_shop.app.controller.dialog.LoginDialogController;
import main.java.com.zoran_jankov.repair_shop.app.controller.dialog.MainWindowController;
import main.java.com.zoran_jankov.repair_shop.app.controller.dialog.WindowController;

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