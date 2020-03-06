package main.java.com.zoran_jankov.repair_shop.data.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import main.java.com.zoran_jankov.repair_shop.data.EntityType;
import main.java.com.zoran_jankov.repair_shop.data.embeddable.BasicInfo;

/**
 * Class ServiceType extends abstract class Property and represents
 * a the type of a service.
 * 
 * @author Zoran Jankov
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "service_type")
public class ServiceType extends AbstractEntity
{
	@Embedded
	private BasicInfo basicInfo;
	
	@Column(name = "default_price")
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
	
	@Override
	public String getDisplayName()
	{
		return basicInfo.getName();
	}
}