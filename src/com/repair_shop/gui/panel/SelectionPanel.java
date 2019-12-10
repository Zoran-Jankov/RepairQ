package com.repair_shop.gui.panel;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

import com.repair_shop.gui.text.ButtonName;
import com.repair_shop.gui.text.LabelName;
import com.repair_shop.gui.utility.ButtonFactory;
import com.repair_shop.gui.utility.ComboBoxFactory;
import com.repair_shop.gui.utility.LabelFactory;

import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;

public class SelectionPanel extends JPanel
{
	private static final long serialVersionUID = 6173599805523082955L;
	private JComboBox<String> cmbDataElement = ComboBoxFactory.createJComboBox();
	private JLabel lblEntityDetails = LabelFactory.createJLabel
			                                     (LabelName.ENTITY_DETAILS, new Font("Tahoma", Font.PLAIN, 15));
	private final JButton btnNewEntity = ButtonFactory.createJButton
													  (ButtonName.ADD_NEW_ENTITY, new Font("Tahoma", Font.PLAIN, 13));
	
	public SelectionPanel()
	{
		setLayout(new MigLayout("", "[grow][]", "[][][100px:n]"));
		
		JLabel lblDataElement = LabelFactory.createJLabel(LabelName.ENTITY, new Font("Tahoma", Font.BOLD, 13));
		lblDataElement.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblDataElement, "cell 0 0 2 1,grow");
		
		add(cmbDataElement, "cell 0 1,grow");
		
		add(btnNewEntity, "cell 1 1,grow");
		
		add(lblEntityDetails, "cell 0 2 2 1,grow");
	}
	
	public String getEntity()
	{
		cmbDataElement.setBackground(Color.WHITE);
		return (String) cmbDataElement.getSelectedItem();
	}
	
	public void setEntity(String item)
	{
		cmbDataElement.setBackground(Color.WHITE);
		cmbDataElement.setSelectedItem(item);
	}
	
	public void setComboBoxModel(ComboBoxModel<String> model)
	{
		cmbDataElement.setModel(model);
	}
	
	public void setButtonFunction(ActionListener listener, String text)
	{
		btnNewEntity.addActionListener(listener);
		btnNewEntity.setText(text);
	}
	
	public void setEntityDetails(String text)
	{
		lblEntityDetails.setText(text);
	}
	
	public void showSelectionError()
	{
		cmbDataElement.setBackground(Color.YELLOW);
	}
}