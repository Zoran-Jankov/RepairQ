package com.repair_shop.gui;

import java.awt.Window;

import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.repair_shop.utility.PropertyDialogText;

public class PropertyRegistrationDialog extends InputDialog
{
	private static final long serialVersionUID = -491903794166339996L;
	public JLabel lblName = new JLabel(PropertyDialogText.NAME_LABEL);
	public JLabel lblDescription = new JLabel(PropertyDialogText.DESCRIPTION_LABEL);
	public JTextField txtName = new JTextField();
	public JEditorPane txtDescription = new JEditorPane();
	
	/**
	 * Creates JDialog "General Property Registration Form".
	 */
	public PropertyRegistrationDialog(Window owner)
	{
		super(owner);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
        setTitle(PropertyDialogText.TITLE);
		setBounds(100, 100, 300, 380);
		
		lblID.setBounds(10, 11, 274, 14);

		lblIDValue.setBounds(10, 36, 274, 25);
		
	
		lblName.setBounds(10, 72, 274, 14);
		contentPane.add(lblName);
	
		txtName.setBounds(10, 97, 274, 25);
		contentPane.add(txtName);
	
		
		lblDescription.setBounds(10, 133, 214, 14);
		contentPane.add(lblDescription);
		
		txtDescription.setBounds(10, 158, 274, 137);
		contentPane.add(txtDescription);
	
		btnAdd.setBounds(10, 315, 108, 25);

		btnCancel.setBounds(176, 315, 108, 25);
	}
}