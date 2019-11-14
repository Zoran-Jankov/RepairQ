package com.repair_shop.gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
import java.awt.Font;

public class InputDialog extends JDialog
{
	private static final long serialVersionUID = 1052750813632894193L;
	public JPanel buttonPane = new JPanel();
	public JLabel lblId = new JLabel("ID");
	public JLabel lblIdvalue = new JLabel("1-23456789");
	public JPanel contentPanel = new JPanel();
	public JButton btnAdd = new JButton("Add");
	public JButton btnCancel = new JButton("Cancel");

	public InputDialog()
	{
		setBounds(100, 100, 360, 400);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new MigLayout("", "[][grow]", "[][]"));
		
		contentPanel.add(lblId, "cell 0 0");
		
		lblIdvalue.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPanel.add(lblIdvalue, "cell 1 0");
			
		getContentPane().add(buttonPane, BorderLayout.SOUTH);
		buttonPane.setLayout(new MigLayout("", "[217px][217px]", "[23px]"));
				
		btnAdd.setActionCommand("OK");
		buttonPane.add(btnAdd, "cell 0 0,grow");
		getRootPane().setDefaultButton(btnAdd);
			
		btnCancel.setActionCommand("Cancel");
		buttonPane.add(btnCancel, "cell 1 0,grow");
	}
}