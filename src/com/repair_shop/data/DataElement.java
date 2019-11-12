package com.repair_shop.data;

import java.util.HashMap;

public interface DataElement
{
	public DataType getDataType();
	
	public int getID();
	
	public void setId(int id);
	
	public HashMap<Integer, DataElement> getReferenceMap();
	
	public void setReferenceMap(HashMap<Integer, DataElement> referenceMap);
	
	public void addReference(DataElement dataElement);
	
	public void removeReference(int id);
	
	public boolean hasUniqueString();
	
	public String getUniqueString();
	
	public boolean makesReferences();
	
	public void createReferences();
	
	public void deleteReferences();
}
