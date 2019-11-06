package com.repair_shop.gui;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;
import java.awt.Font;

public class UserLoginDialog extends JDialog
{
	private static final long serialVersionUID = -4769630859043739979L;
	private JPanel contentPane = new JPanel();
	private JLabel lblUsername = new JLabel("Username");
	private JTextField textFieldUsername = new JTextField();
	private JLabel lblPassword = new JLabel("Password");
	private JPasswordField passwordField = new JPasswordField();
	private JButton btnSignIin = new JButton("Sign in");
	private JButton btnQuit = new JButton("Quit");
	
	/**
	 * Creates JDialog "User Login".
	 */
	public UserLoginDialog()
	{
		setType(Type.UTILITY);
		setTitle("User Login");
		setResizable(false);
		setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
		setBounds(100, 100, 342, 224);
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblUsername.setBounds(67, 11, 200, 14);
		contentPane.add(lblUsername);
		
		textFieldUsername.setBounds(67, 36, 200, 25);
		contentPane.add(textFieldUsername);
		textFieldUsername.setColumns(10);
		
		lblPassword.setBounds(67, 72, 200, 14);
		contentPane.add(lblPassword);
		
		passwordField.setBounds(67, 97, 200, 25);
		contentPane.add(passwordField);
		
		btnSignIin.setFont(new Font("Dialog", Font.PLAIN, 12));
		btnSignIin.setBounds(67, 150, 90, 23);
		contentPane.add(btnSignIin);
		
		btnQuit.setFont(new Font("Dialog", Font.PLAIN, 12));
		btnQuit.setBounds(177, 150, 90, 23);
		contentPane.add(btnQuit);
	}
	
	public String getUsername()
	{
		return textFieldUsername.getText();
	}
	
	public char[] getPassword()
	{
		return passwordField.getPassword();
	}
}