package main.java.com.yankov.repair_shop.app.controller;

import java.awt.Window;

import main.java.com.yankov.repair_shop.app.utility.ListenerFactory;
import main.java.com.yankov.repair_shop.data.EntityType;
import main.java.com.yankov.repair_shop.gui.MainWindow;
import main.java.com.yankov.repair_shop.gui.text.ButtonName;

public class MainWindowController implements WindowController
{
	private MainWindow mainWindow = new MainWindow();
	
	//TODO Finish MainWindowController implementation 
	
	public MainWindowController()
	{
		mainWindow.setVisible(true);
		
		mainWindow.getTicketPanel().setButtonNewFunction
		          (ListenerFactory.openWindow(this, EntityType.TICKET), ButtonName.TICKET);
	}
	
	@Override
	public Window getWindow()
	{
		return mainWindow;
	}
}