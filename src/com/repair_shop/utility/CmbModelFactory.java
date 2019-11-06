package com.repair_shop.utility;

import javax.swing.DefaultComboBoxModel;

public class CmbModelFactory 
{
	public static DefaultComboBoxModel<String> getModel(byte type)
	{
		String[] items = (String[]) AccessData.getDataTable(type)
												   .getUniqueStringMap()
												   .keySet().toArray();
		
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>(items);
		return model;
	}
}