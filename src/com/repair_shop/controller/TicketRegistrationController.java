package com.repair_shop.controller;

import com.repair_shop.data.DataType;
import com.repair_shop.data.Ticket;

public class TicketRegistrationController extends InputDialogController
{
	public TicketRegistrationController(WindowController owner, DataType dataType)
	{
		super(owner, dataType);
	}

	@Override
	protected boolean isInputValid()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected Ticket createDataElement()
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