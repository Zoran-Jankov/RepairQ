package main.java.com.zoran_jankov.repair_shop.data.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import main.java.com.zoran_jankov.repair_shop.data.EntityType;

/**
 * Class DeviceType represents a device type.
 * 
 * @author Zoran Jankov
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "device_type")
public class DeviceType extends BasicInfo
{
	@Override
	public EntityType getType()
	{
		return EntityType.DEVICE_TYPE;
	}
}