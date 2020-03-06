package main.java.com.zoran_jankov.repair_shop.data.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import main.java.com.zoran_jankov.repair_shop.data.EntityType;

/**
 * Class Brand represents a device brand.
 * 
 * @author Zoran Jankov
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "brand")
public class Brand extends BasicInfo
{
	@Override
	public final EntityType getType()
	{
		return EntityType.BRAND;
	}
}