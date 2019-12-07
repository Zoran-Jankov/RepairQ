package com.repair_shop.gui.panel;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

import com.repair_shop.gui.component.ButtonFactory;
import com.repair_shop.gui.component.LabelFactory;

import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import com.repair_shop.gui.component.ComboBoxFactory;

public class SelectionPanel extends JPanel
{
	private static final long serialVersionUID = 6173599805523082955L;
	private JComboBox<String> cmbDataElement = ComboBoxFactory.createJComboBox();
	private JLabel lblDataElementDetails = LabelFactory.createJLabel("Data Element details", new Font("Tahoma", Font.PLAIN, 13));
	private final JButton btnNewDataElement = ButtonFactory.createJButton("New", new Font("Tahoma", Font.PLAIN, 13));
	
	public SelectionPanel()
	{
		setLayout(new MigLayout("", "[grow][]", "[][][100px:n]"));
		
		JLabel lblDataElement = LabelFactory.createJLabel("Data Element", new Font("Tahoma", Font.BOLD, 13));
		lblDataElement.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblDataElement, "cell 0 0 2 1,grow");
		
		add(cmbDataElement, "cell 0 1,grow");
		
		add(btnNewDataElement, "cell 1 1,grow");
		
		lblDataElementDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(lblDataElementDetails, "cell 0 2 2 1,grow");
	}
	
	public String getDataElement()
	{
		cmbDataElement.setBackground(Color.WHITE);
		return (String) cmbDataElement.getSelectedItem();
	}
	
	public void setDataElement(String item)
	{
		cmbDataElement.setBackground(Color.WHITE);
		cmbDataElement.setSelectedItem(item);
	}
	
	public void setDataElementCmbModel(ComboBoxModel<String> model)
	{
		cmbDataElement.setModel(model);
	}
	
	public void setBtnNewDataElement(ActionListener listener)
	{
		btnNewDataElement.addActionListener(listener);
	}
	
	public void showDataElementError()
	{
		cmbDataElement.setBackground(Color.YELLOW);
	}
}