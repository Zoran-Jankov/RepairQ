package com.repair_shop.gui.panel;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTable;

import com.repair_shop.gui.component.ButtonFactory;

import javax.swing.JButton;
import java.awt.Font;

public class DataTablePanel extends JPanel
{
	private static final long serialVersionUID = 3437145568450011870L;
	private JTable tblData = new JTable();
	private JButton btnAddNewData = ButtonFactory.createJButton("Add New Data", new Font("Tahoma", Font.PLAIN, 13));

	public DataTablePanel()
	{
		setLayout(new MigLayout("", "[grow]", "[grow][]"));
		
		add(tblData, "cell 0 0,grow");
		
		add(btnAddNewData, "cell 0 1");
	}
}