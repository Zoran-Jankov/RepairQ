package com.repair_shop.gui;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class PropertyPanel extends JPanel
{
	private static final long serialVersionUID = 5315153141202094448L;
	private JTextField txtName = TextFieldFactory.createJTextField(10);
	private JTextPane txtDescription = new JTextPane();

	public PropertyPanel()
	{
		setLayout(new MigLayout("", "[][grow]", "[20px:n,fill][10px:n][][grow]"));
		
		JLabel lblName = LabelFactory.createJLabel("Name", new Font("Tahoma", Font.PLAIN, 13));
		add(lblName, "cell 0 0");
		
		add(txtName, "cell 1 0,grow");
		
		JLabel lblDescription = LabelFactory.createJLabel("Description", new Font("Tahoma", Font.PLAIN, 13));
		add(lblDescription, "cell 0 2,growy");
		
		add(txtDescription, "cell 0 3 2 1,grow");
	}
	
	public String getPropertyName()
	{
		return txtName.getText();
	}
	
	public String getDescription()
	{
		return txtDescription.getText();
	}
	
	public void showNameDefault()
	{
		txtName.setBackground(Color.WHITE);
	}
	
	public void showNameError()
	{
		txtName.setBackground(Color.YELLOW);
	}
}