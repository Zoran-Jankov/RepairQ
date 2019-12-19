package main.java.com.yankov.repair_shop.app.utility;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

import main.java.com.yankov.repair_shop.data.DataManager;
import main.java.com.yankov.repair_shop.data.EntityType;

public class IDGenerator
{
	private static int TERMINAL_ID = 1;
	private static final int COUNTER_MAX_VALUE = 10000000;
	private static final int DAY_TICKETS_COUNTER_MAX_VALUE = 100;
	private static final int TERMINAL_NUMBER_ID_VALUE = TERMINAL_ID * COUNTER_MAX_VALUE;
	private static final SimpleDateFormat ticketDateFormat = new SimpleDateFormat("yyMMdd");
	private static LocalDate lastTicketDate = LocalDate.MIN;
	
	public static int getNewID(EntityType dataType)
	{
		if(dataType == EntityType.TICKET)
		{
			checkNewWokDay();
			int ticketDate = Integer.parseInt(ticketDateFormat.format(LocalDate.now()));
			
			return TERMINAL_NUMBER_ID_VALUE
				 + (ticketDate * DAY_TICKETS_COUNTER_MAX_VALUE)
				 + DataManager.getEntityCounter(EntityType.TICKET) + 1;
		}
		else
		{
			return DataManager.getEntityCounter(dataType) + 1 + TERMINAL_NUMBER_ID_VALUE;
		}
	}
	
	private static void checkNewWokDay()
	{
		if(lastTicketDate != LocalDate.now())
		{
			DataManager.resetTicketCounter();
			lastTicketDate = LocalDate.now();
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