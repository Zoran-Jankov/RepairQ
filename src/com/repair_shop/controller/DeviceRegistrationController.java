package com.repair_shop.controller;

import java.awt.Color;
import java.awt.Window;

import com.repair_shop.data.DataManager;
import com.repair_shop.data.DataType;
import com.repair_shop.data.Device;
import com.repair_shop.data.Model;
import com.repair_shop.gui.DeviceRegistrationDialog;
import com.repair_shop.utility.ActionListenerFactory;
import com.repair_shop.utility.CmbModelFactory;
import com.repair_shop.utility.DeviceDialogText;

public class DeviceRegistrationController extends InputDialogController
{
	private DeviceRegistrationDialog deviceGUI;
	
	public DeviceRegistrationController(WindowController owner, DataType dataType)
	{
		super(owner, dataType);
		deviceGUI = (DeviceRegistrationDialog) gui;
		deviceGUI.getDeviceRegistrationPanel().setDeviceTypeCmbModel(CmbModelFactory.getModel(dataType));
		deviceGUI.getDeviceRegistrationPanel().setBrandCmbModel(CmbModelFactory.getModel(dataType));
		deviceGUI.getDeviceRegistrationPanel()
				 .setBtnNewModelActionListener(ActionListenerFactory
				 .openNewWindow(this,DataType.MODEL));
	}
	
	public void updateComboBoxes(String deviceType,
								  String brand,
								  String model)
	{
		deviceGUI.getDeviceRegistrationPanel().setDeviceType(deviceType);
		deviceGUI.getDeviceRegistrationPanel().setBrand(brand);
		deviceGUI.getDeviceRegistrationPanel().setModel(model);
	}
	
	@Override
	protected Device createDataElement()
	{
		Device newDevice = new Device();
		
		newDevice.setId(id);
		newDevice.setSerial(deviceGUI.txtSerial.getText());
		newDevice.setModel((Model) DataManager.devicesDataTable		
				 .getByUniqueString((String) deviceGUI.cmbModel.getSelectedItem()));
		
		return newDevice;
	}
	
	@Override
	protected  boolean isInputValid()
	{
		return isModelSelected()
			&& isSerialNumberOK();
	}

	private  boolean isModelSelected()
	{
		return deviceGUI.cmbModel.getSelectedItem() != null;
	}

	private  boolean isSerialNumberOK()
	{
		String serial = deviceGUI.txtSerial.getText();
		
		return !("".equals(serial) || DataManager.devicesDataTable.uniqueStringCollision(serial));
	}
	
	@Override
	protected void showInputErrors()
	{
		checkSerialNumber();
		checkModel();
	}
	
	private void checkSerialNumber()
	{
		if(isSerialNumberOK())
		{
			deviceGUI.lblSerial.setText(DeviceDialogText.SERIAL_NUMBER_LABEL);
			deviceGUI.txtSerial.setBackground(Color.WHITE);
		}
		else
		{
			deviceGUI.lblSerial.setText(DeviceDialogText.SERIAL_NUMBER_ERROR_MESSAGE);
			deviceGUI.txtSerial.setBackground(Color.YELLOW);
		}
	}

	private void checkModel()
	{
		if(isModelSelected())
		{
			deviceGUI.lblModel.setText(DeviceDialogText.MODEL_LABEL);
			deviceGUI.cmbModel.setBackground(Color.WHITE);
		}
		else
		{
			deviceGUI.lblModel.setText(DeviceDialogText.MODEL_ERROR_MESSAGE);
			deviceGUI.cmbModel.setBackground(Color.YELLOW);
		}
	}
}