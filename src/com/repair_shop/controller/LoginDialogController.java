package com.repair_shop.controller;

import com.repair_shop.gui.LoginDialog;

public class LoginDialogController
{
	private LoginDialog gui = new LoginDialog();
	
	public LoginDialogController()
	{
		gui.getInputButtonPanel().setBtnAddActionListener(null);
		gui.getInputButtonPanel().setBtnCancelActionListener(null);
	}
	
	public void tryLogin()
	{
		if(isInputValid())
		{
			login();
		}
		else
		{
			showLoginErrors();
		}
	}

	private boolean isInputValid()
	{
		// TODO Implement isInputValid() method
		return false;
	}

	private void login()
	{
		// TODO Implement Login() method
	}

	private void showLoginErrors()
	{
		// TODO Implement showLoginErrors() method
	}
}