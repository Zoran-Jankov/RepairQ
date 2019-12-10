package com.repair_shop.gui.panel;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTable;
import javax.swing.table.TableModel;

import com.repair_shop.gui.text.ButtonName;
import com.repair_shop.gui.utility.ButtonFactory;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;

public class DataTablePanel extends JPanel
{
	private static final long serialVersionUID = 3437145568450011870L;
	private JTable tblData = new JTable();
	private JButton btnAddNewData = ButtonFactory.createJButton(ButtonName.ADD_NEW_ENTITY, new Font("Tahoma", Font.PLAIN, 13));

	public DataTablePanel()
	{
		setLayout(new MigLayout("", "[grow]", "[grow][]"));
		
		add(tblData, "cell 0 0,grow");
		
		add(btnAddNewData, "cell 0 1");
	}
	
	public void setTableModel(TableModel dataModel)
	{
		tblData.setModel(dataModel);
	}
	
	public void setButtonNewFunction(ActionListener listener, String buttonText)
	{
		btnAddNewData.setText(buttonText);
		btnAddNewData.addActionListener(listener);
	}
}