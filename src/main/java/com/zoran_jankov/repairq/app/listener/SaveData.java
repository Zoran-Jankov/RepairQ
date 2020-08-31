package main.java.com.zoran_jankov.repair_shop.app.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.java.com.zoran_jankov.repair_shop.app.controller.dialog.InputDialogController;

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