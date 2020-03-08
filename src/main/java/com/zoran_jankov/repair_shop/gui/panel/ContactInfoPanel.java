package main.java.com.zoran_jankov.repair_shop.gui.panel;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import main.java.com.zoran_jankov.repair_shop.data.FieldType;
import main.java.com.zoran_jankov.repair_shop.gui.utility.LabelFactory;
import net.miginfocom.swing.MigLayout;

public class ContactInfoPanel extends JPanel
{
	private static final long serialVersionUID = -1636004925810635460L;
	private TextInputField phoneNumber = new TextInputField(FieldType.PHONE_NUMBER);
	private TextInputField email = new TextInputField(FieldType.EMAIL);
	private TextInputField address = new TextInputField(FieldType.ADDRESS);

	public ContactInfoPanel()
	{
		setLayout(new MigLayout("", "[][grow]", "[20px:n:20px][25px:25px:25px][25px:25px:25px][25px:25px:25px]"));
		
		JLabel lblContactInforamtion = LabelFactory.createJLabel("Contact Inforamtion", new Font("Tahoma", Font.BOLD, 13));
		lblContactInforamtion.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblContactInforamtion, "cell 0 0 2 1,grow");
		
		add(phoneNumber, "cell 1 1");
		
		add(email, "cell 1 2");
		
		add(address, "cell 1 3"); 
	}
	
	public String getPhoneNumber()
	{
		return phoneNumber.getInput();
	}
	
	public String getEmail()
	{
		return email.getInput();
	}
	
	public String getAddress()
	{
		return address.getInput();
	}
}