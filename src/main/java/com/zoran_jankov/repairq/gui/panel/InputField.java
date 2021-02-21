package com.zoran_jankov.repairq.gui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Window;

import javax.swing.FocusManager;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.zoran_jankov.repairq.app.FieldProperties;
import com.zoran_jankov.repairq.app.listener.ListenerFactory;
import com.zoran_jankov.repairq.data.entity.Entity;
import com.zoran_jankov.repairq.gui.utility.LabelFactory;
import com.zoran_jankov.repairq.gui.utility.TextFieldFactory;

import net.miginfocom.swing.MigLayout;

public class InputField extends JPanel {
    private static final long serialVersionUID = -1839158784863217197L;
    private JTextField textField = TextFieldFactory.createJTextField(10);
    private Entity selectedEntity;
    private FieldProperties fieldProperties;

    public InputField(FieldProperties fieldProperties) {
	this.fieldProperties = fieldProperties;
	
	setLayout(new MigLayout("", "[left][][grow,fill][]", "[20px:n,fill]"));

	JLabel labelFeildName = LabelFactory.createJLabel(fieldProperties.getLabel(), new Font("Tahoma", Font.PLAIN, 13));
	add(labelFeildName, "cell 0 0,grow");
	
	add(textField, "cell 2 0,grow");
	
	if (fieldProperties.isRequired()) {
	    convertToRequiredField();
	}
	
	if (isEntity()) {
	    convertToSelectionField();
	}
    }
    
    private void convertToRequiredField() {
	JLabel requiredField = LabelFactory.createJLabel("*", new Font("Tahoma", Font.BOLD, 16));
	add(requiredField, "cell 1 0,grow");
	requiredField.setForeground(Color.RED);
	textField.setToolTipText("⚠ This is a required field.");
    }
    
    private void convertToSelectionField() {
	JButton buttonSelect = new JButton("🔍");
	Window activeWindow = FocusManager.getCurrentManager().getActiveWindow();
	buttonSelect.addActionListener(ListenerFactory.openLookup(activeWindow,fieldProperties.getType()));
	add(buttonSelect, "cell 3 0");
    }
    
    private boolean isEntity() {
	if(fieldProperties.getType() == Entity.class) {
	    return true;
	} else { 
	    return false;
	}
    }

    public boolean isEmpty() {
	return "".equals(textField.getText());
    }
    
    public Object getInput() {
	textField.setBackground(Color.WHITE);
	if (isEntity()) {
	  return selectedEntity;
	} else {
	    return textField.getText();
	}
    }
    
    public void setInput(Object input) {
	if (isEntity()) {
	    textField.setText(((Entity) input).getDisplayName());
	    this.selectedEntity = (Entity) input;
	} else {
	    textField.setText((String) input);
	}
    }
    
    public void showError(String ErrorToolTip) {
	textField.setToolTipText(ErrorToolTip);
	textField.setBackground(Color.PINK);
    }
}