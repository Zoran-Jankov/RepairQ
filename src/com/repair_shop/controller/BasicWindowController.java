package com.repair_shop.controller;

import java.awt.Window;

public abstract class BasicWindowController implements WindowController
{
	@Override
	public abstract Window getWindow();
	
	@Override
	public void closeWindow()
	{
		getWindow().dispose();
	}
}