package com.repair_shop.utility;

public class PropertyDialogText
{
	public static String TITLE = "Property Registration Form";
	public static String ID_LABEL = "  Property ID";
	public static String NAME_LABEL = "* Property name";
	public static String DESCRIPTION_LABEL = "  Property description";
	public static String ADD_BUTTON = "Add";
	public static String CANCEL_BUTTON = "Cancel";
	public static String NAME_ERROR = "<html><font size='2' color='red'>Please enter a uniqe name for new property </font></html>";
	
	
	public static void loadText(DataType dataType)
	{
		if(DataType.isAMatketingType(dataType))
		{
			loadMarketingTypeText();
		}
		
		if(dataType == DataType.DEVICE_TYPE)
		{
			loadDeviceTypeText();
		}
		
	}
	private static void loadDeviceTypeText()
	{
		TITLE = "Device Type Registration Form";
		ID_LABEL = "  Device type ID";
		NAME_LABEL = "* Device type name";
		DESCRIPTION_LABEL = "  Device type description";
		ADD_BUTTON = "Add";
		CANCEL_BUTTON = "Cancel";
		NAME_ERROR = "<html><font size='2' color='red'>Please enter a uniqe name for new device type</font></html>";
	}
	
	private static void loadMarketingTypeText()
	{
		TITLE = "Marketing Type Registration Form";
		ID_LABEL =  "  Marketing type ID";
		NAME_LABEL = "* Marketing type name";
		DESCRIPTION_LABEL = "  Marketing type description";
		ADD_BUTTON = "Add";
		CANCEL_BUTTON = "Cancel";
		NAME_ERROR = "<html><font size='2' color='red'>Please enter a uniqe name for new marketing type</font></html>";
	}
}