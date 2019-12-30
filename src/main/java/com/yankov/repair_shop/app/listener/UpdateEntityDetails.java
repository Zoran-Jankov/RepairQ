package main.java.com.yankov.repair_shop.app.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.java.com.yankov.repair_shop.app.controller.InputDialogController;
import main.java.com.yankov.repair_shop.app.controller.TicketRegistrationController;
import main.java.com.yankov.repair_shop.data.EntityType;

public class UpdateEntityDetails implements ActionListener
{
	public EntityType entityType;
	public InputDialogController controller;
	
	public UpdateEntityDetails(EntityType entityType, InputDialogController controller)
	{
		this.entityType = entityType;
		this.controller = controller;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		switch(entityType)
		{
			case CLIENT:
				((TicketRegistrationController) controller).showClientDetails();
				break;
				
			case DEVICE:
				((TicketRegistrationController) controller).showDeviceDetails();
				break;
				
			default:
				break;
		}
	}
}