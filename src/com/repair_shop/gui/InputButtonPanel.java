package com.repair_shop.gui;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

public class InputButtonPanel extends JPanel
{
	private static final long serialVersionUID = -454697132541346234L;
	private JButton btnAdd = new JButton("Add");
	private JButton btnCancel = new JButton("Cancel");

	public InputButtonPanel()
	{
		setLayout(new GridLayout(0, 2, 0, 0));
		add(btnAdd);
		add(btnCancel);
	}
	
	public void setBtnAddActionListerner(ActionListener listener)
	{
		btnAdd.addActionListener(listener);
	}
	
	public void setBtnCanvelActionListerner(ActionListener listener)
	{
		btnCancel.addActionListener(listener);
	}
}