package com.repair_shop.gui;

import com.repair_shop.utility.DeviceDialogText;

import java.awt.Window;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DeviceRegistrationDialog extends InputDialog
{
	private static final long serialVersionUID = -610400028743924499L;
	public JComboBox<String> cmbDeviceType = new JComboBox<String>();
	public JComboBox<String> cmbManufacturer = new JComboBox<String>();
	public JLabel lblModel = new JLabel(DeviceDialogText.MODEL_LABEL);
	public JComboBox<String> cmbModel = new JComboBox<String>();
	public JButton btnAddNewModel = new JButton(DeviceDialogText.ADD_NEW_MODEL_BUTTON);
	public JLabel lblSerial = new JLabel(DeviceDialogText.SERIAL_NUMBER_LABEL);
	public JTextField txtSerial = new JTextField();
	
	/**
	 * Creates frame "Device Registration Form".
	 */
	public DeviceRegistrationDialog(Window owner)
	{
		super(owner);
		setTitle(DeviceDialogText.TITLE);
		setBounds(100, 100, 300, 420);
	
		JLabel labelDeviceType = new JLabel(DeviceDialogText.DEVICE_TYPE_LABEL);
		labelDeviceType.setBounds(20, 50, 255, 15);
		contentPane.add(labelDeviceType);
		
		cmbDeviceType.setBounds(20, 75, 255, 25);
		contentPane.add(cmbDeviceType);
	
		JLabel labelManufacturer = new JLabel(DeviceDialogText.MANUFACTURER_LABEL);
		labelManufacturer.setBounds(20, 115, 255, 15);
		contentPane.add(labelManufacturer);
		
		cmbManufacturer.setBounds(20, 140, 255, 25);
		contentPane.add(cmbManufacturer);
	
		lblModel.setBounds(20, 175, 255, 15);
		contentPane.add(lblModel);
		
		cmbModel.setBounds(20, 200, 255, 25);
		contentPane.add(cmbModel);
		
		btnAddNewModel.setBounds(95, 234, 110, 25);
		contentPane.add(btnAddNewModel);

		lblSerial.setBounds(20, 265, 255, 14);
		contentPane.add(lblSerial);
		
		txtSerial.setBounds(20, 290, 255, 25);
		contentPane.add(txtSerial);
		txtSerial.setColumns(10);
	}
}