package com.repair_shop.data.entity;

import com.repair_shop.data.DataType;

public class Ticket extends AbstractEntity
{
	private Priority priority;
	private Client client;
	private Device device;
	private Status status;
	
	@Override
	public DataType getDataType()
	{
		return DataType.TICKET;
	}
	
	public Priority getPriority()
	{
		return priority;
	}

	public void setPriority(Priority priority)
	{
		this.priority = priority;
	}

	public Client getClient()
	{
		return client;
	}

	public void setClient(Client client)
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

	public Status getStatus()
	{
		return status;
	}

	public void setStatus(Status status)
	{
		this.status = status;
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
		status.removeReference(this.getId());
	}
}