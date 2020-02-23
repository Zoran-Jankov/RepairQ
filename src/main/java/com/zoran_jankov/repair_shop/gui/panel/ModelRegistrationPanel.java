package main.java.com.zoran_jankov.repair_shop.gui.panel;

import javax.swing.JPanel;

import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

import main.java.com.zoran_jankov.repair_shop.gui.text.ButtonName;
import main.java.com.zoran_jankov.repair_shop.gui.text.LabelName;
import main.java.com.zoran_jankov.repair_shop.gui.utility.ButtonFactory;
import main.java.com.zoran_jankov.repair_shop.gui.utility.ComboBoxFactory;
import main.java.com.zoran_jankov.repair_shop.gui.utility.LabelFactory;
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
	private JComboBox<String> cmbDeviceType = ComboBoxFactory.createJComboBox();
	private JButton btnNewDeviceType = ButtonFactory.createJButton(ButtonName.DEVICE_TYPE, new Font("Tahoma", Font.PLAIN, 13));
	private JComboBox<String> cmbBrand = ComboBoxFactory.createJComboBox();
	private JButton btnNewBrand = ButtonFactory.createJButton(ButtonName.BRAND, new Font("Tahoma", Font.PLAIN, 13));
	
	public ModelRegistrationPanel()
	{
		setLayout(new MigLayout("", "[][grow][]", "[20px:n:20px][20px:n:20px]"));
		
		JLabel lblDeviceType = LabelFactory.createJLabel(LabelName.DEVICE_TYPE, new Font("Tahoma", Font.PLAIN, 13));
		add(lblDeviceType, "cell 0 0,growy");
		
		AutoCompleteDecorator.decorate(cmbDeviceType);
		add(cmbDeviceType, "cell 1 0,grow");
		
		add(btnNewDeviceType, "cell 2 0,growx");
		
		JLabel lblBrand = LabelFactory.createJLabel(LabelName.BRAND, new Font("Tahoma", Font.PLAIN, 13));
		add(lblBrand, "cell 0 1,growy");
		
		AutoCompleteDecorator.decorate(cmbBrand);
		add(cmbBrand, "cell 1 1,grow");
		
		add(btnNewBrand, "cell 2 1,growx");
	}
	
	public String getDeviceType()
	{
		cmbDeviceType.setBackground(Color.WHITE);
		return (String) cmbDeviceType.getSelectedItem();
	}
	
	public void setDeviceType(ComboBoxModel<String> model)
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
	
	public void setBrand(ComboBoxModel<String> model)
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