package com.repair_shop.controller;

import java.awt.Window;

import com.repair_shop.data.DataElement;
import com.repair_shop.utility.DataType;

public class TicketRegistrationController extends InputDialogController
{
	public TicketRegistrationController(WindowController owner, DataType dataType)
	{
		super(owner, dataType);
	}

	@Override
	public Window getWindow()
	{
		// TODO Auto-generated method stub
		return null;
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
	protected void showInputErrors()
	{
		// TODO Auto-generated method stub
	}
}