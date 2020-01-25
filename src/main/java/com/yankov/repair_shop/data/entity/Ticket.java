package main.java.com.yankov.repair_shop.data.entity;

import main.java.com.yankov.repair_shop.data.EntityType;
import main.java.com.yankov.repair_shop.data.NotificationType;
import main.java.com.yankov.repair_shop.data.Priority;

public class Ticket extends AbstractEntity
{
	private Priority priority;
	private NotificationType status;
	private Customer client;
	private Device device;
	
	@Override
	public EntityType getEntityType()
	{
		return EntityType.TICKET;
	}
	
	public Priority getPriority()
	{
		return priority;
	}

	public void setPriority(Priority priority)
	{
		this.priority = priority;
	}
	
	public NotificationType getStatus()
	{
		return status;
	}

	public void setStatus(NotificationType status)
	{
		this.status = status;
	}

	public Customer getClient()
	{
		return client;
	}

	public void setClient(Customer client)
	{
		this.client = client;
	}

	public Device getDevice()
	{
		return device;
	}

	public void setDevice(Device device)
	{
		this.device = device;
	}
	
	@Override
	public void createReferences()
	{
		client.addReference(this);
		device.addReference(this);
		status.addReference(this);
	}
	
	@Override
	public void deleteReferences()
	{
		client.removeReference(this.getId());
		device.removeReference(this.getId());
		status.removeReference(EntityType.TICKET, this.getId());
	}
}