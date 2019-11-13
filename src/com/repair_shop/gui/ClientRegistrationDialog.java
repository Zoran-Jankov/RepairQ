package com.repair_shop.gui;

import java.awt.Font;
import java.awt.Window;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

import com.repair_shop.utility.ClientDialogText;

/** 
 * Class ClientRegGUI defines graphic user interface for client registration.
 * 		
 * @author Zoran Jankov
 * @version 1.4
 * @since 2019-10-01
 */

public class ClientRegistrationDialog extends PersonRegistrationDialog
{	
	private static final long serialVersionUID = -4233718677850473593L;
	public JLabel lblMarketing =  new JLabel(ClientDialogText.MARKETING_LABEL);
	public JComboBox<String> cmbMarketing = new JComboBox<String>();
	public JButton btnAddNewMarketing = new JButton(ClientDialogText.ADD_NEW_MARKETING_BUTTON);
	
	/**
	 * Creates JDialog "Customer Registration Form".
	 */
	public ClientRegistrationDialog(Window owner)
	{
		super(owner);
	
		lblMarketing.setBounds(35, 290, 185, 15);
		contentPane.add(lblMarketing);
		
		cmbMarketing.setSize(185, 25);
		cmbMarketing.setLocation(35, 305);
		contentPane.add(cmbMarketing);
		
		btnAddNewMarketing.setFont(new Font("Dialog", Font.PLAIN, 12));
		btnAddNewMarketing.setBounds(235, 305, 185, 25);
		contentPane.add(btnAddNewMarketing);
	}
}