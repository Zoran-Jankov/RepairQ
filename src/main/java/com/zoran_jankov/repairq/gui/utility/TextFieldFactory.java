package com.zoran_jankov.repairq.gui.utility;

import javax.swing.JTextField;

public final class TextFieldFactory
{
	/**
	 * @wbp.factory
	 * @wbp.factory.parameter.source columns 10
	 */
	public static JTextField createJTextField(int columns)
	{
		JTextField textField = new JTextField();
		textField.setColumns(columns);
		return textField;
	}
}