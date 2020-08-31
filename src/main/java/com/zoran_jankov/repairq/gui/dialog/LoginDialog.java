package com.zoran_jankov.repairq.gui.dialog;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.zoran_jankov.repairq.gui.panel.InputButtonPanel;
import com.zoran_jankov.repairq.gui.text.ErrorMessage;
import com.zoran_jankov.repairq.gui.text.ErrorTitle;
import com.zoran_jankov.repairq.gui.text.LabelName;
import com.zoran_jankov.repairq.gui.text.WindowTitle;
import com.zoran_jankov.repairq.gui.utility.LabelFactory;
import com.zoran_jankov.repairq.gui.utility.TextFieldFactory;

import net.miginfocom.swing.MigLayout;

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