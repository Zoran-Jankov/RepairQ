package main.java.com.zoran_jankov.repair_shop.app.controller;

import java.awt.Window;

import main.java.com.zoran_jankov.repair_shop.app.utility.ListenerFactory;
import main.java.com.zoran_jankov.repair_shop.app.utility.WindowControllerFactory;
import main.java.com.zoran_jankov.repair_shop.app.utility.WindowTag;
import main.java.com.zoran_jankov.repair_shop.gui.dialog.LoginDialog;
import main.java.com.zoran_jankov.repair_shop.gui.text.ButtonName;

public class LoginDialogController implements WindowController
{
	private LoginDialog gui = new LoginDialog();
	
	public LoginDialogController()
	{
		gui.getInputButtonPanel().setAddButtonFunction
		   (ListenerFactory.login(this), ButtonName.LOGIN);
		
		gui.getInputButtonPanel().setCancelButtonFunction
		   (ListenerFactory.closeWindow(this), ButtonName.QUIT);
		
		gui.setVisible(true);
	}
	
	@Override
	public Window getWindow()
	{
		return gui;
	}
	
	public void tryLogin()
	{
		if(isInputValid())
		{
			login();
		}
		else
		{
			showLoginError();
		}
	}

	private boolean isInputValid()
	{
		return true;
	}

	private void login()
	{
		WindowControllerFactory.createController(WindowTag.MAIN_WINDOW);
		gui.dispose();
	}

	private void showLoginError()
	{
		gui.showLoginError();
	}
}