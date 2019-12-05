package com.repair_shop.gui;

import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;

public class ModelRegistrationPanel extends JPanel
{
	private static final long serialVersionUID = -5345042248892559454L;
	private JComboBox<String> cmbDeviceType = new JComboBox<String>();
	private JButton btnNewDeviceType = ButtonFactory.createJButton("New Device Type", new Font("Tahoma", Font.PLAIN, 13));
	private JComboBox<String> cmbBrand = new JComboBox<String>();
	private JButton btnNewBrand = ButtonFactory.createJButton("New Brand", new Font("Tahoma", Font.PLAIN, 13));
	
	public ModelRegistrationPanel()
	{
		setLayout(new MigLayout("", "[][grow][]", "[20px:n][20px:n]"));
		
		JLabel lblDeviceType = LabelFactory.createJLabel("Device Type", new Font("Tahoma", Font.PLAIN, 13));
		add(lblDeviceType, "cell 0 0,growy");
		add(cmbDeviceType, "cell 1 0,grow");
		add(btnNewDeviceType, "cell 2 0,growx");
		
		JLabel lblBrand = LabelFactory.createJLabel("Brand", new Font("Tahoma", Font.PLAIN, 13));
		add(lblBrand, "cell 0 1,growy");
		add(cmbBrand, "cell 1 1,grow");
		add(btnNewBrand, "cell 2 1,growx");
	}
	
	public String getDeviceType()
	{
		cmbDeviceType.setBackground(Color.WHITE);
		return (String) cmbDeviceType.getSelectedItem();
	}
	
	public void setDeviceType(String item)
	{
		cmbDeviceType.setBackground(Color.WHITE);
		cmbDeviceType.setSelectedItem(item);
	}
	
	public void setDeviceTypeCmbModel(ComboBoxModel<String> model)
	{
		cmbDeviceType.setModel(model);
	}
	
	public void setBtnNewDeviceTypeActionlistener(ActionListener listener)
	{
		btnNewDeviceType.addActionListener(listener);
	}
	
	public String getBrand()
	{
		cmbBrand.setBackground(Color.WHITE);
		return (String) cmbBrand.getSelectedItem();
	}
	
	public void setBrand(String item)
	{
		cmbBrand.setBackground(Color.WHITE);
		cmbBrand.setSelectedItem(item);
	}
	
	public void setBrandCmbModel(ComboBoxModel<String> model)
	{
		cmbBrand.setModel(model);
	}
	
	public void setBtnNewBrandActionlistener(ActionListener listener)
	{
		btnNewBrand.addActionListener(listener);
	}
	
	public void showDeviceTypeError()
	{
		cmbDeviceType.setBackground(Color.YELLOW);
	}
	
	public void showBrandError()
	{
		cmbBrand.setBackground(Color.YELLOW);
	}
}