package main.java.com.zoran_jankov.repair_shop.app.controller.dialog;

import main.java.com.zoran_jankov.repair_shop.data.DataManager;
import main.java.com.zoran_jankov.repair_shop.data.EntityType;
import main.java.com.zoran_jankov.repair_shop.data.entity.BasicInfo;
import main.java.com.zoran_jankov.repair_shop.data.entity.Entity;
import main.java.com.zoran_jankov.repair_shop.gui.dialog.PropertyRegistrationDialog;

public class PropertyRegistrationController extends InputDialogController
{
	private PropertyRegistrationDialog propertyGUI;
	private BasicInfo newProperty;
	
	public PropertyRegistrationController(WindowController owner, EntityType entityType)
	{
		super(owner, entityType);
		initializePropertyDialogController();
	}
	
	public PropertyRegistrationController(WindowController owner, Entity entity)
	{
		super(owner, entity);
		initializePropertyDialogController();
	}
	
	private void initializePropertyDialogController()
	{
		newProperty = (BasicInfo) super.entity;
		
		propertyGUI = (PropertyRegistrationDialog) super.gui;
	}
	
	protected boolean isInputValid()
	{
		String name = propertyGUI.getPropertyPanel().getPropertyName();
		
		return !("".equals(name)
			  || DataManager.accessData().getDataTable(entityType).displayNameCollision(name));
	}

	@Override
	protected void getInput()
	{
		newProperty.setName(propertyGUI.getPropertyPanel().getPropertyName());
		
		newProperty.setDescription(propertyGUI.getPropertyPanel().getDescription());
	}

	@Override
	protected void showInputErrors()
	{
		propertyGUI.getPropertyPanel().showNameError();
		super.checkForDuplicate(getDisplayName());
	}
	
	protected String getDisplayName()
	{
		return propertyGUI.getPropertyPanel().getPropertyName();
	}
}