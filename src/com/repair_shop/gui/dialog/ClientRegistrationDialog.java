package com.repair_shop.gui.dialog;

import java.awt.Window;

import javax.swing.JDialog;

import com.repair_shop.gui.panel.IdPanel;
import com.repair_shop.gui.panel.InputButtonPanel;
import com.repair_shop.gui.panel.MarketingPanel;
import com.repair_shop.gui.panel.PersonalInfoPanel;
import com.repair_shop.gui.text.WindowTitle;

import net.miginfocom.swing.MigLayout;

public class ClientRegistrationDialog extends JDialog implements InputDialog
{
	private static final long serialVersionUID = -394107433140693140L;
	private IdPanel idPanel = new IdPanel();
	private PersonalInfoPanel personalInfoPanel = new PersonalInfoPanel();
	private MarketingPanel marketingPanel = new MarketingPanel();
	private InputButtonPanel buttonPanel = new InputButtonPanel();
	
	public ClientRegistrationDialog(Window owner)
	{
		super(owner);
		setResizable(false);
		setTitle(WindowTitle.CLIENT);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		getContentPane().setLayout(new MigLayout("", "[434px]", "[25px:n][][][]"));
		getContentPane().add(idPanel, "cell 0 0,grow");
		getContentPane().add(personalInfoPanel, "cell 0 1,grow");
		getContentPane().add(marketingPanel, "cell 0 2,grow");
		getContentPane().add(buttonPanel, "cell 0 3,grow");
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
	
	public MarketingPanel getMarketingPanel()
	{
		return marketingPanel;
	}

	@Override
	public InputButtonPanel getInputButtonPanel()
	{
		return buttonPanel;
	}
}