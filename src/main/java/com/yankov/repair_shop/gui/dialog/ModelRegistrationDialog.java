package main.java.com.yankov.repair_shop.gui.dialog;

import java.awt.Window;

import javax.swing.JDialog;

import main.java.com.yankov.repair_shop.gui.panel.IdPanel;
import main.java.com.yankov.repair_shop.gui.panel.InputButtonPanel;
import main.java.com.yankov.repair_shop.gui.panel.ModelRegistrationPanel;
import main.java.com.yankov.repair_shop.gui.panel.PropertyPanel;
import main.java.com.yankov.repair_shop.gui.text.WindowTitle;
import net.miginfocom.swing.MigLayout;

public class ModelRegistrationDialog extends JDialog implements InputDialog
{
	private static final long serialVersionUID = 9140297212046754823L;
	private IdPanel idPanel = new IdPanel();
	private ModelRegistrationPanel modelPanel = new ModelRegistrationPanel();
	private PropertyPanel propertyPanel = new PropertyPanel();
	private InputButtonPanel buttonPanel = new InputButtonPanel();

	public ModelRegistrationDialog(Window owner)
	{
		super(owner);
		
		setResizable(false);
		setTitle(WindowTitle.MODEL);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		getContentPane().setLayout(new MigLayout("", "[434px]", "[20px:n][][200px:n][]"));
		
		getContentPane().add(idPanel, "cell 0 0,grow");
		getContentPane().add(modelPanel, "cell 0 1,grow");
		getContentPane().add(propertyPanel, "cell 0 2,grow");
		getContentPane().add(buttonPanel, "cell 0 3,grow");
		
		pack();
	}

	@Override
	public IdPanel getIdPanel()
	{
		return idPanel;
	}
	
	public ModelRegistrationPanel getModelPanel()
	{
		return modelPanel;
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