package com.repair_shop.gui;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import net.miginfocom.swing.MigLayout;

public class InputButtonPanel extends JPanel
{
	private static final long serialVersionUID = -454697132541346234L;
	private JButton btnAdd = new JButton("Add");
	private JButton btnCancel = new JButton("Cancel");

	public InputButtonPanel()
	{
		setLayout(new MigLayout("", "[225px][225px]", "[30px:n]"));
		add(btnAdd, "cell 0 0,grow");
		add(btnCancel, "cell 1 0,grow");
	}
	
	public void setBtnAddActionListerner(ActionListener listener)
	{
		btnAdd.addActionListener(listener);
	}
	
	public void setBtnCancelActionListener(ActionListener listener)
	{
		btnCancel.addActionListener(listener);
	}
}