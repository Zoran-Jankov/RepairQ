package main.java.com.zoran_jankov.repair_shop.data.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import main.java.com.zoran_jankov.repair_shop.data.EntityType;
import main.java.com.zoran_jankov.repair_shop.data.embeddable.BasicInfo;

/**
 * Class Brand represents a device brand.
 * 
 * @author Zoran Jankov
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "brand")
public class Brand extends AbstractEntity
{
	@Embedded
	private BasicInfo basicInfo;
	
	@Override
	public final EntityType getType()
	{
		return EntityType.BRAND;
	}
	
	@Override
	public String getDisplayName()
	{
		return basicInfo.getName();
	}
}