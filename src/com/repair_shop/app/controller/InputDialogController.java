package com.repair_shop.app.controller;

import java.awt.Window;

import com.repair_shop.app.utility.ActionFactory;
import com.repair_shop.app.utility.IDGenerator;
import com.repair_shop.data.DataManager;
import com.repair_shop.data.DataType;
import com.repair_shop.data.entity.Entity;
import com.repair_shop.gui.dialog.InputDialog;
import com.repair_shop.gui.dialog.PropertyRegistrationDialog;
import com.repair_shop.gui.text.WindowTitle;
import com.repair_shop.gui.utility.InputDialogFactory;

public abstract class InputDialogController implements WindowController
{
	protected int id;
	protected InputDialog gui;
	
	protected InputDialogController(WindowController owner, DataType dataType)
	{
		if(!DataType.isAProperty(dataType))
		{
			gui = InputDialogFactory.getWindow(owner.getWindow(), dataType);
		}
		else
		{
			gui = new PropertyRegistrationDialog
					 (owner.getWindow(), WindowTitle.getPropertyTitle(dataType));
		}
		
		id = IDGenerator.getNewID(dataType);
		
		
		gui.getIdPanel().setIdValue(IDGenerator.formatRegularID(id));
		
		gui.getInputButtonPanel().setBtnAddActionListener
		   (ActionFactory.saveData(this));
		
		gui.getInputButtonPanel().setBtnCancelActionListener
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