package com.repair_shop.data;

import java.util.HashMap;

import com.repair_shop.data.entity.Entity;

public interface IndexedData
{
	public int getEntityCounter();
	
	public HashMap<String, Entity> getUniqueStringMap();
	
	public Entity getEntity(int id);
	
	public Entity getEntity(String uniqueString);
	
	public boolean idCollision(int id);
	
	public boolean uniqueStringCollision(String uniqueString);
	
	public void save(Entity newEntity);
	
	public void delete(Entity newEntity);
}