package main.java.com.yankov.repair_shop.app.utility;

import java.time.LocalDate;

import main.java.com.yankov.repair_shop.data.DataManager;
import main.java.com.yankov.repair_shop.data.EntityType;
import main.java.com.yankov.repair_shop.gui.text.LabelName;

public class IDGenerator
{
	private static int WORKSTATION_ID = 1;
	private static final int COUNTER_MAX_VALUE = 100000000;
	private static final int WORKSTATION_ID_VALUE = WORKSTATION_ID * COUNTER_MAX_VALUE;
	private static LocalDate lastTicketDate = LocalDate.MIN;
	
	public static int getNewID(EntityType dataType)
	{
		if(dataType == EntityType.TICKET)
		{
			checkNewWorkDay();
			
			LocalDate today = LocalDate.now();
			
			return DataManager.getEntityCounter(EntityType.TICKET) + 1
				 + today.getDayOfMonth() * 100
				 + today.getMonthValue() * 10000
				 +(today.getYear() % 100) * 1000000
				 + WORKSTATION_ID_VALUE;
		}
		else
		{
			return DataManager.getEntityCounter(dataType) + 1 + WORKSTATION_ID_VALUE;
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

	public static String toString(EntityType dataType, int id)
	{
		if(dataType == EntityType.TICKET)
		{
			return "1-1"; //TODO ticket ID generator implementation
		}
		else
		{
			return String.valueOf(id / COUNTER_MAX_VALUE)
				 + "-" 
				 + String.valueOf(id % COUNTER_MAX_VALUE);
		}
	}
	
	public static int toInt(String displayName)
	{
		if(!displayName.equals(LabelName.NULL_ITEM))
		{
			int workstationID = Integer.parseInt(displayName.split("-")[0]);
			int entityCounterNumber = Integer.parseInt(displayName.split("-")[1]);
		
			return workstationID * COUNTER_MAX_VALUE + entityCounterNumber;
		}
		else
		{
			return 0;
		}
	}
}