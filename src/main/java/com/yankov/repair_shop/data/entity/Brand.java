package main.java.com.yankov.repair_shop.data.entity;

import main.java.com.yankov.repair_shop.data.EntityType;
import main.java.com.yankov.repair_shop.data.component.Property;

/**
 * Class Brand extends abstract class Property and represents
 * a device brand.
 * 
 * @author Zoran Jankov
 */
public class Brand extends AbstractEntity
{
	private Property brand;
	
	@Override
	public EntityType getEntityType()
	{
		return EntityType.BRAND;
	}
	
	public Property getBrand()
	{
		return brand;
	}
	
	public void setBrand(Property brand)
	{
		this.brand = brand;
	}
}