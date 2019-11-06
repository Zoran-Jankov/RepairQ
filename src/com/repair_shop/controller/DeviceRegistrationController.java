package com.repair_shop.controller;

import java.awt.Color;
import java.awt.Window;

import com.repair_shop.data.Device;
import com.repair_shop.gui.DeviceRegistrationGUI;
import com.repair_shop.gui.text.DeviceGUITextUtils;
import com.repair_shop.utility.AccessData;
import com.repair_shop.utility.ActionListenerFactory;
import com.repair_shop.utility.DataType;
import com.repair_shop.utility.GuiFactory;
import com.repair_shop.utility.IDGenerator;
import com.repair_shop.utility.WindowClontrollerFactory;

public class DeviceRegistrationController extends InputDialogController
{
	private static final byte dataType = DataType.DEVICE;
	private int deviceID;
	private DeviceRegistrationGUI gui;
	
	public DeviceRegistrationController(WindowController owner)
	{
		deviceID = IDGenerator.getNewID(dataType);
		gui = (DeviceRegistrationGUI) GuiFactory.getWindow(owner.getWindow(), dataType);
		gui.labelDeviceIDValue.setText(IDGenerator.formatRegularID(deviceID));
		setActionListeners();
	}
	
	private void setActionListeners()
	{
		gui.buttonAddNewModel.addActionListener(ActionListenerFactory
							 .openNewWindow(this,DataType.MODEL));
		gui.buttonAddDevice.addActionListener(ActionListenerFactory.saveData(this));
		gui.buttonCancel.addActionListener(ActionListenerFactory.closeWindow(this));
	}

	@Override
	public void trySavingDataElement()
	{
		newDevice = gui.getInput();
		newDevice.setID(deviceID);
		
		if(isInputValid())
		{
			AccessData.devicesDataTable.save(newDevice);
			closeWindow();
		}
		else
		{
			showDeviceinputErrors();
		}
	}
	
	
	
	private  boolean isInputValid()
	{
		return isModelSelected()
			&& isSerialNumberOK();
	}

	private  boolean isModelSelected()
	{
		return newDevice.getModel() != null;
	}

	private  boolean isSerialNumberOK()
	{
		String serial = newDevice.getSerial();
		
		return !("".equals(serial) || AccessData.devicesDataTable.uniqueStringCollision(serial));
	}
	
	private void showDeviceinputErrors()
	{
		checkSerialNumber();
		checkModel();
	}
	
	private void checkSerialNumber()
	{
		if(isSerialNumberOK())
		{
			gui.labelSerial.setText(DeviceGUITextUtils.SERIAL_NUMBER_LABEL);
			gui.textFieldSerial.setBackground(Color.WHITE);
		}
		else
		{
			gui.showSerialError();
		}
	}

	private void checkModel()
	{
		if(isModelSelected())
		{
			gui.showDefaultModel();
		}
		else
		{
			gui.showModelError();
		}
	}
	
	@Override
	public Window getWindow()
	{
		return gui.getWindow();
	}

	@Override
	public void closeWindow()
	{
		gui.window.dispose();
	}
}