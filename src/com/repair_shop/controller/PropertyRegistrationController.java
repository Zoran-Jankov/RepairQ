package com.repair_shop.controller;

import java.awt.Window;

import com.repair_shop.data.DataElement;
import com.repair_shop.gui.PropertyRegistrationGUI;
import com.repair_shop.gui.text.PropertyGUITextUtils;

public class PropertyRegistrationController extends InputDialogController
{
	private PropertyRegistrationGUI propertyGUI;
	
	public PropertyRegistrationController(WindowController owner, byte dataType)
	{
		super(owner, dataType);
		PropertyGUITextUtils.loadText(dataType);
		propertyGUI = (PropertyRegistrationGUI) gui;
	}
	@Override
	protected boolean isInputValid()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected DataElement createDataElement()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Window getWindow()
	{
		// TODO Auto-generated method stub
		return propertyGUI.getWindow();
	}

	@Override
	protected void showInputErrors()
	{
		// TODO Auto-generated method stub
	}
}
