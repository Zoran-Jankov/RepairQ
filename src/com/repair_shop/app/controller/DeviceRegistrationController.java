package com.repair_shop.app.controller;

import com.repair_shop.app.utility.ActionFactory;
import com.repair_shop.app.utility.ComboBoxModelFactory;
import com.repair_shop.data.DataManager;
import com.repair_shop.data.DataType;
import com.repair_shop.data.entity.Device;
import com.repair_shop.data.entity.Model;
import com.repair_shop.gui.dialog.DeviceRegistrationDialog;
import com.repair_shop.gui.text.LabelName;

public class DeviceRegistrationController extends InputDialogController
{
	private Device newDevice = new Device();
	private DeviceRegistrationDialog deviceGUI;
	
	public DeviceRegistrationController(WindowController owner, DataType dataType)
	{
		super(owner, dataType);
		
		newEntity = newDevice;
		
		deviceGUI = (DeviceRegistrationDialog) gui;
		
		setComboBoxModels();
		
		deviceGUI.getDeviceRegistrationPanel()
				 .setBtnNewModelActionListener
				 (ActionFactory.openWindow(this,DataType.MODEL));
	}
	
	private void setComboBoxModels()
	{
		deviceGUI.getDeviceRegistrationPanel().setDeviceTypeCmbModel
		 		 (ComboBoxModelFactory.DEVICE_TYPE);

		deviceGUI.getDeviceRegistrationPanel().setBrandCmbModel
		 		 (ComboBoxModelFactory.BRAND);

		deviceGUI.getDeviceRegistrationPanel().setModelCmbModel
		 		 (ComboBoxModelFactory.MODEL);
	}
	
	@Override
	protected void createEntity()
	{
		newDevice.setId(id);
		
		newDevice.setSerial(deviceGUI.getDeviceRegistrationPanel().getSerial());
		
		newDevice.setModel((Model) DataManager.getEntity(DataType.MODEL,
									 deviceGUI.getDeviceRegistrationPanel().getModel()));
	}
	
	@Override
	protected  boolean isInputValid()
	{
		return isModelSelected()
			&& isSerialNumberValid();
	}

	private  boolean isModelSelected()
	{
		return !(LabelName.NULL_ITEM.equals(deviceGUI.getDeviceRegistrationPanel().getModel()));
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