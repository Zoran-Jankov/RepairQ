package main.java.com.zoran_jankov.repair_shop.data.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import main.java.com.zoran_jankov.repair_shop.data.EntityType;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "status")
public class Status extends BasicInfo
{
	@Override
	public EntityType getType()
	{
		return EntityType.NOTIFICATION;
	}
}