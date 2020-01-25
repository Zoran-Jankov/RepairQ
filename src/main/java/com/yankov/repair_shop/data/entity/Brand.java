package main.java.com.yankov.repair_shop.data.entity;

import main.java.com.yankov.repair_shop.data.EntityType;

/**
 * Class Brand extends abstract class Property and represents
 * a device brand.
 * 
 * @author Zoran Jankov
 */
public class Brand extends AbstractEntity
{
	public static final EntityType TYPE = EntityType.BRAND;
	private Property brand;
	
	public Property getBrand()
	{
		return brand;
	}
	
	public void setBrand(Property brand)
	{
		this.brand = brand;
	}
}