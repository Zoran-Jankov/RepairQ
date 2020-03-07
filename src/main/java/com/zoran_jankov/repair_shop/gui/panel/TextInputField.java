package main.java.com.zoran_jankov.repair_shop.gui.panel;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;

import main.java.com.zoran_jankov.repair_shop.data.FieldType;
import main.java.com.zoran_jankov.repair_shop.gui.utility.LabelFactory;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import main.java.com.zoran_jankov.repair_shop.gui.utility.TextFieldFactory;

public class TextInputField extends JPanel
{
	private static final long serialVersionUID = -1839158784863217197L;
	private JTextField textField = TextFieldFactory.createJTextField(10);;

	/**
	 * Create the panel.
	 */
	public TextInputField(FieldType type)
	{
		setLayout(new MigLayout("", "[][][grow]", "[25px:25px:25px]"));
		
		JLabel lblFeildName = LabelFactory.createJLabel("Feild Name", new Font("Tahoma", Font.PLAIN, 13));
		add(lblFeildName, "cell 0 0,grow");
		
		JLabel requiredField = LabelFactory.createJLabel("*", new Font("Tahoma", Font.BOLD, 16));
		requiredField.setForeground(Color.RED);
		add(requiredField, "cell 1 0,grow");

		add(textField, "cell 2 0,grow");
		
	}

	public String getInput()
	{
		return textField.getText();
	}

	public void setInput(String input)
	{
		this.textField.setText(input);
	}
}
