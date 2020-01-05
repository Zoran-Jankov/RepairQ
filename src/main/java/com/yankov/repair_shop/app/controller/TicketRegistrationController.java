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
	private Ticket newTicket;
	
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
		
		ticketGUI.getClientPanel().setComboBoxFunction
				 (ComboBoxModelManager.CLIENT, 
				  ListenerFactory.comboBoxListener(EntityType.CLIENT, this));
		
		
		ticketGUI.getClientPanel().setButtonNewEntityFunction
		         (ListenerFactory.openWindow(this, EntityType.CLIENT), ButtonName.CLIENT);
		
		showClientDetails();
	}

	public void showClientDetails()
	{
		if(isClientSelected())
		{
			setClientDetails();
		}
		else
		{
			ticketGUI.getClientPanel().setEntityDetails(LabelName.NULL_ITEM);
		}
	}
	
	private void setClientDetails()
	{
		Client selectedClient = (Client) DataManager.getEntity(EntityType.CLIENT, ticketGUI.getClient());
		
		ticketGUI.getClientPanel()
				 .setEntityDetails("<html>" 
						 + selectedClient.getFullName() + "<br>"
						 + selectedClient.getPrimePhoneNumber() + "<br>"
						 + selectedClient.getAlternativePhoneNumber() + "<br>"
						 + selectedClient.getEmail() + "<br>"
						 + selectedClient.getAddress() + "</html>");
	}

	private void setDevicePanelFunction()
	{
		ticketGUI.getDevicePanel().setEntityType(LabelName.DEVICE);
		
		ticketGUI.getDevicePanel().setComboBoxFunction
								  (ComboBoxModelManager.DEVICE, 
								   ListenerFactory.comboBoxListener(EntityType.DEVICE, this));

		ticketGUI.getDevicePanel().setButtonNewEntityFunction
                 (ListenerFactory.openWindow(this, EntityType.DEVICE), ButtonName.DEVICE);

		showDeviceDetails();
	}

	public void showDeviceDetails()
	{
		if(isDeviceSelected())
		{
			setDeviceDetails();
		}
		else
		{
			ticketGUI.getDevicePanel().setEntityDetails(LabelName.NULL_ITEM);
		}
	}
	
	private void setDeviceDetails()
	{
		Device selectedDevice = (Device) DataManager.getEntity
				(EntityType.DEVICE, IDGenerator.toInt(EntityType.DEVICE, ticketGUI.getDevice()));

		ticketGUI.getDevicePanel()
				 .setEntityDetails("<html>" 
						 + selectedDevice.getModel().getDeviceType().getPropertyName() + "<br>"
						 + selectedDevice.getModel().getBrand().getPropertyName() + "<br>"
						 + selectedDevice.getModel().getPropertyName() + "<br>"
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
	protected void getInput()
	{

		
		newTicket.setId(super.id);
		newTicket.setClient((Client) DataManager.getEntity
				 (EntityType.CLIENT, ticketGUI.getClient()));
		newTicket.setDevice((Device) DataManager.getEntity
				 (EntityType.DEVICE, 
						 IDGenerator.toInt(EntityType.DEVICE, ticketGUI.getDevice())));
		
	}

	@Override
	protected void showInputErrors()
	{
		if(isClientSelected())
		{
			ticketGUI.getClientPanel().showSelectionError();
		}
		
		if(isDeviceSelected())
		{
			ticketGUI.getDevicePanel().showSelectionError();
		}
	}

	@Override
	protected boolean isNewEntityValid()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean isUpdateValid()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean isDisplayNameUniqe()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected String getDisplayName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected boolean isDisplayNameUniqe(String displayName) {
		// TODO Auto-generated method stub
		return false;
	}
}