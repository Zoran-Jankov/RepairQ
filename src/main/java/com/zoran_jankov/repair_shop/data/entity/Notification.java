package main.java.com.zoran_jankov.repair_shop.data.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import main.java.com.zoran_jankov.repair_shop.data.EntityType;

@Entity
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
	private LocalDate timestamp;
	
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
	
	public LocalDate getDate()
	{
		return timestamp;
	}
	
	public void setDate(LocalDate localDate)
	{
		this.timestamp = localDate;
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