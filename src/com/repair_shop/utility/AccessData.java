package com.repair_shop.utility;

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
	
	private static final IndexedDataTable[] dataTables = 
	{
			notificationsDataTable,
			notificationTypesDataTable,
			servicesDataTable,
			serviceTypesDataTable,
			ticketsDataTable,
			statusTypesDataTable,
			clientsDataTable,
			marketingTypesDataTable,
			legalEntitiesDataTable,
			devicesDataTable,
			modelsDataTable,
			deviceTypesDataTable,
			brandsDataTable,
			usersDataTable,
			userTypesDataTable
	};
	
	public static IndexedDataTable getDataTable(byte table)
	{
		return dataTables[table];
	}
}