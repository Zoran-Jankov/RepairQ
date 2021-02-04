package com.zoran_jankov.repairq.data.entity;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.zoran_jankov.repairq.data.EntityType;
import com.zoran_jankov.repairq.data.FieldType;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Class Model represents a device model with associated information about that
 * model.
 *
 * @author Zoran Jankov
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "model")
public class Model extends BasicInfo {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "device_type_id", nullable = false)
    private DeviceType deviceType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brand_id", nullable = false)
    private Brand brand;
    
    public Model(Map<FieldType, Object> data) {
	super(data);
	setDeviceType((DeviceType) data.get(FieldType.DEVICE_TYPE));
	setBrand((Brand) data.get(FieldType.BRAND));
    }

    @Override
    public final EntityType getType() {
	return EntityType.MODEL;
    }
}