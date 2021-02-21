package com.zoran_jankov.repairq.gui.panel;

import javax.swing.JPanel;

import com.zoran_jankov.repairq.gui.utility.LabelFactory;

import net.miginfocom.swing.MigLayout;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class SelectionInputPanel extends JPanel {
    private static final long serialVersionUID = -8659307830152494997L;

    /**
     * Create the panel.
     */
    public SelectionInputPanel(String fieldName) {
    	setLayout(new MigLayout("", "[][]", "[20px:n,fill]"));
    	
    	JLabel lblFeildName = LabelFactory.createJLabel(fieldName, new Font("Tahoma", Font.PLAIN, 13));
	add(lblFeildName, "cell 0 0,grow");
    	
    	JLabel requiredField = LabelFactory.createJLabel("*", new Font("Tahoma", Font.BOLD, 16));
	requiredField.setForeground(Color.RED);

    }
}