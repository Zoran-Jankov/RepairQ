package com.repair_shop.gui;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import net.miginfocom.swing.MigLayout;
import java.awt.Font;

public class InputButtonPanel extends JPanel
{
	private static final long serialVersionUID = -454697132541346234L;
	private JButton btnAdd = ButtonFactory.createJButton("Add", new Font("Tahoma", Font.PLAIN, 13));
	private JButton btnCancel = ButtonFactory.createJButton("Cancel", new Font("Tahoma", Font.PLAIN, 13));

	public InputButtonPanel()
	{
		setLayout(new MigLayout("", "[225px,grow][225px,grow]", "[30px:n]"));
		add(btnAdd, "cell 0 0,grow");
		add(btnCancel, "cell 1 0,grow");
	}
	
	public void setBtnAddActionListener(ActionListener listener)
	{
		btnAdd.addActionListener(listener);
	}
	
	public void setBtnCancelActionListener(ActionListener listener)
	{
		btnCancel.addActionListener(listener);
	}
}