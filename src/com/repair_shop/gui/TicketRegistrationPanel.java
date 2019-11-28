package com.repair_shop.gui;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JEditorPane;

public class TicketRegistrationPanel extends JPanel
{
	private static final long serialVersionUID = -7560124269727203908L;
	
	public TicketRegistrationPanel()
	{
		setLayout(new MigLayout("", "[grow]", "[][::120px,grow]"));
		
		JLabel lblDetails = LabelFactory.createJLabel("Malfunction", new Font("Tahoma", Font.PLAIN, 13));
		add(lblDetails, "cell 0 0,alignx center,growy");
		
		JEditorPane editorPane = new JEditorPane();
		add(editorPane, "cell 0 1,grow");
		
	}
}