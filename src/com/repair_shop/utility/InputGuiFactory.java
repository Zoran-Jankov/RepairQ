package com.repair_shop.utility;

import java.awt.Window;

import com.repair_shop.gui.ClientRegistrationGUI;
import com.repair_shop.gui.InputDialogGui;

public class InputGuiFactory
{
	public static InputDialogGui getWindow(Window owner, byte windowType)
	{
		if(DataType.isAClient(windowType))
		{
			return new ClientRegistrationGUI(owner);
		}
		else
		{
			return null;
		}
	}
}
