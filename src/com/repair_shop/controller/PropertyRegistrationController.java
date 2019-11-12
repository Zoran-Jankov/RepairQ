package com.repair_shop.controller;

import java.awt.Color;

import com.repair_shop.data.DataManager;
import com.repair_shop.data.DataType;
import com.repair_shop.data.Property;
import com.repair_shop.gui.PropertyRegistrationDialog;
import com.repair_shop.utility.DataElementFactory;
import com.repair_shop.utility.PropertyDialogText;

public class PropertyRegistrationController extends InputDialogController
{
	private PropertyRegistrationDialog propertyGUI;
	
	public PropertyRegistrationController(WindowController owner, DataType dataType)
	{
		super(owner, dataType);
		propertyGUI = (PropertyRegistrationDialog) gui;
	}
	@Override
	protected boolean isInputValid()
	{
		String name = propertyGUI.txtName.getText();
		
		return !(DataManager.clientsDataTable.uniqueStringCollision(name)
			 || ("".equals(name)));
	}

	@Override
	protected Property createDataElement()
	{
		Property newProperty = (Property) DataElementFactory.createNewDataElement(dataType);
		
		newProperty.setId(id);
		newProperty.setName(propertyGUI.txtName.getText());
		newProperty.setDescription(propertyGUI.txtDescription.getText());
		
		return newProperty;
	}

	@Override
	protected void showInputErrors()
	{
		propertyGUI.lblPropertyIDValue.setText(PropertyDialogText.NAME_ERROR);
		propertyGUI.txtDescription.setBackground(Color.YELLOW);
	}
}