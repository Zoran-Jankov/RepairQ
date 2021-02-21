package com.zoran_jankov.repairq.gui.panel;

import javax.swing.JPanel;

import com.zoran_jankov.repairq.gui.text.LabelName;

import net.miginfocom.swing.MigLayout;

public class ContactInfoPanel extends JPanel {
    private static final long serialVersionUID = -1636004925810635460L;
    private InputField phoneNumber = new InputField(LabelName.PHONE_NUMBER, true);
    private InputField email = new InputField("Email", false);
    private InputField address = new InputField("Address", false);

    public ContactInfoPanel() {
	setLayout(new MigLayout("", "[grow]", "[20px:n:20px][][][]"));

	add(phoneNumber, "cell 0 1,grow");

	add(email, "cell 0 2,grow");

	add(address, "cell 0 3,grow");
    }

    public String getAddress() {
	return address.getInput();
    }

    public String getEmail() {
	return email.getInput();
    }

    public String getPhoneNumber() {
	return phoneNumber.getInput();
    }
}