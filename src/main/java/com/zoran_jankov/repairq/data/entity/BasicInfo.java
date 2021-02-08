package com.zoran_jankov.repairq.data.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import com.zoran_jankov.repairq.data.FieldType;
import com.zoran_jankov.repairq.data.InputData;

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

    @Column(name = "description", nullable = true, unique = false)
    private String description;
    
    @Override
    public void initialize(InputData data) {
	super.initialize(data);
	setFields(data);
    }

    @Override
    public void update(InputData data) {
	super.update(data);
	setFields(data);
    }
    
    private void setFields(InputData data) {
	setName((String) data.get(FieldType.NAME));
	setDescription((String) data.get(FieldType.DESCRIPTION));
    }
    
    @Override
    public String getDisplayName() {
	return name;
    }
}