package com.zoran_jankov.repairq.app.utility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.zoran_jankov.repairq.app.utility.IDGenerator;
import com.zoran_jankov.repairq.data.EntityType;

public class IDGeneratorTest
{
	@ParameterizedTest
	@EnumSource(EntityType.class)
	public void getNewIDTest(EntityType entityType)
	{
		switch(entityType)
		{
			case TICKET:
				assertEquals(119123001, IDGenerator.getNewID(entityType));
				break;
				
			default:
				assertEquals(100000001, IDGenerator.getNewID(entityType));
				break;
		}
	}
	
	@ParameterizedTest
	@EnumSource(EntityType.class)
	public void toStringTest(EntityType entityType)
	{
		switch(entityType)
		{
			case TICKET:
				assertEquals("1-191230-01", IDGenerator.toString(entityType, 119123001));
				break;
				
			default:
				assertEquals("1-21", IDGenerator.toString(entityType, 100000021));
				break;
		}
	}
	
	@ParameterizedTest
	@EnumSource(EntityType.class)
	public void toIntTest(EntityType entityType)
	{
		switch(entityType)
		{
			case TICKET:
				assertEquals(119123001, IDGenerator.toInt(entityType, "1-191230-01"));
				break;
				
			default:
				assertEquals(100000021, IDGenerator.toInt(entityType, "1-21"));
				break;
		}
	}
}