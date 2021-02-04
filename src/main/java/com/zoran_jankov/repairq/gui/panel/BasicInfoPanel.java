package com.zoran_jankov.repairq.gui.panel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import com.zoran_jankov.repairq.gui.text.LabelName;
import com.zoran_jankov.repairq.gui.utility.LabelFactory;
import com.zoran_jankov.repairq.gui.utility.TextFieldFactory;
import com.zoran_jankov.repairq.gui.utility.TextPaneFactory;

import net.miginfocom.swing.MigLayout;

public class BasicInfoPanel extends JPanel {
    private static final long serialVersionUID = 5315153141202094448L;
    private JTextField txtName = TextFieldFactory.createJTextField(10);
    private JTextPane txtDescription = TextPaneFactory.createJEditorPane();

    public BasicInfoPanel() {
	setLayout(new MigLayout("", "[][grow]", "[20px:n,fill][10px:n][][grow]"));

	JLabel lblName = LabelFactory.createJLabel(LabelName.NAME, new Font("Tahoma", Font.PLAIN, 13));
	add(lblName, "cell 0 0");

	add(txtName, "cell 1 0,grow");

	JLabel lblDescription = LabelFactory.createJLabel(LabelName.DESCRIPTION, new Font("Tahoma", Font.PLAIN, 13));
	add(lblDescription, "cell 0 2,growy");

	add(txtDescription, "cell 0 3 2 1,grow");
    }

    public String getDescription() {
	return txtDescription.getText();
    }

    public String getPropertyName() {
	txtName.setBackground(Color.WHITE);
	return txtName.getText();
    }

    public void showNameError() {
	txtName.setBackground(Color.YELLOW);
    }
}