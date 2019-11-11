package com.repair_shop.utility;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.repair_shop.controller.InputDialogController;
import com.repair_shop.controller.WindowController;
import com.repair_shop.data.DataType;

public class ActionListenerFactory
{
	public static ActionListener saveData(InputDialogController controller)
	{
		return new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				controller.trySavingDataElement();
			}
		};
	}
	
	public static ActionListener openNewWindow(WindowController owner, DataType dataType)
	{
		return new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				DialogClontrollerFactory.createController(owner, dataType);
			}
		};
	}
	
	public static ActionListener closeWindow(WindowController controller)
	{
		return new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				controller.getWindow().dispose();
			}
		};
	}
}