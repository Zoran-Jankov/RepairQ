package main.java.com.yankov.repair_shop.app.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.java.com.yankov.repair_shop.app.controller.TicketRegistrationController;
import main.java.com.yankov.repair_shop.data.EntityType;

public class UpdateEntityDetails implements ActionListener
{
	public EntityType entityType;
	public TicketRegistrationController controller;
	
	public UpdateEntityDetails(EntityType entityType, TicketRegistrationController controller)
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
				controller.showClientDetails();
				break;
				
			case DEVICE:
				controller.showDeviceDetails();
				break;
				
			default:
				break;
		}
	}
}