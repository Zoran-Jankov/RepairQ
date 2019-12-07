package com.repair_shop.gui.dialog;

import com.repair_shop.gui.panel.IdPanel;
import com.repair_shop.gui.panel.InputButtonPanel;

public interface InputDialog
{
	public IdPanel getIdPanel();
	
	public InputButtonPanel getInputButtonPanel();

	public void setVisible(boolean b);
}