package com.repair_shop.gui;

import java.awt.Font;
import java.awt.Window;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.repair_shop.gui.text.PropertyGUITextUtils;

public class PropertyRegistrationGUI  
{
	public JDialog window;
	public JLabel lblIDValue = new JLabel("1-2345");
	public JLabel lblID = new JLabel(PropertyGUITextUtils.ID_LABEL);
	public JTextField txtName = new JTextField();
	public JEditorPane txtDescription = new JEditorPane();
	public JButton btnAdd = new JButton("Add");
	public JButton btnCancel = new JButton("Cancel");
	
	/**
	 * Creates JDialog "General Property Registration Form".
	 */
	public PropertyRegistrationGUI(Window owner)
	{
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		window = new JDialog(owner);
        window.setTitle(PropertyGUITextUtils.TITLE);
		window.setResizable(false);
		window.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		window.setBounds(100, 100, 300, 380);
		window.setContentPane(contentPane);
		
		
		lblID.setBounds(10, 11, 274, 14);
		contentPane.add(lblID);

		lblIDValue.setFont(new Font("Serif", Font.BOLD, 25));
		lblIDValue.setBounds(10, 36, 274, 25);
		contentPane.add(lblIDValue);
	
		JLabel lblDescription = new JLabel(PropertyGUITextUtils.DESCRIPTION_LABEL);
		lblDescription.setBounds(10, 133, 214, 14);
		contentPane.add(lblDescription);
	
		txtName.setBounds(10, 97, 274, 25);
		contentPane.add(txtName);
	
		txtDescription.setBounds(10, 158, 274, 137);
		contentPane.add(txtDescription);
	
	
		btnAdd.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnAdd.setBounds(10, 315, 108, 25);
		contentPane.add(btnAdd);
	
		btnCancel.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnCancel.setBounds(176, 315, 108, 25);
		contentPane.add(btnCancel);
	}
}