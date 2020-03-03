package main.java.com.zoran_jankov.repair_shop.data.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

import main.java.com.zoran_jankov.repair_shop.data.EntityType;
import main.java.com.zoran_jankov.repair_shop.data.embeddable.BasicInfo;

/**
 * Class Brand represents a device brand.
 * 
 * @author Zoran Jankov
 */
@Entity
@Table(name = "brand")
public class Brand extends AbstractEntity
{
	@Embedded
	private BasicInfo brand;
	
	@Override
	public final EntityType getType()
	{
		return EntityType.BRAND;
	}

	public BasicInfo getBrand()
	{
		return brand;
	}
	
	public void setBrand(BasicInfo brand)
	{
		this.brand = brand;
	}
	
	@Override
	public String getDisplayName()
	{
		return brand.getPropertyName();
	}
}