package com.zoran_jankov.repairq.gui.dialog;

import com.zoran_jankov.repairq.gui.panel.IdPanel;
import com.zoran_jankov.repairq.gui.panel.InputButtonPanel;

public interface InputDialog {
    public IdPanel getIdPanel();

    public InputButtonPanel getInputButtonPanel();

    public void setVisible(boolean b);
}