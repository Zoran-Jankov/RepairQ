package com.repair_shop.gui;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JEditorPane;

public class TicketRegistrationPanel extends JPanel
{
	private static final long serialVersionUID = -7560124269727203908L;
	private JEditorPane txtDetails = new JEditorPane();
	private JEditorPane txtImportantNotes = new JEditorPane();
	
	public TicketRegistrationPanel()
	{
		setLayout(new MigLayout("", "[grow]", "[20px:n][80px:n,grow][20px:n][50px:n:80px,grow]"));
		
		JLabel lblDetails = LabelFactory.createJLabel("Details", new Font("Tahoma", Font.PLAIN, 13));
		add(lblDetails, "cell 0 0,alignx center,growy");
		
		add(txtDetails, "cell 0 1,grow");
		
		JLabel lblImportantNotes = LabelFactory.createJLabel("Important Notes", new Font("Tahoma", Font.PLAIN, 13));
		add(lblImportantNotes, "cell 0 2,alignx center,growy");
		
		add(txtImportantNotes, "cell 0 3,grow");
	}
	
	public String getDetails()
	{
		txtDetails.setBackground(Color.WHITE);
		return txtDetails.getText();
	}
	
	public String getImportantNotes()
	{
		return txtImportantNotes.getText();
	}
	
	public void showDetailsError()
	{
		txtDetails.setBackground(Color.YELLOW);
	}
}