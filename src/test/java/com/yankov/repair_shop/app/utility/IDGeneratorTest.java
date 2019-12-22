package test.java.com.yankov.repair_shop.app.utility;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import main.java.com.yankov.repair_shop.data.DataManager;
import main.java.com.yankov.repair_shop.data.EntityFactory;
import main.java.com.yankov.repair_shop.data.EntityType;
import main.java.com.yankov.repair_shop.data.entity.Entity;

class IDGeneratorTest
{
	/**
	 * Adds single entity to every data table for testing purpose.
	 * @throws Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception
	{
		
		for(EntityType entityType : EntityType.values())
		{
			Entity newEntity = EntityFactory.create(entityType);
			DataManager.save(newEntity);
		}
			
	}

	@ParameterizedTest
	@EnumSource(EntityType.class)
	void getNewIDTest(EntityType dataType)
	{
		asse
	}

}
