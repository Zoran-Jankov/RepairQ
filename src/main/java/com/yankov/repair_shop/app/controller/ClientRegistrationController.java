package main.java.com.yankov.repair_shop.app.controller;

import main.java.com.yankov.repair_shop.app.utility.ListenerFactory;

import javax.swing.JOptionPane;

import main.java.com.yankov.repair_shop.app.utility.ComboBoxModelManager;
import main.java.com.yankov.repair_shop.data.DataManager;
import main.java.com.yankov.repair_shop.data.EntityType;
import main.java.com.yankov.repair_shop.data.entity.Client;
import main.java.com.yankov.repair_shop.data.entity.Entity;
import main.java.com.yankov.repair_shop.data.entity.Marketing;
import main.java.com.yankov.repair_shop.gui.dialog.ClientRegistrationDialog;
import main.java.com.yankov.repair_shop.gui.text.ErrorMessage;
import main.java.com.yankov.repair_shop.gui.text.ErrorTitle;
import main.java.com.yankov.repair_shop.gui.text.LabelName;

public class ClientRegistrationController extends InputDialogController
{
	private ClientRegistrationDialog clientGUI;
	private Client newClient;
	
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
		newClient = (Client) super.entity;

		clientGUI = (ClientRegistrationDialog) super.gui;
		
		clientGUI.getMarketingPanel().setMarketingCmbModel
				 (ComboBoxModelManager.MARKETING);
		
		clientGUI.getMarketingPanel().setMarketingButtonFunction
				 (ListenerFactory.openWindow(this, EntityType.MARKETING));
	}
	
	@Override
	protected boolean isNewEntityValid()
	{
		return isInputValid()
			&& isDisplayNameUniqe();
	}

	@Override
	protected boolean isUpdateValid()
	{
		return isInputValid()
			&& isDisplayNameUniqe(getDisplayName());
	}

	@Override
	protected boolean isInputValid()
	{
		return isNameValid()
			&& isPhoneNumberValid()
			&& isMarketingSelected();
	}
	
	@Override
	protected boolean isDisplayNameUniqe()
	{
		return DataManager.displayNameCollision(EntityType.CLIENT, getDisplayName());
	}
	
	@Override
	protected String getDisplayName()
	{
		return clientGUI.getPersonalInfoPanel().getPersonName() 
			 + " "
			 + clientGUI.getPersonalInfoPanel().getPrimePhoneNumber();
	}
	
	@Override
	protected boolean isDisplayNameUniqe(String displayName)
	{
		return isDisplayNameUniqe()
			|| (newClient.equals(DataManager.getEntity(EntityType.CLIENT, displayName)));
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
	protected void getInput()
	{
		newClient.setFullName(clientGUI.getPersonalInfoPanel().getPersonName());
		
		newClient.setPrimePhoneNumber(clientGUI.getPersonalInfoPanel().getPrimePhoneNumber());
		
		newClient.setAlternativePhoneNumber(clientGUI.getPersonalInfoPanel().getAltPoneNumber());
		
		newClient.setEmail(clientGUI.getPersonalInfoPanel().getEmail());
		
		newClient.setAddress(clientGUI.getPersonalInfoPanel().getAddress());
		
		newClient.setMarketing
				((Marketing) DataManager.getEntity(EntityType.MARKETING, 
				  clientGUI.getMarketingPanel().getMarketing()));
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
		
		if(!isDisplayNameUniqe())
		{
			JOptionPane.showMessageDialog
					   (getWindow(), 
						getDisplayName() + " " + ErrorMessage.NOT_UNIQUE, 
						ErrorTitle.NOT_UNIQUE, 
						JOptionPane.ERROR_MESSAGE);
		}
	}
}