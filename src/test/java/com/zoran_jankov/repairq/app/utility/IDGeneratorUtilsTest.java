package com.zoran_jankov.repairq.app.utility;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import com.zoran_jankov.repairq.data.EntityType;

public class IDGeneratorUtilsTest
{
	@ParameterizedTest
	@EnumSource(EntityType.class)
	public void getNewIDTest(EntityType entityType)
	{
		switch(entityType)
		{
			case TICKET:
				assertEquals(119123001, IDGeneratorUtils.getNewID(entityType));
				break;
				
			default:
				assertEquals(100000001, IDGeneratorUtils.getNewID(entityType));
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
				assertEquals("1-191230-01", IDGeneratorUtils.toString(entityType, 119123001));
				break;
				
			default:
				assertEquals("1-21", IDGeneratorUtils.toString(entityType, 100000021));
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
				assertEquals(119123001, IDGeneratorUtils.toInt(entityType, "1-191230-01"));
				break;
				
			default:
				assertEquals(100000021, IDGeneratorUtils.toInt(entityType, "1-21"));
				break;
		}
	}
}