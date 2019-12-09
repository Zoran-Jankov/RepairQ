package com.repair_shop.app.controller;

import com.repair_shop.app.utility.EntityFactory;
import com.repair_shop.data.DataManager;
import com.repair_shop.data.DataType;
import com.repair_shop.data.entity.Property;
import com.repair_shop.gui.dialog.PropertyRegistrationDialog;
import com.repair_shop.gui.text.WindowTitle;

public class PropertyRegistrationController extends InputDialogController
{
	private DataType dataType;
	private PropertyRegistrationDialog propertyGUI;
	
	public PropertyRegistrationController(WindowController owner, DataType dataType)
	{
		super(owner, dataType);
		
		this.dataType = dataType;
		
		WindowTitle.setPropertyTitle(dataType);
		
		propertyGUI = (PropertyRegistrationDialog) super.gui;
	}
	@Override
	protected boolean isInputValid()
	{
		String name = propertyGUI.getPropertyPanel().getName();
		
		return !(DataManager.clientsDataTable.uniqueStringCollision(name)
			 || ("".equals(name)));
	}

	@Override
	protected Property createEntity()
	{
		Property newProperty = (Property) EntityFactory.create(dataType);
		
		newProperty.setId(id);
		newProperty.setName(propertyGUI.getPropertyPanel().getName());
		newProperty.setDescription(propertyGUI.getPropertyPanel().getDescription());
		
		return newProperty;
	}

	@Override
	protected void showInputErrors()
	{
		propertyGUI.getPropertyPanel().showNameError();
	}
}