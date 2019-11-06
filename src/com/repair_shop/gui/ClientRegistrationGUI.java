package com.repair_shop.gui;

import javax.swing.JButton;

/** 
 * Class ClientRegGUI defines graphic user interface for client registration.
 * 		
 * @author Zoran Jankov
 * @version 1.4
 * @since 2019-10-01
 */

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.repair_shop.gui.text.ClientGUITextUtils;

import java.awt.Font;
import java.awt.Window;

public class ClientRegistrationGUI implements WindowContainer
{	
	public JDialog window;
	public JLabel lblIDValue = new JLabel("1-23456789");
	public JLabel lblFirstName = new JLabel(ClientGUITextUtils.FIRST_NAME_LABEL);
	public JTextField txtFirstName = new JTextField();
	public JLabel lblLastName = new JLabel(ClientGUITextUtils.LAST_NAME_LABEL); 
	public JTextField txtLastName = new JTextField();
	public JLabel lblPrimePhoneNum =  new JLabel(ClientGUITextUtils.PRIME_PHONE_NUMBER_LABEL);
	public JTextField txtPrimePhoneNum = new JTextField();
	public JTextField txtAlternativePhoneNum = new JTextField();
	public JTextField txtEmail = new JTextField();
	public JTextField txtAddress = new JTextField();
	public JLabel lblMarketing =  new JLabel(ClientGUITextUtils.MARKETING_LABEL);
	public JComboBox<String> cmbMarketing = new JComboBox<String>();
	public JButton btnAddNewMarketing = new JButton(ClientGUITextUtils.ADD_NEW_MARKETING_BUTTON);
	public JButton btnAdd = new JButton(ClientGUITextUtils.ADD_CLIENT_BUTTON);
	public JButton btnCancel = new JButton(ClientGUITextUtils.CANCEL_BUTTON);
	
	/**
	 * Creates JDialog "Customer Registration Form".
	 */
	public ClientRegistrationGUI(Window owner)
	{
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
	
		window = new JDialog(owner);
		window.setTitle(ClientGUITextUtils.TITLE);
		window.setResizable(false);
		window.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		window.setBounds(100, 100, 460, 440);
		window.setContentPane(contentPane);
		window.setVisible(true);
		
		JLabel labelID =  new JLabel(ClientGUITextUtils.CLIENT_ID_LABEL);
		labelID.setBounds(35, 25, 110, 25);
		contentPane.add(labelID);
		
		lblIDValue.setHorizontalAlignment(SwingConstants.CENTER);
		lblIDValue.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIDValue.setBounds(150, 25, 160, 25);
		contentPane.add(lblIDValue);
		
		lblFirstName.setBounds(35, 90, 185, 15);
		contentPane.add(lblFirstName);
		
		txtFirstName.setColumns(10);
		txtFirstName.setBounds(35, 105, 185, 25);
		contentPane.add(txtFirstName);
		
		lblLastName.setBounds(235, 90, 185, 15);
		contentPane.add(lblLastName);
		
		txtLastName.setColumns(10);
		txtLastName.setBounds(235, 105, 185, 25);
		contentPane.add(txtLastName);
	
		lblPrimePhoneNum.setBounds(35, 140, 185, 15);
		contentPane.add(lblPrimePhoneNum);
		
		txtPrimePhoneNum.setColumns(10);
		txtPrimePhoneNum.setBounds(35, 155, 185, 25);
		contentPane.add(txtPrimePhoneNum);
	
		JLabel labelAlternativePhoneNum =new JLabel(ClientGUITextUtils.SECOND_NUMBER_LABEL);
		labelAlternativePhoneNum.setBounds(235, 140, 185, 15);
		contentPane.add(labelAlternativePhoneNum);
		
		txtAlternativePhoneNum.setColumns(10);
		txtAlternativePhoneNum.setBounds(235, 155, 185, 25);
		contentPane.add(txtAlternativePhoneNum);
	
		JLabel labelEmail = new JLabel(ClientGUITextUtils.EMAIL_LABEL);
		labelEmail.setBounds(35, 190, 385, 15);
		contentPane.add(labelEmail);
		
		txtEmail.setColumns(10);
		txtEmail.setBounds(35, 205, 385, 25);
		contentPane.add(txtEmail);
	
		JLabel labelAddress =  new JLabel(ClientGUITextUtils.ADDRESS_LABEL);
		labelAddress.setBounds(35, 240, 385, 15);
		contentPane.add(labelAddress);
		
		txtAddress.setColumns(10);
		txtAddress.setBounds(35, 255, 385, 25);
		contentPane.add(txtAddress);
	
		lblMarketing.setBounds(35, 290, 185, 15);
		contentPane.add(lblMarketing);
		
		cmbMarketing.setSize(185, 25);
		cmbMarketing.setLocation(35, 305);
		contentPane.add(cmbMarketing);
		
		btnAddNewMarketing.setFont(new Font("Dialog", Font.PLAIN, 12));
		btnAddNewMarketing.setBounds(235, 305, 185, 25);
		contentPane.add(btnAddNewMarketing);
	
		btnAdd.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnAdd.setBounds(35, 365, 110, 25);
		contentPane.add(btnAdd);
	
		btnCancel.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnCancel.setBounds(310, 365, 110, 25);
		contentPane.add(btnCancel);
	}

	@Override
	public Window getWindow()
	{
		return window;
	}
}