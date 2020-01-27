package main.java.com.yankov.repair_shop.data.entity;

import java.util.HashMap;
import java.util.Map;

import main.java.com.yankov.repair_shop.data.EntityType;
import main.java.com.yankov.repair_shop.data.component.BasicInfo;

/**
 * Class Brand represents a device brand.
 * 
 * @author Zoran Jankov
 */
public class Brand extends AbstractEntity
{
	private BasicInfo brand;
	
	private Map<Integer, Model> modelsReferencingBrand = new HashMap<Integer, Model>();
	
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

	public Map<Integer, Model> getModelsReferencingBrand()
	{
		return modelsReferencingBrand;
	}

	public void setModelsReferencingBrand(Map<Integer, Model> modelsReferencingBrand)
	{
		this.modelsReferencingBrand = modelsReferencingBrand;
	}
	
	public void addModelReferencingBrand(Model model)
	{
		modelsReferencingBrand.put(model.getId(), model);
	}
	
	public void removeModelReferencingBrand(int id)
	{
		modelsReferencingBrand.remove(id);
	}
	
	@Override
	public String getDisplayName()
	{
		return brand.getPropertyName();
	}
}