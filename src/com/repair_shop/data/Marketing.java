package com.repair_shop.data;

public class Marketing extends Property
{
	protected Marketing(int id, String name, String description)
	{
		super(id, name, description);
	}

	@Override
	public DataType getDataType()
	{
		return DataType.MARKETING_TYPE;
	}
}