package main.java.com.yankov.repair_shop.data;

import java.util.HashMap;

import main.java.com.yankov.repair_shop.app.utility.ComboBoxModelManager;
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
		dataTables.put(EntityType.MARKETING, marketingTypesDataTable);
		dataTables.put(EntityType.LEGAL_ENTITY, legalEntitiesDataTable);
		dataTables.put(EntityType.DEVICE, devicesDataTable);
		dataTables.put(EntityType.MODEL, modelsDataTable);
		dataTables.put(EntityType.DEVICE_TYPE, deviceTypesDataTable);
		dataTables.put(EntityType.BRAND, brandsDataTable);
		dataTables.put(EntityType.USER, usersDataTable);
	}
	
	public static IndexedData getDataTable(EntityType entityType)
	{
		return dataTables.get(entityType);
	}
	
	public static Entity getEntity(EntityType entityType, int id)
	{
		return getDataTable(entityType).getEntity(id);
	}
	
	public static Entity getEntity(EntityType entityType, String name)
	{
		return getDataTable(entityType).getEntity(name);
	}

	public static int getEntityCounter(EntityType entityType)
	{
		return getDataTable(entityType).getEntityCounter();
	}
	
	public static HashMap<Integer, Entity>getIdMap(EntityType entityType)
	{
		return getDataTable(entityType).getIdMap();
	}

	public static HashMap<String, Entity> getDisplayNameMap(EntityType entityType)
	{
		return getDataTable(entityType).getDisplayNameMap();
	}
	
	public static boolean isDataTableEmpty(EntityType entityType)
	{
		return getEntityCounter(entityType) == 0;
	}

	public static boolean idCollision(EntityType entityType, int id)
	{
		return getDataTable(entityType).idCollision(id);
	}

	public static boolean uniqueStringCollision(EntityType entityType, String displayName)
	{
		return getDataTable(entityType).displayNameCollision(displayName);
	}

	public static void save(Entity newEntity)
	{
		getDataTable(newEntity.getEntityType()).save(newEntity);
		
		ComboBoxModelManager.updateModel(newEntity);
	}

	public static void delete(Entity newEntity)
	{
		getDataTable(newEntity.getEntityType()).delete(newEntity);
	}
	
	public static void resetTicketCounter()
	{
		ticketsDataTable.resetEntityCounter();
	}
}