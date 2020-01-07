package main.java.com.yankov.repair_shop.app.controller;

import java.awt.Window;

import main.java.com.yankov.repair_shop.app.utility.ListenerFactory;
import main.java.com.yankov.repair_shop.app.utility.IDGenerator;
import main.java.com.yankov.repair_shop.data.DataManager;
import main.java.com.yankov.repair_shop.data.EntityFactory;
import main.java.com.yankov.repair_shop.data.EntityType;
import main.java.com.yankov.repair_shop.data.entity.Entity;
import main.java.com.yankov.repair_shop.gui.dialog.InputDialog;
import main.java.com.yankov.repair_shop.gui.utility.InputDialogFactory;

public abstract class InputDialogController implements WindowController
{
	protected int id;
	protected Entity entity;
	protected InputDialog gui;
	
	protected InputDialogController(WindowController owner, EntityType entityType)
	{
		initializeController(owner, entityType);
		
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
	
	protected abstract boolean isNewEntityValid();
	
	public void trySavingEntity()
	{
		if(isNewEntityValid())
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
	
	protected abstract boolean isUpdateValid();
	
	public void tryEntityUpdate()
	{
		if(isUpdateValid())
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
	
	@Override
	public Window getWindow()
	{
		return (Window) gui;
	}
}