package com.repair_shop.data.entity;

import java.util.HashMap;

import com.repair_shop.data.DataType;

public interface Entity
{
	public DataType getDataType();
	
	public int getID();
	
	public void setId(int id);
	
	public HashMap<Integer, Entity> getReferenceMap();
	
	public void setReferenceMap(HashMap<Integer, Entity> referenceMap);
	
	public void addReference(Entity dataElement);
	
	public void removeReference(int id);
	
	public String getDisplayName();
	
	public void createReferences();
	
	public void deleteReferences();
}