package com.repair_shop.data;

import java.util.HashMap;

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
	public static IndexedData userTypesDataTable = new IndexedDataTable();
	
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
		dataTables.put(DataType.USER_TYPE, userTypesDataTable);
	}
	
	public static IndexedData getDataTable(DataType dataType)
	{
		return dataTables.get(dataType);
	}

	public int getDataElementCounter(DataType dataType)
	{
		return getDataTable(dataType).getDataElementCounter();
	}

	public HashMap<String, DataElement> getUniqueStringMap(DataType dataType)
	{
		return getDataTable(dataType).getUniqueStringMap();
	}

	public DataElement getByID(DataType dataType, int id)
	{
		return getDataTable(dataType).getByID(id);
	}

	public DataElement getByUniqueString(DataType dataType, String uniqueString)
	{
		return getDataTable(dataType).getByUniqueString(uniqueString);
	}

	public boolean idCollision(DataType dataType, int id)
	{
		return getDataTable(dataType).idCollision(id);
	}

	public boolean uniqueStringCollision(DataType dataType, String uniqueString)
	{
		return getDataTable(dataType).uniqueStringCollision(uniqueString);
	}

	public void save(DataElement newDataElement)
	{
		getDataTable(newDataElement.getDataType()).save(newDataElement);
	}

	public void delete(DataElement newDataElement)
	{
		getDataTable(newDataElement.getDataType()).delete(newDataElement);
	}
}