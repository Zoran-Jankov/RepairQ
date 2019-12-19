package main.java.com.yankov.repair_shop.app.utility;

import main.java.com.yankov.repair_shop.data.DataManager;
import main.java.com.yankov.repair_shop.data.EntityType;

public class IDGenerator
{
	private static final int COUNTER_MAX_VALUE = 10000000;
	private static final int TERMINAL_NUMBER = 1;
	
	public static int getNewID(EntityType dataType)
	{
		if(dataType == EntityType.TICKET)
		{
			return 1; //TODO ticket ID generator implementation
		}
		else
		{
			return DataManager.getEntityCounter(dataType) 
					+ (TERMINAL_NUMBER * COUNTER_MAX_VALUE);
		}
	}
	
	public static String toString(EntityType dataType, int id)
	{
		if(dataType == EntityType.TICKET)
		{
			return "1 - 1"; //TODO ticket ID generator implementation
		}
		else
		{
			return String.valueOf(id / COUNTER_MAX_VALUE)
				 + " - " 
				 + String.valueOf(id % COUNTER_MAX_VALUE);
		}
	}
	
	public static int toInt(String displayName)
	{
		int terminalNumber = Integer.parseInt(displayName.split(" - ")[0]);
		int entityOrdinalNumber = Integer.parseInt(displayName.split(" - ")[1]);
		
		return terminalNumber * COUNTER_MAX_VALUE + entityOrdinalNumber;
	}
}