package com.repair_shop.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JTextField;
import java.awt.Button;

import javax.swing.JEditorPane;
import javax.swing.JButton;

public class ModelRegistrationDialog implements InputDialog
{
	private JDialog modelWindow;
	private JLabel lblModelIDValue = new JLabel("Error");
	public JComboBox<String> cmbDeviceType = new JComboBox<String>();
	public Button btnNewDeviceType = new Button("New Device Type");
	public JComboBox<String> cmbManufacturer = new JComboBox<String>();
	public Button btnNewManufacturer = new Button("New Manufacturer");
	public JTextField txtModel = new JTextField();
	public JEditorPane txtSpecification = new JEditorPane();
	private JButton btnAddNewModel = new JButton("Add");
	private JButton btnCancel = new JButton("Cancel");

	/**
	 * Create frame "Model Registration Form"
	 * @param owner 
	 */
	public ModelRegistrationDialog(Window owner)
	{
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		modelWindow = new JDialog(owner);
		modelWindow.setResizable(false);
		modelWindow.setTitle("Add New Model");
		modelWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		modelWindow.setBounds(100, 100, 340, 540);
		modelWindow.setContentPane(contentPane);

		JLabel lblModelID = new JLabel("Model ID");
		lblModelID.setBounds(10, 11, 314, 14);
		contentPane.add(lblModelID);
		
		lblModelIDValue.setFont(new Font("Serif", Font.BOLD, 25));
		lblModelIDValue.setBounds(10, 36, 314, 25);
		contentPane.add(lblModelIDValue);

		JLabel lblDeviceType = new JLabel("Device Type");
		lblDeviceType.setBounds(10, 72, 200, 14);
		contentPane.add(lblDeviceType);
		
		cmbDeviceType.setBounds(10, 97, 200, 25);
		contentPane.add(cmbDeviceType);
		
		btnNewDeviceType.setBounds(216, 97, 108, 25);
		contentPane.add(btnNewDeviceType);

		JLabel lblManufacturer = new JLabel("Manufacturer");
		lblManufacturer.setBounds(10, 133, 200, 14);
		contentPane.add(lblManufacturer);
		
		cmbManufacturer.setBounds(10, 158, 200, 25);
		contentPane.add(cmbManufacturer);
		
		btnNewManufacturer.setBounds(216, 158, 108, 25);
		contentPane.add(btnNewManufacturer);

		JLabel lblModel = new JLabel("Model");
		lblModel.setBounds(10, 195, 200, 14);
		contentPane.add(lblModel);
		
		txtModel.setBounds(10, 220, 200, 25);
		contentPane.add(txtModel);
		txtModel.setColumns(10);

		JLabel lblSpecification = new JLabel("Specification");
		lblSpecification.setBounds(10, 255, 314, 14);
		contentPane.add(lblSpecification);
		
		txtSpecification.setBounds(10, 280, 314, 184);
		contentPane.add(txtSpecification);

		btnAddNewModel.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnAddNewModel.setBounds(10, 475, 108, 25);
		contentPane.add(btnAddNewModel);
		
		btnCancel.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnCancel.setBounds(216, 475, 108, 25);
		contentPane.add(btnCancel);
	}

	@Override
	public Window getWindow()
	{
		return modelWindow;
	}

	@Override
	public void setIdValue(String id)
	{
		lblModelIDValue.setText(id);
	}

	@Override
	public void setBtnAddActionListener(ActionListener l)
	{
		btnAddNewModel.addActionListener(l);
	}

	@Override
	public void setBtnCancelActionListener(ActionListener l)
	{
		btnCancel.addActionListener(l);
	}
}	