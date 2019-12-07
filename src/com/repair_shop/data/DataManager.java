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
	
	public static Entity getDataElement(DataType dataType, int id)
	{
		return getByID(dataType, id);
	}
	
	public static Entity getDataElement(DataType dataType, String name)
	{
		return getByUniqueString(dataType, name);
	}

	public static int getDataElementCounter(DataType dataType)
	{
		return getDataTable(dataType).getDataElementCounter();
	}

	public static HashMap<String, Entity> getUniqueStringMap(DataType dataType)
	{
		return getDataTable(dataType).getUniqueStringMap();
	}

	public static Entity getByID(DataType dataType, int id)
	{
		return getDataTable(dataType).getByID(id);
	}

	public static Entity getByUniqueString(DataType dataType, String uniqueString)
	{
		return getDataTable(dataType).getByUniqueString(uniqueString);
	}
	
	public static boolean isDataTableEmpty(DataType dataType)
	{
		return getDataElementCounter(dataType) == 0;
	}

	public static boolean idCollision(DataType dataType, int id)
	{
		return getDataTable(dataType).idCollision(id);
	}

	public static boolean uniqueStringCollision(DataType dataType, String uniqueString)
	{
		return getDataTable(dataType).uniqueStringCollision(uniqueString);
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