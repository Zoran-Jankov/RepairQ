package main.java.com.zoran_jankov.repair_shop.data.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

import main.java.com.zoran_jankov.repair_shop.data.EntityType;
import main.java.com.zoran_jankov.repair_shop.data.embeddable.BasicInfo;

@Entity
@Table(name = "notification_type")
public class NotificationType extends AbstractEntity
{
	@Embedded
	private BasicInfo notificationType;
	
	@Override
	public EntityType getType()
	{
		return EntityType.NOTIFICATION;
	}

	public BasicInfo getNotificationType()
	{
		return notificationType;
	}

	public void setNotificationType(BasicInfo notificationType)
	{
		this.notificationType = notificationType;
	}

	@Override
	public String getDisplayName()
	{
		return notificationType.getName();
	}
}