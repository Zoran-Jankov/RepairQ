package main.java.com.yankov.repair_shop.app.utility;

import java.util.HashMap;
import java.util.HashSet;

import javax.swing.DefaultComboBoxModel;

import main.java.com.yankov.repair_shop.data.DataManager;
import main.java.com.yankov.repair_shop.data.EntityType;
import main.java.com.yankov.repair_shop.gui.text.LabelName;

public class ComboBoxModelFactory
{
	public static DefaultComboBoxModel<String> NOTIFICATION_TYPE = loadModel(EntityType.NOTIFICATION_TYPE);
	public static DefaultComboBoxModel<String> SERVICE_TYPE = loadModel(EntityType.SERVICE_TYPE);
	public static DefaultComboBoxModel<String> TICKET = loadModel(EntityType.TICKET);
	public static DefaultComboBoxModel<String> STATUS = loadModel(EntityType.STATUS);
	public static DefaultComboBoxModel<String> CLIENT = loadModel(EntityType.CLIENT);
	public static DefaultComboBoxModel<String> MARKETING_TYPE = loadModel(EntityType.MARKETING_TYPE);
	public static DefaultComboBoxModel<String> DEVICE = loadModel(EntityType.DEVICE);
	public static DefaultComboBoxModel<String> MODEL = loadModel(EntityType.MODEL);
	public static DefaultComboBoxModel<String> DEVICE_TYPE = loadModel(EntityType.DEVICE_TYPE);
	public static DefaultComboBoxModel<String> BRAND = loadModel(EntityType.BRAND);
	public static DefaultComboBoxModel<String> USER = loadModel(EntityType.USER);
	
	private static HashMap<EntityType, DefaultComboBoxModel<String>> modelsMap = new HashMap<EntityType, DefaultComboBoxModel<String>>();
	
	static
	{
		modelsMap.put(EntityType.NOTIFICATION_TYPE, NOTIFICATION_TYPE);
		modelsMap.put(EntityType.SERVICE_TYPE, SERVICE_TYPE);
		modelsMap.put(EntityType.TICKET, TICKET);
		modelsMap.put(EntityType.STATUS, STATUS);
		modelsMap.put(EntityType.CLIENT, CLIENT);
		modelsMap.put(EntityType.MARKETING_TYPE, MARKETING_TYPE);
		modelsMap.put(EntityType.DEVICE, DEVICE);
		modelsMap.put(EntityType.MODEL, MODEL);
		modelsMap.put(EntityType.DEVICE_TYPE, DEVICE_TYPE);
		modelsMap.put(EntityType.BRAND, BRAND);
		modelsMap.put(EntityType.USER, USER);
	}
	
	
	public static DefaultComboBoxModel<String> loadModel(EntityType dataType)
	{
		HashSet<String> items = new HashSet<String>
								   (DataManager.getDisplayNameMap(dataType).keySet());
		
		if(items.isEmpty())
		{
			items.add(LabelName.NULL_ITEM);
		}
		
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>
												(items.toArray(new String[0]));
		return model;
	}
	
	public static void updateModel(EntityType dataType, String item)
	{
		modelsMap.get(dataType).addElement(item);
		modelsMap.get(dataType).setSelectedItem(item);
	}
}