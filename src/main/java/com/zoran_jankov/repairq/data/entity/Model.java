package com.zoran_jankov.repairq.data.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.zoran_jankov.repairq.data.FieldType;
import com.zoran_jankov.repairq.data.InputData;

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
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<Device> devices;
    
    @Override
    protected void setFields(InputData data) {
	super.setFields(data);
	setDeviceType((DeviceType) data.get(FieldType.DEVICE_TYPE));
	setBrand((Brand) data.get(FieldType.BRAND));
    }
}