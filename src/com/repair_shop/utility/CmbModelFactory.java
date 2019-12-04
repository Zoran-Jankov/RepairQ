package com.repair_shop.utility;

import java.util.HashSet;

import javax.swing.DefaultComboBoxModel;

import com.repair_shop.data.DataManager;
import com.repair_shop.data.DataType;

public class CmbModelFactory 
{
	public static DefaultComboBoxModel<String> getModel(DataType dataType)
	{
		HashSet<String> items = new HashSet<String>();
		items.add("");
		items.addAll(DataManager.getUniqueStringMap(dataType).keySet());
		
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>
												(items.toArray(new String[0]));
		return model;
	}
}