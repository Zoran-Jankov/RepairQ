package com.repair_shop.data.entity;

import com.repair_shop.data.DataType;

public class Service extends AbstractEntity
{
	private int price;
	private Notification notification;
	private Ticket ticket;
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
	public DataType getDataType()
	{
		return DataType.SERVICE;
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
	
	@Override
	public void createReferences()
	{
		serviceType.addReference(this);
	}
	
	public void deleteReferences()
	{
		serviceType.removeReference(this.getID());
	}
}