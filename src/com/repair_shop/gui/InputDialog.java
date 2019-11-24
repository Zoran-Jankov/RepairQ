package com.repair_shop.gui;

import java.awt.event.ActionListener;

public interface InputDialog
{
	public void setIdValue(String id);
	
	public void setBtnAddActionListener(ActionListener listener);

	public void setBtnCancelActionListener(ActionListener listener);
}