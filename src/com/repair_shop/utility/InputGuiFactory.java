package com.repair_shop.utility;

import java.awt.Window;

import com.repair_shop.gui.ClientRegistrationGUI;
import com.repair_shop.gui.InputDialogGui;
import com.repair_shop.gui.PropertyRegistrationGUI;
import com.repair_shop.gui.text.PropertyGUITextUtils;

public class InputGuiFactory
{
	public static InputDialogGui getWindow(Window owner, byte dataType)
	{
		if(DataType.isAClient(dataType))
		{
			return new ClientRegistrationGUI(owner);
		}
		else if(DataType.isAProperty(dataType))
		{
			PropertyGUITextUtils.loadText(dataType);
			return new PropertyRegistrationGUI(owner);
		}
		else
		{
			return null;
		}
	}
}
