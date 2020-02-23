package main.java.com.zoran_jankov.repair_shop.gui.panel;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

import main.java.com.zoran_jankov.repair_shop.gui.text.LabelName;
import main.java.com.zoran_jankov.repair_shop.gui.utility.LabelFactory;
import main.java.com.zoran_jankov.repair_shop.gui.utility.TextFieldFactory;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class ContactInfoPanel extends JPanel
{
	private static final long serialVersionUID = -1636004925810635460L;
	private JTextField txtPrimePhone = TextFieldFactory.createJTextField(10);
	private JTextField txtEmail = TextFieldFactory.createJTextField(10);
	private JTextField txtAddress = TextFieldFactory.createJTextField(10);

	public ContactInfoPanel()
	{
		JLabel lblContactInforamtion = LabelFactory.createJLabel("Contact Inforamtion", new Font("Tahoma", Font.BOLD, 13));
		
		setLayout(new MigLayout("", "[][grow]", "[20px:n:20px][20px:n:20px,fill][20px:n:20px][20px:n:20px]"));
		lblContactInforamtion.setHorizontalAlignment(SwingConstants.CENTER);
		
		add(lblContactInforamtion, "cell 0 0 2 1,grow");
		
		JLabel lblPrimePhone = LabelFactory.createJLabel(LabelName.PRIME_PHONE, new Font("Tahoma", Font.PLAIN, 13));
		add(lblPrimePhone, "cell 0 1,growy");
		
		add(txtPrimePhone, "cell 1 1,grow");
		
		JLabel lblEmail = LabelFactory.createJLabel(LabelName.EMAIL, new Font("Tahoma", Font.PLAIN, 13));
		add(lblEmail, "cell 0 2,growy");
		
		add(txtEmail, "cell 1 2,growx");
		
		JLabel lblHomeAddress = LabelFactory.createJLabel(LabelName.ADDRESS, new Font("Tahoma", Font.PLAIN, 13));
		add(lblHomeAddress, "cell 0 3,growy");
		
		add(txtAddress, "cell 1 3,grow");
	}
	
	public String getPrimePhoneNumber()
	{
		txtPrimePhone.setBackground(Color.WHITE);
		return txtPrimePhone.getText();
	}
	
	public void showPhoneError()
	{
		txtPrimePhone.setBackground(Color.YELLOW);
	}
	
	public String getEmail()
	{
		return txtEmail.getText();
	}
	
	public String getAddress()
	{
		return txtAddress.getText();
	}
}