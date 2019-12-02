package com.repair_shop.data;

public class DeviceType extends Property
{
	protected DeviceType(int id, String name, String description)
	{
		super(id, name, description);
	}

	@Override
	public DataType getDataType()
	{
		return DataType.DEVICE_TYPE;
	}
}