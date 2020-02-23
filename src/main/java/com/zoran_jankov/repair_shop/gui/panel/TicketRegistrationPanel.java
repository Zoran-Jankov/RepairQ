package main.java.com.zoran_jankov.repair_shop.gui.panel;

import javax.swing.JPanel;
import javax.swing.JTextPane;

import main.java.com.zoran_jankov.repair_shop.gui.text.LabelName;
import main.java.com.zoran_jankov.repair_shop.gui.utility.LabelFactory;
import main.java.com.zoran_jankov.repair_shop.gui.utility.TextPaneFactory;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

public class TicketRegistrationPanel extends JPanel
{
	private static final long serialVersionUID = -7560124269727203908L;
	private JTextPane txtDetails = TextPaneFactory.createJEditorPane();
	
	public TicketRegistrationPanel()
	{
		setLayout(new MigLayout("", "[grow]", "[20px:n][80px:n,grow]"));
		
		JLabel lblDetails = LabelFactory.createJLabel(LabelName.DETAILS, new Font("Tahoma", Font.PLAIN, 13));
		add(lblDetails, "cell 0 0,alignx center,growy");
		
		add(txtDetails, "cell 0 1,grow");
	}
	
	public String getDetails()
	{
		txtDetails.setBackground(Color.WHITE);
		return txtDetails.getText();
	}
	
	public void showDetailsError()
	{
		txtDetails.setBackground(Color.YELLOW);
	}
}