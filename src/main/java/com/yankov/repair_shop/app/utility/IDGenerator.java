package main.java.com.yankov.repair_shop.app.utility;

import java.time.LocalDate;
import java.util.Objects;

import main.java.com.yankov.repair_shop.data.DataManager;
import main.java.com.yankov.repair_shop.data.EntityType;
import main.java.com.yankov.repair_shop.gui.text.LabelName;

public class IDGenerator
{
	private static final int WORKSTATION_ID = 1;
	private static final int DAY_ID_FORMATER = 100;
	private static final int MONTH_ID_FORMATER = 10000;	
	private static final int YEAR_ID_FORMATER = 1000000;
	private static final int WORKSTATION_ID_FORMATER = 100000000;
	private static final int WORKSTATION_ID_VALUE = WORKSTATION_ID * WORKSTATION_ID_FORMATER;
	
	private static LocalDate lastTicketDate = LocalDate.MIN;
	
	public static int getNewID(EntityType entityType)
	{
		Objects.requireNonNull(entityType, "EntityType is null");
		
		int entityCounter = DataManager.getEntityCounter(entityType);
		
		switch(entityType)
		{
			case TICKET:
			{
				checkNewWorkDay();
				
				LocalDate today = LocalDate.now();
				
				int dayIDValue = today.getDayOfMonth() * DAY_ID_FORMATER;
				int monthIDValue = today.getMonthValue() * MONTH_ID_FORMATER;
				int yearIDValue = (today.getYear() % DAY_ID_FORMATER) * YEAR_ID_FORMATER;
				
				return entityCounter + 1
					 + dayIDValue
					 + monthIDValue
					 + yearIDValue
					 + WORKSTATION_ID_VALUE;
			}
			default:
			{
				return entityCounter + 1 + WORKSTATION_ID_VALUE;
			}
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
		Objects.requireNonNull(entityType, "EntityType is null");
		
		String workstationID = String.valueOf(id / WORKSTATION_ID_FORMATER);
		
		switch(entityType)
		{
			case TICKET:
			{
				String date = String.valueOf((id % WORKSTATION_ID_FORMATER) / DAY_ID_FORMATER);
				String dailyTicketCounter = String.valueOf(id %  DAY_ID_FORMATER);
				
				if(dailyTicketCounter.length() == 1)
				{
					dailyTicketCounter = '0' + dailyTicketCounter;
				}
				
				return workstationID + "-" + date + "-" + dailyTicketCounter;
			}
			
			default:
			{
				String entityCounter = String.valueOf(id % WORKSTATION_ID_FORMATER);
				
				return workstationID + "-" + entityCounter;
			}	
		}
	}
	
	public static int toInt(EntityType entityType, String displayName)
	{
		Objects.requireNonNull(entityType, "EntityType is null");
		
		if(LabelName.NULL_ITEM.equals(displayName))
			return 0;
		
		int workstationID = Integer.parseInt(displayName.split("-")[0]) * WORKSTATION_ID_FORMATER;
		
		switch(entityType)
		{
			case TICKET:
			{
				int date = Integer.parseInt(displayName.split("-")[1]) * DAY_ID_FORMATER;
				int entityCounterNumber = Integer.parseInt(displayName.split("-")[2]);
				return workstationID + date + entityCounterNumber;
			}
			default:
			{
				int entityCounterNumber = Integer.parseInt(displayName.split("-")[1]);
		
				return workstationID + entityCounterNumber;
			}
		}	
	}
}