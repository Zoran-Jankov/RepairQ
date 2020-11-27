package com.zoran_jankov.repairq.gui.utility;

import java.awt.Window;

import com.zoran_jankov.repairq.data.EntityType;
import com.zoran_jankov.repairq.gui.dialog.CustomerRegistrationDialog;
import com.zoran_jankov.repairq.gui.dialog.DeviceRegistrationDialog;
import com.zoran_jankov.repairq.gui.dialog.InputDialog;
import com.zoran_jankov.repairq.gui.dialog.ModelRegistrationDialog;
import com.zoran_jankov.repairq.gui.dialog.PropertyRegistrationDialog;
import com.zoran_jankov.repairq.gui.dialog.TicketRegistrationDialog;

public class InputDialogFactory {
    public static InputDialog getWindow(Window owner, EntityType type) {
	switch (type) {
	case TICKET:
	    return new TicketRegistrationDialog(owner);

	case CUSTOMER:
	    return new CustomerRegistrationDialog(owner);

	case DEVICE:
	    return new DeviceRegistrationDialog(owner);

	case MODEL:
	    return new ModelRegistrationDialog(owner);

	default: {
	    if (EntityType.isABasicInfo(type)) {
		return new PropertyRegistrationDialog(owner, type);
	    } else {
		return null;
	    }
	}
	}
    }
}