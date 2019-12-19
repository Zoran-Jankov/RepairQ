package main.java.com.yankov.repair_shop.app.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.java.com.yankov.repair_shop.app.controller.WindowController;
import main.java.com.yankov.repair_shop.app.utility.DialogClontrollerFactory;
import main.java.com.yankov.repair_shop.app.utility.WindowControllerFactory;
import main.java.com.yankov.repair_shop.app.utility.WindowTag;
import main.java.com.yankov.repair_shop.data.EntityType;

public class OpenWindow implements ActionListener
{
	private WindowController owner;
	private EntityType dataType = null;
	private WindowTag window;

	public OpenWindow(WindowController owner, EntityType dataType)
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
		else
		{
			WindowControllerFactory.createController(window);
		}
	}
}