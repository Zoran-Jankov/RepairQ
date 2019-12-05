package com.repair_shop.utility;

import java.awt.Window;

import com.repair_shop.data.DataType;
import com.repair_shop.gui.ClientRegistrationDialog;
import com.repair_shop.gui.DeviceRegistrationDialog;
import com.repair_shop.gui.InputDialog;
import com.repair_shop.gui.ModelRegistrationDialog;
import com.repair_shop.gui.PropertyRegistrationDialog;
import com.repair_shop.gui.TicketRegistrationDialog;

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