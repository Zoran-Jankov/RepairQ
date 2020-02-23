package main.java.com.zoran_jankov.repair_shop.data.reference;

import java.util.Map;

import main.java.com.zoran_jankov.repair_shop.data.EntityType;
import main.java.com.zoran_jankov.repair_shop.data.entity.Entity;

public class ModelReferenceMap implements EntityReferenceMap
{
	@Override
	public Map<Integer, Entity> getReferenceMap(EntityType entityType)
	{
		return null;
	}

	@Override
	public void setReferenceMap(Map<Integer, Entity> referenceMap)
	{

	}

	@Override
	public void addReference(Entity entity)
	{
		
	}

	@Override
	public void removeReference(int id)
	{

	}
}