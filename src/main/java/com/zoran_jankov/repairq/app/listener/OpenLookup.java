package com.zoran_jankov.repairq.app.listener;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.FocusManager;

import com.zoran_jankov.repairq.data.entity.Entity;
import com.zoran_jankov.repairq.gui.dialog.LookupWindow;
import com.zoran_jankov.repairq.gui.panel.InputFieldPanel;

public class OpenLookup implements ActionListener {
    
    private InputFieldPanel inputField;
    private Class<? extends Entity> type;
    private Window activeWindow;
    
    public OpenLookup(InputFieldPanel inputField, Class<? extends Entity> type) {
	this.inputField= inputField;
	this.type = type;
	this.activeWindow = FocusManager.getCurrentManager().getActiveWindow();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	new LookupWindow(inputField, type, activeWindow);

    }
}