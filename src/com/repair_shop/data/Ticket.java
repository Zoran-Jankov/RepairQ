package com.repair_shop.data;

public class Ticket extends AbstractDataElement
{
	private int priority;
	private Client client;
	private Device device;
	private Status status;
	
	@Override
	public DataType getDataType()
	{
		return DataType.TICKET;
	}
	
	public int getPriority()
	{
		return priority;
	}

	public void setPriority(int priority)
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
		client.removeReference(this.getID());
		device.removeReference(this.getID());
		status.removeReference(this.getID());
	}
}