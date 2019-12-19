package main.java.com.yankov.repair_shop.gui.dialog;

import main.java.com.yankov.repair_shop.gui.panel.IdPanel;
import main.java.com.yankov.repair_shop.gui.panel.InputButtonPanel;

public interface InputDialog
{
	public IdPanel getIdPanel();
	
	public InputButtonPanel getInputButtonPanel();

	public void setVisible(boolean b);
}