package main.java.com.zoran_jankov.repair_shop.gui.utility;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.java.com.zoran_jankov.repair_shop.data.FieldType;

public class InputField
{
	JPanel panel = new JPanel();
	
	public InputField(FieldType type)
	{
		
		
		panel.add(createLabel(type));
		panel.add(createInputFeild(type));
		
		if(isSelectable())
		{
			panel.add(createButton());
		}
		
	}

	private boolean isSelectable()
	{
		return false;
	}

	private JLabel createInputFeild(FieldType type)
	{
		return null;
	}

	private Component createLabel(FieldType type)
	{
		return null;
	}
	
	private JButton createButton()
	{
		return null;
	}
}