package main.java.com.zoran_jankov.repair_shop.data;

import java.util.HashMap;
import java.util.Map;

import main.java.com.zoran_jankov.repair_shop.data.entity.Entity;

public class IndexedDataTable implements IndexedData
{
	private int entityCounter = 0;
	private Map<Integer, Entity> idMap = new HashMap<Integer, Entity>();
	private Map<String, Entity> displayNameMap = new HashMap<String, Entity>();
	
	@Override
	public int getEntityCounter()
	{
		return entityCounter;
	}
	
	@Override
	public void resetEntityCounter()
	{
		entityCounter = 0;
	}
	
	@Override
	public Map<Integer, Entity> getIdMap()
	{
		return idMap;
	}
	
	@Override
	public Map<String, Entity> getDisplayNameMap()
	{
		return displayNameMap;
	}
	
	@Override
	public Entity getEntity(int id)
	{
		return idMap.get(id);
	}
	
	@Override
	public Entity getEntity(String displayName)
	{
		return displayNameMap.get(displayName);
	}
	
	@Override
	public boolean idCollision(int id)
	{
		return idMap.containsKey(id);
	}

	@Override
	public boolean displayNameCollision(String displayName)
	{
		return displayNameMap.containsKey(displayName);
	}

	@Override
	public void save(Entity newEntity)
	{
		entityCounter++;
		
		idMap.put(newEntity.getId(), newEntity);
		
		if(EntityType.hasDisplayName(newEntity))
		{
			displayNameMap.put(newEntity.getDisplayName(), newEntity);
		}
		
		if(EntityType.makesReferences(newEntity))
		{
			newEntity.createReferences();
		}
	}
	
	@Override
	public void delete(Entity newEntity)
	{
		idMap.remove(newEntity.getId());
		
		if(EntityType.hasDisplayName(newEntity))
		{
			displayNameMap.remove(newEntity.getDisplayName());
		}
		
		if(EntityType.makesReferences(newEntity))
		{
			newEntity.deleteReferences();
		}
	}
}