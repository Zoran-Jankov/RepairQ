package com.repair_shop.gui;
import javax.swing.JButton;
import java.awt.Font;

public final class ButtonFactory
{
	/**
	 * @wbp.factory
	 * @wbp.factory.parameter.source text "Add"
	 * @wbp.factory.parameter.source font new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13)
	 */
	public static JButton createJButton(String text, Font font)
	{
		JButton button = new JButton(text);
		button.setFont(font);
		return button;
	}
}