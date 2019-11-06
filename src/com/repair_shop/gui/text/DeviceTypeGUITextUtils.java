package com.repair_shop.gui.text;

public class DeviceTypeGUITextUtils
{
	public static String TITLE = "Device Type Registration Form";
	public static String ID_LABEL = "Device type ID";
	public static String NAME_LABEL = "* Device type Name";
	public static String DESCRIPTION_LABEL = "  Device type Description";
	public static String ADD_BUTTON = "Add";
	public static String CANCEL_BUTTON = "Cancel";
	public static String NAME_ERROR = "<html><font size='2' color='red'>Please enter a uniqe name for new device type</font></html>";
	
	public static String[] getText()
	{
		String[] text = {TITLE,
						 ID_LABEL,
						 NAME_LABEL,
						 DESCRIPTION_LABEL,
						 ADD_BUTTON,
						 CANCEL_BUTTON,
						 NAME_ERROR};
		return text;
	}
}