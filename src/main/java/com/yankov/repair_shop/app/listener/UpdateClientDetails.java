package main.java.com.yankov.repair_shop.app.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.java.com.yankov.repair_shop.app.controller.TicketRegistrationController;

public class UpdateClientDetails implements ActionListener
{
	public TicketRegistrationController controller;
	
	public UpdateClientDetails(TicketRegistrationController controller)
	{
		this.controller = controller;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		controller.showClientDetails();
	}
}