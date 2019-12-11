package com.repair_shop.app.utility;

import java.util.HashSet;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

import com.repair_shop.data.DataManager;
import com.repair_shop.data.DataType;
import com.repair_shop.gui.text.LabelName;

public class ComboBoxModelFactory 
{
	public static ComboBoxModel<String> getModel(DataType dataType)
	{
		HashSet<String> items = new HashSet<String>();
		items.add(LabelName.NULL_ITEM);
		items.addAll(DataManager.getUniqueStringMap(dataType).keySet());
		
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>
												(items.toArray(new String[0]));
		return model;
	}
}