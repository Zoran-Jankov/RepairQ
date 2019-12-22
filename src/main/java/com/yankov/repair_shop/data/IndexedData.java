package main.java.com.yankov.repair_shop.data;

import java.util.Map;

import main.java.com.yankov.repair_shop.data.entity.Entity;

/**
 * Interface for Indexed Data Table.
 * 
 * @author Zoran Jankov
 */
public interface IndexedData
{
	/**
	 * Getter for the number of saved entities of a certain type.
	 * @return (int) - Number of saved entities.
	 */
	public int getEntityCounter();
	
	public void resetEntityCounter();
	
	public Map<Integer, Entity> getIdMap();
	
	/**
	 * Getter for the display name map.
	 * @return (HashMap<String, Entity>) -  Display name map
	 */
	public Map<String, Entity> getDisplayNameMap();
	
	/**
	 * Getter for specific entity by is's id number.
	 * @param id - Entity id number.
	 * @return Entity
	 */
	public Entity getEntity(int id);
	
	/**
	 * Getter for specific entity by is's display name.
	 * @param displayName - Entity display name.
	 * @return Entity
	 */
	public Entity getEntity(String displayName);
	
	public boolean idCollision(int id);
	
	public boolean displayNameCollision(String displayName);
	
	public void save(Entity newEntity);
	
	public void delete(Entity newEntity);
}