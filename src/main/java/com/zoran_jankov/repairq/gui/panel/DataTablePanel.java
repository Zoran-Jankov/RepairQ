package com.zoran_jankov.repairq.gui.panel;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableModel;

import com.zoran_jankov.repairq.gui.text.ButtonName;
import com.zoran_jankov.repairq.gui.utility.ButtonFactory;

import net.miginfocom.swing.MigLayout;

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