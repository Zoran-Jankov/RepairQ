package com.repair_shop.utility;

import java.awt.Window;

import com.repair_shop.data.DataType;
import com.repair_shop.gui.ClientRegistrationDialog;
import com.repair_shop.gui.InputDialog;
import com.repair_shop.gui.PropertyRegistrationDialog;

public class InputDialogFactory
{
	public static InputDialog getWindow(Window owner, DataType dataType)
	{
		if(DataType.isAClient(dataType))
		{
			return new ClientRegistrationDialog(owner);
		}
		else if(DataType.isAProperty(dataType))
		{
			PropertyDialogText.loadText(dataType);
			return new PropertyRegistrationDialog(owner);
		}
		else
		{
			return null;
		}
	}
}
