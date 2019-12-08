package com.repair_shop.app.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.repair_shop.app.utility.InputDialogController;

public class SaveData implements ActionListener
{
	private InputDialogController controller;

	public SaveData(InputDialogController controller)
	{
		this.controller = controller;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		controller.trySavingEntity();
	}
}