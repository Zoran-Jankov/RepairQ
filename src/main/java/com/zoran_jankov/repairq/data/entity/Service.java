package com.zoran_jankov.repairq.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.zoran_jankov.repairq.data.InputData;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "service")
public class Service extends AbstractEntity {
    @Column(name = "price", nullable = false)
    private int price;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "notification_id")
    private Notification notification;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "service_type_id")
    private ServiceType serviceType;

    public Service(InputData data) {
	super(data);
    }

    @Override
    public void update(InputData data) {
	super.basicUpdate(data);
    }
}