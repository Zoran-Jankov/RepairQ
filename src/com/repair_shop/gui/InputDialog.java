package com.repair_shop.gui;

import javax.swing.JDialog;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Window;
import java.awt.event.ActionListener;

public class InputDialog extends JDialog
{
	private static final long serialVersionUID = 4886989159537910763L;
	
	IdPanel idPanel = new IdPanel();
	InputButtonPanel buttoPanel = new InputButtonPanel();

	public InputDialog(Window owner)
	{
		super(owner);
		JPanel contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(idPanel, BorderLayout.NORTH);
		contentPane.add(buttoPanel, BorderLayout.SOUTH);
	}

	public void setIdValue(String id)
	{
		idPanel.setIdValue(id);
	}

	public void setBtnAddActionListener(ActionListener listener)
	{
		buttoPanel.setBtnAddActionListerner(listener);
	}

	public void setBtnCancelActionListener(ActionListener listener)
	{
		buttoPanel.setBtnCancelActionListener(listener);
	}
}