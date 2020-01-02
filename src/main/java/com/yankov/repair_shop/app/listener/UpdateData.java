package main.java.com.yankov.repair_shop.app.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.java.com.yankov.repair_shop.app.controller.InputDialogController;

public class UpdateData implements ActionListener
{
	private InputDialogController controller;

	public UpdateData(InputDialogController controller)
	{
		this.controller = controller;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		controller.tryEntityUpdate();
	}
}