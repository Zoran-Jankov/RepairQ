package com.zoran_jankov.repairq.app.utility;

import com.zoran_jankov.repairq.app.controller.dialog.LoginDialogController;
import com.zoran_jankov.repairq.app.controller.dialog.MainWindowController;
import com.zoran_jankov.repairq.app.controller.dialog.WindowController;

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