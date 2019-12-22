package main.java.com.yankov.repair_shop.app.utility;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

import main.java.com.yankov.repair_shop.data.DataManager;
import main.java.com.yankov.repair_shop.data.EntityType;
import main.java.com.yankov.repair_shop.data.entity.Entity;
import main.java.com.yankov.repair_shop.gui.text.LabelName;

public class ComboBoxModelManager
{
	public static ComboBoxModel<String> NOTIFICATION_TYPE = loadModel(EntityType.NOTIFICATION_TYPE);
	public static ComboBoxModel<String> SERVICE_TYPE = loadModel(EntityType.SERVICE_TYPE);
	public static ComboBoxModel<String> TICKET = loadModel(EntityType.TICKET);
	public static ComboBoxModel<String> STATUS = loadModel(EntityType.STATUS);
	public static ComboBoxModel<String> CLIENT = loadModel(EntityType.CLIENT);
	public static ComboBoxModel<String> MARKETING = loadModel(EntityType.MARKETING);
	public static ComboBoxModel<String> DEVICE = loadModel(EntityType.DEVICE);
	public static ComboBoxModel<String> MODEL = loadModel(EntityType.MODEL);
	public static ComboBoxModel<String> DEVICE_TYPE = loadModel(EntityType.DEVICE_TYPE);
	public static ComboBoxModel<String> BRAND = loadModel(EntityType.BRAND);
	public static ComboBoxModel<String> USER = loadModel(EntityType.USER);
	
	private static Map<EntityType, ComboBoxModel<String>> MODELS_MAP = new EnumMap<EntityType, ComboBoxModel<String>>(EntityType.class);
	
	static
	{
		MODELS_MAP.put(EntityType.NOTIFICATION_TYPE, NOTIFICATION_TYPE);
		MODELS_MAP.put(EntityType.SERVICE_TYPE, SERVICE_TYPE);
		MODELS_MAP.put(EntityType.TICKET, TICKET);
		MODELS_MAP.put(EntityType.STATUS, STATUS);
		MODELS_MAP.put(EntityType.CLIENT, CLIENT);
		MODELS_MAP.put(EntityType.MARKETING, MARKETING);
		MODELS_MAP.put(EntityType.DEVICE, DEVICE);
		MODELS_MAP.put(EntityType.MODEL, MODEL);
		MODELS_MAP.put(EntityType.DEVICE_TYPE, DEVICE_TYPE);
		MODELS_MAP.put(EntityType.BRAND, BRAND);
		MODELS_MAP.put(EntityType.USER, USER);
	}
	
	
	public static ComboBoxModel<String> loadModel(EntityType entityType)
	{
		Set<String> items = new HashSet<String>();
		
		items.add(LabelName.NULL_ITEM);
		
		if(EntityType.hasDisplayName(entityType))
		{
			items.addAll(getDisplayNameSet(entityType));
		}
		else
		{
			items.addAll(getIdSet(entityType));
		}
		
		ComboBoxModel<String> model = new DefaultComboBoxModel<String>
												(items.toArray(new String[0]));
		return model;
	}
	
	private static Set<String> getIdSet(EntityType entityType)
	{
		Set<Integer> idSet = DataManager.getIdMap(entityType).keySet();
		Set<String> dispalyNames = new HashSet<String>();
		
		for(Integer id : idSet)
		{
			dispalyNames.add(id.toString());
		}
		
		return dispalyNames;
	}

	private static Set<String> getDisplayNameSet(EntityType entityType)
	{
		return DataManager.getDisplayNameMap(entityType).keySet();
	}

	public static void updateModel(Entity newEntity)
	{
		EntityType entityType = newEntity.getEntityType();
		String item = newEntity.getDisplayName();
		
        ((DefaultComboBoxModel<String>) MODELS_MAP.get(entityType)).addElement(item);
		MODELS_MAP.get(entityType).setSelectedItem(item);
	}
}