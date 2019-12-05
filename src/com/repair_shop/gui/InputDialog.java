package com.repair_shop.gui;

import java.awt.Window;

public interface InputDialog
{
	public Window getWindow();
	
	public IdPanel getIdPanel();
	
	public InputButtonPanel getInputButtonPanel();

	public void setVisible(boolean b);
}