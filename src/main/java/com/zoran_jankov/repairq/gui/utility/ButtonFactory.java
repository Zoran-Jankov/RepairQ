package com.zoran_jankov.repairq.gui.utility;

import java.awt.Font;

import javax.swing.JButton;

public final class ButtonFactory {
    /**
     * @wbp.factory
     * @wbp.factory.parameter.source text "Add"
     * @wbp.factory.parameter.source font new java.awt.Font("Tahoma",
     *                               java.awt.Font.PLAIN, 13)
     */
    public static JButton createJButton(String text, Font font) {
	JButton button = new JButton(text);
	button.setFont(font);
	return button;
    }
}