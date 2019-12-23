package test.java.com.yankov.repair_shop.app.utility;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import main.java.com.yankov.repair_shop.app.utility.IDGenerator;

import main.java.com.yankov.repair_shop.data.EntityType;

class IDGeneratorTest
{
	@ParameterizedTest
	@EnumSource(EntityType.class)
	void getNewIDTest(EntityType entityType)
	{
		if(entityType == EntityType.TICKET)
		{
			assertEquals(119122301, IDGenerator.getNewID(entityType));
		}
		else
		{
			assertEquals(100000001, IDGenerator.getNewID(entityType));
		}
	}
}