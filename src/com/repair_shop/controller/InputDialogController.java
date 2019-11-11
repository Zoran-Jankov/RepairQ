package com.repair_shop.controller;

import java.awt.Window;

import com.repair_shop.data.DataElement;
import com.repair_shop.data.DataType;
import com.repair_shop.gui.InputDialog;
import com.repair_shop.utility.DataManager;
import com.repair_shop.utility.ActionListenerFactory;
import com.repair_shop.utility.IDGenerator;
import com.repair_shop.utility.InputDialogFactory;

public abstract class InputDialogController implements WindowController
{
	protected DataType dataType;
	protected int id = IDGenerator.getNewID(dataType);
	protected InputDialog gui;
	
	protected InputDialogController(WindowController owner, DataType dataType)
	{
		this.dataType = dataType;
		gui = InputDialogFactory.getWindow(owner.getWindow(), dataType);
		gui.setIdValue(IDGenerator.formatRegularID(id));
		gui.setBtnAddActionListener(ActionListenerFactory.saveData(this));
		gui.setBtnCancelActionListener(ActionListenerFactory.closeWindow(this));
	}

	public void trySavingDataElement()
	{
		if(isInputValid())
		{
			DataManager.getDataTable(dataType).save(createDataElement());
			getWindow().dispose();
		}
		else
		{
			showInputErrors();
		}
	}

	protected abstract boolean isInputValid();
	
	protected abstract DataElement createDataElement();
	
	protected abstract void showInputErrors();
	
	@Override
	public Window getWindow()
	{
		return gui.getWindow();
	}
}