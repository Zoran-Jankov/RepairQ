package main.java.com.zoran_jankov.repair_shop.gui.utility;

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