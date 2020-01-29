package main.java.com.yankov.repair_shop.data;

import java.util.EnumMap;
import java.util.Map;

import main.java.com.yankov.repair_shop.app.utility.ComboBoxModelManager;
import main.java.com.yankov.repair_shop.data.entity.Entity;
import main.java.com.yankov.repair_shop.data.entity.User;

public class DataManager
{	
	private static final DataManager instance = new DataManager();
		
	public User logedinUser;
	
	private final Map<EntityType, IndexedData> DATA_TABLES = new EnumMap<EntityType, IndexedData>(EntityType.class);
	
	private DataManager(){}
	
	public static DataManager accessData()
	{
		return instance;
	}
	
	public IndexedData getDataTable(EntityType entityType)
	{
		return DATA_TABLES.get(entityType);
	}
	
	public Entity getEntity(EntityType entityType, int id)
	{
		return getDataTable(entityType).getEntity(id);
	}
	
	public Entity getEntity(EntityType entityType, String name)
	{
		return getDataTable(entityType).getEntity(name);
	}

	public int getEntityCounter(EntityType entityType)
	{
		return getDataTable(entityType).getEntityCounter();
	}
	
	public Map<Integer, Entity>getIdMap(EntityType entityType)
	{
		return getDataTable(entityType).getIdMap();
	}

	public Map<String, Entity> getDisplayNameMap(EntityType entityType)
	{
		return getDataTable(entityType).getDisplayNameMap();
	}
	
	public boolean isDataTableEmpty(EntityType entityType)
	{
		return getEntityCounter(entityType) == 0;
	}

	public boolean idCollision(EntityType entityType, int id)
	{
		return getDataTable(entityType).idCollision(id);
	}

	public boolean displayNameCollision(EntityType entityType, String displayName)
	{
		return getDataTable(entityType).displayNameCollision(displayName);
	}

	public void save(Entity newEntity)
	{
		getDataTable(newEntity.getType()).save(newEntity);
		
		ComboBoxModelManager.updateModel(newEntity);
	}

	public void delete(Entity newEntity)
	{
		getDataTable(newEntity.getType()).delete(newEntity);
	}
	
	public void resetTicketCounter()
	{
		getDataTable(EntityType.TICKET).resetEntityCounter();
	}
}