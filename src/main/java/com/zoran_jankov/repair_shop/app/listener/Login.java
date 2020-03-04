package main.java.com.zoran_jankov.repair_shop.app.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.java.com.zoran_jankov.repair_shop.app.controller.dialog.LoginDialogController;

/**
 * ActionListener for login action.
 * 
 * @author Zoran Jankov
 */
public class Login implements ActionListener
{
	public LoginDialogController controller;
	
	/**
	 * Login dialog controller is passed as parameter and it's 
	 * method tryLogin() is invoked.
	 * @param controller
	 */
	public Login(LoginDialogController controller)
	{
		this.controller = controller;
	}
	
	/**
	 * Performs tryLogin() method in the login dialog controller.
	 * @param ActionEvent
	 */
	@Override
	public void actionPerformed(ActionEvent e)
	{
		controller.tryLogin();
	}
}