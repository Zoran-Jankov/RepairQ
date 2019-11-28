package com.repair_shop.gui;

import java.awt.Window;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import net.miginfocom.swing.MigLayout;

public class DeviceRegistrationDialog extends JDialog implements InputDialog
{
	private static final long serialVersionUID = -4737312459407759293L;
	private IdPanel idPanel = new IdPanel();
	private DeviceRegistrationPanel devicePanel = new DeviceRegistrationPanel();
	private InputButtonPanel buttonPanel = new InputButtonPanel();
	
	public DeviceRegistrationDialog(Window owner)
	{
		super(owner);
		getContentPane().setLayout(new MigLayout("", "[434px]", "[25px:n][][]"));
		getContentPane().add(idPanel, "cell 0 0,grow");
		getContentPane().add(devicePanel, "cell 0 1,grow");
		getContentPane().add(buttonPanel, "cell 0 2,grow");
	}

	@Override
	public void setIdValue(String id)
	{
		
	}

	@Override
	public void setBtnAddActionListener(ActionListener listener)
	{
		
	}

	@Override
	public void setBtnCancelActionListener(ActionListener listener)
	{
		
	}
}