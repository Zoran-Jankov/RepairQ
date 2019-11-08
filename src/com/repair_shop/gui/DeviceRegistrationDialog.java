package com.repair_shop.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.repair_shop.utility.DeviceDialogText;

import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.SwingConstants;

public class DeviceRegistrationDialog implements InputDialog
{
	private JDialog window;
	private JButton btnAddDevice = new JButton(DeviceDialogText.ADD_DEVICE_BUTTON);;
	private JButton btnCancel = new JButton(DeviceDialogText.CANCEL_BUTTON);
	private JLabel lblDeviceIDValue = new JLabel("1-23456");
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
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		window = new JDialog(owner);
		window.setTitle(DeviceDialogText.TITLE);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.setBounds(100, 100, 300, 420);
		window.setContentPane(contentPane);
		window.setVisible(true);
		
		JLabel labelDeviceID = new JLabel(DeviceDialogText.DEVICE_ID_LABEL);
		labelDeviceID.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelDeviceID.setBounds(20, 10, 75, 25);
		contentPane.add(labelDeviceID);
		
		lblDeviceIDValue.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeviceIDValue.setFont(new Font("Segoe UI Symbol", Font.BOLD, 15));
		lblDeviceIDValue.setBounds(200, 10, 75, 25);
		contentPane.add(lblDeviceIDValue);
	
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
	
		btnAddDevice.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnAddDevice.setBounds(20, 345, 110, 25);
		contentPane.add(btnAddDevice);
		
		btnCancel.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnCancel.setBounds(165, 345, 110, 25);
		contentPane.add(btnCancel);
	}
	
	@Override
	public void setIdValue(String id)
	{
		lblDeviceIDValue.setText(id);
	}

	@Override
	public void setBtnAddActionListener(ActionListener l)
	{
		btnAddDevice.addActionListener(l);
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