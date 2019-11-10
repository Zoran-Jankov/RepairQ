package com.repair_shop.data;

import com.repair_shop.utility.DataType;

public class DeviceType extends Property
{
	@Override
	public DataType getDataType()
	{
		return DataType.DEVICE_TYPE;
	}
}
