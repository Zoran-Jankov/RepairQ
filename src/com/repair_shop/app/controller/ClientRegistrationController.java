package com.repair_shop.app.controller;

import com.repair_shop.app.utility.ActionFactory;
import com.repair_shop.app.utility.ComboBoxModelFactory;
import com.repair_shop.data.DataManager;
import com.repair_shop.data.DataType;
import com.repair_shop.data.entity.Client;
import com.repair_shop.data.entity.Marketing;
import com.repair_shop.gui.dialog.ClientRegistrationDialog;

public class ClientRegistrationController extends InputDialogController
{
	private Client newClient = new Client();
	private ClientRegistrationDialog clientGUI;
	
	public ClientRegistrationController(WindowController owner, DataType dataType)
	{
		super(owner, dataType);
		
		newEntity = newClient;

		clientGUI = (ClientRegistrationDialog) super.gui;
		
		clientGUI.getMarketingPanel().setMarketingCmbModel
				 (ComboBoxModelFactory.MARKETING_TYPE);
		
		clientGUI.getMarketingPanel()
				 .setBtnMarketingActionListener
				 (ActionFactory.openWindow(this, DataType.MARKETING_TYPE));
	}
	
	@Override
	protected boolean isInputValid()
	{
		return isNameValid()
			&& isPhoneNumberValid()
			&& isMarketingSelected();
	}
	
	private boolean isNameValid( )
	{
		return !("".equals(clientGUI.getPersonalInfoPanel().getName()));
	}
	
	private boolean isPhoneNumberValid()
	{
		String phoneNumber = clientGUI.getPersonalInfoPanel().getPrimePhoneNumber();
		
		return !(DataManager.clientsDataTable.uniqueStringCollision(phoneNumber)
			 || ("".equals(phoneNumber)));
	}

	private boolean isMarketingSelected()
	{
		return !("".equals(clientGUI.getMarketingPanel().getMarketing()));
	}

	@Override
	protected void createEntity()
	{
		newClient.setId(id);
		
		newClient.setFullName(clientGUI.getPersonalInfoPanel().getName());
		
		newClient.setPrimePhoneNumber(clientGUI.getPersonalInfoPanel().getPrimePhoneNumber());
		
		newClient.setAlternativePhoneNumber(clientGUI.getPersonalInfoPanel().getAltPoneNumber());
		
		newClient.setEmail(clientGUI.getPersonalInfoPanel().getEmail());
		
		newClient.setAddress(clientGUI.getPersonalInfoPanel().getAddress());
		
		newClient.setMarketing((Marketing) DataManager.getEntity
			     (DataType.MARKETING_TYPE, clientGUI.getMarketingPanel().getMarketing()));
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
	}
}