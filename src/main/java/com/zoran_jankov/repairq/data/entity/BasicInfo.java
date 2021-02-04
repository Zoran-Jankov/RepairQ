package com.zoran_jankov.repairq.data.entity;

import java.util.Map;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import com.zoran_jankov.repairq.data.FieldType;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Class BasicInfo represents a basic information of various entity classes.
 * 
 * @author Zoran Jankov
 */

@Data
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
public abstract class BasicInfo extends AbstractEntity {
    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "description")
    private String description;

    public BasicInfo(Map<FieldType, Object> data) {
	super(data);
	setName((String) data.get(FieldType.NAME));
	setDescription((String) data.get(FieldType.DESCRIPTION));
    }
    
    @Override
    public void update(Map<FieldType, Object> data) {
	super.update(data);
	setName((String) data.get(FieldType.NAME));
	setDescription((String) data.get(FieldType.DESCRIPTION));
    }
    
    @Override
    public String getDisplayName() {
	return name;
    }
}