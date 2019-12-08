package com.repair_shop.data;

import java.util.HashMap;

import com.repair_shop.data.entity.Entity;

public class IndexedDataTable implements IndexedData
{
	private int entityCounter = 1;
	private HashMap<Integer, Entity> idMap = new HashMap<Integer, Entity>();
	private HashMap<String, Entity> uniqueStringMap = new HashMap<String, Entity>();
	
	@Override
	public int getEntityCounter()
	{
		return entityCounter;
	}
	
	@Override
	public HashMap<String, Entity> getUniqueStringMap()
	{
		return uniqueStringMap;
	}
	
	@Override
	public Entity getByID(int id)
	{
		return idMap.get(id);
	}
	
	@Override
	public Entity getByUniqueString(String uniqueString)
	{
		return uniqueStringMap.get(uniqueString);
	}
	
	@Override
	public boolean idCollision(int id)
	{
		return idMap.containsKey(id);
	}

	@Override
	public boolean uniqueStringCollision(String uniqueString)
	{
		return uniqueStringMap.containsKey(uniqueString);
	}

	@Override
	public void save(Entity newEntity)
	{
		idMap.put(newEntity.getID(), newEntity);
		
		if(DataType.hasUniqueString(newEntity))
		{
			uniqueStringMap.put(newEntity.getUniqueString(), newEntity);
		}
		
		if(DataType.makesReferences(newEntity))
		{
			newEntity.createReferences();
		}
		
		entityCounter++;
	}
	
	@Override
	public void delete(Entity newEntity)
	{
		idMap.remove(newEntity.getID());
		
		if(DataType.hasUniqueString(newEntity))
		{
			uniqueStringMap.remove(newEntity.getUniqueString());
		}
		
		if(DataType.makesReferences(newEntity))
		{
			newEntity.deleteReferences();
		}
	}
}