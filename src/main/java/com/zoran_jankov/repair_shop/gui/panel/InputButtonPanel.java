package main.java.com.zoran_jankov.repair_shop.gui.panel;

import javax.swing.JPanel;

import main.java.com.zoran_jankov.repair_shop.gui.text.ButtonName;
import main.java.com.zoran_jankov.repair_shop.gui.utility.ButtonFactory;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import net.miginfocom.swing.MigLayout;
import java.awt.Font;

public class InputButtonPanel extends JPanel
{
	private static final long serialVersionUID = -454697132541346234L;
	private JButton btnAdd = ButtonFactory.createJButton(ButtonName.ADD, new Font("Tahoma", Font.PLAIN, 13));
	private JButton btnCancel = ButtonFactory.createJButton(ButtonName.CANCEL, new Font("Tahoma", Font.PLAIN, 13));

	public InputButtonPanel()
	{
		setLayout(new MigLayout("", "[225px,grow][225px,grow]", "[30px:n]"));
		
		add(btnAdd, "cell 0 0,grow");
		
		add(btnCancel, "cell 1 0,grow");
	}
	
	public void setAddButtonFunction(ActionListener listener)
	{
		btnAdd.addActionListener(listener);
	}
	
	public void setAddButtonFunction(ActionListener listener, String name)
	{
		setAddButtonFunction(listener);
		btnAdd.setText(name);
	}
	
	public void setCancelButtonFunction(ActionListener listener)
	{
		btnCancel.addActionListener(listener);
	}
	
	public void setCancelButtonFunction(ActionListener listener, String name)
	{
		setCancelButtonFunction(listener);
		btnCancel.setText(name);
	}
}