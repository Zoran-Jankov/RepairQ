package main.java.com.zoran_jankov.repair_shop.data.reference;

import java.util.HashMap;
import java.util.Map;

import main.java.com.zoran_jankov.repair_shop.data.EntityType;
import main.java.com.zoran_jankov.repair_shop.data.entity.Entity;

public class BrandReference implements EntityReference
{
	private Map<Integer, Entity> modelsReferencingBrand = new HashMap<Integer, Entity>();

	@Override
	public Map<Integer, Entity> getReferenceMap(EntityType entityType)
	{
		return modelsReferencingBrand;
	}

	@Override
	public void setReferenceMap(Map<Integer, Entity> referenceMap)
	{
		this.modelsReferencingBrand = referenceMap;
	}

	@Override
	public void addReference(Entity entity)
	{
		modelsReferencingBrand.put(entity.getId(), entity);
	}

	@Override
	public void removeReference(int id)
	{
		modelsReferencingBrand.remove(id);
	}
}