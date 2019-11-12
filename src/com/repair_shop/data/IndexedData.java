package com.repair_shop.data;

import java.util.HashMap;

public interface IndexedData
{
	public int getDataElementCounter();
	
	public HashMap<String, DataElement> getUniqueStringMap();
	
	public DataElement getByID(int id);
	
	public DataElement getByUniqueString(String uniqueString);
	
	public boolean idCollision(int id);
	
	public boolean uniqueStringCollision(String uniqueString);
	
	public void save(DataElement newDataElement);
	
	public void delete(DataElement newDataElement);
}
