package com.repair_shop.gui.dialog;

import java.awt.Window;

import javax.swing.JDialog;

import com.repair_shop.data.DataType;
import com.repair_shop.gui.panel.IdPanel;
import com.repair_shop.gui.panel.InputButtonPanel;
import com.repair_shop.gui.panel.PropertyPanel;
import com.repair_shop.gui.text.WindowTitle;

import net.miginfocom.swing.MigLayout;

public class PropertyRegistrationDialog extends JDialog implements InputDialog
{
	private static final long serialVersionUID = 6674166830353586592L;
	private IdPanel idPanel = new IdPanel();
	private PropertyPanel propertyPanel = new PropertyPanel();
	private InputButtonPanel buttonPanel = new InputButtonPanel();
	
	public PropertyRegistrationDialog(Window owner, DataType dataType)
	{
		super(owner);
		
		setResizable(false);
		setTitle(WindowTitle.getPropertyTitle(dataType));
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		getContentPane().setLayout(new MigLayout("", "[434px]", "[20px:n][grow][]"));
		
		getContentPane().add(idPanel, "cell 0 0,grow");
		
		getContentPane().add(propertyPanel, "cell 0 1,grow");
		
		getContentPane().add(buttonPanel, "cell 0 2,grow");
		
		pack();
	}

	@Override
	public IdPanel getIdPanel()
	{
		return idPanel;
	}
	
	public PropertyPanel getPropertyPanel()
	{
		return propertyPanel;
	}

	@Override
	public InputButtonPanel getInputButtonPanel()
	{
		return buttonPanel;
	}
}