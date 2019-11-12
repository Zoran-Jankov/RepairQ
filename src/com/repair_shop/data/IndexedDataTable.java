package com.repair_shop.data;

import java.util.HashMap;

public class IndexedDataTable implements IndexedData
{
	private int dataElementCounter = 1;
	private HashMap<Integer, DataElement> idMap = new HashMap<Integer, DataElement>();
	private HashMap<String, DataElement> uniqueStringMap = new HashMap<String, DataElement>();
	
	@Override
	public int getDataElementCounter()
	{
		return dataElementCounter;
	}
	
	@Override
	public HashMap<String, DataElement> getUniqueStringMap()
	{
		return uniqueStringMap;
	}
	
	@Override
	public DataElement getByID(int id)
	{
		return idMap.get(id);
	}
	
	@Override
	public DataElement getByUniqueString(String uniqueString)
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
	public void save(DataElement newDataElement)
	{
		idMap.put(newDataElement.getID(), newDataElement);
		
		if(newDataElement.hasUniqueString())
		{
			uniqueStringMap.put(newDataElement.getUniqueString(), newDataElement);
		}
		
		if(newDataElement.makesReferences())
		{
			newDataElement.createReferences();
		}
		
		dataElementCounter++;
	}
	
	@Override
	public void delete(DataElement newDataElement)
	{
		idMap.remove(newDataElement.getID());
		
		if(newDataElement.hasUniqueString())
		{
			uniqueStringMap.remove(newDataElement.getUniqueString());
		}
		
		if(newDataElement.makesReferences())
		{
			newDataElement.deleteReferences();
		}
	}
}