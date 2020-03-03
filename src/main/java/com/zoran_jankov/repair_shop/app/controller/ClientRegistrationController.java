package main.java.com.zoran_jankov.repair_shop.app.controller;

import main.java.com.zoran_jankov.repair_shop.app.utility.ComboBoxModelManager;
import main.java.com.zoran_jankov.repair_shop.app.utility.ListenerFactory;
import main.java.com.zoran_jankov.repair_shop.data.DataManager;
import main.java.com.zoran_jankov.repair_shop.data.EntityType;
import main.java.com.zoran_jankov.repair_shop.data.entity.Customer;
import main.java.com.zoran_jankov.repair_shop.data.entity.Entity;
import main.java.com.zoran_jankov.repair_shop.data.entity.Marketing;
import main.java.com.zoran_jankov.repair_shop.gui.dialog.ClientRegistrationDialog;
import main.java.com.zoran_jankov.repair_shop.gui.text.LabelName;

public class ClientRegistrationController extends InputDialogController
{
	private ClientRegistrationDialog clientGUI;
	private Customer newClient;
	
	public ClientRegistrationController(WindowController owner, EntityType entityType)
	{
		super(owner, entityType);
		initializeClientDialogController();
	}
	
	public ClientRegistrationController(WindowController owner, Entity entity)
	{
		super(owner, entity);
		initializeClientDialogController();
	}
	
	private void initializeClientDialogController()
	{
		newClient = (Customer) super.entity;

		clientGUI = (ClientRegistrationDialog) super.gui;
		
		clientGUI.getMarketingPanel().setMarketingCmbModel
				 (ComboBoxModelManager.MARKETING);
		
		clientGUI.getMarketingPanel().setMarketingButtonFunction
				 (ListenerFactory.openWindow(this, EntityType.MARKETING));
	}

	protected boolean isInputValid()
	{
		return isNameValid()
			&& isPhoneNumberValid()
			&& isMarketingSelected()
			&& super.isDisplayNameUnique(getDisplayName());
	}
	
	private String getDisplayName()
	{
		return clientGUI.getPersonalInfoPanel().getPersonName() 
			 + " "
			 + clientGUI.getPersonalInfoPanel().getPhoneNumber();
	}
	
	private boolean isNameValid( )
	{
		return !("".equals(clientGUI.getPersonalInfoPanel().getPersonName()));
	}
	
	private boolean isPhoneNumberValid()
	{
		return !("".equals(clientGUI.getPersonalInfoPanel().getPhoneNumber()));
	}

	private boolean isMarketingSelected()
	{
		return !(LabelName.NULL_ITEM.equals(clientGUI.getMarketingPanel().getMarketing()));
	}

	@Override
	protected void getInput()
	{
		newClient.setFullName(clientGUI.getPersonalInfoPanel().getPersonName());
		
		newClient.setPrimePhoneNumber(clientGUI.getPersonalInfoPanel().getPhoneNumber());
		
		newClient.setAlternativePhoneNumber(clientGUI.getPersonalInfoPanel().getAltPoneNumber());
		
		newClient.setEmail(clientGUI.getPersonalInfoPanel().getEmail());
		
		newClient.setAddress(clientGUI.getPersonalInfoPanel().getAddress());
	}
	
	@Override
	protected void showInputErrors()
	{
		if(!isNameValid())
		{
			clientGUI.getPersonalInfoPanel().showNameError();
		}
		
		if(!isPhoneNumberValid())
		{
			clientGUI.getPersonalInfoPanel().showPhoneError();
		}
		
		if(!isMarketingSelected())
		{
			clientGUI.getMarketingPanel().showMarketingError();
		}
		
		super.checkForDuplicate(getDisplayName());
	}
}