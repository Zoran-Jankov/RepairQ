package com.repair_shop.controller;

import java.awt.Color;
import java.awt.Window;

import com.repair_shop.data.Client;
import com.repair_shop.data.DataManager;
import com.repair_shop.data.DataType;
import com.repair_shop.data.Marketing;
import com.repair_shop.gui.ClientRegistrationDialog;
import com.repair_shop.gui.dialog.PersonRegistrationDialog;
import com.repair_shop.utility.ActionListenerFactory;
import com.repair_shop.utility.ClientDialogText;
import com.repair_shop.utility.CmbModelFactory;

public class ClientRegistrationController extends InputDialogController
{
	private ClientRegistrationDialog clientGUI;
	public ClientRegistrationController(WindowController owner, DataType dataType)
	{
		super(owner, dataType);
		clientGUI = (ClientRegistrationDialog) gui;
		clientGUI.btnAddNewMarketing.addActionListener(ActionListenerFactory
			     .openNewWindow(this, DataType.MARKETING_TYPE));
		updateComboBoxes();
	}
	
	public void updateComboBoxes()
	{
	//	clientGUI.cmbMarketing.setModel(CmbModelFactory.getModel(DataType.MARKETING_TYPE));
	}
	
	@Override
	public Window getWindow()
	{
		return clientGUI;
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
		
		return !(DataManager.clientsDataTable.uniqueStringCollision(phoneNumber)
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
		newClient.setMarketing((Marketing) DataManager.marketingTypesDataTable
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
			clientGUI.lblFirstName.setText(ClientDialogText.FIRST_NAME_LABEL);
			clientGUI.txtFirstName.setBackground(Color.WHITE);
		}
		else
		{
			clientGUI.lblFirstName.setText(ClientDialogText.FIRST_NAME_ERROR_MESSAGE);
			clientGUI.txtFirstName.setBackground(Color.YELLOW);
		}
	}
	
	private void checkLastName()
	{
		if(isLastNameEntered())
		{
			clientGUI.lblLastName.setText(ClientDialogText.LAST_NAME_LABEL);
			clientGUI.txtLastName.setBackground(Color.WHITE);
		}
		else
		{
			clientGUI.lblLastName.setText(ClientDialogText.LAST_NAME_ERROR_MESSAGE);
			clientGUI.txtLastName.setBackground(Color.YELLOW);
		}
	}
	
	private void checkPhoneNumber()
	{

		if(isPhoneNumberOK())
		{
			clientGUI.lblPrimePhoneNum.setText(ClientDialogText.PRIME_PHONE_NUMBER_LABEL);
			clientGUI.txtPrimePhoneNum.setBackground(Color.WHITE);
		}
		else
		{
			clientGUI.lblPrimePhoneNum.setText(ClientDialogText.PHONE_NUMBER_ERROR_MESSAGE);
			clientGUI.txtPrimePhoneNum.setBackground(Color.YELLOW);
		}
	}
	
	private void checkMarketing()
	{
		if(isMarketingSelected())
		{
			clientGUI.lblMarketing.setText(ClientDialogText.MARKETING_LABEL);
			clientGUI.cmbMarketing.setBackground(Color.WHITE);
		}
		else
		{
			clientGUI.lblMarketing.setText(ClientDialogText.MARKETING_ERROR_MESSAGE);
			clientGUI.cmbMarketing.setBackground(Color.YELLOW);
		}
	}
}