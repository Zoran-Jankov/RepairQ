package main.java.com.yankov.repair_shop.data;

import java.util.HashMap;

import main.java.com.yankov.repair_shop.data.entity.Entity;

public class DataManager
{	
	public static IndexedData notificationsDataTable = new IndexedDataTable();
	public static IndexedData notificationTypesDataTable = new IndexedDataTable();
	public static IndexedData servicesDataTable = new IndexedDataTable();
	public static IndexedData serviceTypesDataTable = new IndexedDataTable();
	public static IndexedData ticketsDataTable = new IndexedDataTable();
	public static IndexedData statusTypesDataTable = new IndexedDataTable();
	public static IndexedData clientsDataTable = new IndexedDataTable();
	public static IndexedData marketingTypesDataTable = new IndexedDataTable();
	public static IndexedData legalEntitiesDataTable = new IndexedDataTable();
	public static IndexedData devicesDataTable = new IndexedDataTable();
	public static IndexedData modelsDataTable = new IndexedDataTable();
	public static IndexedData deviceTypesDataTable = new IndexedDataTable();
	public static IndexedData brandsDataTable = new IndexedDataTable();
	public static IndexedData usersDataTable = new IndexedDataTable();
	
	private static final HashMap<EntityType, IndexedData> dataTables = new HashMap<EntityType, IndexedData>();
	
	static
	{
		dataTables.put(EntityType.NOTIFICATION, notificationsDataTable);
		dataTables.put(EntityType.NOTIFICATION_TYPE, notificationTypesDataTable);
		dataTables.put(EntityType.SERVICE, servicesDataTable);
		dataTables.put(EntityType.SERVICE_TYPE, serviceTypesDataTable);
		dataTables.put(EntityType.TICKET, ticketsDataTable);
		dataTables.put(EntityType.STATUS, statusTypesDataTable);
		dataTables.put(EntityType.CLIENT, clientsDataTable);
		dataTables.put(EntityType.MARKETING_TYPE, marketingTypesDataTable);
		dataTables.put(EntityType.LEGAL_ENTITY, legalEntitiesDataTable);
		dataTables.put(EntityType.DEVICE, devicesDataTable);
		dataTables.put(EntityType.MODEL, modelsDataTable);
		dataTables.put(EntityType.DEVICE_TYPE, deviceTypesDataTable);
		dataTables.put(EntityType.BRAND, brandsDataTable);
		dataTables.put(EntityType.USER, usersDataTable);
	}
	
	public static IndexedData getDataTable(EntityType dataType)
	{
		return dataTables.get(dataType);
	}
	
	public static Entity getEntity(EntityType dataType, int id)
	{
		return getDataTable(dataType).getEntity(id);
	}
	
	public static Entity getEntity(EntityType dataType, String name)
	{
		return getDataTable(dataType).getEntity(name);
	}

	public static int getEntityCounter(EntityType dataType)
	{
		return getDataTable(dataType).getEntityCounter();
	}

	public static HashMap<String, Entity> getDisplayNameMap(EntityType dataType)
	{
		return getDataTable(dataType).getDisplayNameMap();
	}
	
	public static boolean isDataTableEmpty(EntityType dataType)
	{
		return getEntityCounter(dataType) == 0;
	}

	public static boolean idCollision(EntityType dataType, int id)
	{
		return getDataTable(dataType).idCollision(id);
	}

	public static boolean uniqueStringCollision(EntityType dataType, String displayName)
	{
		return getDataTable(dataType).displayNameCollision(displayName);
	}

	public static void save(Entity newDataElement)
	{
		getDataTable(newDataElement.getEntityType()).save(newDataElement);
	}

	public static void delete(Entity newDataElement)
	{
		getDataTable(newDataElement.getEntityType()).delete(newDataElement);
	}
	
	public static void resetTicketCounter()
	{
		ticketsDataTable.resetEntityCounter();
	}
}