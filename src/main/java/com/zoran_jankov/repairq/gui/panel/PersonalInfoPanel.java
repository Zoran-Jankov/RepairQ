package com.zoran_jankov.repairq.gui.panel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.zoran_jankov.repairq.gui.text.LabelName;
import com.zoran_jankov.repairq.gui.utility.LabelFactory;
import com.zoran_jankov.repairq.gui.utility.TextFieldFactory;

import net.miginfocom.swing.MigLayout;

public class PersonalInfoPanel extends JPanel {
    private static final long serialVersionUID = -1636004925810635460L;
    private JTextField txtFirstName = TextFieldFactory.createJTextField(10);
    private JTextField txtLastName = TextFieldFactory.createJTextField(10);

    public PersonalInfoPanel() {
	setLayout(new MigLayout("", "[][grow]", "[][fill][fill]"));

	JLabel lblPersonalInformation = LabelFactory.createJLabel("Personal Information",
		new Font("Tahoma", Font.BOLD, 13));
	lblPersonalInformation.setHorizontalAlignment(SwingConstants.CENTER);
	add(lblPersonalInformation, "cell 0 0 2 1,grow");

	JLabel lblFirstName = LabelFactory.createJLabel(LabelName.FIRST_NAME, new Font("Tahoma", Font.PLAIN, 13));
	add(lblFirstName, "cell 0 1,growy");

	add(txtFirstName, "cell 1 1,grow");

	JLabel lblLastName = LabelFactory.createJLabel(LabelName.LAST_NAME, new Font("Tahoma", Font.PLAIN, 13));
	add(lblLastName, "cell 0 2,growy");

	add(txtLastName, "cell 1 2,grow");
    }

    public String getFirstName() {
	txtFirstName.setBackground(Color.WHITE);
	return txtFirstName.getText();
    }

    public String getLastName() {
	txtLastName.setBackground(Color.WHITE);
	return txtLastName.getText();
    }

    public void setFirstName(String firstName) {
	txtFirstName.setText(firstName);
    }

    public void setLastName(String lastName) {
	txtLastName.setText(lastName);
    }

    public void showFirstNameError() {
	txtFirstName.setBackground(Color.YELLOW);
    }

    public void showLastNameError() {
	txtLastName.setBackground(Color.YELLOW);
    }
}