package main.java.com.yankov.repair_shop.data;

import java.util.EnumMap;
import java.util.Map;

import main.java.com.yankov.repair_shop.app.utility.ComboBoxModelManager;
import main.java.com.yankov.repair_shop.data.entity.Entity;
import main.java.com.yankov.repair_shop.data.entity.User;

public class DataManager
{	
	private static final DataManager instance = new DataManager();
	
	private IndexedData notificationsDataTable = new IndexedDataTable();
	private IndexedData notificationTypesDataTable = new IndexedDataTable();
	private IndexedData servicesDataTable = new IndexedDataTable();
	private IndexedData serviceTypesDataTable = new IndexedDataTable();
	private IndexedData ticketsDataTable = new IndexedDataTable();
	private IndexedData statusTypesDataTable = new IndexedDataTable();
	private IndexedData clientsDataTable = new IndexedDataTable();
	private IndexedData marketingTypesDataTable = new IndexedDataTable();
	private IndexedData legalEntitiesDataTable = new IndexedDataTable();
	private IndexedData devicesDataTable = new IndexedDataTable();
	private IndexedData modelsDataTable = new IndexedDataTable();
	private IndexedData deviceTypesDataTable = new IndexedDataTable();
	private IndexedData brandsDataTable = new IndexedDataTable();
	private IndexedData usersDataTable = new IndexedDataTable();
	
	public static User logedinUser;
	
	private static final Map<EntityType, IndexedData> DATA_TABLES = new EnumMap<EntityType, IndexedData>(EntityType.class);
	
	static
	{
		
	}
	
	private DataManager()
	{
		DATA_TABLES.put(EntityType.NOTIFICATION, notificationsDataTable);
		DATA_TABLES.put(EntityType.NOTIFICATION_TYPE, notificationTypesDataTable);
		DATA_TABLES.put(EntityType.SERVICE, servicesDataTable);
		DATA_TABLES.put(EntityType.SERVICE_TYPE, serviceTypesDataTable);
		DATA_TABLES.put(EntityType.TICKET, ticketsDataTable);
		DATA_TABLES.put(EntityType.STATUS, statusTypesDataTable);
		DATA_TABLES.put(EntityType.CUSTOMER, clientsDataTable);
		DATA_TABLES.put(EntityType.MARKETING, marketingTypesDataTable);
		DATA_TABLES.put(EntityType.LEGAL_ENTITY, legalEntitiesDataTable);
		DATA_TABLES.put(EntityType.DEVICE, devicesDataTable);
		DATA_TABLES.put(EntityType.MODEL, modelsDataTable);
		DATA_TABLES.put(EntityType.DEVICE_TYPE, deviceTypesDataTable);
		DATA_TABLES.put(EntityType.BRAND, brandsDataTable);
		DATA_TABLES.put(EntityType.USER, usersDataTable);
	}
	
	public static DataManager accessData()
	{
		return instance;
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
		getDataTable(newEntity.getType()).save(newEntity);
		
		ComboBoxModelManager.updateModel(newEntity);
	}

	public static void delete(Entity newEntity)
	{
		getDataTable(newEntity.getType()).delete(newEntity);
	}
	
	public void resetTicketCounter()
	{
		ticketsDataTable.resetEntityCounter();
	}
}