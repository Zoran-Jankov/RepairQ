package com.repair_shop.gui.utility;

import java.awt.Window;

import com.repair_shop.data.DataType;
import com.repair_shop.gui.dialog.ClientRegistrationDialog;
import com.repair_shop.gui.dialog.DeviceRegistrationDialog;
import com.repair_shop.gui.dialog.InputDialog;
import com.repair_shop.gui.dialog.ModelRegistrationDialog;
import com.repair_shop.gui.dialog.PropertyRegistrationDialog;
import com.repair_shop.gui.dialog.TicketRegistrationDialog;

public class InputDialogFactory
{
	public static InputDialog getWindow(Window owner, DataType dataType)
	{
		switch(dataType)
		{
			case TICKET:
				return new TicketRegistrationDialog(owner);
			
			case CLIENT:
				return new ClientRegistrationDialog(owner);
			
			case DEVICE:
				return new DeviceRegistrationDialog(owner);
				
			case MODEL:
				return new ModelRegistrationDialog(owner);
				
			default:
			{
				if(DataType.isAProperty(dataType))
				{
					return new PropertyRegistrationDialog(owner);
				}
				else
				{
					return null;
				}
			}
		}
	}
}