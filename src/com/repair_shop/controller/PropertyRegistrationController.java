package com.repair_shop.controller;

import com.repair_shop.data.DataManager;
import com.repair_shop.data.DataType;
import com.repair_shop.data.Property;
import com.repair_shop.gui.PropertyRegistrationDialog;
import com.repair_shop.utility.DataElementFactory;

public class PropertyRegistrationController extends InputDialogController
{
	private PropertyRegistrationDialog propertyGUI;
	
	public PropertyRegistrationController(WindowController owner, DataType dataType)
	{
		super(owner, dataType);
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
	protected Property createDataElement()
	{
		Property newProperty = (Property) DataElementFactory.createNewDataElement(dataType);
		
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