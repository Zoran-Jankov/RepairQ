package com.zoran_jankov.repairq.data.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.zoran_jankov.repairq.data.EntityType;
import com.zoran_jankov.repairq.data.embeddable.CreationInfo;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "notification")
public class Notification extends AbstractEntity
{
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id", nullable = false)
	private NotificationType notificationType;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id", nullable = false)
	private Ticket ticket;
	
	@Embedded
	private CreationInfo crationInfo;
	
	@Column(name = "comment")
	private String comment;
	
	@Override
	public EntityType getType()
	{
		return EntityType.NOTIFICATION;
	}
}