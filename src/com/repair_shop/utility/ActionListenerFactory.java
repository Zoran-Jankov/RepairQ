package com.repair_shop.utility;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.repair_shop.controller.InputDialogController;
import com.repair_shop.controller.WindowController;

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
	
	public static ActionListener openNewWindow(WindowController owner, byte dataType)
	{
		return new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				WindowClontrollerFactory.createController(owner, dataType);
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