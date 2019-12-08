package com.repair_shop.app.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.repair_shop.app.controller.WindowController;

public class CloseWindow implements ActionListener
{
	private WindowController controller;
	
	public CloseWindow(WindowController controller)
	{
		this.controller = controller;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		controller.getWindow().dispose();
	}
}