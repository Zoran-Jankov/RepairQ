package com.zoran_jankov.repairq.app;

import com.zoran_jankov.repairq.app.utility.WindowControllerFactory;
import com.zoran_jankov.repairq.app.utility.WindowTag;

public class Run
{
	public static void main(String[] args)
	{
		WindowControllerFactory.createController(WindowTag.LOGIN_DIALOG);
	}
}