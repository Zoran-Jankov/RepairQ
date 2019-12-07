package com.repair_shop.data.entity;

import com.repair_shop.data.DataType;

public class Status extends Property
{
	@Override
	public DataType getDataType()
	{
		return DataType.STATUS;
	}
}