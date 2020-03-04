package main.java.com.zoran_jankov.repair_shop.app.controller;

import java.time.LocalDate;

import main.java.com.zoran_jankov.repair_shop.app.utility.ComboBoxModelManager;
import main.java.com.zoran_jankov.repair_shop.app.utility.IDGenerator;
import main.java.com.zoran_jankov.repair_shop.app.utility.ListenerFactory;
import main.java.com.zoran_jankov.repair_shop.data.DataManager;
import main.java.com.zoran_jankov.repair_shop.data.EntityType;
import main.java.com.zoran_jankov.repair_shop.data.Priority;
import main.java.com.zoran_jankov.repair_shop.data.entity.Customer;
import main.java.com.zoran_jankov.repair_shop.data.entity.Device;
import main.java.com.zoran_jankov.repair_shop.data.entity.Entity;
import main.java.com.zoran_jankov.repair_shop.data.entity.Notification;
import main.java.com.zoran_jankov.repair_shop.data.entity.NotificationType;
import main.java.com.zoran_jankov.repair_shop.data.entity.Ticket;
import main.java.com.zoran_jankov.repair_shop.gui.dialog.TicketRegistrationDialog;
import main.java.com.zoran_jankov.repair_shop.gui.text.ButtonName;
import main.java.com.zoran_jankov.repair_shop.gui.text.LabelName;

public class TicketRegistrationController extends InputDialogController
{
	private TicketRegistrationDialog ticketGUI;
	private Ticket newTicket;
	
	public TicketRegistrationController(WindowController owner, EntityType entityType)
	{
		super(owner, entityType);
		
		initializeTicketDialogController();
	}
	
	public TicketRegistrationController(WindowController owner, Entity entity)
	{
		super(owner, entity);
		
		initializeTicketDialogController();
	}
	
	private void initializeTicketDialogController()
	{
		ticketGUI = (TicketRegistrationDialog) super.gui;
		
		setClientPanelFunction();
		
		setDevicePanelFunction();
	}
	
	private void setClientPanelFunction()
	{
		ticketGUI.getClientPanel().setEntityType(LabelName.CLIENT);
		
		ticketGUI.getClientPanel().setComboBoxFunction
				 (ComboBoxModelManager.CLIENT, 
				  ListenerFactory.comboBoxListener(EntityType.CUSTOMER, this));
		
		ticketGUI.getClientPanel().setButtonNewEntityFunction
		         (ListenerFactory.openWindow(this, EntityType.CUSTOMER), ButtonName.CLIENT);
		
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
		Customer selectedClient = (Customer) DataManager.accessData().getEntity(EntityType.CUSTOMER, ticketGUI.getClient());
		
		ticketGUI.getClientPanel()
				 .setEntityDetails("<html>" 
						 + selectedClient.getFullName() + "<br>"
						 + selectedClient.getPhoneNumber() + "<br>"
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
						 + selectedDevice.getModel().getDeviceType().getName() + "<br>"
						 + selectedDevice.getModel().getBrand().getName() + "<br>"
						 + selectedDevice.getModel().getName() + "<br>"
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
		newTicket.setClient((Customer) DataManager.getEntity
				 (EntityType.CUSTOMER, ticketGUI.getClient()));
		
		newTicket.setDevice((Device) DataManager.getEntity
				 (EntityType.DEVICE, 
						 IDGenerator.toInt(EntityType.DEVICE, ticketGUI.getDevice())));
		
		newTicket.setPriority(Priority.NORMAL);
		
		createNotification();
	}
	
	private void createNotification()
	{
		Notification opendTicket = new Notification();
		
		opendTicket.setNotificationType(NotificationType.OPEND);
		opendTicket.setTicket(newTicket);
		opendTicket.setUser(DataManager.logedinUser);
		opendTicket.setDate(LocalDate.now());
		opendTicket.setComment(ticketGUI.getTicketPanel().getDetails());
		
		DataManager.save(opendTicket);
	}
	
	@Override
	protected void showInputErrors()
	{
		if(!isClientSelected())
		{
			ticketGUI.getClientPanel().showSelectionError();
		}
		
		if(!isDeviceSelected())
		{
			ticketGUI.getDevicePanel().showSelectionError();
		}
		
		if(!areDetailsValid())
		{
			ticketGUI.getTicketPanel().showDetailsError();
		}
	}
}