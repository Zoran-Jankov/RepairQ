package main.java.com.yankov.repair_shop.app.controller;

import java.awt.Window;

import javax.swing.JOptionPane;

import main.java.com.yankov.repair_shop.app.utility.ListenerFactory;
import main.java.com.yankov.repair_shop.app.utility.IDGenerator;
import main.java.com.yankov.repair_shop.data.DataManager;
import main.java.com.yankov.repair_shop.data.EntityFactory;
import main.java.com.yankov.repair_shop.data.EntityType;
import main.java.com.yankov.repair_shop.data.entity.Entity;
import main.java.com.yankov.repair_shop.gui.dialog.InputDialog;
import main.java.com.yankov.repair_shop.gui.text.ErrorMessage;
import main.java.com.yankov.repair_shop.gui.text.ErrorTitle;
import main.java.com.yankov.repair_shop.gui.utility.InputDialogFactory;

public abstract class InputDialogController implements WindowController
{
	protected int id;
	protected EntityType entityType;
	protected Entity entity;
	protected InputDialog gui;
	
	protected InputDialogController(WindowController owner, EntityType entityType)
	{
		initializeController(owner, entityType);
		
		this.entityType = entityType;
			
		this.entity = EntityFactory.create(entityType);
		
		id = IDGenerator.getNewID(entityType);
		
		gui.getIdPanel().setIdValue(IDGenerator.toString(entityType, id));
		
		gui.getInputButtonPanel().setAddButtonFunction
		   (ListenerFactory.saveData(this));
	}
	
	public InputDialogController(WindowController owner, Entity entity)
	{
		initializeController(owner, entity.getEntityType());
		
		this.entity = entity;
		
		this.entityType = entity.getEntityType();
		
		gui.getIdPanel().setIdValue(IDGenerator.toString(entity.getEntityType(), entity.getId()));
		
		gui.getInputButtonPanel().setAddButtonFunction
		   (null);
	}
	
	private void initializeController(WindowController owner, EntityType entityType)
	{
		gui = InputDialogFactory.getWindow(owner.getWindow(), entityType);
		gui.getInputButtonPanel().setCancelButtonFunction(ListenerFactory.closeWindow(this));
		gui.setVisible(true);
	}
	
	protected abstract boolean isInputValid();
	
	protected boolean isDisplayNameUnique(String displayName)
	{
		return !DataManager.displayNameCollision(entityType, displayName) 
			 || entity.equals(DataManager.getEntity(entityType, displayName));
	}

	public void trySavingEntity()
	{
		if(isInputValid())
		{
			entity.setId(id);
			getInput();
			DataManager.save(entity);
			getWindow().dispose();
		}
		else
		{
			showInputErrors();
		}
	}
	
	public void tryEntityUpdate()
	{
		if(isInputValid())
		{
			DataManager.delete(entity);
			getInput();
			DataManager.save(entity);
			getWindow().dispose();
		}
		else
		{
			showInputErrors();
		}
	}

	protected abstract void getInput();
	
	protected abstract void showInputErrors();
	
	protected void checkForDuplicate(String displayName)
	{
		if(!isDisplayNameUnique(displayName))
		{
			JOptionPane.showMessageDialog
					   (getWindow(), 
						displayName + " " + ErrorMessage.NOT_UNIQUE, 
						ErrorTitle.NOT_UNIQUE, 
						JOptionPane.ERROR_MESSAGE);
		}
	}
	
	@Override
	public Window getWindow()
	{
		return (Window) gui;
	}
}