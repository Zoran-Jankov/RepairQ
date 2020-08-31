package com.zoran_jankov.repairq.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.zoran_jankov.repairq.data.EntityType;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Class ServiceType extends abstract class Property and represents
 * a the type of a service.
 * 
 * @author Zoran Jankov
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "service_type")
public class ServiceType extends BasicInfo
{
	@Column(name = "default_price", nullable = false )
	private int defaultPrice;
	
	/**
	 * Returns EntityType.SERVICE_TYPE enum.
	 * @return (enum EntityType) SERVICE_TYPE
	 */
	@Override
	public EntityType getType()
	{
		return EntityType.SERVICE_TYPE;
	}
}