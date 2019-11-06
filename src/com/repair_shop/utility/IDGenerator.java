package com.repair_shop.utility;

public class IDGenerator
{
	public static final int COUNTER_MAX_VALUE = 10000000;
	public static final int TERMINAL_NUMBER = 1;
	
	public static int getNewClientID()
	{
		return AccessData.clientsDataTable.getDataElementCounter() + (TERMINAL_NUMBER * COUNTER_MAX_VALUE);
	}
	
	public static int getNewDeviceID()
	{
		return AccessData.devicesDataTable.getDataElementCounter() + (TERMINAL_NUMBER * COUNTER_MAX_VALUE);
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