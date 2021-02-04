package com.zoran_jankov.repairq.gui.panel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.zoran_jankov.repairq.gui.utility.LabelFactory;
import com.zoran_jankov.repairq.gui.utility.TextFieldFactory;

import net.miginfocom.swing.MigLayout;

public class TextInputField extends JPanel {
    private static final long serialVersionUID = -1839158784863217197L;

    private JTextField textField = TextFieldFactory.createJTextField(10);
    private boolean isRequiredField;

    /**
     * Create the panel.
     */
    public TextInputField(String fieldName) {
	isRequiredField = isRequired(fieldName);

	setLayout(new MigLayout("", "[][][grow]", "[]"));

	JLabel lblFeildName = LabelFactory.createJLabel(fieldName, new Font("Tahoma", Font.PLAIN, 13));
	add(lblFeildName, "cell 0 0,grow");

	JLabel requiredField = LabelFactory.createJLabel("*", new Font("Tahoma", Font.BOLD, 16));
	requiredField.setForeground(Color.RED);
	requiredField.setVisible(isRequiredField);
	add(requiredField, "cell 1 0,grow");

	add(textField, "cell 2 0,grow");
    }

    public String getInput() {
	if (isRequiredField && isEmpty()) {
	    textField.setBackground(Color.YELLOW);
	} else {
	    textField.setBackground(Color.WHITE);
	}

	return textField.getText();
    }

    private boolean isEmpty() {
	return "".equals(textField.getText());
    }

    private boolean isRequired(String fieldName) {
	switch (fieldName) {
	case "Email":
	case "Address":
	case "Description":
	    return false;

	default:
	    return true;
	}
    }

    public void setInput(String input) {
	this.textField.setText(input);
    }
}