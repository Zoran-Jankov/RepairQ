package com.repair_shop.app.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.repair_shop.app.controller.LoginDialogController;

public class Login implements ActionListener
{
	public LoginDialogController controller;
	
	public Login(LoginDialogController controller)
	{
		this.controller = controller;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		controller.tryLogin();
	}
}