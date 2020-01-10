package main.java.com.yankov.repair_shop.app.controller;

import javax.swing.JOptionPane;

import main.java.com.yankov.repair_shop.data.DataManager;
import main.java.com.yankov.repair_shop.data.EntityType;
import main.java.com.yankov.repair_shop.data.entity.Entity;
import main.java.com.yankov.repair_shop.data.entity.Property;
import main.java.com.yankov.repair_shop.gui.dialog.PropertyRegistrationDialog;
import main.java.com.yankov.repair_shop.gui.text.ErrorMessage;
import main.java.com.yankov.repair_shop.gui.text.ErrorTitle;

public class PropertyRegistrationController extends InputDialogController
{
	private PropertyRegistrationDialog propertyGUI;
	private Property newProperty;
	
	public PropertyRegistrationController(WindowController owner, EntityType entityType)
	{
		super(owner, entityType);
		initializeClientDialogController();
	}
	
	public PropertyRegistrationController(WindowController owner, Entity entity)
	{
		super(owner, entity);
		initializeClientDialogController();
	}
	
	private void initializeClientDialogController()
	{
		newProperty = (Property) super.entity;
		
		propertyGUI = (PropertyRegistrationDialog) super.gui;
	}
	
	protected boolean isInputValid()
	{
		String name = propertyGUI.getPropertyPanel().getPropertyName();
		
		return !("".equals(name)
			  || DataManager.clientsDataTable.displayNameCollision(name));
	}

	@Override
	protected void getInput()
	{
		newProperty.setPropertyName(propertyGUI.getPropertyPanel().getPropertyName());
		
		newProperty.setDescription(propertyGUI.getPropertyPanel().getDescription());
	}

	@Override
	protected void showInputErrors()
	{
		propertyGUI.getPropertyPanel().showNameError();
		
		if(!super.isDisplayNameUnique(getDisplayName()))
		{
			JOptionPane.showMessageDialog
					   (getWindow(), 
						getDisplayName() + " " + ErrorMessage.NOT_UNIQUE, 
						ErrorTitle.NOT_UNIQUE, 
						JOptionPane.ERROR_MESSAGE);
		}
	}
	
	protected String getDisplayName()
	{
		return propertyGUI.getPropertyPanel().getPropertyName();
	}
}