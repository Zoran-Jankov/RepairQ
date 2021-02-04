package com.zoran_jankov.repairq.data.entity;

import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.zoran_jankov.repairq.data.FieldType;
import com.zoran_jankov.repairq.data.embeddable.CreationInfo;
import com.zoran_jankov.repairq.data.embeddable.UpdateInfo;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

/**
 * Abstract class AbstractEntity represents a basic data entity, and it is a
 * superclass for all other data entities in the data structure. All data
 * entities have unique ID number, an (int) field, they inherit that from this
 * class, together with getter and setter method for that field.
 * <p>
 * Field:
 * <p>
 * (int) id - must be unique
 * <p>
 * 
 * @author Zoran Jankov
 */
@Data
@MappedSuperclass
public abstract class AbstractEntity implements Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",
    	    updatable = false,
    	    nullable = false)
    @Setter(AccessLevel.PRIVATE)
    private int id;

    @Embedded
    private CreationInfo creationInfo;
    
    @Embedded
    private UpdateInfo updateInfo;
    
    @SuppressWarnings("unused")
    private AbstractEntity() {}
    
    public AbstractEntity(Map<FieldType, Object> data) {
	setCreationInfo(new CreationInfo(data));
	setUpdateInfo(new UpdateInfo(data));
    }
    
    @Override
    public void update(Map<FieldType, Object> data) {
	updateInfo.update(data);
    }
    
    @Override
    public String getDisplayName() {
	return Integer.toString(id);
    }
}