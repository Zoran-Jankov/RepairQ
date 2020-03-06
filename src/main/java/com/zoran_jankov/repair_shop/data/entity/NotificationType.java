package main.java.com.zoran_jankov.repair_shop.data.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import main.java.com.zoran_jankov.repair_shop.data.EntityType;
import main.java.com.zoran_jankov.repair_shop.data.embeddable.BasicInfo;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "notification_type")
public class NotificationType extends AbstractEntity
{
	@Embedded
	private BasicInfo basicInfo;
	
	@Override
	public EntityType getType()
	{
		return EntityType.NOTIFICATION;
	}

	@Override
	public String getDisplayName()
	{
		return basicInfo.getName();
	}
}