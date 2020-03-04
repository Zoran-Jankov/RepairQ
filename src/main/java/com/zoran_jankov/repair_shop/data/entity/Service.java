package main.java.com.zoran_jankov.repair_shop.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import main.java.com.zoran_jankov.repair_shop.data.EntityType;

@Entity
@Table(name = "service")
public class Service extends AbstractEntity
{
	@Column(name = "price")
	private int price;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id")
	private Notification notification;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id")
	private Ticket ticket;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id")
	private ServiceType serviceType;
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(int price)
	{
		this.price = price;
	}
	
	@Override
	public EntityType getType()
	{
		return EntityType.SERVICE;
	}
	
	public Notification getNotification()
	{
		return notification;
	}

	public void setNotification(Notification notification)
	{
		this.notification = notification;
	}
	
	public Ticket getTicket()
	{
		return ticket;
	}

	public void setTicket(Ticket ticket)
	{
		this.ticket = ticket;
	}

	public ServiceType getServiceType()
	{
		return serviceType;
	}

	public void setServiceType(ServiceType serviceType)
	{
		this.serviceType = serviceType;
	}
}