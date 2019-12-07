package com.repair_shop.data.entity;

import com.repair_shop.data.DataType;

public class DeviceType extends Property
{
	@Override
	public DataType getDataType()
	{
		return DataType.DEVICE_TYPE;
	}
}