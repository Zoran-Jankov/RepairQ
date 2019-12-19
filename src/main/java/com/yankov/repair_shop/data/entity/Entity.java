package main.java.com.yankov.repair_shop.data.entity;

import java.util.HashMap;

import main.java.com.yankov.repair_shop.data.EntityType;

/**
 * Interface for all entities in the data structure.
 * 
 * @author Zoran Jankov
 */
public interface Entity
{
	/**
	 * Returns the entity type.
	 * @return (enum) type oF entity.
	 */
	public EntityType getEntityType();
	
	/**
	 * Getter for data entity ID number.
	 * @return (int) Data element ID number.
	 */
	public int getId();
	
	/**
	 * Setter for data entity ID number.
	 * @param (int) id - Data element ID number.
	 */
	public void setId(int id);
	
	/**
	 * Getter for entity reference map.
	 * @return (HashMap<Integer, Entity>) Entity reference map.
	 */
	public HashMap<Integer, Entity> getReferenceMap();
	
	/**
	 * Setter for entity reference map.
	 * @param referenceMap -  Entity reference map.
	 */
	public void setReferenceMap(HashMap<Integer, Entity> referenceMap);
	
	
	/**
	 * Add an entity to this entity reference map.
	 * @param entity - A entity that is referencing this entity.
	 */
	public void addReference(Entity entity);
	
	/**
	 * Removes an entity to this entity reference map.
	 * @param id - referenced entity id number
	 */
	public void removeReference(int id);
	
	/**
	 * Getter for entity display name used in user interface.
	 * @return (String) Display name for user interface.
	 */
	public String getDisplayName();
	
	/**
	 * Adds references in the entities that are referenced in this entity.
	 */
	public void createReferences();
	
	/**
	 * Removes references in the entities that are referenced in this entity.
	 */
	public void deleteReferences();
}