package com.repair_shop.gui;

import java.awt.Window;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

import net.miginfocom.swing.MigLayout;

public class PropertyRegistrationDialog extends JDialog implements InputDialog
{
	private static final long serialVersionUID = 6674166830353586592L;
	private PropertyPanel propertyPanel = new PropertyPanel();
	private IdPanel idPanel = new IdPanel();
	private InputButtonPanel buttonPanel = new InputButtonPanel();
	
	public PropertyRegistrationDialog(Window owner)
	{
		super(owner);
		getContentPane().setLayout(new MigLayout("", "[434px]", "[20px:n][grow][]"));
		getContentPane().add(idPanel, "cell 0 0,grow");
		getContentPane().add(propertyPanel, "cell 0 1,grow");
		getContentPane().add(buttonPanel, "cell 0 2,grow");
	}
	
	public String getProperyName()
	{
		return propertyPanel.getPropertyName();
	}
	
	public String getDescription()
	{
		return propertyPanel.getDescription();
	}

	@Override
	public void setIdValue(String id)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBtnAddActionListener(ActionListener listener)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBtnCancelActionListener(ActionListener listener)
	{
		// TODO Auto-generated method stub
		
	}
}