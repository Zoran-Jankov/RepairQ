package com.repair_shop.app.controller;

import java.awt.Window;

import com.repair_shop.gui.MainWindow;

public class MainWindowController implements WindowController
{
	private MainWindow mainWindow = new MainWindow();
	
	//TODO Finish MainWindowController implementation 
	
	public MainWindowController()
	{
		mainWindow.setVisible(true);
	}
	
	@Override
	public Window getWindow()
	{
		return mainWindow;
	}
}