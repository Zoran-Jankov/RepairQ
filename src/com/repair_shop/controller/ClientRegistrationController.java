package com.repair_shop.controller;

import com.repair_shop.data.Client;
import com.repair_shop.data.DataElementGetter;
import com.repair_shop.data.DataManager;
import com.repair_shop.data.DataType;
import com.repair_shop.gui.ClientRegistrationDialog;
import com.repair_shop.utility.ActionListenerFactory;
import com.repair_shop.utility.CmbModelFactory;

public class ClientRegistrationController extends InputDialogController
{
	private ClientRegistrationDialog clientGUI;
	
	public ClientRegistrationController(WindowController owner, DataType dataType)
	{
		super(owner, dataType);
		clientGUI = (ClientRegistrationDialog) super.gui;
		clientGUI.getMarketingPanel().setMarketingCmbModel(CmbModelFactory.getModel(dataType));
		clientGUI.getMarketingPanel()
				 .setBtnMarketingActionListener(ActionListenerFactory
			     .openNewWindow(this, DataType.MARKETING_TYPE));
		
	}
	
	public void updateComboBoxes(String item)
	{
		clientGUI.getMarketingPanel().setMarketing(item);
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
		return clientGUI.getMarketingPanel().getMarketing() != "";
	}

	@Override
	protected Client createDataElement()
	{
		Client newClient= new Client();
		
		newClient.setId(id);
		newClient.setName(clientGUI.getPersonalInfoPanel().getName());
		newClient.setPrimePhoneNumber(clientGUI.getPersonalInfoPanel().getPrimePhoneNumber());
		newClient.setAlternativePhoneNumber(clientGUI.getPersonalInfoPanel().getAltPoneNumber());
		newClient.setEmail(clientGUI.getPersonalInfoPanel().getEmail());
		newClient.setAddress(clientGUI.getPersonalInfoPanel().getAddress());
		newClient.setMarketing(DataElementGetter.getMarketing(clientGUI.getMarketingPanel().getMarketing()));
		
		return newClient;
	}
	
	@Override
	protected void showInputErrors()
	{
		checkName();
		checkPhoneNumber();
		checkMarketing();
	}
	
	private void checkName()
	{
		if(isNameValid())
		{
			clientGUI.getPersonalInfoPanel().showNameDefault();
		}
		else
		{
			clientGUI.getPersonalInfoPanel().showNameError();
		}
	}
	
	
	private void checkPhoneNumber()
	{

		if(isPhoneNumberValid())
		{
			clientGUI.getPersonalInfoPanel().showPhoneDefault();
		}
		else
		{
			clientGUI.getPersonalInfoPanel().showPhoneError();
		}
	}
	
	private void checkMarketing()
	{
		if(isMarketingSelected())
		{
			clientGUI.getMarketingPanel().showMarketingDefault();
		}
		else
		{
			clientGUI.getMarketingPanel().showMarketingError();
		}
	}
}