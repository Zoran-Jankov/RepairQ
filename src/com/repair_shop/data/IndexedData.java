package com.repair_shop.data;

import java.util.HashMap;

import com.repair_shop.data.entity.Entity;

public interface IndexedData
{
	public int getDataElementCounter();
	
	public HashMap<String, Entity> getUniqueStringMap();
	
	public Entity getByID(int id);
	
	public Entity getByUniqueString(String uniqueString);
	
	public boolean idCollision(int id);
	
	public boolean uniqueStringCollision(String uniqueString);
	
	public void save(Entity newDataElement);
	
	public void delete(Entity newDataElement);
}