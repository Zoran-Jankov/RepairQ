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
import com.zoran_jankov.repairq.data.Priority;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "ticket")
public class Ticket extends BaseEntity {
    @Column(name = "priority")
    private Priority priority;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "status_id", nullable = false)
    private Status status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "device_id", nullable = false)
    private Device device;
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<Service> services;
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<Service> notifications;

    @Override
    protected void setFields(InputData data) {
	setPriority((Priority) data.get(FieldType.PRIORITY));
	setStatus((Status) data.get(FieldType.STATUS));
	setCustomer((Customer) data.get(FieldType.CUSTOMER));
	setDevice((Device) data.get(FieldType.DEVICE));
    }
}