package com.repair_shop.app.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.repair_shop.app.controller.WindowController;
import com.repair_shop.app.utility.DialogClontrollerFactory;
import com.repair_shop.app.utility.WindowControllerFactory;
import com.repair_shop.app.utility.WindowTag;
import com.repair_shop.data.DataType;

public class OpenWindow implements ActionListener
{
	private WindowController owner;
	private DataType dataType;
	private WindowTag window;

	public OpenWindow(WindowController owner, DataType dataType)
	{
		this.owner = owner;
		this.dataType = dataType;
	}
	
	public OpenWindow(WindowTag window)
	{
		this.window = window;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(dataType != null)
		{
			DialogClontrollerFactory.createController(owner, dataType);
		}
		else if(window != null)
		{
			WindowControllerFactory.createController(window);
		}
	}
}