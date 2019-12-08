package com.repair_shop.app.controller;

import java.awt.Window;

import com.repair_shop.app.utility.ActionFactory;
import com.repair_shop.app.utility.WindowControllerFactory;
import com.repair_shop.app.utility.WindowTag;
import com.repair_shop.gui.dialog.LoginDialog;

public class LoginDialogController implements WindowController
{
	private LoginDialog gui = new LoginDialog();
	
	public LoginDialogController()
	{
		gui.getInputButtonPanel().setBtnAddActionListener
		   (ActionFactory.openWindow(WindowTag.MAIN_WINDOW));
		
		gui.getInputButtonPanel().setBtnCancelActionListener
		   (ActionFactory.closeWindow(this));
		
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
	}

	private void showLoginError()
	{
		gui.showLoginError();
	}
}