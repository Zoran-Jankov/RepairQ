package main.java.com.zoran_jankov.repair_shop.data.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import main.java.com.zoran_jankov.repair_shop.data.EntityType;

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
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id", nullable = false)
	private User user;
	
	@Column(name = "timestamp")
	private LocalDateTime timestamp;
	
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
	
	public User getUser()
	{
		return user;
	}
	
	public void setUser(User user)
	{
		this.user = user;
	}
	
	public LocalDateTime getDate()
	{
		return timestamp;
	}
	
	public void setDate(LocalDateTime timestamp)
	{
		this.timestamp = timestamp;
	}
	
	public String getComment()
	{
		return comment;
	}
	
	public void setComment(String notification)
	{
		this.comment = notification;
	}
}