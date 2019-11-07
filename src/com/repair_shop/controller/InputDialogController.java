package com.repair_shop.controller;

import java.awt.Window;

import com.repair_shop.data.DataElement;
import com.repair_shop.gui.InputDialogGui;
import com.repair_shop.utility.AccessData;
import com.repair_shop.utility.ActionListenerFactory;
import com.repair_shop.utility.IDGenerator;
import com.repair_shop.utility.InputGuiFactory;

public abstract class InputDialogController implements WindowController
{
	protected byte dataType;
	protected int id = IDGenerator.getNewID(dataType);
	protected InputDialogGui gui;
	
	protected InputDialogController(WindowController owner, byte dataType)
	{
		gui = InputGuiFactory.getWindow(owner.getWindow(), dataType);
		gui.setIdValue(IDGenerator.formatRegularID(id));
		gui.setBtnAddActionListener(ActionListenerFactory.saveData(this));
		gui.setBtnCancelActionListener(ActionListenerFactory.closeWindow(this));
	}

	public void trySavingDataElement()
	{
		if(isInputValid())
		{
			AccessData.getDataTable(dataType).save(createDataElement());
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