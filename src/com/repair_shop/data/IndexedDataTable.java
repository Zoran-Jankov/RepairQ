package com.repair_shop.data;

import java.util.HashMap;

public class IndexedDataTable
{
	private int dataElementCounter = 1;
	private HashMap<Integer, DataElement> idMap = new HashMap<Integer, DataElement>();
	private HashMap<String, DataElement> uniqueStringMap = new HashMap<String, DataElement>();
	
	public int getDataElementCounter()
	{
		return dataElementCounter;
	}
	
	public HashMap<String, DataElement> getUniqueStringMap()
	{
		return uniqueStringMap;
	}
	
	public DataElement getByID(int id)
	{
		return idMap.get(id);
	}
	
	public DataElement getByUniqueString(String uniqueString)
	{
		return uniqueStringMap.get(uniqueString);
	}
	
	public boolean idCollision(int id)
	{
		return idMap.containsKey(id);
	}

	public boolean uniqueStringCollision(String uniqueString)
	{
		return uniqueStringMap.containsKey(uniqueString);
	}

	public void save(DataElement newDataElement)
	{
		idMap.put(newDataElement.getID(), newDataElement);
		
		if(newDataElement.hasUniqueString())
		{
			uniqueStringMap.put(newDataElement.getUniqueString(), newDataElement);
		}
		
		if(newDataElement.isReferencable())
		{
			newDataElement.createReferences();
		}
		
		dataElementCounter++;
	}
	
	public void delete(DataElement newDataElement)
	{
		idMap.remove(newDataElement.getID());
		
		if(newDataElement.hasUniqueString())
		{
			uniqueStringMap.remove(newDataElement.getUniqueString());
		}
		
		if(newDataElement.isReferencable())
		{
			newDataElement.deleteReferences();
		}
	}
}