package main.java.com.yankov.repair_shop.app.utility;

import java.time.LocalDate;

import main.java.com.yankov.repair_shop.data.DataManager;
import main.java.com.yankov.repair_shop.data.EntityType;
import main.java.com.yankov.repair_shop.gui.text.LabelName;

public class IDGenerator
{
	private static int WORKSTATION_ID = 1;
	private static final int ENTITY_COUNTER_MAX_VALUE = 100000000;
	private static final int DAILY_TICKET_COUNTER_MAX_VALUE = 100;	
	private static final int WORKSTATION_ID_VALUE = WORKSTATION_ID * ENTITY_COUNTER_MAX_VALUE;
	private static LocalDate lastTicketDate = LocalDate.MIN;
	
	public static int getNewID(EntityType entityType)
	{
		if(entityType == EntityType.TICKET)
		{
			checkNewWorkDay();
			
			LocalDate today = LocalDate.now();
			
			return DataManager.getEntityCounter(EntityType.TICKET) + 1
				 + today.getDayOfMonth() * DAILY_TICKET_COUNTER_MAX_VALUE
				 + today.getMonthValue() * 10000
				 +(today.getYear() % DAILY_TICKET_COUNTER_MAX_VALUE) * 1000000
				 + WORKSTATION_ID_VALUE;
		}
		else
		{
			return DataManager.getEntityCounter(entityType) + 1 + WORKSTATION_ID_VALUE;
		}
	}
	
	private static void checkNewWorkDay()
	{
		if(lastTicketDate != LocalDate.now())
		{
			DataManager.resetTicketCounter();
			lastTicketDate = LocalDate.now();
		}
	}

	public static String toString(EntityType entityType, int id)
	{
		if(entityType == null)
		{
			return "Null EntityType entered";
		}
		
		String workstationID = String.valueOf(id / ENTITY_COUNTER_MAX_VALUE);
		
		switch(entityType)
		{
			case TICKET:
			{
				String date = String.valueOf((id % ENTITY_COUNTER_MAX_VALUE) / DAILY_TICKET_COUNTER_MAX_VALUE);
				String dailyTicketCounter = String.valueOf(id %  DAILY_TICKET_COUNTER_MAX_VALUE);
				
				if(dailyTicketCounter.length() == 1)
				{
					dailyTicketCounter = '0' + dailyTicketCounter;
				}
				
				return workstationID + "-" + date + "-" + dailyTicketCounter;
			}
			
			default:
			{
				String entityCounter = String.valueOf(id % ENTITY_COUNTER_MAX_VALUE);
				
				return workstationID + "-" + entityCounter;
			}	
		}
	}
	
	public static int toInt(String displayName)
	{
		if(!displayName.equals(LabelName.NULL_ITEM))
		{
			int workstationID = Integer.parseInt(displayName.split("-")[0]);
			int entityCounterNumber = Integer.parseInt(displayName.split("-")[1]);
		
			return workstationID * ENTITY_COUNTER_MAX_VALUE + entityCounterNumber;
		}
		else
		{
			return 0;
		}
	}
}