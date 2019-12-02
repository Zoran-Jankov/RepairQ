package com.repair_shop.gui;

import javax.swing.JDialog;
import net.miginfocom.swing.MigLayout;

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
		getContentPane().setLayout(new MigLayout("", "[250px:n][250px:n][]", "[::30px][200px:n,grow][][]"));
		getContentPane().add(ticketIDPanel, "cell 0 0 2 1,grow");
		getContentPane().add(clientPanel, "cell 0 1,grow");
		getContentPane().add(devicePanel, "cell 1 1,grow");
		getContentPane().add(ticketPanel, "cell 0 2 2 1,grow");
		getContentPane().add(butonPanel, "cell 0 3 2 1,grow");
	}
}