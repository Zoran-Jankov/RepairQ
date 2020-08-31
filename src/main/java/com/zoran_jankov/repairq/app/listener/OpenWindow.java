package com.zoran_jankov.repairq.app.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.zoran_jankov.repairq.app.controller.dialog.InputDialogController;
import com.zoran_jankov.repairq.app.controller.dialog.WindowController;
import com.zoran_jankov.repairq.app.utility.WindowControllerFactory;
import com.zoran_jankov.repairq.app.utility.WindowTag;
import com.zoran_jankov.repairq.data.EntityType;
import com.zoran_jankov.repairq.data.entity.Entity;
import com.zoran_jankov.repairq.gui.text.ErrorMessage;
import com.zoran_jankov.repairq.gui.text.ErrorTitle;

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
			InputDialogController.createController(owner, entityType);
		}
		else if(entity != null)
		{
			InputDialogController.createController(owner, entity);
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