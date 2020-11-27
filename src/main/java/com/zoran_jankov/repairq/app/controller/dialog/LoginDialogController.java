package com.zoran_jankov.repairq.app.controller.dialog;

import java.awt.Window;

import com.zoran_jankov.repairq.gui.dialog.LoginDialog;
import com.zoran_jankov.repairq.gui.text.ButtonName;

import com.zoran_jankov.repairq.app.utility.WindowControllerFactory;
import com.zoran_jankov.repairq.app.utility.WindowTag;

import com.zoran_jankov.repairq.app.utility.ListenerFactory;

public class LoginDialogController implements WindowController {
    private LoginDialog gui = new LoginDialog();

    public LoginDialogController() {
	gui.getInputButtonPanel().setAddButtonFunction(ListenerFactory.login(this), ButtonName.LOGIN);

	gui.getInputButtonPanel().setCancelButtonFunction(ListenerFactory.closeWindow(this), ButtonName.QUIT);

	gui.setVisible(true);
    }

    @Override
    public Window getWindow() {
	return gui;
    }

    public void tryLogin() {
	if (isInputValid()) {
	    login();
	} else {
	    showLoginError();
	}
    }

    private boolean isInputValid() {
	return true;
    }

    private void login() {
	WindowControllerFactory.createController(WindowTag.MAIN_WINDOW);
	gui.dispose();
    }

    private void showLoginError() {
	gui.showLoginError();
    }
}