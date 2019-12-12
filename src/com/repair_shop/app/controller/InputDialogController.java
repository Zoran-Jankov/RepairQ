package com.repair_shop.app.controller;

import java.awt.Window;

import com.repair_shop.app.utility.ActionFactory;
import com.repair_shop.app.utility.ComboBoxModelFactory;
import com.repair_shop.app.utility.IDGenerator;
import com.repair_shop.data.DataManager;
import com.repair_shop.data.DataType;
import com.repair_shop.data.entity.Entity;
import com.repair_shop.gui.dialog.InputDialog;
import com.repair_shop.gui.utility.InputDialogFactory;

public abstract class InputDialogController implements WindowController
{
	protected DataType dataType;
	protected int id;
	protected Entity newEntity;
	protected InputDialog gui;
	
	protected InputDialogController(WindowController owner, DataType dataType)
	{
		this.dataType = dataType;
		
		gui = InputDialogFactory.getWindow(owner.getWindow(), dataType);
		
		id = IDGenerator.getNewID(dataType);
		
		gui.getIdPanel().setIdValue(IDGenerator.formatRegularID(id));
		
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
			DataManager.save(newEntity);
			
			ComboBoxModelFactory.updateModel(dataType);
			
			getWindow().dispose();
		}
		else
		{
			showInputErrors();
		}
	}

	protected abstract boolean isInputValid();
	
	protected abstract void createEntity();
	
	protected abstract void showInputErrors();
}