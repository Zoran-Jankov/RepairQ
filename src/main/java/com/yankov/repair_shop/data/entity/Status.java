package main.java.com.yankov.repair_shop.data.entity;

import main.java.com.yankov.repair_shop.data.EntityType;

public class Status extends Property
{
	@Override
	public EntityType getEntityType()
	{
		return EntityType.STATUS;
	}
}