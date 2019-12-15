package com.repair_shop.app.utility;

import com.repair_shop.data.DataManager;
import com.repair_shop.data.DataType;

public class IDGenerator
{
	private static final int COUNTER_MAX_VALUE = 10000000;
	private static final int TERMINAL_NUMBER = 1;
	
	public static int getNewID(DataType dataType)
	{
		if(dataType == DataType.TICKET)
		{
			return 1; //TODO ticket ID generator implementation
		}
		else
		{
			return DataManager.getEntityCounter(dataType) 
					+ (TERMINAL_NUMBER * COUNTER_MAX_VALUE);
		}
	}
	
	public static String idToString(DataType dataType, int id)
	{
		if(dataType == DataType.TICKET)
		{
			return "1-Error"; //TODO ticket ID generator implementation
		}
		else
		{
			return String.valueOf(id / COUNTER_MAX_VALUE)
					 + " - " 
					 + String.valueOf(id % COUNTER_MAX_VALUE);
		}
	}
	
	public static int stringToId(String displayName)
	{
		return 0; //TODO stringToId() method implementation
	}
}