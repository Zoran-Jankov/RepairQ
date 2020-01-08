package main.java.com.yankov.repair_shop.app.controller;

import main.java.com.yankov.repair_shop.app.utility.ListenerFactory;
import main.java.com.yankov.repair_shop.app.utility.ComboBoxModelManager;
import main.java.com.yankov.repair_shop.data.DataManager;
import main.java.com.yankov.repair_shop.data.EntityType;
import main.java.com.yankov.repair_shop.data.entity.Device;
import main.java.com.yankov.repair_shop.data.entity.Entity;
import main.java.com.yankov.repair_shop.data.entity.Model;
import main.java.com.yankov.repair_shop.gui.dialog.DeviceRegistrationDialog;
import main.java.com.yankov.repair_shop.gui.text.LabelName;

public class DeviceRegistrationController extends InputDialogController
{
	private DeviceRegistrationDialog deviceGUI;
	private Device newDevice;
	
	public DeviceRegistrationController(WindowController owner, EntityType entityType)
	{
		super(owner, entityType);
		initializeDeviceDialogController();
	}
	
	public DeviceRegistrationController(WindowController owner, Entity entity) 
	{
		super(owner, entity);
		initializeDeviceDialogController();
	}
	
	private void initializeDeviceDialogController()
	{
		newDevice = (Device) super.entity;
		
		deviceGUI = (DeviceRegistrationDialog) super.gui;
		
		setComboBoxModels();
		
		deviceGUI.getDeviceRegistrationPanel().setBtnNewModelActionListener
				 (ListenerFactory.openWindow(this,EntityType.MODEL));
	}

	private void setComboBoxModels()
	{
		deviceGUI.getDeviceRegistrationPanel().setDeviceTypeCmbModel
		 		 (ComboBoxModelManager.DEVICE_TYPE);

		deviceGUI.getDeviceRegistrationPanel().setBrandCmbModel
		 		 (ComboBoxModelManager.BRAND);

		deviceGUI.getDeviceRegistrationPanel().setModelCmbModel
		 		 (ComboBoxModelManager.MODEL);
	}
	
	@Override
	protected boolean isInputValid()
	{	
		return isModelSelected()
			&& isSerialNumberValid();
	}
	
	@Override
	protected String getDisplayName()
	{
		return newDevice.getDisplayName();
	}
	
	@Override
	protected void getInput()
	{
		newDevice.setSerial(deviceGUI.getDeviceRegistrationPanel().getSerial());
		
		newDevice.setModel((Model) DataManager.getEntity(EntityType.MODEL,
									 deviceGUI.getDeviceRegistrationPanel().getModel()));
	}

	private boolean isModelSelected()
	{
		return !(LabelName.NULL_ITEM.equals(deviceGUI.getDeviceRegistrationPanel().getModel()));
	}

	private boolean isSerialNumberValid()
	{
		String serial = deviceGUI.getDeviceRegistrationPanel().getSerial();
		
		return !("".equals(serial));
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