package com.repair_shop.utility;

public class IDGenerator
{
	private static final int COUNTER_MAX_VALUE = 10000000;
	private static final int TERMINAL_NUMBER = 1;
	
	public static int getNewID(DataType dataType)
	{
		return AccessData.getDataTable(dataType).getDataElementCounter() + (TERMINAL_NUMBER * COUNTER_MAX_VALUE);
	}
	
	public static String formatRegularID(int id)
	{
		return String.valueOf(TERMINAL_NUMBER)
				 + " - " 
				 + String.valueOf(id % COUNTER_MAX_VALUE);
	}
	
	public static String formatTicketID()
	{
		return null; //TODO formatTicketID()
	}
}