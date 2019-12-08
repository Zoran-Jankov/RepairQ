package com.repair_shop.app.utility;

import java.awt.event.ActionListener;

import com.repair_shop.app.action.CloseWindow;
import com.repair_shop.app.action.OpenWindow;
import com.repair_shop.app.action.SaveData;
import com.repair_shop.app.controller.WindowController;
import com.repair_shop.data.DataType;

public class ActionFactory
{
	public static ActionListener saveData(InputDialogController controller)
	{
		return new SaveData(controller);
	}
	
	public static ActionListener openWindow(WindowController owner, DataType dataType)
	{
		return new OpenWindow(owner, dataType);
	}
	
	public static ActionListener openWindow(WindowTag window)
	{
		return new OpenWindow(window);
	}
	
	public static ActionListener closeWindow(WindowController controller)
	{
		return new CloseWindow(controller);
	}
}