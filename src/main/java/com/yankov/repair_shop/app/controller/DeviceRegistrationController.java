package main.java.com.yankov.repair_shop.app.controller;

import main.java.com.yankov.repair_shop.app.utility.ListenerFactory;
import main.java.com.yankov.repair_shop.app.utility.ComboBoxModelManager;
import main.java.com.yankov.repair_shop.data.DataManager;
import main.java.com.yankov.repair_shop.data.EntityType;
import main.java.com.yankov.repair_shop.data.entity.Device;
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
	protected void getInput()
	{
		newDevice.setSerial(deviceGUI.getDeviceRegistrationPanel().getSerial());
		
		newDevice.setModel((Model) DataManager.getEntity(EntityType.MODEL,
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

	@Override
	protected boolean isNewEntityValid()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean isUpdateValid()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean isDisplayNameUniqe()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected String getDisplayName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected boolean isDisplayNameUniqe(String displayName) {
		// TODO Auto-generated method stub
		return false;
	}
}