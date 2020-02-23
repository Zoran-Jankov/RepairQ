package main.java.com.zoran_jankov.repair_shop.data.entity;

import main.java.com.zoran_jankov.repair_shop.data.EntityType;
import main.java.com.zoran_jankov.repair_shop.data.component.BasicInfo;
import main.java.com.zoran_jankov.repair_shop.data.reference.EntityReferenceMap;
import main.java.com.zoran_jankov.repair_shop.data.reference.SingleReferenceMap;

/**
 * Class Brand represents a device brand.
 * 
 * @author Zoran Jankov
 */
public class Brand extends AbstractEntity
{
	private BasicInfo brand;
	private SingleReferenceMap reference = new SingleReferenceMap();
	
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
	public EntityReferenceMap getReferenceMap()
	{
		return (EntityReferenceMap) reference;
	}
	
	@Override
	public String getDisplayName()
	{
		return brand.getPropertyName();
	}
}