package com.zoran_jankov.repairq.data.entity;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.zoran_jankov.repairq.data.EntityType;
import com.zoran_jankov.repairq.data.FieldType;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Class DeviceType represents a device type.
 * 
 * @author Zoran Jankov
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "device_type")
public class DeviceType extends BasicInfo {
    public DeviceType(Map<FieldType, Object> data) {
	super(data);
    }
    
    @Override
    public EntityType getType() {
	return EntityType.DEVICE_TYPE;
    }
}