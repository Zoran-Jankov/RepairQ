package com.repair_shop.gui.component;

import javax.swing.JComboBox;

public final class ComboBoxFactory
{
	/**
	 * @wbp.factory
	 */
	public static JComboBox<String> createJComboBox()
	{
		JComboBox<String> comboBox = new JComboBox<String>();
		return comboBox;
	}
}