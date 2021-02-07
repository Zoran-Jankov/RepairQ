package com.zoran_jankov.repairq.data.entity;

import com.zoran_jankov.repairq.data.InputData;

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

    public void update(InputData data);
    
    /**
     * Getter for entity display name used in user interface.
     *
     * @return (String) Display name for user interface.
     */
    public String getDisplayName();
}