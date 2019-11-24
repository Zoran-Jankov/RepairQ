package com.repair_shop.gui;
import javax.swing.JLabel;
import java.awt.Font;

public final class LabelFactory
{
	/**
	 * @wbp.factory
	 * @wbp.factory.parameter.source font new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13)
	 */
	public static JLabel createJLabel(String text, Font font)
	{
		JLabel label = new JLabel(text);
		label.setFont(font);
		return label;
	}
}