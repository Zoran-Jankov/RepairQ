package main.java.com.yankov.repair_shop.app;

import main.java.com.yankov.repair_shop.app.utility.WindowControllerFactory;
import main.java.com.yankov.repair_shop.app.utility.WindowTag;

public class Run
{
	public static void main(String[] args)
	{
		WindowControllerFactory.createController(WindowTag.LOGIN_DIALOG);
	}
}