package com.repair_shop.gui;

import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.repair_shop.utility.PropertyDialogText;

public class PropertyRegistrationDialog implements InputDialog
{
	private JDialog window;
	public JLabel lblPropertyIDValue = new JLabel("1-23456789");
	public JTextField txtName = new JTextField();
	public JEditorPane txtDescription = new JEditorPane();
	public JButton btnAddProperty = new JButton(PropertyDialogText.ADD_BUTTON);
	public JButton btnCancel = new JButton(PropertyDialogText.CANCEL_BUTTON);
	
	/**
	 * Creates JDialog "General Property Registration Form".
	 */
	public PropertyRegistrationDialog(Window owner)
	{
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		window = new JDialog(owner);
        window.setTitle(PropertyDialogText.TITLE);
		window.setResizable(false);
		window.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		window.setBounds(100, 100, 300, 380);
		window.setContentPane(contentPane);
		window.setVisible(true);
		
		JLabel lblID = new JLabel(PropertyDialogText.ID_LABEL);
		lblID.setBounds(10, 11, 274, 14);
		contentPane.add(lblID);

		lblPropertyIDValue.setFont(new Font("Serif", Font.BOLD, 25));
		lblPropertyIDValue.setBounds(10, 36, 274, 25);
		contentPane.add(lblPropertyIDValue);
		
		JLabel lblName = new JLabel(PropertyDialogText.NAME_LABEL);
		lblName.setBounds(10, 72, 274, 14);
		contentPane.add(lblName);
	
		txtName.setBounds(10, 97, 274, 25);
		contentPane.add(txtName);
	
		JLabel lblDescription = new JLabel(PropertyDialogText.DESCRIPTION_LABEL);
		lblDescription.setBounds(10, 133, 214, 14);
		contentPane.add(lblDescription);
		
		txtDescription.setBounds(10, 158, 274, 137);
		contentPane.add(txtDescription);
	
		btnAddProperty.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnAddProperty.setBounds(10, 315, 108, 25);
		contentPane.add(btnAddProperty);
	
		btnCancel.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnCancel.setBounds(176, 315, 108, 25);
		contentPane.add(btnCancel);
	}

	@Override
	public void setIdValue(String id)
	{
		lblPropertyIDValue.setText(id);
	}

	@Override
	public void setBtnAddActionListener(ActionListener l)
	{
		btnAddProperty.addActionListener(l);
	}

	@Override
	public void setBtnCancelActionListener(ActionListener l)
	{
		btnCancel.addActionListener(l);
	}
	
	@Override
	public Window getWindow()
	{
		return window;
	}
}