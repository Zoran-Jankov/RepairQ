package com.repair_shop.app.controller;

import com.repair_shop.app.utility.ActionFactory;
import com.repair_shop.app.utility.ComboBoxModelFactory;
import com.repair_shop.data.DataManager;
import com.repair_shop.data.DataType;
import com.repair_shop.data.entity.Client;
import com.repair_shop.data.entity.Ticket;
import com.repair_shop.gui.dialog.TicketRegistrationDialog;
import com.repair_shop.gui.text.ButtonName;

public class TicketRegistrationController extends InputDialogController
{
	private Ticket newTicket = new Ticket();
	private TicketRegistrationDialog ticketGUI;
	
	public TicketRegistrationController(WindowController owner, DataType dataType)
	{
		super(owner, dataType);
		
		newEntity = newTicket;
		
		ticketGUI = (TicketRegistrationDialog) super.gui;
		
		setClientPanelFunction();
		
		setDevicePanelFunction();
	}
	
	private void setClientPanelFunction()
	{
		ticketGUI.getClientPanel().setComboBoxModel
				 (ComboBoxModelFactory.CLIENT);
		
		ticketGUI.getClientPanel().setButtonFunction
		         (ActionFactory.openWindow(this, DataType.CLIENT), ButtonName.CLIENT);
		
		setClientDetails();
	}

	public void setClientDetails()
	{
		// TODO setClientDetails() implementation
	}

	private void setDevicePanelFunction()
	{
		ticketGUI.getDevicePanel().setComboBoxModel
		         (ComboBoxModelFactory.DEVICE);

		ticketGUI.getDevicePanel().setButtonFunction
                 (ActionFactory.openWindow(this, DataType.DEVICE), ButtonName.DEVICE);

		setDeviceDetails();
	}

	private void setDeviceDetails()
	{
		// TODO setDeviceDetails() implementation
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
	protected void createEntity()
	{
		
		
		newTicket.setClient((Client) DataManager.getByUniqueString(DataType.CLIENT, ticketGUI.getClient()));
		
	}

	@Override
	protected void showInputErrors()
	{
		// TODO Auto-generated method stub
	}
}