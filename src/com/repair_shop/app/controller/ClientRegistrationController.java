package com.repair_shop.app.controller;

import com.repair_shop.app.utility.ActionFactory;
import com.repair_shop.app.utility.ComboBoxModelFactory;
import com.repair_shop.data.DataManager;
import com.repair_shop.data.DataType;
import com.repair_shop.data.entity.Client;
import com.repair_shop.data.entity.Marketing;
import com.repair_shop.gui.dialog.ClientRegistrationDialog;
import com.repair_shop.gui.text.LabelName;

public class ClientRegistrationController extends InputDialogController
{
	private ClientRegistrationDialog clientGUI;
	
	public ClientRegistrationController(WindowController owner, DataType dataType)
	{
		super(owner, dataType);

		clientGUI = (ClientRegistrationDialog) super.gui;
		
		clientGUI.getMarketingPanel().setMarketingCmbModel
				 (ComboBoxModelFactory.MARKETING_TYPE);
		
		clientGUI.getMarketingPanel()
				 .setMarketingButtonFunction
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
		return !("".equals(clientGUI.getPersonalInfoPanel().getPersonName()));
	}
	
	private boolean isPhoneNumberValid()
	{
		return !("".equals(clientGUI.getPersonalInfoPanel().getPrimePhoneNumber()));
	}

	private boolean isMarketingSelected()
	{
		return !(LabelName.NULL_ITEM.equals(clientGUI.getMarketingPanel().getMarketing()));
	}

	@Override
	protected Client createEntity()
	{
		Client newClient= new Client();
		
		newClient.setId(super.id);
		
		newClient.setFullName(clientGUI.getPersonalInfoPanel().getPersonName());
		
		newClient.setPrimePhoneNumber(clientGUI.getPersonalInfoPanel().getPrimePhoneNumber());
		
		newClient.setAlternativePhoneNumber(clientGUI.getPersonalInfoPanel().getAltPoneNumber());
		
		newClient.setEmail(clientGUI.getPersonalInfoPanel().getEmail());
		
		newClient.setAddress(clientGUI.getPersonalInfoPanel().getAddress());
		
		newClient.setMarketing((Marketing) DataManager.getEntity
			     									  (DataType.MARKETING_TYPE, 
			     									   clientGUI.getMarketingPanel().getMarketing()));
		
		ComboBoxModelFactory.updateModel(DataType.CLIENT, newClient.getDisplayName());
		
		return newClient;
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