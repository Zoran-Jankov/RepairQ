package com.zoran_jankov.repairq.data.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.zoran_jankov.repairq.data.InputData;

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
    public DeviceType(InputData data) {
	super(data);
    }

}