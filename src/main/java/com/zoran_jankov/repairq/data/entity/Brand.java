package com.zoran_jankov.repairq.data.entity;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.zoran_jankov.repairq.data.EntityType;
import com.zoran_jankov.repairq.data.FieldType;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Class Brand represents a device brand.
 * 
 * @author Zoran Jankov
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "brand")
public class Brand extends BasicInfo {
    
    public Brand(Map<FieldType, Object> data) {
	super(data);
    }
    
    @Override
    public final EntityType getType() {
	return EntityType.BRAND;
    }
}