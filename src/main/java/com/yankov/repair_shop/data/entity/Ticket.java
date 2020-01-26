package main.java.com.yankov.repair_shop.data.entity;

import main.java.com.yankov.repair_shop.data.EntityType;
import main.java.com.yankov.repair_shop.data.NotificationType;
import main.java.com.yankov.repair_shop.data.Priority;

public class Ticket extends AbstractEntity
{
	private Priority priority;
	private NotificationType status;
	private Customer customer;
	private Device device;
	
	@Override
	public final EntityType getType()
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
		return customer;
	}

	public void setClient(Customer customer)
	{
		this.customer = customer;
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
		customer.addTicketReferencingCustomer(this);
		device.addTicketReferencingDevice(this);
		status.addReference(this);
	}
	
	@Override
	public void deleteReferences()
	{
		customer.removeTicketReferencingCustomer(this.getId());
		device.removeTicketReferencingDevice(this.getId());
		status.removeReference(EntityType.TICKET, this.getId());
	}
}