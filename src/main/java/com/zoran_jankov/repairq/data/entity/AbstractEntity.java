package com.zoran_jankov.repairq.data.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.zoran_jankov.repairq.data.DataManager;
import com.zoran_jankov.repairq.data.embeddable.CreationInfo;
import com.zoran_jankov.repairq.data.embeddable.UpdateInfo;

import lombok.Getter;

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
@MappedSuperclass
public abstract class AbstractEntity implements Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    @Getter
    private int id;

    @Embedded
    private CreationInfo creationInfo;
    
    @Embedded
    private UpdateInfo updateInfo;
    
    public AbstractEntity() {
	User owner = DataManager.accessData().getLoggedInUser();
	this.creationInfo = new CreationInfo(owner, LocalDateTime.now());
	this.updateInfo = new UpdateInfo();
    }
    
    @Override
    public String getDisplayName() {
	return Integer.toString(id);
    }
}