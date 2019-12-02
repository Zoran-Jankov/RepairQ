package com.repair_shop.data;

public class NotificationType extends Property
{
	protected NotificationType(int id, String name, String description)
	{
		super(id, name, description);
	}

	@Override
	public DataType getDataType()
	{
		return DataType.NOTIFICATION_TYPE;
	}
}