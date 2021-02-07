package com.zoran_jankov.repairq.gui.dialog;

import java.awt.Window;

import javax.swing.JDialog;

import com.zoran_jankov.repairq.gui.panel.DeviceRegistrationPanel;
import com.zoran_jankov.repairq.gui.panel.IdPanel;
import com.zoran_jankov.repairq.gui.panel.InputButtonPanel;
import com.zoran_jankov.repairq.gui.text.WindowTitleUtils;

import net.miginfocom.swing.MigLayout;

public class DeviceRegistrationDialog extends JDialog implements InputDialog {
    private static final long serialVersionUID = -4737312459407759293L;
    private IdPanel idPanel = new IdPanel();
    private DeviceRegistrationPanel devicePanel = new DeviceRegistrationPanel();
    private InputButtonPanel buttonPanel = new InputButtonPanel();

    public DeviceRegistrationDialog(Window owner) {
	super(owner);

	setResizable(false);
	setTitle(WindowTitleUtils.NEW_DEVICE);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	getContentPane().setLayout(new MigLayout("", "[434px]", "[25px:n][][]"));

	getContentPane().add(idPanel, "cell 0 0,grow");

	getContentPane().add(devicePanel, "cell 0 1,grow");

	getContentPane().add(buttonPanel, "cell 0 2,grow");

	pack();
    }

    public DeviceRegistrationPanel getDeviceRegistrationPanel() {
	return devicePanel;
    }

    public IdPanel getIdPanel() {
	return idPanel;
    }

    public InputButtonPanel getInputButtonPanel() {
	return buttonPanel;
    }
}