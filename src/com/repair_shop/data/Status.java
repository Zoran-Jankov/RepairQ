package com.repair_shop.data;

public class Status extends Property
{
	protected Status(int id, String name, String description)
	{
		super(id, name, description);
	}

	@Override
	public DataType getDataType()
	{
		return DataType.STATUS;
	}
}