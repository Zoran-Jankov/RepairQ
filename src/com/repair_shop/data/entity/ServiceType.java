package com.repair_shop.data.entity;

import com.repair_shop.data.DataType;

public class ServiceType extends Property
{
	private int defaultPrice;
	
	@Override
	public DataType getDataType()
	{
		return DataType.SERVICE_TYPE;
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