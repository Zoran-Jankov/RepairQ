package com.repair_shop.gui;

import javax.swing.JDialog;

public class TicketRegistrationDialog extends JDialog
{
	private static final long serialVersionUID = -9127229519123602813L;
	
	private IdPanel ticketIDPanel = new IdPanel();
	private SelectionPanel clientPanel = new SelectionPanel();
	private SelectionPanel devicePanel = new SelectionPanel();
	private TicketRegistrationPanel ticketPanel = new TicketRegistrationPanel();
	private InputButtonPanel butonPanel = new InputButtonPanel();
	
	public TicketRegistrationDialog()
	{
		getContentPane().add(ticketIDPanel);
		getContentPane().add(clientPanel);
		getContentPane().add(devicePanel);
		getContentPane().add(ticketPanel);
		getContentPane().add(butonPanel);
	}
}