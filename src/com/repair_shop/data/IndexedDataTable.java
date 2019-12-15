package com.repair_shop.data;

import java.util.HashMap;

import com.repair_shop.data.entity.Entity;

public class IndexedDataTable implements IndexedData
{
	private int entityCounter = 0;
	private HashMap<Integer, Entity> idMap = new HashMap<Integer, Entity>();
	private HashMap<String, Entity> displayNameMap = new HashMap<String, Entity>();
	
	@Override
	public int getEntityCounter()
	{
		return entityCounter;
	}
	
	@Override
	public HashMap<String, Entity> getDisplayNameMap()
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
		
		idMap.put(newEntity.getID(), newEntity);
		
		if(DataType.hasDisplayName(newEntity))
		{
			displayNameMap.put(newEntity.getDisplayName(), newEntity);
		}
		
		if(DataType.makesReferences(newEntity))
		{
			newEntity.createReferences();
		}
	}
	
	@Override
	public void delete(Entity newEntity)
	{
		idMap.remove(newEntity.getID());
		
		if(DataType.hasDisplayName(newEntity))
		{
			displayNameMap.remove(newEntity.getDisplayName());
		}
		
		if(DataType.makesReferences(newEntity))
		{
			newEntity.deleteReferences();
		}
	}
}