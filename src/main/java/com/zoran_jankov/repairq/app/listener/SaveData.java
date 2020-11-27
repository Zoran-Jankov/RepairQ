package com.zoran_jankov.repairq.app.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.zoran_jankov.repairq.app.controller.dialog.InputDialogController;

public class SaveData implements ActionListener {
    private InputDialogController controller;

    public SaveData(InputDialogController controller) {
	this.controller = controller;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	controller.trySavingEntity();
    }
}