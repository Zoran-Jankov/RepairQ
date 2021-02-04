package com.zoran_jankov.repairq.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.zoran_jankov.repairq.data.InputData;
import com.zoran_jankov.repairq.data.Priority;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "ticket")
public class Ticket extends AbstractEntity {
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

    public Ticket(InputData data) {
	super(data);
    }

    @Override
    public void update(InputData data) {
	super.basicUpdate(data);
    }
}