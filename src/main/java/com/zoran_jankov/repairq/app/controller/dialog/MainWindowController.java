package com.zoran_jankov.repairq.app.controller.dialog;

import java.awt.Window;

import com.zoran_jankov.repairq.app.utility.ListenerFactory;
import com.zoran_jankov.repairq.data.EntityType;
import com.zoran_jankov.repairq.gui.MainWindow;
import com.zoran_jankov.repairq.gui.text.ButtonName;

public class MainWindowController implements WindowController {
    private MainWindow mainWindow = new MainWindow();

    public MainWindowController() {
	mainWindow.setVisible(true);

	mainWindow.getTicketPanel().setButtonNewFunction(ListenerFactory.openWindow(this, EntityType.TICKET),
		ButtonName.TICKET);
    }

    @Override
    public Window getWindow() {
	return mainWindow;
    }
}