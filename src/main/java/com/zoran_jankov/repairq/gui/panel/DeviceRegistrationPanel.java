package com.zoran_jankov.repairq.gui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.zoran_jankov.repairq.gui.text.ButtonName;
import com.zoran_jankov.repairq.gui.text.LabelName;
import com.zoran_jankov.repairq.gui.utility.ButtonFactory;
import com.zoran_jankov.repairq.gui.utility.ComboBoxFactory;
import com.zoran_jankov.repairq.gui.utility.LabelFactory;
import com.zoran_jankov.repairq.gui.utility.TextFieldFactory;

import net.miginfocom.swing.MigLayout;

public class DeviceRegistrationPanel extends JPanel {
    private static final long serialVersionUID = -4810443150610740707L;
    private JComboBox<String> cmbModel = ComboBoxFactory.createJComboBox();
    private JButton btnNewModel = ButtonFactory.createJButton(ButtonName.MODEL, new Font("Tahoma", Font.PLAIN, 13));
    private JTextField txtSerial = TextFieldFactory.createJTextField(10);

    public DeviceRegistrationPanel() {
	setLayout(new MigLayout("", "[][grow][]", "[20px:n:20px][20px:n:20px]"));

	JLabel lblModel = LabelFactory.createJLabel(LabelName.MODEL, new Font("Tahoma", Font.PLAIN, 13));
	add(lblModel, "cell 0 0,growy");

	add(cmbModel, "flowx,cell 1 0,grow");

	add(btnNewModel, "cell 2 0,alignx center,growy");

	JLabel lblSerial = LabelFactory.createJLabel(LabelName.SERIAL, new Font("Tahoma", Font.PLAIN, 13));
	add(lblSerial, "cell 0 1,growy");

	add(txtSerial, "cell 1 1 2 1,grow");
    }

    public String getModel() {
	cmbModel.setBackground(Color.WHITE);
	return (String) cmbModel.getSelectedItem();
    }

    public String getSerial() {
	txtSerial.setBackground(Color.WHITE);
	return txtSerial.getText();
    }

    public void setBtnNewModelActionListener(ActionListener listener) {
	btnNewModel.addActionListener(listener);
    }

    public void setModel(ComboBoxModel<String> model) {
	cmbModel.setModel(model);
    }

    public void setSerial(String serial) {
	txtSerial.setText(serial);
    }

    public void showModelError() {
	cmbModel.setBackground(Color.YELLOW);
    }

    public void showSerialError() {
	txtSerial.setBackground(Color.YELLOW);
    }
}