package main.java.com.yankov.repair_shop.data;

import java.util.HashMap;
import java.util.Map;

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
	
	private static final Map<EntityType, IndexedData> DATA_TABLES = new HashMap<EntityType, IndexedData>();
	
	static
	{
		DATA_TABLES.put(EntityType.NOTIFICATION, notificationsDataTable);
		DATA_TABLES.put(EntityType.NOTIFICATION_TYPE, notificationTypesDataTable);
		DATA_TABLES.put(EntityType.SERVICE, servicesDataTable);
		DATA_TABLES.put(EntityType.SERVICE_TYPE, serviceTypesDataTable);
		DATA_TABLES.put(EntityType.TICKET, ticketsDataTable);
		DATA_TABLES.put(EntityType.STATUS, statusTypesDataTable);
		DATA_TABLES.put(EntityType.CLIENT, clientsDataTable);
		DATA_TABLES.put(EntityType.MARKETING, marketingTypesDataTable);
		DATA_TABLES.put(EntityType.LEGAL_ENTITY, legalEntitiesDataTable);
		DATA_TABLES.put(EntityType.DEVICE, devicesDataTable);
		DATA_TABLES.put(EntityType.MODEL, modelsDataTable);
		DATA_TABLES.put(EntityType.DEVICE_TYPE, deviceTypesDataTable);
		DATA_TABLES.put(EntityType.BRAND, brandsDataTable);
		DATA_TABLES.put(EntityType.USER, usersDataTable);
	}
	
	public static IndexedData getDataTable(EntityType entityType)
	{
		return DATA_TABLES.get(entityType);
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
	
	public static Map<Integer, Entity>getIdMap(EntityType entityType)
	{
		return getDataTable(entityType).getIdMap();
	}

	public static Map<String, Entity> getDisplayNameMap(EntityType entityType)
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

	public static boolean displayNameCollision(EntityType entityType, String displayName)
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