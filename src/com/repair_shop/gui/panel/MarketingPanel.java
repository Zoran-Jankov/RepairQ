package com.repair_shop.gui.panel;

import javax.swing.JPanel;

import com.repair_shop.gui.text.ButtonName;
import com.repair_shop.gui.text.LabelName;
import com.repair_shop.gui.utility.ButtonFactory;
import com.repair_shop.gui.utility.ComboBoxFactory;
import com.repair_shop.gui.utility.LabelFactory;

import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class MarketingPanel extends JPanel
{
	private static final long serialVersionUID = -2355948052589691285L;
	private JComboBox<String> cmbMarketing = ComboBoxFactory.createJComboBox();
	private JButton btnNewMarketing = ButtonFactory.createJButton(ButtonName.MARKETING, new Font("Tahoma", Font.PLAIN, 13));

	public MarketingPanel()
	{
		setLayout(new MigLayout("", "[][grow,fill][][][][][][][][][]", "[fill]"));
		
		JLabel lblMarketingInformation = LabelFactory.createJLabel(LabelName.MARKETING, new Font("Tahoma", Font.PLAIN, 13));
		add(lblMarketingInformation, "cell 0 0,alignx trailing,growy");
		
		add(cmbMarketing, "cell 1 0 9 1,grow");
		
		add(btnNewMarketing, "cell 10 0,growy");
	}
	
	public String getMarketing()
	{
		cmbMarketing.setBackground(Color.WHITE);
		return (String) cmbMarketing.getSelectedItem();
	}
	
	public void setMarketing(String item)
	{
		cmbMarketing.setBackground(Color.WHITE);
		cmbMarketing.setSelectedItem(item);
	}
	
	public void setMarketingCmbModel(ComboBoxModel<String> model)
	{
		cmbMarketing.setModel(model);
	}
	
	public void setBtnMarketingActionListener(ActionListener listener)
	{
		btnNewMarketing.addActionListener(listener);
	}
	
	public void showMarketingError()
	{
		cmbMarketing.setBackground(Color.YELLOW);
	}
}