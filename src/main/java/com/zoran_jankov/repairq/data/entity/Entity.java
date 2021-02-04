package com.zoran_jankov.repairq.data.entity;

import java.util.Map;

import com.zoran_jankov.repairq.data.EntityType;
import com.zoran_jankov.repairq.data.FieldType;

/**
 * Interface for all entities in the data structure.
 * 
 * @author Zoran Jankov
 */
public interface Entity {
    
    
    /**
     * Getter for data entity ID number.
     * 
     * @return (int) Data element ID number.
     */
    public int getId();

    /**
     * Getter for entity display name used in user interface.
     * 
     * @return (String) Display name for user interface.
     */
    public String getDisplayName();
    
    public void update(Map<FieldType, Object> data);
    
    /**
     * Getter for data entity type.
     * 
     * @return (EntityType) Entity Type Enum.
     */
    public EntityType getType();
}