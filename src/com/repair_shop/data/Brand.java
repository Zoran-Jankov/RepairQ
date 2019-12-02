package com.repair_shop.data;

public class Brand extends Property
{
	protected Brand(int id, String name, String description)
	{
		super(id, name, description);
	}

	@Override
	public DataType getDataType()
	{
		return DataType.BRAND;
	}
}
