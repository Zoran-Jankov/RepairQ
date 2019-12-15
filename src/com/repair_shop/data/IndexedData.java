package com.repair_shop.data;

import java.util.HashMap;

import com.repair_shop.data.entity.Entity;

public interface IndexedData
{
	public int getEntityCounter();
	
	public HashMap<String, Entity> getDisplayNameMap();
	
	public Entity getEntity(int id);
	
	public Entity getEntity(String displayName);
	
	public boolean idCollision(int id);
	
	public boolean displayNameCollision(String displayName);
	
	public void save(Entity newEntity);
	
	public void delete(Entity newEntity);
}