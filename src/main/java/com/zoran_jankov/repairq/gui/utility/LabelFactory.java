package com.zoran_jankov.repairq.gui.utility;

import java.awt.Font;

import javax.swing.JLabel;

public final class LabelFactory {
    /**
     * @wbp.factory
     * @wbp.factory.parameter.source font new java.awt.Font("Tahoma",
     *                               java.awt.Font.PLAIN, 13)
     */
    public static JLabel createJLabel(String text, Font font) {
	JLabel label = new JLabel(text);
	label.setFont(font);
	return label;
    }
}