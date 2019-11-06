package com.repair_shop.controller;

import java.awt.Window;

import com.repair_shop.gui.PropertyRegistrationGUI;
import com.repair_shop.gui.text.PropertyGUITextUtils;
import com.repair_shop.utility.GuiFactory;
import com.repair_shop.utility.IDGenerator;

public class PropertyRegistrationController extends InputDialogController
{
	private int propertyID;
	private PropertyRegistrationGUI gui;
	
	public PropertyRegistrationController(WindowController owner, byte type)
	{
		PropertyGUITextUtils.loadText(type);
		propertyID = IDGenerator.
		gui = (PropertyRegistrationGUI) GuiFactory.getWindow(owner.getWindow(), type);
		gui.lblIDValue.setText(ID);
	}

	@Override
	public void trySavingDataElement()
	{
		// TODO Auto-generated method stub
	}

	@Override
	public Window getWindow()
	{
		// TODO Auto-generated method stub
		return null;
	}
}
