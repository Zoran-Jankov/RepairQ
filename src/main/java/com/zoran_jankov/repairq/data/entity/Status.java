package com.zoran_jankov.repairq.data.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.zoran_jankov.repairq.data.EntityType;

import lombok.Data;
import lombok.EqualsAndHashCode;

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