package com.zoran_jankov.repairq.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.zoran_jankov.repairq.data.FieldType;
import com.zoran_jankov.repairq.data.InputData;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "notification")
public class Notification extends AbstractEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "notification_type_id", nullable = false)
    private NotificationType notificationType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ticket_id", nullable = false)
    private Ticket ticket;

    @Column(name = "comment")
    private String comment;

    @Override
    public void initialize(InputData data) {
	super.initialize(data);
	setTicket((Ticket) data.get(FieldType.TICKET));
	setComment((String) data.get(FieldType.COMMENT));
    }

    @Override
    public void update(InputData data) {
	super.update(data);
	setTicket((Ticket) data.get(FieldType.TICKET));
	setComment((String) data.get(FieldType.COMMENT));
    }
}