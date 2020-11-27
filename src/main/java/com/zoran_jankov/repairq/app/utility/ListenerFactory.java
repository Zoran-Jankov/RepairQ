package com.zoran_jankov.repairq.app.utility;

import java.awt.event.ActionListener;

import com.zoran_jankov.repairq.app.controller.dialog.InputDialogController;
import com.zoran_jankov.repairq.app.controller.dialog.LoginDialogController;
import com.zoran_jankov.repairq.app.controller.dialog.WindowController;
import com.zoran_jankov.repairq.app.listener.CloseWindow;
import com.zoran_jankov.repairq.app.listener.Login;
import com.zoran_jankov.repairq.app.listener.OpenWindow;
import com.zoran_jankov.repairq.app.listener.SaveData;
import com.zoran_jankov.repairq.app.listener.UpdateData;
import com.zoran_jankov.repairq.data.EntityType;

/**
 * The ActionFactory class is a factory for action listeners.
 * 
 * @author Zoran Jankov
 *
 */
public class ListenerFactory {
    /**
     * Returns new SaveData ActionListener
     * 
     * @param controller - InputDialogController
     * @return new SaveData ActionListener
     */
    public static ActionListener saveData(InputDialogController controller) {
	return new SaveData(controller);
    }

    public static ActionListener updateData(InputDialogController controller) {
	return new UpdateData(controller);
    }

    /**
     * Returns new OpenWindow ActionListener
     * 
     * @param owner    - Window owner of the new window
     * @param dataType - EntityType enum
     * @return new OpenWindow ActionListener
     */
    public static ActionListener openWindow(WindowController owner, EntityType entityType) {
	return new OpenWindow(owner, entityType);
    }

    /**
     * Returns new OpenWindow ActionListener
     * 
     * @param window - WindowTag of the new window
     * @return new OpenWindow ActionListener
     */
    public static ActionListener openWindow(WindowTag window) {
	return new OpenWindow(window);
    }

    /**
     * Returns new CloseWindow ActionListener
     * 
     * @param controller - WindowController
     * @return new CloseWindow ActionListener
     */
    public static ActionListener closeWindow(WindowController controller) {
	return new CloseWindow(controller);
    }

    /**
     * Returns new Login ActionListener
     * 
     * @param controller - LoginDialogController
     * @return new Login ActionListener
     */
    public static ActionListener login(LoginDialogController controller) {
	return new Login(controller);
    }
}