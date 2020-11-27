package com.zoran_jankov.repairq.gui.panel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import com.zoran_jankov.repairq.gui.text.LabelName;
import com.zoran_jankov.repairq.gui.utility.LabelFactory;
import com.zoran_jankov.repairq.gui.utility.TextPaneFactory;

import net.miginfocom.swing.MigLayout;

public class TicketRegistrationPanel extends JPanel {
    private static final long serialVersionUID = -7560124269727203908L;
    private JTextPane txtDetails = TextPaneFactory.createJEditorPane();

    public TicketRegistrationPanel() {
	setLayout(new MigLayout("", "[grow]", "[20px:n][80px:n,grow]"));

	JLabel lblDetails = LabelFactory.createJLabel(LabelName.DETAILS, new Font("Tahoma", Font.PLAIN, 13));
	add(lblDetails, "cell 0 0,alignx center,growy");

	add(txtDetails, "cell 0 1,grow");
    }

    public String getDetails() {
	txtDetails.setBackground(Color.WHITE);
	return txtDetails.getText();
    }

    public void showDetailsError() {
	txtDetails.setBackground(Color.YELLOW);
    }
}