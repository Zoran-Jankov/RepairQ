package main.java.com.yankov.repair_shop.data.entity;

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