package com.repair_shop.controller;

import java.awt.Color;
import java.awt.Window;

import com.repair_shop.data.Client;
import com.repair_shop.data.Property;
import com.repair_shop.gui.ClientRegistrationGUI;
import com.repair_shop.gui.text.ClientGUITextUtils;
import com.repair_shop.utility.AccessData;
import com.repair_shop.utility.ActionListenerFactory;
import com.repair_shop.utility.CmbModelFactory;
import com.repair_shop.utility.DataType;

public class ClientRegistrationController extends InputDialogController
{
	private ClientRegistrationGUI clientGUI;
	public ClientRegistrationController(WindowController owner, byte dataType)
	{
		super(owner, dataType);
		clientGUI = (ClientRegistrationGUI) gui;
		clientGUI.btnAddNewMarketing.addActionListener(ActionListenerFactory
	              .openNewWindow(this, DataType.MARKETING_TYPE));
		updateComboBoxes();
	}
	
	public void updateComboBoxes()
	{
		clientGUI.cmbMarketing.setModel(CmbModelFactory.getModel(DataType.MARKETING_TYPE));
	}
	
	@Override
	protected boolean isInputValid()
	{
		return isFirstNameEntered()
			&& isLastNameEntered()
			&& isPhoneNumberOK()
			&& isMarketingSelected();
	}
	
	private boolean isFirstNameEntered( )
	{
		return !("".equals(clientGUI.txtFirstName.getText()));
	}

	private boolean isLastNameEntered( )
	{
		return !("".equals(clientGUI.txtLastName.getText()));
	}
	
	private boolean isPhoneNumberOK()
	{
		String phoneNumber = clientGUI.txtPrimePhoneNum.getText();
		
		return !(AccessData.clientsDataTable.uniqueStringCollision(phoneNumber)
			 || ("".equals(phoneNumber)));
	}

	private boolean isMarketingSelected()
	{
		return clientGUI.cmbMarketing.getSelectedItem() != null;
	}

	@Override
	protected Client createDataElement()
	{
		Client newClient = new Client();
		
		newClient.setId(id);
		newClient.setFirstName(clientGUI.txtFirstName.getText());
		newClient.setLastName(clientGUI.txtPrimePhoneNum.getText());
		newClient.setPrimePhoneNumber(clientGUI.txtPrimePhoneNum.getText());
		newClient.setAlternativePhoneNumber(clientGUI.txtAlternativePhoneNum.getText());
		newClient.setEmail(clientGUI.txtEmail.getText());
		newClient.setAddress(clientGUI.txtAddress.getText());
		newClient.setMarketing((Property) AccessData.marketingTypesDataTable
				 .getByUniqueString((String) clientGUI.cmbMarketing.getSelectedItem()));
		
		return newClient;
	}
	
	@Override
	protected void showInputErrors()
	{
		checkFirstName();
		checkLastName();
		checkPhoneNumber();
		checkMarketing();
	}
	
	private void checkFirstName()
	{
		if(isFirstNameEntered())
		{
			clientGUI.lblFirstName.setText(ClientGUITextUtils.FIRST_NAME_LABEL);
			clientGUI.txtFirstName.setBackground(Color.WHITE);
		}
		else
		{
			clientGUI.lblFirstName.setText(ClientGUITextUtils.FIRST_NAME_ERROR_MESSAGE);
			clientGUI.txtFirstName.setBackground(Color.YELLOW);
		}
	}
	
	private void checkLastName()
	{
		if(isLastNameEntered())
		{
			clientGUI.lblLastName.setText(ClientGUITextUtils.LAST_NAME_LABEL);
			clientGUI.txtLastName.setBackground(Color.WHITE);
		}
		else
		{
			clientGUI.lblLastName.setText(ClientGUITextUtils.LAST_NAME_ERROR_MESSAGE);
			clientGUI.txtLastName.setBackground(Color.YELLOW);
		}
	}
	
	private void checkPhoneNumber()
	{

		if(isPhoneNumberOK())
		{
			clientGUI.lblPrimePhoneNum.setText(ClientGUITextUtils.PRIME_PHONE_NUMBER_LABEL);
			clientGUI.txtPrimePhoneNum.setBackground(Color.WHITE);
		}
		else
		{
			clientGUI.lblPrimePhoneNum.setText(ClientGUITextUtils.PHONE_NUMBER_ERROR_MESSAGE);
			clientGUI.txtPrimePhoneNum.setBackground(Color.YELLOW);
		}
	}
	
	private void checkMarketing()
	{
		if(isMarketingSelected())
		{
			clientGUI.lblMarketing.setText(ClientGUITextUtils.MARKETING_LABEL);
			clientGUI.cmbMarketing.setBackground(Color.WHITE);
		}
		else
		{
			clientGUI.lblMarketing.setText(ClientGUITextUtils.MARKETING_ERROR_MESSAGE);
			clientGUI.cmbMarketing.setBackground(Color.YELLOW);
		}
	}
	
	@Override
	public Window getWindow()
	{
		return clientGUI.getWindow();
	}
}