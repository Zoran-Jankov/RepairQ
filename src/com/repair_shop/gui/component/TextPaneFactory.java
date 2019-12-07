package com.repair_shop.gui.component;

import javax.swing.JTextPane;

public final class TextPaneFactory
{
	/**
	 * @wbp.factory
	 */
	public static JTextPane createJEditorPane()
	{
		JTextPane textPane = new JTextPane();
		return textPane;
	}
}