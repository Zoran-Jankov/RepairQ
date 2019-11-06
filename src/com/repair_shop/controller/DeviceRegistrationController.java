package com.repair_shop.controller;

import java.awt.Window;

import javax.xml.datatype.DatatypeConfigurationException;

import com.repair_shop.data.Device;
import com.repair_shop.gui.DeviceRegistrationGUI;
import com.repair_shop.utility.AccessData;
import com.repair_shop.utility.ActionListenerFactory;
import com.repair_shop.utility.DataType;
import com.repair_shop.utility.IDGenerator;
import com.repair_shop.utility.WindowClontrollerFactory;

public class DeviceRegistrationController extends InputDialogController
{
	private int deviceID;
	private Device newDevice;
	private DeviceRegistrationGUI gui;
	
	public DeviceRegistrationController(WindowController owner)
	{
		deviceID = IDGenerator.getNewClientID();
		gui = new DeviceRegistrationGUI(owner.getWindow());
		gui.labelDeviceIDValue.setText(formatIDValue());
		gui.buttonAddNewModel.addActionListener(ActionListenerFactory.openNewWindow(this,DataType.MODEL));
		gui.buttonAddDevice.addActionListener(ActionListenerFactory.saveData(this));
		gui.buttonCancel.addActionListener(ActionListenerFactory.closeWindow(this));
	}
	
	private String formatIDValue()
	{
		return String.valueOf(IDGenerator.TERMINAL_NUMBER)
			 + " - " 
			 + String.valueOf(deviceID / IDGenerator.COUNTER_MAX_VALUE);
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
			gui.showDefaultSerial();
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
		return null;
	}

	@Override
	public void closeWindow()
	{
		gui.window.dispose();
	}

	
}