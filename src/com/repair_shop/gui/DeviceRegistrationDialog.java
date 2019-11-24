package com.repair_shop.gui;

import java.awt.Window;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

public class DeviceRegistrationDialog extends JDialog implements InputDialog
{
	private static final long serialVersionUID = -4737312459407759293L;
	private IdPanel idPanel = new IdPanel();
	
	public DeviceRegistrationDialog(Window owner)
	{
		super(owner);
	}

	@Override
	public void setIdValue(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBtnAddActionListener(ActionListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBtnCancelActionListener(ActionListener listener) {
		// TODO Auto-generated method stub
		
	}

}