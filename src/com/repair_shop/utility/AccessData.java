package com.repair_shop.utility;

import java.util.HashMap;

import com.repair_shop.data.IndexedDataTable;

public class AccessData
{	
	public static IndexedDataTable notificationsDataTable = new IndexedDataTable();
	public static IndexedDataTable notificationTypesDataTable = new IndexedDataTable();
	public static IndexedDataTable servicesDataTable = new IndexedDataTable();
	public static IndexedDataTable serviceTypesDataTable = new IndexedDataTable();
	public static IndexedDataTable ticketsDataTable = new IndexedDataTable();
	public static IndexedDataTable statusTypesDataTable = new IndexedDataTable();
	public static IndexedDataTable clientsDataTable = new IndexedDataTable();
	public static IndexedDataTable marketingTypesDataTable = new IndexedDataTable();
	public static IndexedDataTable legalEntitiesDataTable = new IndexedDataTable();
	public static IndexedDataTable devicesDataTable = new IndexedDataTable();
	public static IndexedDataTable modelsDataTable = new IndexedDataTable();
	public static IndexedDataTable deviceTypesDataTable = new IndexedDataTable();
	public static IndexedDataTable brandsDataTable = new IndexedDataTable();
	public static IndexedDataTable usersDataTable = new IndexedDataTable();
	public static IndexedDataTable userTypesDataTable = new IndexedDataTable();
	
	private static final HashMap<DataType, IndexedDataTable> dataTables = new HashMap<DataType, IndexedDataTable>();
	
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
	
	public static IndexedDataTable getDataTable(DataType dataType)
	{
		return dataTables.get(dataType);
	}
}