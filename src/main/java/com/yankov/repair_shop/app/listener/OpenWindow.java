package main.java.com.yankov.repair_shop.app.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.java.com.yankov.repair_shop.app.controller.WindowController;
import main.java.com.yankov.repair_shop.app.utility.DialogClontrollerFactory;
import main.java.com.yankov.repair_shop.app.utility.WindowControllerFactory;
import main.java.com.yankov.repair_shop.app.utility.WindowTag;
import main.java.com.yankov.repair_shop.data.EntityType;

/**
 * ActionListener for open window action.
 * 
 * @author Zoran Jankov
 */
public class OpenWindow implements ActionListener
{
	private WindowController owner;
	private EntityType entityType = null;
	private WindowTag window;

	public OpenWindow(WindowController owner, EntityType entityType)
	{
		this.owner = owner;
		this.entityType = entityType;
	}
	
	public OpenWindow(WindowTag window)
	{
		this.window = window;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(entityType != null)
		{
			DialogClontrollerFactory.createController(owner, entityType);
		}
		else
		{
			WindowControllerFactory.createController(window);
		}
	}
}