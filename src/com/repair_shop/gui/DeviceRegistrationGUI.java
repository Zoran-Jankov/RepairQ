package com.repair_shop.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.repair_shop.data.Device;
import com.repair_shop.data.Model;
import com.repair_shop.data.Property;
import com.repair_shop.gui.text.DeviceGUITextUtils;

import java.awt.Font;
import java.awt.Window;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.SwingConstants;

public class DeviceRegistrationGUI implements WindowContainer
{
	public JDialog window; 
	public JPanel contentPane = new JPanel();
	public JLabel labelDeviceIDValue = new JLabel();
	public JComboBox<Property> comboBoxDeviceType = new JComboBox<Property>();
	public JComboBox<Property> comboBoxManufacturer = new JComboBox<Property>();
	public JLabel labelModel = new JLabel();
	public JComboBox<Model> comboBoxModel = new JComboBox<Model>();
	public JButton buttonAddNewModel;
	public JLabel labelSerial = new JLabel();
	public JTextField textFieldSerial = new JTextField();
	public JButton buttonAddDevice;
	public JButton buttonCancel;
	
	/**
	 * Creates frame "Device Registration Form".
	 */
	public DeviceRegistrationGUI(Window owner)
	{
		window = new JDialog(owner);
		window.setTitle(DeviceGUITextUtils.TITLE);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.setBounds(100, 100, 300, 420);
		window.setContentPane(contentPane);
		window.setVisible(true);
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
	
		JLabel labelDeviceID = new JLabel(DeviceGUITextUtils.DEVICE_ID_LABEL);
		labelDeviceID.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelDeviceID.setBounds(20, 10, 75, 25);
		contentPane.add(labelDeviceID);
		
		labelDeviceIDValue.setHorizontalAlignment(SwingConstants.CENTER);
		labelDeviceIDValue.setFont(new Font("Segoe UI Symbol", Font.BOLD, 15));
		labelDeviceIDValue.setBounds(200, 10, 75, 25);
		contentPane.add(labelDeviceIDValue);
	
		JLabel labelDeviceType = new JLabel(DeviceGUITextUtils.DEVICE_TYPE_LABEL);
		labelDeviceType.setBounds(20, 50, 255, 15);
		contentPane.add(labelDeviceType);
		
		comboBoxDeviceType.setBounds(20, 75, 255, 25);
		contentPane.add(comboBoxDeviceType);
	
		JLabel labelManufacturer = new JLabel(DeviceGUITextUtils.MANUFACTURER_LABEL);
		labelManufacturer.setBounds(20, 115, 255, 15);
		contentPane.add(labelManufacturer);
		
		comboBoxManufacturer.setBounds(20, 140, 255, 25);
		contentPane.add(comboBoxManufacturer);
	
		labelModel.setBounds(20, 175, 255, 15);
		contentPane.add(labelModel);
		
		comboBoxModel.setBounds(20, 200, 255, 25);
		contentPane.add(comboBoxModel);
		
		buttonAddNewModel = new JButton(DeviceGUITextUtils.ADD_NEW_MODEL_BUTTON);
		buttonAddNewModel.setBounds(95, 234, 110, 25);
		contentPane.add(buttonAddNewModel);

		labelSerial.setBounds(20, 265, 255, 14);
		contentPane.add(labelSerial);
		
		textFieldSerial.setBounds(20, 290, 255, 25);
		contentPane.add(textFieldSerial);
		textFieldSerial.setColumns(10);
	
		buttonAddDevice = new JButton(DeviceGUITextUtils.ADD_DEVICE_BUTTON);
		buttonAddDevice.setFont(new Font("Dialog", Font.PLAIN, 15));
		buttonAddDevice.setBounds(20, 345, 110, 25);
		contentPane.add(buttonAddDevice);
		
		buttonCancel = new JButton(DeviceGUITextUtils.CANCEL_BUTTON);
		buttonCancel.setFont(new Font("Dialog", Font.PLAIN, 15));
		buttonCancel.setBounds(165, 345, 110, 25);
		contentPane.add(buttonCancel);
	}
	
	
	
	public Device getInput()
	{	
		Device newDevice = new Device();
		newDevice.setModel((Model) comboBoxModel.getSelectedItem());
		newDevice.setSerial(textFieldSerial.getText());
		return newDevice;
	}

	@Override
	public Window getWindow()
	{
		return window;
	}
}