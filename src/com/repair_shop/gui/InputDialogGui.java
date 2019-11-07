package com.repair_shop.gui;

import java.awt.event.ActionListener;

public interface InputDialogGui extends WindowContainer
{
	public void setIdValue(String id);
	
	public void setBtnAddActionListener(ActionListener l);
	
	public void setBtnCancelActionListener(ActionListener l);
}
