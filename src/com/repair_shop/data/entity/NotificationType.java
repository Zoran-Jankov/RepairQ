package com.repair_shop.data.entity;

import com.repair_shop.data.DataType;

public class NotificationType extends Property
{
	@Override
	public DataType getDataType()
	{
		return DataType.NOTIFICATION_TYPE;
	}
}