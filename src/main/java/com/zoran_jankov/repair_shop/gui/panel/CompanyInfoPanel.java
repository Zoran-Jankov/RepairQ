package main.java.com.zoran_jankov.repair_shop.gui.panel;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.JTextField;

import main.java.com.zoran_jankov.repair_shop.gui.text.LabelName;
import main.java.com.zoran_jankov.repair_shop.gui.utility.LabelFactory;
import javax.swing.SwingConstants;
import main.java.com.zoran_jankov.repair_shop.gui.utility.TextFieldFactory;

public class CompanyInfoPanel extends JPanel
{
	private static final long serialVersionUID = -8321772559737543683L;
	private JTextField txtCompanyName;
	private JTextField txtTaxId;
	private JTextField txtBankAccount;
	
	/**
	 * Create the panel.
	 */
	public CompanyInfoPanel()
	{
		setLayout(new MigLayout("", "[][grow]", "[20px:n:20px][20px:n:20px][20px:n:20px][20px:n:20px]"));
		
		JLabel lblCompanyInfo = LabelFactory.createJLabel("Company Information", new Font("Tahoma", Font.BOLD, 13));
		lblCompanyInfo.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblCompanyInfo, "cell 0 0 2 1,grow");
		
		JLabel lblCompanyName = LabelFactory.createJLabel("Company Name", new Font("Tahoma", Font.PLAIN, 13));
		add(lblCompanyName, "cell 0 1,growy");
		
		txtCompanyName = TextFieldFactory.createJTextField(10);
		add(txtCompanyName, "cell 1 1,grow");
		
		JLabel lblTaxIdNumber = LabelFactory.createJLabel(LabelName.TAX_ID, new Font("Tahoma", Font.PLAIN, 13));
		add(lblTaxIdNumber, "cell 0 2,growy");
		
		txtTaxId = TextFieldFactory.createJTextField(10);
		add(txtTaxId, "cell 1 2,grow");
		
		JLabel lblBanckAccount = LabelFactory.createJLabel(LabelName.BANK_ACCOUNT, new Font("Tahoma", Font.PLAIN, 13));
		add(lblBanckAccount, "cell 0 3,growy");
		
		txtBankAccount = TextFieldFactory.createJTextField(10);
		add(txtBankAccount, "cell 1 3,grow");
	}
	
	public String getCompanyName()
	{
		return txtCompanyName.getText();
	}

	public void setCompanyName(String companyName)
	{
		this.txtCompanyName.setText(companyName);
	}
	
	public String getTaxId()
	{
		return txtTaxId.getText();
	}
	
	public void setTaxId(String taxId)
	{
		this.txtTaxId.setText(taxId);
	}

	public String getBankAccount()
	{
		return txtBankAccount;
	}

	public void setBankAccount(JTextField txtBankAccount)
	{
		this.txtBankAccount = txtBankAccount;
	}
}