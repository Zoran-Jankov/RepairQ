package com.zoran_jankov.repairq.gui.utility;

import javax.swing.JComboBox;

public final class ComboBoxFactory {
    /**
     * @wbp.factory
     */
    public static JComboBox<String> createJComboBox() {
	JComboBox<String> comboBox = new JComboBox<String>();
	return comboBox;
    }
}