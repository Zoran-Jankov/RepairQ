package com.repair_shop.app.controller;

import java.awt.Window;

import com.repair_shop.gui.MainWindow;

public class MainWindowController implements WindowController
{
	private MainWindow mainWindow;
	
	//TODO Finish MainWindowController implementation 
	
	@Override
	public Window getWindow()
	{
		return mainWindow;
	}
}