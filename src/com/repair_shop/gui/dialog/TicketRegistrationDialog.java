package com.repair_shop.gui.dialog;

import java.awt.Window;

import javax.swing.JDialog;

import com.repair_shop.gui.panel.IdPanel;
import com.repair_shop.gui.panel.InputButtonPanel;
import com.repair_shop.gui.panel.SelectionPanel;
import com.repair_shop.gui.panel.TicketRegistrationPanel;
import com.repair_shop.gui.text.WindowTitle;

import net.miginfocom.swing.MigLayout;

public class TicketRegistrationDialog extends JDialog implements InputDialog
{
	private static final long serialVersionUID = -9127229519123602813L;
	private IdPanel idPanel = new IdPanel();
	private SelectionPanel clientPanel = new SelectionPanel();
	private SelectionPanel devicePanel = new SelectionPanel();
	private TicketRegistrationPanel ticketPanel = new TicketRegistrationPanel();
	private InputButtonPanel buttonPanel = new InputButtonPanel();
	
	public TicketRegistrationDialog(Window owner)
	{
		super(owner);
		
		setResizable(false);
		setTitle(WindowTitle.TICKET);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		getContentPane().setLayout(new MigLayout("", "[250px:n,grow][250px:n,grow]", "[::30px][200px:n,grow][][]"));
		
		getContentPane().add(idPanel, "cell 0 0 2 1,grow");
		
		getContentPane().add(clientPanel, "cell 0 1,grow");
		
		getContentPane().add(devicePanel, "cell 1 1,grow");
		
		getContentPane().add(ticketPanel, "cell 0 2 2 1,grow");
		
		getContentPane().add(buttonPanel, "cell 0 3 2 1,grow");
		
		pack();
	}
	
	@Override
	public IdPanel getIdPanel()
	{
		return idPanel;
	}
	
	public SelectionPanel getPersonalInfoPanel()
	{
		return clientPanel;
	}
	
	public SelectionPanel getMarketingPanel()
	{
		return devicePanel;
	}
	
	public TicketRegistrationPanel getTicketPanel()
	{
		return ticketPanel;
	}

	@Override
	public InputButtonPanel getInputButtonPanel()
	{
		return buttonPanel;
	}
}