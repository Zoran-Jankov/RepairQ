package main.java.com.zoran_jankov.repair_shop.data.entity;

import javax.persistence.Embedded;

import main.java.com.zoran_jankov.repair_shop.data.EntityType;
import main.java.com.zoran_jankov.repair_shop.data.embeddable.BasicInfo;

public class Status extends AbstractEntity
{
	@Embedded
	private BasicInfo status;
	
	@Override
	public EntityType getType()
	{
		return EntityType.NOTIFICATION;
	}

	public BasicInfo getStatus()
	{
		return status;
	}

	public void setStatus(BasicInfo status)
	{
		this.status = status;
	}

	@Override
	public String getDisplayName()
	{
		return status.getName();
	}
}