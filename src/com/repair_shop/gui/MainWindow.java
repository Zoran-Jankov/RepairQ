package com.repair_shop.gui;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import com.repair_shop.gui.panel.DataTablePanel;

import java.awt.GridLayout;

public class MainWindow extends JFrame
{
	private static final long serialVersionUID = -6003284600077289818L;
	private DataTablePanel ticketPanel = new DataTablePanel();
	private DataTablePanel notificationPanel = new DataTablePanel();
	public MainWindow()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		getContentPane().add(tabbedPane);
		
		tabbedPane.add(ticketPanel);
		tabbedPane.setTitleAt(0, "Tickets");
		tabbedPane.setEnabledAt(0, true);
		
		tabbedPane.add(notificationPanel);
		tabbedPane.setTitleAt(1, "Notifications");
		tabbedPane.setEnabledAt(1, true);
	}
}