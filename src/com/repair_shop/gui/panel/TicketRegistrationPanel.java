package com.repair_shop.gui.panel;

import javax.swing.JPanel;
import javax.swing.JTextPane;

import com.repair_shop.gui.text.LabelName;
import com.repair_shop.gui.utility.LabelFactory;
import com.repair_shop.gui.utility.TextPaneFactory;

import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

public class TicketRegistrationPanel extends JPanel
{
	private static final long serialVersionUID = -7560124269727203908L;
	private JTextPane txtDetails = TextPaneFactory.createJEditorPane();
	private JTextPane txtImportantNotes = TextPaneFactory.createJEditorPane();
	
	public TicketRegistrationPanel()
	{
		setLayout(new MigLayout("", "[grow]", "[20px:n][80px:n,grow][20px:n][50px:n:80px,grow]"));
		
		JLabel lblDetails = LabelFactory.createJLabel(LabelName.DETAILS, new Font("Tahoma", Font.PLAIN, 13));
		add(lblDetails, "cell 0 0,alignx center,growy");
		
		add(txtDetails, "cell 0 1,grow");
		
		JLabel lblImportantNotes = LabelFactory.createJLabel(LabelName.IMPORTANT_NOTES, new Font("Tahoma", Font.PLAIN, 13));
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