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
		return !("".equals(clientGUI.getMarketingPanel().getMarketing()));
	}

	@Override
	protected Client createDataElement()
	{
		return new Client(clientGUI.getPersonalInfoPanel().getName(), 
						  clientGUI.getPersonalInfoPanel().getPrimePhoneNumber(), 
						  clientGUI.getPersonalInfoPanel().getAltPoneNumber(), 
						  clientGUI.getPersonalInfoPanel().getEmail(), 
						  clientGUI.getPersonalInfoPanel().getAddress(), 
						  DataElementGetter.getMarketing(clientGUI.getMarketingPanel().getMarketing()));
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