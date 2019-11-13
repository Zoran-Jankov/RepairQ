package com.repair_shop.gui;

import javax.swing.JLabel;
import java.awt.Window;

import javax.swing.JComboBox;

import javax.swing.JButton;

public class ModelRegistrationDialog extends PropertyRegistrationDialog
{
	private static final long serialVersionUID = 3610145401800857979L;
	public JComboBox<String> cmbDeviceType = new JComboBox<String>();
	public JButton btnNewDeviceType = new JButton("New Device Type");
	public JComboBox<String> cmbManufacturer = new JComboBox<String>();
	public JButton btnNewManufacturer = new JButton("New Manufacturer");

	/**
	 * Create frame "Model Registration Form"
	 * @param owner 
	 */
	public ModelRegistrationDialog(Window owner)
	{
		super(owner);

		setResizable(false);
		setTitle("Add New Model");
		setBounds(100, 100, 340, 540);
		
		lblID.setBounds(10, 11, 314, 14);
		
		lblIDValue.setBounds(10, 36, 314, 25);

		JLabel lblDeviceType = new JLabel("Device Type");
		lblDeviceType.setBounds(10, 72, 200, 14);
		contentPane.add(lblDeviceType);
		
		cmbDeviceType.setBounds(10, 97, 200, 25);
		contentPane.add(cmbDeviceType);
		
		btnNewDeviceType.setBounds(216, 97, 108, 25);
		contentPane.add(btnNewDeviceType);

		JLabel lblManufacturer = new JLabel("Manufacturer");
		lblManufacturer.setBounds(10, 133, 200, 14);
		contentPane.add(lblManufacturer);
		
		cmbManufacturer.setBounds(10, 158, 200, 25);
		contentPane.add(cmbManufacturer);
		
		btnNewManufacturer.setBounds(216, 158, 108, 25);
		contentPane.add(btnNewManufacturer);

		lblName.setBounds(10, 195, 200, 14);

		txtName.setBounds(10, 220, 200, 25);

		lblDescription.setBounds(10, 255, 314, 14);
		
		txtDescription.setBounds(10, 280, 314, 184);;
		
		btnAdd.setBounds(10, 475, 108, 25);

		btnCancel.setBounds(216, 475, 108, 25);
	}
}	