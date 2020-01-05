package main.java.com.yankov.repair_shop.app.controller;

import main.java.com.yankov.repair_shop.data.DataManager;
import main.java.com.yankov.repair_shop.data.EntityType;
import main.java.com.yankov.repair_shop.data.EntityFactory;
import main.java.com.yankov.repair_shop.data.entity.Property;
import main.java.com.yankov.repair_shop.gui.dialog.PropertyRegistrationDialog;

public class PropertyRegistrationController extends InputDialogController
{
	private EntityType entityType;
	private PropertyRegistrationDialog propertyGUI;
	
	public PropertyRegistrationController(WindowController owner, EntityType entityType)
	{
		super(owner, entityType);
		
		this.entityType = entityType;
		
		propertyGUI = (PropertyRegistrationDialog) super.gui;
	}
	@Override
	protected boolean isInputValid()
	{
		String name = propertyGUI.getPropertyPanel().getPropertyName();
		
		return !("".equals(name)
			  || DataManager.clientsDataTable.displayNameCollision(name));
	}

	@Override
	protected Property getInput()
	{
		Property newProperty = (Property) EntityFactory.create(entityType);
		
		newProperty.setId(super.id);
		
		newProperty.setPropertyName(propertyGUI.getPropertyPanel().getPropertyName());
		
		newProperty.setDescription(propertyGUI.getPropertyPanel().getDescription());
		
		return newProperty;
	}

	@Override
	protected void showInputErrors()
	{
		propertyGUI.getPropertyPanel().showNameError();
	}
	@Override
	protected boolean isNewEntityValid() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	protected boolean isUpdateValid() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	protected boolean isDisplayNameUniqe() {
		// TODO Auto-generated method stub
		return false;
	}
}