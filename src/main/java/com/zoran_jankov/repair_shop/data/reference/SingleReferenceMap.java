package main.java.com.zoran_jankov.repair_shop.data.reference;

import java.util.HashMap;
import java.util.Map;

import main.java.com.zoran_jankov.repair_shop.data.EntityType;
import main.java.com.zoran_jankov.repair_shop.data.entity.Entity;

public class SingleReferenceMap implements EntityReferenceMap
{
	private Map<Integer, Entity> referenceMap = new HashMap<Integer, Entity>();

	@Override
	public Map<Integer, Entity> getReferenceMap(EntityType entityType)
	{
		return referenceMap;
	}

	@Override
	public void setReferenceMap(Map<Integer, Entity> referenceMap)
	{
		this.referenceMap = referenceMap;
	}

	@Override
	public void addReference(Entity entity)
	{
		referenceMap.put(entity.getId(), entity);
	}

	@Override
	public void removeReference(int id)
	{
		referenceMap.remove(id);
	}
}