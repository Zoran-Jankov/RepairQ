package com.repair_shop.gui;

import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.repair_shop.utility.ClientDialogText;

public abstract class InputDialog extends JDialog
{
	private static final long serialVersionUID = -2647887157796282387L;
	protected JPanel contentPane = new JPanel();
	protected JLabel lblID =  new JLabel(ClientDialogText.CLIENT_ID_LABEL);
	protected JLabel lblIDValue = new JLabel("1-23456789");
	protected JButton btnAdd = new JButton(ClientDialogText.ADD_CLIENT_BUTTON);
	protected JButton btnCancel = new JButton(ClientDialogText.CANCEL_BUTTON);
	
	public InputDialog(Window owner)
	{
		super(owner);
		setContentPane(contentPane);
		setResizable(false);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setVisible(true);
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		
		lblID.setBounds(35, 25, 110, 25);
		contentPane.add(lblID);

		lblIDValue.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblIDValue);
		
		btnAdd.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnAdd.setBounds(35, 365, 110, 25);
		contentPane.add(btnAdd);
		
		btnCancel.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnCancel.setBounds(310, 365, 110, 25);
		contentPane.add(btnCancel);
	}
	
	public void setIdValue(String id)
	{
		lblIDValue.setText(id);
	}
	
	public void setBtnAddActionListener(ActionListener l)
	{
		btnAdd.addActionListener(l);
	}
	
	public void setBtnCancelActionListener(ActionListener l)
	{
		btnCancel.addActionListener(l);
	}

	public Window getWindow()
	{
		return this;
	}
}