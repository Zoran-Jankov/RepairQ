package com.repair_shop.gui;

/** 
 * Class ClientRegGUI defines graphic user interface for client registration.
 * 		
 * @author Zoran Jankov
 * @version 1.4
 * @since 2019-10-01
 */

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.repair_shop.utility.ClientDialogText;

import java.awt.Window;

public abstract class PersonRegistrationDialog extends InputDialog
{	
	private static final long serialVersionUID = -8214273379334402308L;
	protected JTextField txtFirstName = new JTextField();
	protected JTextField txtLastName = new JTextField();
	protected JTextField txtPrimePhoneNum = new JTextField();
	protected JTextField txtAlternativePhoneNum = new JTextField();
	protected JTextField txtEmail = new JTextField();
	protected JTextField txtAddress = new JTextField();
	
	/**
	 * Creates JDialog "Customer Registration Form".
	 */
	public PersonRegistrationDialog(Window owner)
	{
		
		super(owner);
		setTitle(ClientDialogText.TITLE);
		setBounds(100, 100, 460, 440);
	
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		lblIDValue.setBounds(150, 25, 160, 25);
		
		JLabel lblFirstName = new JLabel(ClientDialogText.FIRST_NAME_LABEL);
		lblFirstName.setBounds(35, 90, 185, 15);
		contentPane.add(lblFirstName);
		
		txtFirstName.setColumns(10);
		txtFirstName.setBounds(35, 105, 185, 25);
		contentPane.add(txtFirstName);
		
		JLabel lblLastName = new JLabel(ClientDialogText.LAST_NAME_LABEL); 
		lblLastName.setBounds(235, 90, 185, 15);
		contentPane.add(lblLastName);
		
		txtLastName.setColumns(10);
		txtLastName.setBounds(235, 105, 185, 25);
		contentPane.add(txtLastName);
	
		JLabel lblPrimePhoneNum =  new JLabel(ClientDialogText.PRIME_PHONE_NUMBER_LABEL);
		lblPrimePhoneNum.setBounds(35, 140, 185, 15);
		contentPane.add(lblPrimePhoneNum);
		
		txtPrimePhoneNum.setColumns(10);
		txtPrimePhoneNum.setBounds(35, 155, 185, 25);
		contentPane.add(txtPrimePhoneNum);
	
		JLabel labelAlternativePhoneNum =new JLabel(ClientDialogText.SECOND_NUMBER_LABEL);
		labelAlternativePhoneNum.setBounds(235, 140, 185, 15);
		contentPane.add(labelAlternativePhoneNum);
		
		txtAlternativePhoneNum.setColumns(10);
		txtAlternativePhoneNum.setBounds(235, 155, 185, 25);
		contentPane.add(txtAlternativePhoneNum);
	
		JLabel labelEmail = new JLabel(ClientDialogText.EMAIL_LABEL);
		labelEmail.setBounds(35, 190, 385, 15);
		contentPane.add(labelEmail);
		
		txtEmail.setColumns(10);
		txtEmail.setBounds(35, 205, 385, 25);
		contentPane.add(txtEmail);
	
		JLabel labelAddress =  new JLabel(ClientDialogText.ADDRESS_LABEL);
		labelAddress.setBounds(35, 240, 385, 15);
		contentPane.add(labelAddress);
		
		txtAddress.setColumns(10);
		txtAddress.setBounds(35, 255, 385, 25);
		contentPane.add(txtAddress);
	}
}