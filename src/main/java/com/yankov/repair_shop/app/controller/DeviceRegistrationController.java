package main.java.com.yankov.repair_shop.app.controller;

import main.java.com.yankov.repair_shop.app.utility.ActionFactory;
import main.java.com.yankov.repair_shop.app.utility.ComboBoxModelFactory;
import main.java.com.yankov.repair_shop.app.utility.IDGenerator;
import main.java.com.yankov.repair_shop.data.DataManager;
import main.java.com.yankov.repair_shop.data.EntityType;
import main.java.com.yankov.repair_shop.data.entity.Device;
import main.java.com.yankov.repair_shop.data.entity.Model;
import main.java.com.yankov.repair_shop.gui.dialog.DeviceRegistrationDialog;
import main.java.com.yankov.repair_shop.gui.text.LabelName;

public class DeviceRegistrationController extends InputDialogController
{
	private DeviceRegistrationDialog deviceGUI;
	
	public DeviceRegistrationController(WindowController owner, EntityType dataType)
	{
		super(owner, dataType);
		
		deviceGUI = (DeviceRegistrationDialog) super.gui;
		
		setComboBoxModels();
		
		deviceGUI.getDeviceRegistrationPanel()
				 .setBtnNewModelActionListener
				 (ActionFactory.openWindow(this,EntityType.MODEL));
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
	protected Device createEntity()
	{
		Device newDevice = new Device();
		
		newDevice.setId(super.id);
		
		newDevice.setSerial(deviceGUI.getDeviceRegistrationPanel().getSerial());
		
		newDevice.setModel((Model) DataManager.getEntity(EntityType.MODEL,
									 deviceGUI.getDeviceRegistrationPanel().getModel()));
		
		ComboBoxModelFactory.updateModel(EntityType.DEVICE, IDGenerator.toString(EntityType.DEVICE, newDevice.getId()));
		
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
		return !(LabelName.NULL_ITEM.equals(deviceGUI.getDeviceRegistrationPanel().getModel()));
	}

	private  boolean isSerialNumberValid()
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