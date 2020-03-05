package main.java.com.zoran_jankov.repair_shop.data.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import main.java.com.zoran_jankov.repair_shop.data.EntityType;
import main.java.com.zoran_jankov.repair_shop.data.embeddable.CreationInfo;

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
	
	public NotificationType getNotificationType()
	{
		return notificationType;
	}
	
	public void setNotificationType(NotificationType notificationType)
	{
		this.notificationType = notificationType;
	}
	
	public Ticket getTicket()
	{
		return ticket;
	}
	
	public void setTicket(Ticket ticket)
	{
		this.ticket = ticket;
	}
	
	public String getComment()
	{
		return comment;
	}
	
	public void setComment(String notification)
	{
		this.comment = notification;
	}

	public CreationInfo getCrationInfo()
	{
		return crationInfo;
	}

	public void setCrationInfo(CreationInfo crationInfo)
	{
		this.crationInfo = crationInfo;
	}
}