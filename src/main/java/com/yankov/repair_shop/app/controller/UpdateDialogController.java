package main.java.com.yankov.repair_shop.app.controller;

import java.awt.Window;

import main.java.com.yankov.repair_shop.app.utility.IDGenerator;
import main.java.com.yankov.repair_shop.app.utility.ListenerFactory;
import main.java.com.yankov.repair_shop.data.EntityType;
import main.java.com.yankov.repair_shop.data.entity.Entity;
import main.java.com.yankov.repair_shop.gui.dialog.InputDialog;
import main.java.com.yankov.repair_shop.gui.utility.InputDialogFactory;

public abstract class UpdateDialogController implements WindowController
{
	protected EntityType entityType;
	protected InputDialog gui;
	
	public UpdateDialogController(WindowController owner, Entity entity)
	{
		this.entityType = entity.getEntityType();
		
		gui = InputDialogFactory.getWindow(owner.getWindow(), entityType);
		
		gui.getIdPanel().setIdValue(IDGenerator.toString(entityType, entity.getId()));
		
		gui.getInputButtonPanel().setAddButtonFunction
		   (null);
		
		gui.getInputButtonPanel().setCancelButtonFunction
		   (ListenerFactory.closeWindow(this));
		
		gui.setVisible(true);
	}
	
	@Override
	public Window getWindow()
	{
		return (Window) gui;
	}
	
	public void tryEntityUpdate()
	{
		if(isInputValid())
		{
			getWindow().dispose();
		}
		else
		{
			showInputErrors();
		}
	}

	public abstract void showInputErrors();

	public abstract boolean isInputValid();
}