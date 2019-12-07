package com.repair_shop.data.entity;

import com.repair_shop.data.DataType;

public class Marketing extends Property
{
	@Override
	public DataType getDataType()
	{
		return DataType.MARKETING_TYPE;
	}
}