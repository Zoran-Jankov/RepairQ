package com.repair_shop.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.repair_shop.data.Property;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JTextField;
import java.awt.Button;

import javax.swing.JEditorPane;
import javax.swing.JButton;

public class ModelRegistrationWindow implements WindowContainer
{
	public JDialog window = new JDialog();
	public JPanel contentPane = new JPanel();
	public JLabel lblModelIDValue = new JLabel("Error");
	public JComboBox<String> comboBoxDeviceType = new JComboBox<String>();
	public Button btnNewDeviceType = new Button("New Device Type");
	public Button btnNewManufacturer = new Button("New Manufacturer");
	public JTextField textFieldModel = new JTextField();
	public JEditorPane editorPaneSpecification = new JEditorPane();
	public JButton btnAdd = new JButton("Add");
	public JButton btnCancel = new JButton("Cancel");

	/**
	 * Create frame "Model Registration Form"
	 * @param owner 
	 */
	public ModelRegistrationWindow(Window owner)
	{
		window.setResizable(false);
		window.setTitle("Add New Model");
		window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		window.setBounds(100, 100, 340, 540);
		window.setContentPane(contentPane);
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);

		JLabel lblModelID = new JLabel("Model ID");
		lblModelID.setBounds(10, 11, 314, 14);
		contentPane.add(lblModelID);
		
		lblModelIDValue.setFont(new Font("Serif", Font.BOLD, 25));
		lblModelIDValue.setBounds(10, 36, 314, 25);
		contentPane.add(lblModelIDValue);

		JLabel lblDeviceType = new JLabel("Device Type");
		lblDeviceType.setBounds(10, 72, 200, 14);
		contentPane.add(lblDeviceType);
		
		comboBoxDeviceType.setBounds(10, 97, 200, 25);
		contentPane.add(comboBoxDeviceType);
		
		btnNewDeviceType.setBounds(216, 97, 108, 25);
		contentPane.add(btnNewDeviceType);

		JLabel lblManufacturer = new JLabel("Manufacturer");
		lblManufacturer.setBounds(10, 133, 200, 14);
		contentPane.add(lblManufacturer);
		
		JComboBox<Property> comboBoxManufacturer = new JComboBox<Property>();
		comboBoxManufacturer.setBounds(10, 158, 200, 25);
		contentPane.add(comboBoxManufacturer);
		
		btnNewManufacturer.setBounds(216, 158, 108, 25);
		contentPane.add(btnNewManufacturer);

		JLabel lblModel = new JLabel("Model");
		lblModel.setBounds(10, 195, 200, 14);
		contentPane.add(lblModel);
		
		textFieldModel.setBounds(10, 220, 200, 25);
		contentPane.add(textFieldModel);
		textFieldModel.setColumns(10);

		JLabel lblSpecification = new JLabel("Specification");
		lblSpecification.setBounds(10, 255, 314, 14);
		contentPane.add(lblSpecification);
		
		editorPaneSpecification.setBounds(10, 280, 314, 184);
		contentPane.add(editorPaneSpecification);

		btnAdd.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnAdd.setBounds(10, 475, 108, 25);
		contentPane.add(btnAdd);
		
		btnCancel.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnCancel.setBounds(216, 475, 108, 25);
		contentPane.add(btnCancel);
	}

	@Override
	public Window getWindow()
	{
		return window;
	}
}	