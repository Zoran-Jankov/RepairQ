package com.zoran_jankov.repairq.gui.dialog;

import java.awt.Window;

import javax.swing.JDialog;

import com.zoran_jankov.repairq.gui.panel.ContactInfoPanel;
import com.zoran_jankov.repairq.gui.panel.IdPanel;
import com.zoran_jankov.repairq.gui.panel.InputButtonPanel;
import com.zoran_jankov.repairq.gui.panel.PersonalInfoPanel;
import com.zoran_jankov.repairq.gui.text.WindowTitleUtils;

import net.miginfocom.swing.MigLayout;

public class CustomerRegistrationDialog extends JDialog implements InputDialog {
    private static final long serialVersionUID = -394107433140693140L;
    private IdPanel idPanel = new IdPanel();
    private PersonalInfoPanel personalInfoPanel = new PersonalInfoPanel();
    private ContactInfoPanel contactInfoPanel = new ContactInfoPanel();
    private InputButtonPanel buttonPanel = new InputButtonPanel();

    public CustomerRegistrationDialog(Window owner) {
	super(owner);

	setResizable(false);
	setTitle(WindowTitleUtils.NEW_CLIENT);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	getContentPane().setLayout(new MigLayout("", "[]", "[][][][][][]"));

	getContentPane().add(idPanel, "cell 0 0,grow");

	getContentPane().add(personalInfoPanel, "cell 0 1,grow");

	getContentPane().add(contactInfoPanel, "cell 0 2,grow");

	getContentPane().add(buttonPanel, "cell 0 5,grow");

	pack();
	this.setVisible(true);
    }

    public IdPanel getIdPanel() {
	return idPanel;
    }

    public InputButtonPanel getInputButtonPanel() {
	return buttonPanel;
    }

    public PersonalInfoPanel getPersonalInfoPanel() {
	return personalInfoPanel;
    }
}