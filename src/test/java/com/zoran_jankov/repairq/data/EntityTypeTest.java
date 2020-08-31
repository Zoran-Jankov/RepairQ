package com.zoran_jankov.repairq.data;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import com.zoran_jankov.repairq.data.entity.Device;
import com.zoran_jankov.repairq.data.entity.Notification;
import com.zoran_jankov.repairq.data.entity.Service;
import com.zoran_jankov.repairq.data.entity.Ticket;

class EntityTypeTest
{
	@ParameterizedTest
	@EnumSource(EntityType.class)
	public void hasDisplayNameTest(EntityType entityType)
	{
		switch (entityType)
		{
        	case NOTIFICATION:
        	case SERVICE:
        	case TICKET:
        	case DEVICE:
        		assertFalse(EntityType.hasDisplayName(entityType));
        		break;
        		
        	default:
        		assertTrue(EntityType.hasDisplayName(entityType));
        		break;
		}
	}
	
	@Test
	public void hasDisplayNameTest()
	{
		assertFalse(EntityType.hasDisplayName(new Notification()));
		assertFalse(EntityType.hasDisplayName(new Service()));
		assertFalse(EntityType.hasDisplayName(new Ticket()));
		assertFalse(EntityType.hasDisplayName(new Device()));
	}
}