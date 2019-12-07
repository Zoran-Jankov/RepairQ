package com.repair_shop.gui.panel;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import com.repair_shop.gui.component.LabelFactory;
import com.repair_shop.gui.component.TextFieldFactory;
import com.repair_shop.gui.component.TextPaneFactory;

public class PropertyPanel extends JPanel
{
	private static final long serialVersionUID = 5315153141202094448L;
	private JTextField txtName = TextFieldFactory.createJTextField(10);
	private JTextPane txtDescription = TextPaneFactory.createJEditorPane();

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
		txtName.setBackground(Color.WHITE);
		return txtName.getText();
	}
	
	public String getDescription()
	{
		return txtDescription.getText();
	}
	
	public void showNameError()
	{
		txtName.setBackground(Color.YELLOW);
	}
}