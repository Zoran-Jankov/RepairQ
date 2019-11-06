package com.repair_shop.utility;

import java.awt.Window;

import com.repair_shop.gui.ClientRegistrationGUI;
import com.repair_shop.gui.WindowContainer;

public class GuiFactory
{
	public static WindowContainer getWindow(Window owner, byte windowType)
	{
		if(windowType == DataType.CLIENT)
		{
			return new ClientRegistrationGUI(owner);
		}
		else
		{
			return null;
		}
	}
}
