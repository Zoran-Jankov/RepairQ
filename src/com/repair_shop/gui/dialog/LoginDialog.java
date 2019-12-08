package com.repair_shop.gui.dialog;

import javax.swing.JDialog;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

import com.repair_shop.gui.component.LabelFactory;
import com.repair_shop.gui.component.TextFieldFactory;
import com.repair_shop.gui.panel.InputButtonPanel;
import com.repair_shop.gui.text.ButtonName;
import com.repair_shop.gui.text.ErrorMessage;
import com.repair_shop.gui.text.ErrorTitle;
import com.repair_shop.gui.text.LabelName;
import com.repair_shop.gui.text.WindowTitle;

import javax.swing.JPasswordField;

public class LoginDialog extends JDialog
{
	private static final long serialVersionUID = 7195384093352450230L;
	private JTextField txtUsername = TextFieldFactory.createJTextField(10);
	private JPasswordField txtPassword = new JPasswordField();
	private InputButtonPanel buttonPanel = new InputButtonPanel();

	public LoginDialog()
	{
		setResizable(false);
		setTitle(WindowTitle.LOGIN);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(new MigLayout("", "[][grow]", "[30px:n][30px:n][]"));
		
		JLabel lblUsername = LabelFactory.createJLabel(LabelName.USERNAME, new Font("Tahoma", Font.PLAIN, 13));
		getContentPane().add(lblUsername, "cell 0 0,growy");
		
		getContentPane().add(txtUsername, "cell 1 0,grow");
		
		JLabel lblPassword = LabelFactory.createJLabel(LabelName.PASSWORD, new Font("Tahoma", Font.PLAIN, 13));
		getContentPane().add(lblPassword, "cell 0 1,growy");
		
		getContentPane().add(txtPassword, "cell 1 1,grow");
		
		getContentPane().add(buttonPanel, "cell 0 2 2 1,grow");
		
		buttonPanel.setBtnAddName(ButtonName.LOGIN);
		
		buttonPanel.setBtnCancelName(ButtonName.QUIT);
		
		pack();
	}
	
	public InputButtonPanel getInputButtonPanel()
	{
		return buttonPanel;
	}
	
	public String getUsername()
	{
		txtUsername.setBackground(Color.WHITE);
		return txtUsername.getText();
	}
	
	public char[] getPassword()
	{
		txtUsername.setBackground(Color.WHITE);
		return txtPassword.getPassword();
	}
	
	public void showLoginError()
	{
		JOptionPane.showMessageDialog(this, 
		        					  ErrorMessage.LOGIN, 
		        					  ErrorTitle.LOGIN,
		        					  JOptionPane.ERROR_MESSAGE);
	}
}