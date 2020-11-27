package com.zoran_jankov.repairq.gui.panel;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.zoran_jankov.repairq.gui.text.LabelName;
import com.zoran_jankov.repairq.gui.utility.LabelFactory;

import net.miginfocom.swing.MigLayout;

public class IdPanel extends JPanel {
    private static final long serialVersionUID = -7708177867098774117L;
    private JLabel lblIDValue = LabelFactory.createJLabel("0-123456789", new Font("Tahoma", Font.BOLD, 13));

    public IdPanel() {
	setLayout(new MigLayout("", "[20px:n][][grow][][grow]", "[20px:n]"));

	JLabel lblID = LabelFactory.createJLabel("ID", new Font("Tahoma", Font.PLAIN, 13));
	add(lblID, "cell 0 0 0 1,growy");

	add(lblIDValue, "cell 2 0,grow");

	JLabel lblRequiredFields = LabelFactory.createJLabel(LabelName.REQUIRED_FIELDS,
		new Font("Tahoma", Font.PLAIN, 13));
	add(lblRequiredFields, "cell 4 0,alignx right,growy");
    }

    public void setIdValue(String id) {
	lblIDValue.setText(id);
    }
}