package main.java.com.yankov.repair_shop.gui.panel;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

import main.java.com.yankov.repair_shop.gui.text.ButtonName;
import main.java.com.yankov.repair_shop.gui.text.LabelName;
import main.java.com.yankov.repair_shop.gui.utility.ButtonFactory;
import main.java.com.yankov.repair_shop.gui.utility.ComboBoxFactory;
import main.java.com.yankov.repair_shop.gui.utility.LabelFactory;
import main.java.com.yankov.repair_shop.gui.utility.TextFieldFactory;

import javax.swing.ComboBoxModel;
import javax.swing.JButton;

public class DeviceRegistrationPanel extends JPanel
{
	private static final long serialVersionUID = -4810443150610740707L;
	private JComboBox<String> cmbDeviceType = ComboBoxFactory.createJComboBox();
	private JComboBox<String> cmbBrand = ComboBoxFactory.createJComboBox();
	private JComboBox<String> cmbModel = ComboBoxFactory.createJComboBox();
	private JButton btnNewModel = ButtonFactory.createJButton(ButtonName.MODEL, new Font("Tahoma", Font.PLAIN, 13));
	private JTextField txtSerial = TextFieldFactory.createJTextField(10);

	public DeviceRegistrationPanel()
	{
		setLayout(new MigLayout("", "[][grow]", "[25px:n][25px:n][25px:n][25px:n][25px:n]"));
		
		JLabel lblDeviceType = LabelFactory.createJLabel(LabelName.DEVICE_TYPE, new Font("Tahoma", Font.PLAIN, 13));
		add(lblDeviceType, "cell 0 0,growy");
		
		AutoCompleteDecorator.decorate(cmbDeviceType);
		add(cmbDeviceType, "cell 1 0,grow");
		
		JLabel lblBrand = LabelFactory.createJLabel(LabelName.BRAND, new Font("Tahoma", Font.PLAIN, 13));
		add(lblBrand, "cell 0 1,growy");
		
		AutoCompleteDecorator.decorate(cmbBrand);
		add(cmbBrand, "cell 1 1,grow");
		
		JLabel lblModel = LabelFactory.createJLabel(LabelName.MODEL, new Font("Tahoma", Font.PLAIN, 13));
		add(lblModel, "cell 0 2,growy");
		
		AutoCompleteDecorator.decorate(cmbModel);
		add(cmbModel, "cell 1 2,grow");
		
		add(btnNewModel, "cell 1 3,alignx center,growy");
		
		JLabel lblSerial = LabelFactory.createJLabel(LabelName.SERIAL, new Font("Tahoma", Font.PLAIN, 13));
		add(lblSerial, "cell 0 4,growy");
		
		add(txtSerial, "cell 1 4,grow");
	}
	
	public String getDeviceType()
	{
		return (String) cmbDeviceType.getSelectedItem();
	}
	
	public void setDeviceTypeCmbModel(ComboBoxModel<String> model)
	{
		cmbDeviceType.setModel(model);
	}
	
	public String getBrand()
	{
		return (String) cmbBrand.getSelectedItem();
	}
	
	public void setBrandCmbModel(ComboBoxModel<String> model)
	{
		cmbBrand.setModel(model);
	}
	
	public String getModel()
	{
		cmbModel.setBackground(Color.WHITE);
		return (String) cmbModel.getSelectedItem();
	}
	
	public void setModelCmbModel(ComboBoxModel<String> model)
	{
		cmbModel.setModel(model);
	}
	
	public String getSerial()
	{
		txtSerial.setBackground(Color.WHITE);
		return txtSerial.getText();
	}
	
	public void setBtnNewModelActionListener(ActionListener listener)
	{
		btnNewModel.addActionListener(listener);
	}
	
	public void showModelError()
	{
		cmbModel.setBackground(Color.YELLOW);
	}
	
	public void showSerialError()
	{
		txtSerial.setBackground(Color.YELLOW);
	}
}