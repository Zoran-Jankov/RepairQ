package main.java.com.yankov.repair_shop.app.controller;

import main.java.com.yankov.repair_shop.app.utility.ListenerFactory;
import main.java.com.yankov.repair_shop.app.utility.ComboBoxModelManager;
import main.java.com.yankov.repair_shop.app.utility.IDGenerator;
import main.java.com.yankov.repair_shop.data.DataManager;
import main.java.com.yankov.repair_shop.data.EntityType;
import main.java.com.yankov.repair_shop.data.entity.Client;
import main.java.com.yankov.repair_shop.data.entity.Device;
import main.java.com.yankov.repair_shop.data.entity.Ticket;
import main.java.com.yankov.repair_shop.gui.dialog.TicketRegistrationDialog;
import main.java.com.yankov.repair_shop.gui.text.ButtonName;
import main.java.com.yankov.repair_shop.gui.text.LabelName;

public class TicketRegistrationController extends InputDialogController
{
	private TicketRegistrationDialog ticketGUI;
	
	public TicketRegistrationController(WindowController owner, EntityType entityType)
	{
		super(owner, entityType);
		
		ticketGUI = (TicketRegistrationDialog) super.gui;
		
		setClientPanelFunction();
		
		setDevicePanelFunction();
	}
	
	private void setClientPanelFunction()
	{
		ticketGUI.getClientPanel().setEntityType(LabelName.CLIENT);
		
		ticketGUI.getClientPanel().setComboBoxModel(ComboBoxModelManager.CLIENT);
		
		ticketGUI.getClientPanel().setButtonFunction
		         (ListenerFactory.openWindow(this, EntityType.CLIENT), ButtonName.CLIENT);
		
		setClientDetails();
	}

	public void setClientDetails()
	{
		if(ticketGUI.getClient() != LabelName.NULL_ITEM)
		{
			Client selectedClient = (Client) DataManager.getEntity(EntityType.CLIENT, ticketGUI.getClient());
		
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
		
		ticketGUI.getDevicePanel().setComboBoxModel(ComboBoxModelManager.DEVICE);

		ticketGUI.getDevicePanel().setButtonFunction
                 (ListenerFactory.openWindow(this, EntityType.DEVICE), ButtonName.DEVICE);

		setDeviceDetails();
	}

	private void setDeviceDetails()
	{
		Device selectedDevice = (Device) DataManager.getEntity
										(EntityType.DEVICE, IDGenerator.toInt(ticketGUI.getDevice()));
		
		ticketGUI.getDevicePanel().setEntityDetails
								  ("<html>" + selectedDevice.getModel().getDeviceType().getName() + "<br><br>"
											+ selectedDevice.getModel().getBrand().getName() + "<br><br>"
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
		
		newTicket.setClient((Client) DataManager.getEntity(EntityType.CLIENT, ticketGUI.getClient()));
		newTicket.setDevice((Device) DataManager.getEntity(EntityType.DEVICE, id));
		return newTicket;
	}

	@Override
	protected void showInputErrors()
	{
		// TODO Auto-generated method stub
	}
}