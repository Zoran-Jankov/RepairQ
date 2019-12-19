package main.java.com.yankov.repair_shop.data.entity;

import main.java.com.yankov.repair_shop.data.EntityType;

public class ServiceType extends Property
{
	private int defaultPrice;
	
	@Override
	public EntityType getEntityType()
	{
		return EntityType.SERVICE_TYPE;
	}
	
	public int getRegularPrice()
	{
		return defaultPrice;
	}

	public void setDefaultPrice(int defaultPrice)
	{
		this.defaultPrice = defaultPrice;
	}
}