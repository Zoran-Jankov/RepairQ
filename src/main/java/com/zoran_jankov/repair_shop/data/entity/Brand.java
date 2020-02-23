package main.java.com.zoran_jankov.repair_shop.data.entity;

import main.java.com.zoran_jankov.repair_shop.data.EntityType;
import main.java.com.zoran_jankov.repair_shop.data.component.BasicInfo;
import main.java.com.zoran_jankov.repair_shop.data.reference.EntityReference;
import main.java.com.zoran_jankov.repair_shop.data.reference.SingleReference;

/**
 * Class Brand represents a device brand.
 * 
 * @author Zoran Jankov
 */
public class Brand extends AbstractEntity
{
	private BasicInfo brand;
	private SingleReference reference = new SingleReference();
	
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
	
	public EntityReference getReference()
	{
		return (EntityReference) reference;
	}

	public void setReference(EntityReference reference)
	{
		this.reference = (SingleReference) reference;
	}
	
	@Override
	public String getDisplayName()
	{
		return brand.getPropertyName();
	}
}