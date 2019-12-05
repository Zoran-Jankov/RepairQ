package com.repair_shop.gui;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;

public class PersonalInfoPanel extends JPanel
{
	private static final long serialVersionUID = -1636004925810635460L;
	private JTextField txtName;
	private JTextField txtPrimePhone;
	private JTextField txtAltPhone;
	private JTextField txtEmail;
	private JTextField txtAddress;

	public PersonalInfoPanel()
	{
		setLayout(new MigLayout("", "[][5.00][grow]", "[20px:n,fill][20px:n,fill][20px:n,fill][][20px:n]"));
		
		JLabel lblName = LabelFactory.createJLabel("First and Last Name", new Font("Tahoma", Font.PLAIN, 13));
		add(lblName, "cell 0 0,growy");
		
		txtName = TextFieldFactory.createJTextField(10);
		add(txtName, "cell 2 0,grow");
		
		JLabel lblPrimePhone = LabelFactory.createJLabel("Primary Phone Number", new Font("Tahoma", Font.PLAIN, 13));
		add(lblPrimePhone, "cell 0 1,growy");
		
		txtPrimePhone = TextFieldFactory.createJTextField(10);
		add(txtPrimePhone, "cell 2 1,grow");
		
		JLabel lblAltPhone = LabelFactory.createJLabel("Alternative Phone Number", new Font("Tahoma", Font.PLAIN, 13));
		add(lblAltPhone, "cell 0 2,growy");
		
		txtAltPhone = TextFieldFactory.createJTextField(10);
		add(txtAltPhone, "cell 2 2,grow");
		
		JLabel lblEmail = LabelFactory.createJLabel("Email Address", new Font("Tahoma", Font.PLAIN, 13));
		add(lblEmail, "cell 0 3,growy");
		
		txtEmail = TextFieldFactory.createJTextField(10);
		add(txtEmail, "cell 2 3,growx");
		
		JLabel lblHomeAddress = LabelFactory.createJLabel("Home Address", new Font("Tahoma", Font.PLAIN, 13));
		add(lblHomeAddress, "cell 0 4,growy");
		
		txtAddress = TextFieldFactory.createJTextField(10);
		add(txtAddress, "cell 2 4,grow");
	}
	
	public String getPersonName()
	{
		txtName.setBackground(Color.WHITE);
		return txtName.getText();
	}
	
	public String getPrimePhoneNumber()
	{
		txtName.setBackground(Color.WHITE);
		return txtPrimePhone.getText();
	}
	
	public String getAltPoneNumber()
	{
		return txtAltPhone.getText();
	}
	
	public String getEmail()
	{
		return txtAltPhone.getText();
	}
	
	public String getAddress()
	{
		return txtAddress.getText();
	}
	
	public void showNameError()
	{
		txtName.setBackground(Color.YELLOW);
	}
	
	public void showPhoneError()
	{
		txtName.setBackground(Color.YELLOW);
	}
}