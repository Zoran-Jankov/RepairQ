package com.repair_shop.data;

import java.util.HashMap;

import com.repair_shop.data.entity.Entity;

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
	
	private static final HashMap<DataType, IndexedData> dataTables = new HashMap<DataType, IndexedData>();
	
	static
	{
		dataTables.put(DataType.NOTIFICATION, notificationsDataTable);
		dataTables.put(DataType.NOTIFICATION_TYPE, notificationTypesDataTable);
		dataTables.put(DataType.SERVICE, servicesDataTable);
		dataTables.put(DataType.SERVICE_TYPE, serviceTypesDataTable);
		dataTables.put(DataType.TICKET, ticketsDataTable);
		dataTables.put(DataType.STATUS, statusTypesDataTable);
		dataTables.put(DataType.CLIENT, clientsDataTable);
		dataTables.put(DataType.MARKETING_TYPE, marketingTypesDataTable);
		dataTables.put(DataType.LEGAL_ENTITY, legalEntitiesDataTable);
		dataTables.put(DataType.DEVICE, devicesDataTable);
		dataTables.put(DataType.MODEL, modelsDataTable);
		dataTables.put(DataType.DEVICE_TYPE, deviceTypesDataTable);
		dataTables.put(DataType.BRAND, brandsDataTable);
		dataTables.put(DataType.USER, usersDataTable);
	}
	
	public static IndexedData getDataTable(DataType dataType)
	{
		return dataTables.get(dataType);
	}
	
	public static Entity getEntity(DataType dataType, int id)
	{
		return getDataTable(dataType).getEntity(id);
	}
	
	public static Entity getEntity(DataType dataType, String name)
	{
		return getDataTable(dataType).getEntity(name);
	}

	public static int getEntityCounter(DataType dataType)
	{
		return getDataTable(dataType).getEntityCounter();
	}

	public static HashMap<String, Entity> getDisplayNameMap(DataType dataType)
	{
		return getDataTable(dataType).getDisplayNameMap();
	}
	
	public static boolean isDataTableEmpty(DataType dataType)
	{
		return getEntityCounter(dataType) == 0;
	}

	public static boolean idCollision(DataType dataType, int id)
	{
		return getDataTable(dataType).idCollision(id);
	}

	public static boolean uniqueStringCollision(DataType dataType, String displayName)
	{
		return getDataTable(dataType).displayNameCollision(displayName);
	}

	public static void save(Entity newDataElement)
	{
		getDataTable(newDataElement.getDataType()).save(newDataElement);
	}

	public static void delete(Entity newDataElement)
	{
		getDataTable(newDataElement.getDataType()).delete(newDataElement);
	}
}