package com.zoran_jankov.repairq.gui;

import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

import com.zoran_jankov.repairq.gui.panel.DataTablePanel;
import com.zoran_jankov.repairq.gui.text.TabName;
import com.zoran_jankov.repairq.gui.text.WindowTitleUtils;

public class MainWindow extends JFrame {
    private static final long serialVersionUID = -6003284600077289818L;
    private DataTablePanel ticketPanel = new DataTablePanel();
    private DataTablePanel notificationPanel = new DataTablePanel();

    public MainWindow() {
	setTitle(WindowTitleUtils.MAIN_WINDOW);
	setExtendedState(Frame.MAXIMIZED_BOTH);
	setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	getContentPane().setLayout(new GridLayout(1, 0, 0, 0));

	JTabbedPane tabbedPane = new JTabbedPane(SwingConstants.LEFT);
	getContentPane().add(tabbedPane);

	tabbedPane.addTab(TabName.TICKET, UIManager.getIcon("FileView.fileIcon"), ticketPanel, "Tickets View");
	tabbedPane.setEnabledAt(0, true);

	tabbedPane.addTab(TabName.NOTIFICATION, UIManager.getIcon("FileChooser.homeFolderIcon"), notificationPanel,
		"Notifications View");
	tabbedPane.setEnabledAt(1, true);

	pack();
    }

    public DataTablePanel getNotificationPanel() {
	return notificationPanel;
    }

    public DataTablePanel getTicketPanel() {
	return ticketPanel;
    }
}