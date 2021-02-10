package com.zoran_jankov.repairq.data.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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
 * Class Device inherits AbstractEntity class, and represents a device with
 * associated information about that device.
 *
 * @author Zoran Jankov
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "device")
public class Device extends BaseEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "model_id", nullable = false)
    private Model model;

    @Column(name = "serial", nullable = false)
    private String serial;
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<Ticket> tikets;

    @Override
    protected void setFields(InputData data) {
	setModel((Model) data.get(FieldType.MODEL));
	setSerial((String) data.get(FieldType.SERIAL));
    }
}