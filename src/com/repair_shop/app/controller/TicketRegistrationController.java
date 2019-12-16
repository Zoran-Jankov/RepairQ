package com.repair_shop.app.controller;

import com.repair_shop.app.utility.ActionFactory;
import com.repair_shop.app.utility.ComboBoxModelFactory;
import com.repair_shop.data.DataManager;
import com.repair_shop.data.DataType;
import com.repair_shop.data.entity.Client;
import com.repair_shop.data.entity.Device;
import com.repair_shop.data.entity.Ticket;
import com.repair_shop.gui.dialog.TicketRegistrationDialog;
import com.repair_shop.gui.text.ButtonName;
import com.repair_shop.gui.text.LabelName;

public class TicketRegistrationController extends InputDialogController
{
	private TicketRegistrationDialog ticketGUI;
	
	public TicketRegistrationController(WindowController owner, DataType dataType)
	{
		super(owner, dataType);
		
		ticketGUI = (TicketRegistrationDialog) super.gui;
		
		setClientPanelFunction();
		
		setDevicePanelFunction();
	}
	
	private void setClientPanelFunction()
	{
		ticketGUI.getClientPanel().setEntityType(LabelName.CLIENT);
		
		ticketGUI.getClientPanel().setComboBoxModel(ComboBoxModelFactory.CLIENT);
		
		ticketGUI.getClientPanel().setButtonFunction
		         (ActionFactory.openWindow(this, DataType.CLIENT), ButtonName.CLIENT);
		
		setClientDetails();
	}

	public void setClientDetails()
	{
		if(ticketGUI.getClient() != LabelName.NULL_ITEM)
		{
			Client selectedClient = (Client) DataManager.getEntity(DataType.CLIENT, ticketGUI.getClient());
		
			ticketGUI.getClientPanel().setEntityDetails
									  ("<html>" + selectedClient.getFullName() + "<br><br>"
												+ selectedClient.getPrimePhoneNumber() + "<br><br>"
												+ selectedClient.getAlternativePhoneNumber() + "<br><br>"
												+ selectedClient.getEmail() + "<br><br>"
												+ selectedClient.getAddress() + "</html>");
		}
	}

	private void setDevicePanelFunction()
	{
		ticketGUI.getDevicePanel().setEntityType(LabelName.DEVICE);
		
		ticketGUI.getDevicePanel().setComboBoxModel(ComboBoxModelFactory.DEVICE);

		ticketGUI.getDevicePanel().setButtonFunction
                 (ActionFactory.openWindow(this, DataType.DEVICE), ButtonName.DEVICE);

		setDeviceDetails();
	}

	private void setDeviceDetails()
	{
		Device selectedDevice = (Device) DataManager.getEntity(DataType.DEVICE, ticketGUI.getDevice());
		
		ticketGUI.getDevicePanel().setEntityDetails
								  ("<html>" + selectedDevice.getModel().getDataType() + "<br><br>"
											+ selectedDevice.getModel().getBrand() + "<br><br>"
											+ selectedDevice.getModel().getName() + "<br><br>"
											+ selectedDevice.getSerial() + "</html>");
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
		return !(LabelName.NULL_ITEM.equals(ticketGUI.getClient()));
	}

	private boolean isDeviceSelected()
	{
		return !(LabelName.NULL_ITEM.equals(ticketGUI.getDevice()));
	}

	private boolean areDetailsValid()
	{
		return !("".equals(ticketGUI.getTicketPanel().getDetails()));
	}

	@Override
	protected Ticket createEntity()
	{
		Ticket newTicket = new Ticket();
		
		newTicket.setClient((Client) DataManager.getEntity(DataType.CLIENT, ticketGUI.getClient()));
		newTicket.setDevice((Device) DataManager.getEntity(DataType.DEVICE, id));
		return newTicket;
	}

	@Override
	protected void showInputErrors()
	{
		// TODO Auto-generated method stub
	}
}