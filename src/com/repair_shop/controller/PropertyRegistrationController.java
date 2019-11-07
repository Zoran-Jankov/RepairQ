package com.repair_shop.controller;

import com.repair_shop.data.Property;
import com.repair_shop.gui.PropertyRegistrationGUI;
import com.repair_shop.utility.AccessData;

public class PropertyRegistrationController extends InputDialogController
{
	private PropertyRegistrationGUI propertyGUI;
	
	public PropertyRegistrationController(WindowController owner, byte dataType)
	{
		super(owner, dataType);
		propertyGUI = (PropertyRegistrationGUI) gui;
	}
	@Override
	protected boolean isInputValid()
	{
		String name = propertyGUI.txtName.getText();
		
		return !(AccessData.clientsDataTable.uniqueStringCollision(name)
			 || ("".equals(name)));
	}

	@Override
	protected Property createDataElement()
	{
		Property newProperty = new Property();
		
		newProperty.setId(id);
		newProperty.setName(propertyGUI.txtName.getText());
		newProperty.setDescription(propertyGUI.txtDescription.getText());
		
		return newProperty;
	}

	@Override
	protected void showInputErrors()
	{
		//TODO
	}
}