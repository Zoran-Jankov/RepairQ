package com.repair_shop.app.controller;

import java.awt.Window;

import com.repair_shop.app.utility.ActionFactory;
import com.repair_shop.data.DataType;
import com.repair_shop.gui.MainWindow;
import com.repair_shop.gui.text.ButtonName;

public class MainWindowController implements WindowController
{
	private MainWindow mainWindow = new MainWindow();
	
	//TODO Finish MainWindowController implementation 
	
	public MainWindowController()
	{
		mainWindow.setVisible(true);
		
		mainWindow.getTicketPanel().setButtonNewFunction
		          (ActionFactory.openWindow(this, DataType.TICKET), ButtonName.TICKET);
	}
	
	@Override
	public Window getWindow()
	{
		return mainWindow;
	}
}