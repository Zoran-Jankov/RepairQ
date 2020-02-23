package main.java.com.zoran_jankov.repair_shop.data.entity;

import main.java.com.zoran_jankov.repair_shop.data.EntityType;
import main.java.com.zoran_jankov.repair_shop.data.reference.EntityReference;

/**
 * Interface for all entities in the data structure.
 * 
 * @author Zoran Jankov
 */
public interface Entity
{
	public EntityType getType();
	
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
	
	public EntityReference getReference();
	
	public void setReference(EntityReference entityReference);
	
	/**
	 * Adds references in the entities that are referenced in this entity.
	 */
	public void createReferences();
	
	/**
	 * Removes references in the entities that are referenced in this entity.
	 */
	public void deleteReferences();
	
	/**
	 * Getter for entity display name used in user interface.
	 * @return (String) Display name for user interface.
	 */
	public String getDisplayName();
}