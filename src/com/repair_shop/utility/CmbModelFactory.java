package com.repair_shop.utility;

import javax.swing.DefaultComboBoxModel;

public class CmbModelFactory 
{
	public static DefaultComboBoxModel<String> getModel(DataType dataType)
	{
		String[] items = (String[]) AccessData.getDataTable(dataType)
											  .getUniqueStringMap()
											  .keySet().toArray();
		
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>(items);
		return model;
	}
}