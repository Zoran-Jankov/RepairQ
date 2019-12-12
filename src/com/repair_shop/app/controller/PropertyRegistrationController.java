package com.repair_shop.app.controller;

import com.repair_shop.data.DataManager;
import com.repair_shop.data.DataType;
import com.repair_shop.data.EntityFactory;
import com.repair_shop.data.entity.Property;
import com.repair_shop.gui.dialog.PropertyRegistrationDialog;

public class PropertyRegistrationController extends InputDialogController
{
	private Property newProperty = (Property) EntityFactory.create(dataType);
	private PropertyRegistrationDialog propertyGUI;
	
	public PropertyRegistrationController(WindowController owner, DataType dataType)
	{
		super(owner, dataType);
		
		newEntity = newProperty;
		
		this.dataType = dataType;
		
		propertyGUI = (PropertyRegistrationDialog) super.gui;
	}
	@Override
	protected boolean isInputValid()
	{
		String name = propertyGUI.getPropertyPanel().getPropertyName();
		
		return !("".equals(name)
			  || DataManager.clientsDataTable.uniqueStringCollision(name));
	}

	@Override
	protected void createEntity()
	{
		newProperty.setId(id);
		
		newProperty.setName(propertyGUI.getPropertyPanel().getPropertyName());
		
		newProperty.setDescription(propertyGUI.getPropertyPanel().getDescription());
	}

	@Override
	protected void showInputErrors()
	{
		propertyGUI.getPropertyPanel().showNameError();
	}
}