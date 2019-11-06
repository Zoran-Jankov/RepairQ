package com.repair_shop.data;

public class Ticket extends DataElement
{
	private int priority;
	private Client client;
	private Device device;
	private Property status;
	
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

	public Property getStatus()
	{
		return status;
	}

	public void setStatus(Property status)
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

	@Override
	public boolean hasUniqueString()
	{
		return false;
	}

	@Override
	public boolean isReferencable()
	{
		return true;
	}
}