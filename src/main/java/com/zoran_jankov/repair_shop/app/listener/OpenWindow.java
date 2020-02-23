package main.java.com.zoran_jankov.repair_shop.app.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import main.java.com.zoran_jankov.repair_shop.app.controller.WindowController;
import main.java.com.zoran_jankov.repair_shop.app.utility.DialogClontrollerFactory;
import main.java.com.zoran_jankov.repair_shop.app.utility.WindowControllerFactory;
import main.java.com.zoran_jankov.repair_shop.app.utility.WindowTag;
import main.java.com.zoran_jankov.repair_shop.data.EntityType;
import main.java.com.zoran_jankov.repair_shop.data.entity.Entity;
import main.java.com.zoran_jankov.repair_shop.gui.text.ErrorMessage;
import main.java.com.zoran_jankov.repair_shop.gui.text.ErrorTitle;

/**
 * ActionListener for open window action.
 * 
 * @author Zoran Jankov
 */
public class OpenWindow implements ActionListener
{
	private WindowController owner;
	private Entity entity = null;
	private EntityType entityType = null;
	private WindowTag window = null;

	public OpenWindow(WindowController owner, EntityType entityType)
	{
		this.owner = owner;
		this.entityType = entityType;
	}
	
	public OpenWindow(WindowController owner, Entity entity)
	{
		this.owner = owner;
		this.entity = entity;
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
		else if(entity != null)
		{
			DialogClontrollerFactory.createController(owner, entity);
		}
		else if(window != null)
		{
			WindowControllerFactory.createController(window);
		}
		else
		{
			JOptionPane.showMessageDialog
					   (owner.getWindow(), 
						ErrorMessage.OPEN_WINDOW, 
						ErrorTitle.OPEN_WINDOW, 
						JOptionPane.ERROR_MESSAGE);
		}
	}
}