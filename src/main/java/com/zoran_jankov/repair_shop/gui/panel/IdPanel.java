package main.java.com.zoran_jankov.repair_shop.gui.panel;

import javax.swing.JPanel;

import main.java.com.zoran_jankov.repair_shop.gui.text.LabelName;
import main.java.com.zoran_jankov.repair_shop.gui.utility.LabelFactory;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;

public class IdPanel extends JPanel
{
	private static final long serialVersionUID = -7708177867098774117L;
	private JLabel lblIDValue = LabelFactory.createJLabel("0-123456789", new Font("Tahoma", Font.BOLD, 13));
	
	public IdPanel()
	{
		setLayout(new MigLayout("", "[20px:n][][grow][][grow]", "[20px:n]"));
		
		JLabel lblID = LabelFactory.createJLabel("ID", new Font("Tahoma", Font.PLAIN, 13));
		add(lblID, "cell 0 0 0 1,growy");
		
		add(lblIDValue, "cell 2 0,grow");
		
		JLabel lblRequiredFields = LabelFactory.createJLabel(LabelName.REQUIRED_FIELDS, new Font("Tahoma", Font.PLAIN, 13));
		add(lblRequiredFields, "cell 4 0,alignx right,growy");
	}
	
	public void setIdValue(String id)
	{
		lblIDValue.setText(id);
	}
}