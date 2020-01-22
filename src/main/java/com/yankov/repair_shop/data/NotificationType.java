package main.java.com.yankov.repair_shop.data;

import main.java.com.yankov.repair_shop.data.entity.Notification;
import main.java.com.yankov.repair_shop.data.entity.Ticket;

public enum NotificationType
{
	OPEND,
	TESTED,
	FINISHED,
	CLOSED;

	public void addReference(Notification notification)
	{
		// TODO Auto-generated method stub
	}
	
	public void addReference(Ticket ticket)
	{
		// TODO Auto-generated method stub
	}

	public void removeReference(EntityType entityType, int id)
	{
		// TODO Auto-generated method stub
	}
}