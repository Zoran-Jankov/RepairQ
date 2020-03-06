package main.java.com.zoran_jankov.repair_shop.data.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import main.java.com.zoran_jankov.repair_shop.data.EntityType;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "notification_type")
public class NotificationType extends BasicInfo
{
	@Override
	public EntityType getType()
	{
		return EntityType.NOTIFICATION_TYPE;
	}
}