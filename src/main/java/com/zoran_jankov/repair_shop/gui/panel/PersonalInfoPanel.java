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

public class PersonalInfoPanel extends JPanel
{
	private static final long serialVersionUID = -1636004925810635460L;
	private JTextField txtFirstName = TextFieldFactory.createJTextField(10);
	private JTextField txtLastName = TextFieldFactory.createJTextField(10);
	private final JLabel lblPersonalInformation = LabelFactory.createJLabel("Personal Information", new Font("Tahoma", Font.BOLD, 13));

	public PersonalInfoPanel()
	{
		setLayout(new MigLayout("", "[][grow]", "[20px:n:20px][20px:n:20px,fill][20px:n:20px,fill]"));
		lblPersonalInformation.setHorizontalAlignment(SwingConstants.CENTER);
		
		add(lblPersonalInformation, "cell 0 0 2 1,grow");
		
		JLabel lblFirstName = LabelFactory.createJLabel("First Name", new Font("Tahoma", Font.PLAIN, 13));
		add(lblFirstName, "cell 0 1,growy");
		
		add(txtFirstName, "cell 1 1,grow");
		
		JLabel lblLastName = LabelFactory.createJLabel(LabelName.PRIME_PHONE, new Font("Tahoma", Font.PLAIN, 13));
		add(lblLastName, "cell 0 2,growy");
		
		add(txtLastName, "cell 1 2,grow");
	}
	
	public String getFirstName()
	{
		txtFirstName.setBackground(Color.WHITE);
		return txtFirstName.getText();
	}
	
	public void setFirstName(String firstName)
	{
		txtFirstName.setText(firstName);
	}
	
	public void showFirstNameError()
	{
		txtFirstName.setBackground(Color.YELLOW);
	}
	
	public String getLastName()
	{
		txtLastName.setBackground(Color.WHITE);
		return txtLastName.getText();
	}
	
	public void setLastName(String lastName)
	{
		txtLastName.setText(lastName);
	}
	
	public void showLastNameError()
	{
		txtLastName.setBackground(Color.YELLOW);
	}
}