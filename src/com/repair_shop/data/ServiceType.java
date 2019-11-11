package com.repair_shop.data;

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