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
import com.repair_shop.utility.IDGenerator;

public class ClientRegistrationController extends InputDialogController
{
	private int clientID = IDGenerator.getNewClientID();
	private ClientRegistrationGUI gui;
	
	public ClientRegistrationController(WindowController owner)
	{
		gui = new ClientRegistrationGUI(owner.getWindow());
		gui.lblIDValue.setText(IDGenerator.formatRegularID(clientID));
		setActionListeners();
		updateComboBoxes();
	}
	
	private void setActionListeners()
	{
		gui.btnAddNewMarketing.addActionListener(ActionListenerFactory
				              .openNewWindow(this, DataType.MARKETING_TYPE));
		gui.btnAdd.addActionListener(ActionListenerFactory.saveData(this));
		gui.btnCancel.addActionListener(ActionListenerFactory.closeWindow(this));
	}
	
	public void updateComboBoxes()
	{
		gui.cmbMarketing.setModel(CmbModelFactory.getModel(DataType.MARKETING_TYPE));
	}
	
	@Override
	public void trySavingDataElement()
	{
		if(isInputValid())
		{
			AccessData.clientsDataTable.save(createNewClient());
			closeWindow();
		}
		else
		{
			showInputErrors();
		}
	}

	private Client createNewClient()
	{
		Client newClient = new Client();
		
		newClient.setID(clientID);
		newClient.setFirstName(gui.txtFirstName.getText());
		newClient.setLastName(gui.txtPrimePhoneNum.getText());
		newClient.setPrimePhoneNumber(gui.txtPrimePhoneNum.getText());
		newClient.setAlternativePhoneNumber(gui.txtAlternativePhoneNum.getText());
		newClient.setEmail(gui.txtEmail.getText());
		newClient.setAddress(gui.txtAddress.getText());
		newClient.setMarketing((Property) AccessData.marketingTypesDataTable
				 .getByUniqueString((String) gui.cmbMarketing.getSelectedItem()));
		
		return newClient;
	}
	
	private boolean isInputValid()
	{
		return isFirstNameEntered()
			&& isLastNameEntered()
			&& isPhoneNumberOK()
			&& isMarketingSelected();
	}
	
	private boolean isFirstNameEntered( )
	{
		return !("".equals(gui.txtFirstName.getText()));
	}

	private boolean isLastNameEntered( )
	{
		return !("".equals(gui.txtLastName.getText()));
	}
	
	private boolean isPhoneNumberOK()
	{
		String phoneNumber = gui.txtPrimePhoneNum.getText();
		
		return !(AccessData.clientsDataTable.uniqueStringCollision(phoneNumber)
			 || ("".equals(phoneNumber)));
	}

	private boolean isMarketingSelected()
	{
		return gui.cmbMarketing.getSelectedItem() != null;
	}
	
	private void showInputErrors()
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
			gui.lblFirstName.setText(ClientGUITextUtils.FIRST_NAME_LABEL);
			gui.txtFirstName.setBackground(Color.WHITE);
		}
		else
		{
			gui.lblFirstName.setText(ClientGUITextUtils.FIRST_NAME_ERROR_MESSAGE);
			gui.txtFirstName.setBackground(Color.YELLOW);
		}
	}
	
	private void checkLastName()
	{
		if(isLastNameEntered())
		{
			gui.lblLastName.setText(ClientGUITextUtils.LAST_NAME_LABEL);
			gui.txtLastName.setBackground(Color.WHITE);
		}
		else
		{
			gui.lblLastName.setText(ClientGUITextUtils.LAST_NAME_ERROR_MESSAGE);
			gui.txtLastName.setBackground(Color.YELLOW);
		}
	}
	
	private void checkPhoneNumber()
	{

		if(isPhoneNumberOK())
		{
			gui.lblPrimePhoneNum.setText(ClientGUITextUtils.PRIME_PHONE_NUMBER_LABEL);
			gui.txtPrimePhoneNum.setBackground(Color.WHITE);
		}
		else
		{
			gui.lblPrimePhoneNum.setText(ClientGUITextUtils.PHONE_NUMBER_ERROR_MESSAGE);
			gui.txtPrimePhoneNum.setBackground(Color.YELLOW);
		}
	}
	
	private void checkMarketing()
	{
		if(isMarketingSelected())
		{
			gui.lblMarketing.setText(ClientGUITextUtils.MARKETING_LABEL);
			gui.cmbMarketing.setBackground(Color.WHITE);
		}
		else
		{
			gui.lblMarketing.setText(ClientGUITextUtils.MARKETING_ERROR_MESSAGE);
			gui.cmbMarketing.setBackground(Color.YELLOW);
		}
	}
	
	@Override
	public Window getWindow()
	{
		return gui.getWindow();
	}
}