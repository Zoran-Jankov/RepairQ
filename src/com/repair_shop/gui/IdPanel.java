package com.repair_shop.gui;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;

public class IdPanel extends JPanel
{
	private static final long serialVersionUID = -7708177867098774117L;
	private JLabel lblIDValue = LabelFactory.createJLabel("0-123456789", new Font("Tahoma", Font.PLAIN, 13));
	
	public IdPanel()
	{
		setLayout(new MigLayout("", "[][][][][][]", "[]"));
		
		JLabel lblID = LabelFactory.createJLabel("ID", new Font("Tahoma", Font.PLAIN, 13));
		add(lblID, "cell 0 0 0 1,growy");
		
		add(lblIDValue, "cell 2 0,grow");
	}
	
	public void setIdValue(String id)
	{
		lblIDValue.setText(id);
	}
}