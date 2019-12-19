package main.java.com.yankov.repair_shop.app.controller;

import main.java.com.yankov.repair_shop.app.utility.ListenerFactory;
import main.java.com.yankov.repair_shop.app.utility.ComboBoxModelManager;
import main.java.com.yankov.repair_shop.data.DataManager;
import main.java.com.yankov.repair_shop.data.EntityType;
import main.java.com.yankov.repair_shop.data.entity.Client;
import main.java.com.yankov.repair_shop.data.entity.Marketing;
import main.java.com.yankov.repair_shop.gui.dialog.ClientRegistrationDialog;
import main.java.com.yankov.repair_shop.gui.text.LabelName;

public class ClientRegistrationController extends InputDialogController
{
	private ClientRegistrationDialog clientGUI;
	
	public ClientRegistrationController(WindowController owner, EntityType entityType)
	{
		super(owner, entityType);

		clientGUI = (ClientRegistrationDialog) super.gui;
		
		clientGUI.getMarketingPanel().setMarketingCmbModel
				 (ComboBoxModelManager.MARKETING);
		
		clientGUI.getMarketingPanel()
				 .setMarketingButtonFunction
				 (ListenerFactory.openWindow(this, EntityType.MARKETING));
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
			     									  (EntityType.MARKETING, 
			     									   clientGUI.getMarketingPanel().getMarketing()));
		
		ComboBoxModelManager.updateModel(EntityType.CLIENT, newClient.getDisplayName());
		
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