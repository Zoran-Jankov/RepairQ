package main.java.com.yankov.repair_shop.gui.utility;

import java.awt.Window;

import main.java.com.yankov.repair_shop.data.EntityType;
import main.java.com.yankov.repair_shop.gui.dialog.ClientRegistrationDialog;
import main.java.com.yankov.repair_shop.gui.dialog.DeviceRegistrationDialog;
import main.java.com.yankov.repair_shop.gui.dialog.InputDialog;
import main.java.com.yankov.repair_shop.gui.dialog.ModelRegistrationDialog;
import main.java.com.yankov.repair_shop.gui.dialog.PropertyRegistrationDialog;
import main.java.com.yankov.repair_shop.gui.dialog.TicketRegistrationDialog;

public class InputDialogFactory
{
	public static InputDialog getWindow(Window owner, EntityType dataType)
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
				if(EntityType.isAProperty(dataType))
				{
					return new PropertyRegistrationDialog(owner, dataType);
				}
				else
				{
					return null;
				}
			}
		}
	}
}