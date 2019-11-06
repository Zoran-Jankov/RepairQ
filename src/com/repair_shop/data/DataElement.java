package com.repair_shop.data;

import java.util.HashMap;

public interface DataElement
{
	public int getID();
	
	public void setID(int id);
	
	public HashMap<Integer, DataElement> getReferenceMap();
	
	public void setReferenceMap(HashMap<Integer, DataElement> referenceMap);
	
	public void addReference(DataElement dataElement);
	
	public void removeReference(int id);
	
	public abstract boolean hasUniqueString();
	
	public String getUniqueString();
	
	public abstract boolean isReferencable();
	
	public void createReferences();
	
	public void deleteReferences();
}
