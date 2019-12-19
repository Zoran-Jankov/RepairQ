package main.java.com.yankov.repair_shop.gui.panel;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

import main.java.com.yankov.repair_shop.gui.text.LabelName;
import main.java.com.yankov.repair_shop.gui.utility.LabelFactory;
import main.java.com.yankov.repair_shop.gui.utility.TextFieldFactory;

import java.awt.Color;
import java.awt.Font;

public class PersonalInfoPanel extends JPanel
{
	private static final long serialVersionUID = -1636004925810635460L;
	private JTextField txtName = TextFieldFactory.createJTextField(10);
	private JTextField txtPrimePhone = TextFieldFactory.createJTextField(10);
	private JTextField txtAltPhone = TextFieldFactory.createJTextField(10);
	private JTextField txtEmail = TextFieldFactory.createJTextField(10);
	private JTextField txtAddress = TextFieldFactory.createJTextField(10);

	public PersonalInfoPanel()
	{
		setLayout(new MigLayout("", "[][5.00][grow]", "[20px:n,fill][20px:n,fill][20px:n,fill][][20px:n]"));
		
		JLabel lblName = LabelFactory.createJLabel(LabelName.FULL_NAME, new Font("Tahoma", Font.PLAIN, 13));
		add(lblName, "cell 0 0,growy");
		
		add(txtName, "cell 2 0,grow");
		
		JLabel lblPrimePhone = LabelFactory.createJLabel(LabelName.PRIME_PHONE, new Font("Tahoma", Font.PLAIN, 13));
		add(lblPrimePhone, "cell 0 1,growy");
		
		add(txtPrimePhone, "cell 2 1,grow");
		
		JLabel lblAltPhone = LabelFactory.createJLabel(LabelName.ALTERNATIVE_PHONE, new Font("Tahoma", Font.PLAIN, 13));
		add(lblAltPhone, "cell 0 2,growy");
		
		add(txtAltPhone, "cell 2 2,grow");
		
		JLabel lblEmail = LabelFactory.createJLabel(LabelName.EMAIL, new Font("Tahoma", Font.PLAIN, 13));
		add(lblEmail, "cell 0 3,growy");
		
		add(txtEmail, "cell 2 3,growx");
		
		JLabel lblHomeAddress = LabelFactory.createJLabel(LabelName.ADDRESS, new Font("Tahoma", Font.PLAIN, 13));
		add(lblHomeAddress, "cell 0 4,growy");
		
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
		return txtEmail.getText();
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
		txtPrimePhone.setBackground(Color.YELLOW);
	}
}