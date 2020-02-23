package test.java.com.zoran.jankov.repair_shop.app.utility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import main.java.com.zoran_jankov.repair_shop.app.utility.IDGenerator;
import main.java.com.zoran_jankov.repair_shop.data.EntityType;

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