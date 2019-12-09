package com.repair_shop.app.controller;

import com.repair_shop.data.DataManager;
import com.repair_shop.data.DataType;
import com.repair_shop.data.entity.Client;
import com.repair_shop.data.entity.Ticket;
import com.repair_shop.gui.dialog.TicketRegistrationDialog;

public class TicketRegistrationController extends InputDialogController
{
	private TicketRegistrationDialog ticketGUI;
	
	public TicketRegistrationController(WindowController owner, DataType dataType)
	{
		super(owner, dataType);
		
		ticketGUI = (TicketRegistrationDialog) super.gui;
		
	}

	@Override
	protected boolean isInputValid()
	{
		return isClientSelected()
			&& isDeviceSelected()
			&& areDetailsValid();
	}

	private boolean isClientSelected()
	{
		return false;
	}

	private boolean isDeviceSelected()
	{
		return false;
	}

	private boolean areDetailsValid()
	{
		return false;
	}

	@Override
	protected Ticket createEntity()
	{
		Ticket newTicket = new Ticket();
		
		newTicket.setClient((Client) DataManager.getByUniqueString(DataType.CLIENT, ticketGUI.getClient()));
		
		return newTicket;
	}

	@Override
	protected void showInputErrors()
	{
		// TODO Auto-generated method stub
	}
}