package com.zoran_jankov.repairq.gui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.zoran_jankov.repairq.gui.text.ButtonName;
import com.zoran_jankov.repairq.gui.text.LabelName;
import com.zoran_jankov.repairq.gui.utility.ButtonFactory;
import com.zoran_jankov.repairq.gui.utility.ComboBoxFactory;
import com.zoran_jankov.repairq.gui.utility.LabelFactory;

import net.miginfocom.swing.MigLayout;

public class ModelRegistrationPanel extends JPanel {
    private static final long serialVersionUID = -5345042248892559454L;
    private JComboBox<String> cmbDeviceType = ComboBoxFactory.createJComboBox();
    private JButton btnNewDeviceType = ButtonFactory.createJButton(ButtonName.DEVICE_TYPE,
	    new Font("Tahoma", Font.PLAIN, 13));
    private JComboBox<String> cmbBrand = ComboBoxFactory.createJComboBox();
    private JButton btnNewBrand = ButtonFactory.createJButton(ButtonName.BRAND, new Font("Tahoma", Font.PLAIN, 13));

    public ModelRegistrationPanel() {
	setLayout(new MigLayout("", "[][grow][]", "[20px:n:20px][20px:n:20px]"));

	JLabel lblDeviceType = LabelFactory.createJLabel(LabelName.DEVICE_TYPE, new Font("Tahoma", Font.PLAIN, 13));
	add(lblDeviceType, "cell 0 0,growy");

	add(cmbDeviceType, "cell 1 0,grow");

	add(btnNewDeviceType, "cell 2 0,growx");

	JLabel lblBrand = LabelFactory.createJLabel(LabelName.BRAND, new Font("Tahoma", Font.PLAIN, 13));
	add(lblBrand, "cell 0 1,growy");

	add(cmbBrand, "cell 1 1,grow");

	add(btnNewBrand, "cell 2 1,growx");
    }

    public String getBrand() {
	cmbBrand.setBackground(Color.WHITE);
	return (String) cmbBrand.getSelectedItem();
    }

    public String getDeviceType() {
	cmbDeviceType.setBackground(Color.WHITE);
	return (String) cmbDeviceType.getSelectedItem();
    }

    public void setBrandCmbModel(ComboBoxModel<String> model) {
	cmbBrand.setModel(model);
    }

    public void setBtnNewBrandActionlistener(ActionListener listener) {
	btnNewBrand.addActionListener(listener);
    }

    public void setBtnNewDeviceTypeActionlistener(ActionListener listener) {
	btnNewDeviceType.addActionListener(listener);
    }

    public void setDeviceTypeCmbModel(ComboBoxModel<String> model) {
	cmbDeviceType.setModel(model);
    }

    public void showBrandError() {
	cmbBrand.setBackground(Color.YELLOW);
    }

    public void showDeviceTypeError() {
	cmbDeviceType.setBackground(Color.YELLOW);
    }
}