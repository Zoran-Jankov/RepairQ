package main.java.com.zoran_jankov.repair_shop.gui.panel;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

import main.java.com.zoran_jankov.repair_shop.gui.text.ButtonName;
import main.java.com.zoran_jankov.repair_shop.gui.text.LabelName;
import main.java.com.zoran_jankov.repair_shop.gui.utility.ButtonFactory;
import main.java.com.zoran_jankov.repair_shop.gui.utility.ComboBoxFactory;
import main.java.com.zoran_jankov.repair_shop.gui.utility.LabelFactory;
import main.java.com.zoran_jankov.repair_shop.gui.utility.TextFieldFactory;

import javax.swing.ComboBoxModel;
import javax.swing.JButton;

public class DeviceRegistrationPanel extends JPanel
{
	private static final long serialVersionUID = -4810443150610740707L;
	private JComboBox<String> cmbModel = ComboBoxFactory.createJComboBox();
	private JButton btnNewModel = ButtonFactory.createJButton(ButtonName.MODEL, new Font("Tahoma", Font.PLAIN, 13));
	private JTextField txtSerial = TextFieldFactory.createJTextField(10);

	public DeviceRegistrationPanel()
	{
		setLayout(new MigLayout("", "[][grow][]", "[20px:n:20px][20px:n:20px]"));
		
		JLabel lblModel = LabelFactory.createJLabel(LabelName.MODEL, new Font("Tahoma", Font.PLAIN, 13));
		add(lblModel, "cell 0 0,growy");
		
		AutoCompleteDecorator.decorate(cmbModel);
		add(cmbModel, "flowx,cell 1 0,grow");
		
		add(btnNewModel, "cell 2 0,alignx center,growy");
		
		JLabel lblSerial = LabelFactory.createJLabel(LabelName.SERIAL, new Font("Tahoma", Font.PLAIN, 13));
		add(lblSerial, "cell 0 1,growy");
		
		add(txtSerial, "cell 1 1 2 1,grow");
	}
	
	public String getModel()
	{
		cmbModel.setBackground(Color.WHITE);
		return (String) cmbModel.getSelectedItem();
	}
	
	public void setModel(ComboBoxModel<String> model)
	{
		cmbModel.setModel(model);
	}
	
	public String getSerial()
	{
		txtSerial.setBackground(Color.WHITE);
		return txtSerial.getText();
	}
	
	public void setSerial(String serial)
	{
		txtSerial.setText(serial);
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