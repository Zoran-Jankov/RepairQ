package main.java.com.yankov.repair_shop.app.controller;

import java.awt.Window;

import main.java.com.yankov.repair_shop.app.utility.ActionFactory;
import main.java.com.yankov.repair_shop.app.utility.WindowControllerFactory;
import main.java.com.yankov.repair_shop.app.utility.WindowTag;
import main.java.com.yankov.repair_shop.gui.dialog.LoginDialog;
import main.java.com.yankov.repair_shop.gui.text.ButtonName;

public class LoginDialogController implements WindowController
{
	private LoginDialog gui = new LoginDialog();
	
	public LoginDialogController()
	{
		gui.getInputButtonPanel().setAddButtonFunction
		   (ActionFactory.login(this), ButtonName.LOGIN);
		
		gui.getInputButtonPanel().setCancelButtonFunction
		   (ActionFactory.closeWindow(this), ButtonName.QUIT);
		
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
		// TODO Implement isInputValid() method
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