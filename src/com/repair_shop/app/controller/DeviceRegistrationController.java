package com.repair_shop.app.controller;

import com.repair_shop.app.utility.ActionFactory;
import com.repair_shop.app.utility.ComboBoxModelFactory;
import com.repair_shop.data.DataManager;
import com.repair_shop.data.DataType;
import com.repair_shop.data.entity.Device;
import com.repair_shop.data.entity.Model;
import com.repair_shop.gui.dialog.DeviceRegistrationDialog;

public class DeviceRegistrationController extends InputDialogController
{
	private DeviceRegistrationDialog deviceGUI;
	
	public DeviceRegistrationController(WindowController owner, DataType dataType)
	{
		super(owner, dataType);
		
		deviceGUI = (DeviceRegistrationDialog) gui;
		
		setComboBoxModels();
		
		deviceGUI.getDeviceRegistrationPanel()
				 .setBtnNewModelActionListener
				 (ActionFactory.openWindow(this,DataType.MODEL));
	}
	
	private void setComboBoxModels()
	{
		deviceGUI.getDeviceRegistrationPanel().setDeviceTypeCmbModel
		 		 (ComboBoxModelFactory.getModel(DataType.DEVICE_TYPE));

		deviceGUI.getDeviceRegistrationPanel().setBrandCmbModel
		 		 (ComboBoxModelFactory.getModel(DataType.BRAND));

		deviceGUI.getDeviceRegistrationPanel().setModelCmbModel
		 		 (ComboBoxModelFactory.getModel(DataType.MODEL));
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
	protected Device createEntity()
	{
		Device newDevice = new Device();
		
		newDevice.setId(id);
		
		newDevice.setSerial(deviceGUI.getDeviceRegistrationPanel().getSerial());
		
		newDevice.setModel((Model) DataManager.getEntity(DataType.MODEL,
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
		
		return !("".equals(serial) 
			  || DataManager.devicesDataTable.uniqueStringCollision(serial));
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