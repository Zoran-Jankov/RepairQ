package com.repair_shop.gui;

import java.awt.Window;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

import net.miginfocom.swing.MigLayout;

public class ClientRegistrationDialog extends JDialog implements InputDialog
{
	private static final long serialVersionUID = -394107433140693140L;
	private IdPanel idPanel = new IdPanel();
	private PersonalInfoPanel personalInfoPanel = new PersonalInfoPanel();
	private MarketingPanel marketingPanel = new MarketingPanel();
	private InputButtonPanel buttonPanel = new InputButtonPanel();
	
	public ClientRegistrationDialog(Window owner)
	{
		super(owner);
		getContentPane().setLayout(new MigLayout("", "[434px]", "[25px:n][][][]"));
		getContentPane().add(idPanel, "cell 0 0,grow");
		getContentPane().add(personalInfoPanel, "cell 0 1,grow");
		getContentPane().add(marketingPanel, "cell 0 2,grow");
		getContentPane().add(buttonPanel, "cell 0 3,grow");
	}

	@Override
	public void setIdValue(String id)
	{
		idPanel.setIdValue(id);
	}

	@Override
	public void setBtnAddActionListener(ActionListener listener)
	{
		buttonPanel.setBtnAddActionListener(listener);
	}

	@Override
	public void setBtnCancelActionListener(ActionListener listener)
	{
		buttonPanel.setBtnCancelActionListener(listener);
	}
}