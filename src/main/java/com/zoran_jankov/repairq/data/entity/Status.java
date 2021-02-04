package com.zoran_jankov.repairq.data.entity;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.zoran_jankov.repairq.data.EntityType;
import com.zoran_jankov.repairq.data.FieldType;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "status")
public class Status extends BasicInfo {
    public Status(Map<FieldType, Object> data) {
	super(data);
    }
    
    @Override
    public EntityType getType() {
	return EntityType.NOTIFICATION;
    }
}