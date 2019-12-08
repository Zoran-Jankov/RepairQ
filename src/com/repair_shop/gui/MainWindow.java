package com.repair_shop.gui;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import com.repair_shop.gui.panel.DataTablePanel;
import com.repair_shop.gui.text.TabName;
import com.repair_shop.gui.text.WindowTitle;

import java.awt.GridLayout;

public class MainWindow extends JFrame
{
	private static final long serialVersionUID = -6003284600077289818L;
	private DataTablePanel ticketPanel = new DataTablePanel();
	private DataTablePanel notificationPanel = new DataTablePanel();
	
	public MainWindow()
	{
		setTitle(WindowTitle.MAIN_WINDOW);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		getContentPane().add(tabbedPane);
		
		tabbedPane.add(ticketPanel);
		tabbedPane.setTitleAt(0, TabName.TICKET);
		tabbedPane.setEnabledAt(0, true);
		
		tabbedPane.add(notificationPanel);
		tabbedPane.setTitleAt(1, TabName.NOTIFICATION);
		tabbedPane.setEnabledAt(1, true);
		
		pack();
	}
}