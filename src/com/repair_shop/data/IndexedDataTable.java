package com.repair_shop.data;

import java.util.HashMap;

import com.repair_shop.data.entity.Entity;

public class IndexedDataTable implements IndexedData
{
	private int dataElementCounter = 1;
	private HashMap<Integer, Entity> idMap = new HashMap<Integer, Entity>();
	private HashMap<String, Entity> uniqueStringMap = new HashMap<String, Entity>();
	
	@Override
	public int getDataElementCounter()
	{
		return dataElementCounter;
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
	public void save(Entity newDataElement)
	{
		idMap.put(newDataElement.getID(), newDataElement);
		
		if(DataType.hasUniqueString(newDataElement))
		{
			uniqueStringMap.put(newDataElement.getUniqueString(), newDataElement);
		}
		
		if(DataType.makesReferences(newDataElement))
		{
			newDataElement.createReferences();
		}
		
		dataElementCounter++;
	}
	
	@Override
	public void delete(Entity newDataElement)
	{
		idMap.remove(newDataElement.getID());
		
		if(DataType.hasUniqueString(newDataElement))
		{
			uniqueStringMap.remove(newDataElement.getUniqueString());
		}
		
		if(DataType.makesReferences(newDataElement))
		{
			newDataElement.deleteReferences();
		}
	}
}