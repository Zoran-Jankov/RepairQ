package main.java.com.zoran_jankov.repair_shop.app.controller.dialog;

import main.java.com.zoran_jankov.repair_shop.app.utility.ComboBoxModelManager;
import main.java.com.zoran_jankov.repair_shop.app.utility.ListenerFactory;
import main.java.com.zoran_jankov.repair_shop.data.DataManager;
import main.java.com.zoran_jankov.repair_shop.data.EntityType;
import main.java.com.zoran_jankov.repair_shop.data.entity.Customer;
import main.java.com.zoran_jankov.repair_shop.data.entity.Entity;
import main.java.com.zoran_jankov.repair_shop.gui.dialog.CustomerRegistrationDialog;
import main.java.com.zoran_jankov.repair_shop.gui.text.LabelName;

public class ClientRegistrationController extends InputDialogController
{
	private CustomerRegistrationDialog clientGUI;
	private
	
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

		clientGUI = (CustomerRegistrationDialog) super.gui;
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