package com.repair_shop.gui;

import javax.swing.JDialog;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class LoginDialog extends JDialog
{
	private static final long serialVersionUID = 7195384093352450230L;
	private JTextField txtUsername = TextFieldFactory.createJTextField(10);;
	private JPasswordField txtPassword = new JPasswordField();
	private InputButtonPanel buttonPanel = new InputButtonPanel();

	public LoginDialog()
	{
		getContentPane().setLayout(new MigLayout("", "[][grow][]", "[30px:n][30px:n][]"));
		
		JLabel lblUsername = LabelFactory.createJLabel("Username", new Font("Tahoma", Font.PLAIN, 13));
		getContentPane().add(lblUsername, "cell 0 0,growy");
		
		getContentPane().add(txtUsername, "cell 1 0,grow");
		
		JLabel lblPassword = LabelFactory.createJLabel("Password", new Font("Tahoma", Font.PLAIN, 13));
		getContentPane().add(lblPassword, "cell 0 1,growy");
		
		getContentPane().add(txtPassword, "cell 1 1,grow");
		
		getContentPane().add(buttonPanel, "cell 0 2 3 1,grow");
		
		buttonPanel.setBtnAddName("Login");
		
		buttonPanel.setBtnCancelName("Quit");
	}
}