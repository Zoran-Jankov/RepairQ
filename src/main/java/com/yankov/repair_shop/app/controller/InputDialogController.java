package main.java.com.yankov.repair_shop.app.controller;

import java.awt.Window;

import main.java.com.yankov.repair_shop.app.utility.ActionFactory;
import main.java.com.yankov.repair_shop.app.utility.IDGenerator;
import main.java.com.yankov.repair_shop.data.DataManager;
import main.java.com.yankov.repair_shop.data.EntityType;
import main.java.com.yankov.repair_shop.data.entity.Entity;
import main.java.com.yankov.repair_shop.gui.dialog.InputDialog;
import main.java.com.yankov.repair_shop.gui.utility.InputDialogFactory;

public abstract class InputDialogController implements WindowController
{
	protected int id;
	protected InputDialog gui;
	
	protected InputDialogController(WindowController owner, EntityType dataType)
	{
		gui = InputDialogFactory.getWindow(owner.getWindow(), dataType);
		
		id = IDGenerator.getNewID(dataType);
		
		gui.getIdPanel().setIdValue(IDGenerator.toString(dataType, id));
		
		gui.getInputButtonPanel().setAddButtonFunction
		   (ActionFactory.saveData(this));
		
		gui.getInputButtonPanel().setCancelButtonFunction
		   (ActionFactory.closeWindow(this));
		
		gui.setVisible(true);
	}
	
	@Override
	public Window getWindow()
	{
		return (Window) gui;
	}

	public void trySavingEntity()
	{
		if(isInputValid())
		{
			DataManager.save(createEntity());
			getWindow().dispose();
		}
		else
		{
			showInputErrors();
		}
	}

	protected abstract boolean isInputValid();
	
	protected abstract Entity createEntity();
	
	protected abstract void showInputErrors();
}