package main.java.com.zoran_jankov.repair_shop.gui.panel;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.JTextField;

import main.java.com.zoran_jankov.repair_shop.gui.utility.LabelFactory;

public class CompanyInfoPanel extends JPanel
{
	private static final long serialVersionUID = -8321772559737543683L;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public CompanyInfoPanel()
	{
		setLayout(new MigLayout("", "[][grow]", "[25px:n:25px][25px:n:25px]"));
		
		JLabel lblTaxIdNumber = LabelFactory.createJLabel("\"Tax ID Number\"", new Font("Tahoma", Font.PLAIN, 13));
		add(lblTaxIdNumber, "cell 0 0,growy");
		
		textField = new JTextField();
		add(textField, "cell 1 0,grow");
		textField.setColumns(10);
		
		JLabel lblBanckAccount = LabelFactory.createJLabel("Banck Account", new Font("Tahoma", Font.PLAIN, 13));
		add(lblBanckAccount, "cell 0 1,growy");
		
	}
}