package com.zoran_jankov.repairq.gui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.zoran_jankov.repairq.gui.text.ButtonName;
import com.zoran_jankov.repairq.gui.text.LabelName;
import com.zoran_jankov.repairq.gui.utility.ButtonFactory;
import com.zoran_jankov.repairq.gui.utility.ComboBoxFactory;
import com.zoran_jankov.repairq.gui.utility.LabelFactory;

import net.miginfocom.swing.MigLayout;

public class SelectionPanel extends JPanel {
    private static final long serialVersionUID = 6173599805523082955L;

    private JLabel lblEntityType = LabelFactory.createJLabel(LabelName.ENTITY, new Font("Tahoma", Font.BOLD, 13));

    private JComboBox<String> cmbEntity = ComboBoxFactory.createJComboBox();

    private JLabel lblEntityDetails = LabelFactory.createJLabel(LabelName.ENTITY_DETAILS,
	    new Font("Tahoma", Font.PLAIN, 13));

    private final JButton btnUpdateEntity = ButtonFactory.createJButton(ButtonName.UPDATE_ENTITY,
	    new Font("Tahoma", Font.PLAIN, 13));

    private final JButton btnNewEntity = ButtonFactory.createJButton(ButtonName.ADD_NEW_ENTITY,
	    new Font("Tahoma", Font.PLAIN, 13));

    public SelectionPanel() {
	setLayout(new MigLayout("", "[grow][grow]", "[][][100px:n][]"));

	lblEntityType.setHorizontalAlignment(SwingConstants.CENTER);
	add(lblEntityType, "cell 0 0 2 1,grow");

	add(cmbEntity, "cell 0 1 2 1,grow");

	add(lblEntityDetails, "cell 0 2 2 1,grow");

	btnUpdateEntity.setHorizontalAlignment(SwingConstants.LEFT);
	add(btnUpdateEntity, "flowx,cell 0 3,alignx center,growy");

	btnNewEntity.setHorizontalAlignment(SwingConstants.RIGHT);
	add(btnNewEntity, "cell 1 3,alignx center,growy");
    }

    public String getEntity() {
	cmbEntity.setBackground(Color.WHITE);
	return (String) cmbEntity.getSelectedItem();
    }

    public void setEntityType(String text) {
	lblEntityType.setText(text);
    }

    public void setComboBoxFunction(ComboBoxModel<String> model, ActionListener listener) {
	cmbEntity.setModel(model);
	cmbEntity.addActionListener(listener);
    }

    public void setButtonUpdateEntityFunction(ActionListener listener, String text) {
	btnUpdateEntity.addActionListener(listener);
	btnUpdateEntity.setText(text);
    }

    public void setButtonNewEntityFunction(ActionListener listener, String text) {
	btnNewEntity.addActionListener(listener);
	btnNewEntity.setText(text);
    }

    public void setEntityDetails(String text) {
	lblEntityDetails.setText(text);
    }

    public void showSelectionError() {
	cmbEntity.setBackground(Color.YELLOW);
    }
}