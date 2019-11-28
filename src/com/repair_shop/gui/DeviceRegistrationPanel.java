package com.repair_shop.gui;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import javax.swing.JButton;

public class DeviceRegistrationPanel extends JPanel
{
	private static final long serialVersionUID = -4810443150610740707L;
	private JComboBox<String> cmbDeviceType = new JComboBox<String>();
	private JComboBox<String> cmbBrand = new JComboBox<String>();
	private JComboBox<String> cmbModel = new JComboBox<String>();
	private JButton btnNewModel = ButtonFactory.createJButton("New Model", new Font("Tahoma", Font.PLAIN, 13));
	private JTextField txtSerial = TextFieldFactory.createJTextField(10);;

	public DeviceRegistrationPanel()
	{
		setLayout(new MigLayout("", "[][grow]", "[25px:n][25px:n][25px:n][25px:n][25px:n]"));
		
		JLabel lblDeviceType = LabelFactory.createJLabel("Device Type", new Font("Tahoma", Font.PLAIN, 13));
		add(lblDeviceType, "cell 0 0,growy");
		
		add(cmbDeviceType, "cell 1 0,grow");
		
		JLabel lblBrand = LabelFactory.createJLabel("Brand", new Font("Tahoma", Font.PLAIN, 13));
		add(lblBrand, "cell 0 1,growy");
		
		add(cmbBrand, "cell 1 1,grow");
		
		JLabel lblModel = LabelFactory.createJLabel("Model", new Font("Tahoma", Font.PLAIN, 13));
		add(lblModel, "cell 0 2,growy");
		
		add(cmbModel, "cell 1 2,growx");
		
		add(btnNewModel, "cell 1 3,alignx center,growy");
		
		JLabel lblSerial = LabelFactory.createJLabel("Serial", new Font("Tahoma", Font.PLAIN, 13));
		add(lblSerial, "cell 0 4,growy");
		
		add(txtSerial, "cell 1 4,grow");
	}
}