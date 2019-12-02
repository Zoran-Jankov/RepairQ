package com.repair_shop.data;

public class ServiceType extends Property
{
	protected ServiceType(int id, String name, String description)
	{
		super(id, name, description);
	}

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