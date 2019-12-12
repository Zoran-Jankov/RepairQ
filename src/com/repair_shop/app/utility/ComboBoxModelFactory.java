package com.repair_shop.app.utility;

import java.util.HashMap;
import java.util.HashSet;

import javax.swing.DefaultComboBoxModel;

import com.repair_shop.data.DataManager;
import com.repair_shop.data.DataType;

import com.repair_shop.gui.text.LabelName;

public class ComboBoxModelFactory
{
	public static DefaultComboBoxModel<String> NOTIFICATION_TYPE = loadModel(DataType.NOTIFICATION_TYPE);
	public static DefaultComboBoxModel<String> SERVICE_TYPE = loadModel(DataType.SERVICE_TYPE);
	public static DefaultComboBoxModel<String> TICKET = loadModel(DataType.TICKET);
	public static DefaultComboBoxModel<String> STATUS = loadModel(DataType.STATUS);
	public static DefaultComboBoxModel<String> CLIENT = loadModel(DataType.CLIENT);
	public static DefaultComboBoxModel<String> MARKETING_TYPE = loadModel(DataType.MARKETING_TYPE);
	public static DefaultComboBoxModel<String> DEVICE = loadModel(DataType.DEVICE);
	public static DefaultComboBoxModel<String> MODEL = loadModel(DataType.MODEL);
	public static DefaultComboBoxModel<String> DEVICE_TYPE = loadModel(DataType.DEVICE_TYPE);
	public static DefaultComboBoxModel<String> BRAND = loadModel(DataType.BRAND);
	public static DefaultComboBoxModel<String> USER = loadModel(DataType.USER);
	
	private static HashMap<DataType, DefaultComboBoxModel<String>> modelsMap = new HashMap<DataType, DefaultComboBoxModel<String>>();
	
	static
	{
		modelsMap.put(DataType.NOTIFICATION_TYPE, NOTIFICATION_TYPE);
		modelsMap.put(DataType.SERVICE_TYPE, SERVICE_TYPE);
		modelsMap.put(DataType.TICKET, TICKET);
		modelsMap.put(DataType.STATUS, STATUS);
		modelsMap.put(DataType.CLIENT, CLIENT);
		modelsMap.put(DataType.MARKETING_TYPE, MARKETING_TYPE);
		modelsMap.put(DataType.DEVICE, DEVICE);
		modelsMap.put(DataType.MODEL, MODEL);
		modelsMap.put(DataType.DEVICE_TYPE, DEVICE_TYPE);
		modelsMap.put(DataType.BRAND, BRAND);
		modelsMap.put(DataType.USER, USER);
	}
	
	
	public static DefaultComboBoxModel<String> loadModel(DataType dataType)
	{
		HashSet<String> items = new HashSet<String>
								   (DataManager.getUniqueStringMap(dataType).keySet());
		
		if(items.isEmpty())
		{
			items.add(LabelName.NULL_ITEM);
		}
		
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>
												(items.toArray(new String[0]));
		return model;
	}
	
	public static void updateModel(DataType dataType)
	{
		if(modelsMap.get(dataType) != null)
		{
			loadModel(dataType);
		}
	}
}