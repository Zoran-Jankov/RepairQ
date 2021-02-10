package com.zoran_jankov.repairq.data.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.zoran_jankov.repairq.data.FieldType;
import com.zoran_jankov.repairq.data.InputData;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Class ServiceType extends abstract class Property and represents a the type
 * of a service.
 *
 * @author Zoran Jankov
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "service_type")
public class ServiceType extends BasicInfo {
    @Column(name = "default_price", nullable = false)
    private int defaultPrice;
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<Service> services;
    
    @Override
    protected void setFields(InputData data) {
	super.setFields(data);
	setDefaultPrice((int) data.get(FieldType.PRICE));
    }
}