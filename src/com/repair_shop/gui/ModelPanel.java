package com.repair_shop.gui;

import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class ModelPanel extends JPanel
{
	private static final long serialVersionUID = -5345042248892559454L;
	private JComboBox<String> cmbDeviceType = new JComboBox<String>();
	private JButton btnNewDeviceType = ButtonFactory.createJButton("New Device Type", new Font("Tahoma", Font.PLAIN, 13));
	private JComboBox<String> cmbBrand = new JComboBox<String>();
	private JButton btnNewBrand = ButtonFactory.createJButton("New Brand", new Font("Tahoma", Font.PLAIN, 13));
	
	public ModelPanel()
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
}