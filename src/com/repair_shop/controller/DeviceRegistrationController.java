package com.repair_shop.controller;

import com.repair_shop.data.DataManager;
import com.repair_shop.data.DataType;
import com.repair_shop.data.Device;
import com.repair_shop.data.Model;
import com.repair_shop.gui.DeviceRegistrationDialog;
import com.repair_shop.utility.ActionListenerFactory;
import com.repair_shop.utility.CmbModelFactory;

public class DeviceRegistrationController extends InputDialogController
{
	private DeviceRegistrationDialog deviceGUI;
	
	public DeviceRegistrationController(WindowController owner, DataType dataType)
	{
		super(owner, dataType);
		
		deviceGUI = (DeviceRegistrationDialog) gui;
		
		deviceGUI.getDeviceRegistrationPanel().setDeviceTypeCmbModel
				 (CmbModelFactory.getModel(DataType.DEVICE_TYPE));
		
		deviceGUI.getDeviceRegistrationPanel().setBrandCmbModel
				 (CmbModelFactory.getModel(DataType.BRAND));
		
		deviceGUI.getDeviceRegistrationPanel()
				 .setBtnNewModelActionListener
				 (ActionListenerFactory.openNewWindow(this,DataType.MODEL));
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
		newDevice.setSerial(deviceGUI.getDeviceRegistrationPanel().getSerial());
		newDevice.setModel((Model) DataManager.getDataElement(DataType.MODEL,
									 deviceGUI.getDeviceRegistrationPanel().getModel()));
		
		return newDevice;
	}
	
	@Override
	protected  boolean isInputValid()
	{
		return isModelSelected()
			&& isSerialNumberValid();
	}

	private  boolean isModelSelected()
	{
		return !("".equals(deviceGUI.getDeviceRegistrationPanel().getModel()));
	}

	private  boolean isSerialNumberValid()
	{
		String serial = deviceGUI.getDeviceRegistrationPanel().getSerial();
		
		return !("".equals(serial) || DataManager.devicesDataTable.uniqueStringCollision(serial));
	}
	
	@Override
	protected void showInputErrors()
	{
		if(!isSerialNumberValid())
		{
			deviceGUI.getDeviceRegistrationPanel().showSerialError();
		}
		
		if(!isModelSelected())
		{
			deviceGUI.getDeviceRegistrationPanel().showModelError();
		}
	}
}