package main.java.com.zoran_jankov.repair_shop.gui.panel;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.java.com.zoran_jankov.repair_shop.data.FieldType;
import net.miginfocom.swing.MigLayout;

public class InputField extends JPanel
{
	private static final long serialVersionUID = 1483321300390555144L;
	
	public InputField(FieldType type)
	{
		setLayout(new MigLayout("", "[]", "[]"));
		
		if(isSelectable(type))
		{
			add(createButton());
		}
		
	}

	private boolean isSelectable(FieldType type)
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