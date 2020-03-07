package main.java.com.zoran_jankov.repair_shop.gui.dialog;

import java.awt.Window;

import javax.swing.JDialog;

import main.java.com.zoran_jankov.repair_shop.gui.panel.CompanyInfoPanel;
import main.java.com.zoran_jankov.repair_shop.gui.panel.ContactInfoPanel;
import main.java.com.zoran_jankov.repair_shop.gui.panel.IdPanel;
import main.java.com.zoran_jankov.repair_shop.gui.panel.InputButtonPanel;
import main.java.com.zoran_jankov.repair_shop.gui.panel.PersonalInfoPanel;
import main.java.com.zoran_jankov.repair_shop.gui.text.WindowTitle;
import net.miginfocom.swing.MigLayout;

public class CustomerRegistrationDialog extends JDialog implements InputDialog
{
	private static final long serialVersionUID = -394107433140693140L;
	private IdPanel idPanel = new IdPanel();
	private PersonalInfoPanel personalInfoPanel = new PersonalInfoPanel();
	private ContactInfoPanel contactInfoPanel = new ContactInfoPanel();
	private CompanyInfoPanel companyInfoPanel = new CompanyInfoPanel();
	private InputButtonPanel buttonPanel = new InputButtonPanel();
	
	public CustomerRegistrationDialog(Window owner)
	{
		super(owner);
		
		setResizable(false);
		setTitle(WindowTitle.NEW_CLIENT);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		getContentPane().setLayout(new MigLayout("", "[434px]", "[25px:n][][][][][]"));
		
		getContentPane().add(idPanel, "cell 0 0,grow");
		
		getContentPane().add(personalInfoPanel, "cell 0 1,grow");
		
		getContentPane().add(contactInfoPanel, "cell 0 2,grow");
		
		getContentPane().add(companyInfoPanel, "cell 0 3,grow");
		
		getContentPane().add(buttonPanel, "cell 0 5,grow");
		
		pack();
	}

	@Override
	public IdPanel getIdPanel()
	{
		return idPanel;
	}
	
	public PersonalInfoPanel getPersonalInfoPanel()
	{
		return personalInfoPanel;
	}

	@Override
	public InputButtonPanel getInputButtonPanel()
	{
		return buttonPanel;
	}
}