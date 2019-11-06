package com.repair_shop.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Window;

public class TicketRegistrationWindow extends JFrame
{
	private static final long serialVersionUID = -4907863983944144074L;
	private JPanel contentPane = new JPanel();
	private JLabel lblNewTicket = new JLabel("New Ticket");
	private JLabel lblTicketIDValue = new JLabel("Error");
	private JComboBox<?> comboBoxPriority = new JComboBox<Object>();
	private JLabel lblDevice = new JLabel("Device");
	private JLabel lblDeviceID = new JLabel("ID");
	private JComboBox<?> comboBoxDeviceIDValue = new JComboBox<Object>();
	private JLabel lblDeviceType = new JLabel("Type");
	private JLabel lblTaypeValue = new JLabel("Error");
	private JLabel lblDeviceManufacturer = new JLabel("Manufacturer");
	private JLabel lblManufacturerValue = new JLabel("Error");
	private JLabel lblModel = new JLabel("Model");
	private JLabel lblModelValue = new JLabel("Error");
	private JLabel lblSerial = new JLabel("Serial");
	private JLabel lblSerialValue = new JLabel("Error");
	private JButton btnAddNewDevice = new JButton("Add New Device");
	private JLabel lblClient = new JLabel("Client");
	private JLabel lblClientID = new JLabel("ID");
	private JLabel comboBoxClientIDValue = new JLabel();
	private JLabel lblName = new JLabel("Name");
	private JLabel comboBoxNameValue = new JLabel();
	private JLabel lblprimePhoneNum = new JLabel("Phone Number");
	private JComboBox<?> comboBoxPhoneValue = new JComboBox<Object>();
	private JLabel lblEmail = new JLabel("Email");
	private JLabel comboBoxEmailValue = new JLabel();
	private JButton btnAddNewClient = new JButton("Add New Client");
	private JLabel lblTicketDetails = new JLabel("Ticket Details");
	private JTextPane details = new JTextPane();
	private JLabel lblImportantNotes = new JLabel("Important Notes");
	private JTextPane importantNotes = new JTextPane();
	private JLabel lblAccessories = new JLabel("Accessories");
	private JTextPane accessories = new JTextPane();
	private JButton btnNewTicket = new JButton("Add New Ticket");
	private JButton btnCancel = new JButton("Cancel");
	private JTextField textFieldSearch;
	
	/**
	 * Creates frame "Add New Ticket".
	 * @param owner 
	 */
	public TicketRegistrationWindow(Window owner)
	{
		setType(Type.UTILITY);
		setResizable(false);
		setBackground(Color.WHITE);
		setTitle("Ticket Registration");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(0, -19, 636, 718);
		contentPane.setBackground(SystemColor.activeCaption);
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewTicket.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewTicket.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewTicket.setBounds(159, 11, 153, 14);
		contentPane.add(lblNewTicket);
		
		lblTicketIDValue.setHorizontalAlignment(SwingConstants.CENTER);
		lblTicketIDValue.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		lblTicketIDValue.setBounds(339, 11, 111, 14);
		contentPane.add(lblTicketIDValue);
		
		contentPane.add(comboBoxPriority);
		lblDevice.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblDevice.setBounds(36, 129, 208, 14);
		contentPane.add(lblDevice);
		
		lblDeviceID.setBounds(36, 164, 48, 14);
		contentPane.add(lblDeviceID);
		
		comboBoxDeviceIDValue.setBounds(159, 160, 85, 22);
		contentPane.add(comboBoxDeviceIDValue);
		
		lblDeviceType.setBounds(36, 189, 63, 14);
		contentPane.add(lblDeviceType);
		
		lblTaypeValue.setBounds(159, 189, 121, 14);
		contentPane.add(lblTaypeValue);
		
		lblDeviceManufacturer.setBounds(36, 214, 100, 14);
		contentPane.add(lblDeviceManufacturer);
		
		lblManufacturerValue.setBounds(159, 214, 121, 14);
		contentPane.add(lblManufacturerValue);
		
		lblModel.setBounds(36, 239, 48, 14);
		contentPane.add(lblModel);
		
		lblModelValue.setBounds(159, 239, 121, 14);
		contentPane.add(lblModelValue);
		
		lblSerial.setBounds(36, 264, 48, 14);
		contentPane.add(lblSerial);
		
		lblSerialValue.setBounds(159, 264, 121, 14);
		contentPane.add(lblSerialValue);
		
		btnAddNewDevice.setBounds(61, 289, 111, 23);
		contentPane.add(btnAddNewDevice);
		lblClient.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblClient.setBounds(349, 129, 239, 14);
		contentPane.add(lblClient);
		
		lblClientID.setBounds(349, 189, 48, 14);
		contentPane.add(lblClientID);
		comboBoxClientIDValue.setText("Error");
		
		comboBoxClientIDValue.setBounds(444, 183, 144, 20);
		contentPane.add(comboBoxClientIDValue);
		
		lblName.setBounds(349, 214, 48, 14);
		contentPane.add(lblName);
		comboBoxNameValue.setText("Error");
		
		comboBoxNameValue.setBounds(444, 208, 144, 20);
		contentPane.add(comboBoxNameValue);
		
		lblprimePhoneNum.setBounds(349, 239, 85, 14);
		contentPane.add(lblprimePhoneNum);
		
		comboBoxPhoneValue.setBounds(444, 236, 144, 20);
		contentPane.add(comboBoxPhoneValue);
		
		lblEmail.setBounds(349, 264, 48, 14);
		contentPane.add(lblEmail);
		comboBoxEmailValue.setText("Error");
		
		comboBoxEmailValue.setBounds(444, 261, 144, 20);
		contentPane.add(comboBoxEmailValue);
		
		btnAddNewClient.setBounds(400, 289, 121, 23);
		contentPane.add(btnAddNewClient);
		
		lblTicketDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblTicketDetails.setBounds(259, 353, 95, 14);
		contentPane.add(lblTicketDetails);
		
		details.setBounds(10, 378, 610, 78);
		contentPane.add(details);
		
		lblImportantNotes.setHorizontalAlignment(SwingConstants.CENTER);
		lblImportantNotes.setBounds(264, 479, 90, 14);
		contentPane.add(lblImportantNotes);	
		
		importantNotes.setBounds(10, 504, 610, 35);
		contentPane.add(importantNotes);
		
		lblAccessories.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccessories.setBounds(250, 549, 126, 14);
		contentPane.add(lblAccessories);
		
		accessories.setBounds(10, 564, 610, 35);
		contentPane.add(accessories);
		
		btnNewTicket.setBounds(61, 655, 111, 23);
		contentPane.add(btnNewTicket);
		
		btnCancel.setBounds(476, 655, 89, 23);
		contentPane.add(btnCancel);
		
		textFieldSearch = new JTextField();
		textFieldSearch.setBounds(444, 161, 144, 20);
		contentPane.add(textFieldSearch);
		textFieldSearch.setColumns(10);
		
		JLabel lblSearch = new JLabel("Search");
		lblSearch.setBounds(349, 164, 48, 14);
		contentPane.add(lblSearch);
	}
	
	public void addNewDeviceListener(ActionListener addNewDeviceListener)
	{
		btnAddNewDevice.addActionListener(addNewDeviceListener);
	}
	
	public void addNewClientListener(ActionListener addNewClientListener)
	{
		btnAddNewClient.addActionListener(addNewClientListener);
	}
	
	public void newTicketListener(ActionListener newTickedListener)
	{
		btnNewTicket.addActionListener(newTickedListener);
	}

	public int getPriority()
	{
		return comboBoxPriority.getSelectedIndex();
	}

	public int getClientID()
	{
		//TODO Get Client ID
		return 0;
	}

	public int getDeviceID()
	{
		return comboBoxDeviceIDValue.getSelectedIndex();
	}

	public String getDetails()
	{
		return details.getText();
	}

	public String getImportantNotes()
	{
		return importantNotes.getText();
	}

	public String getAccessories()
	{
		return accessories.getText();
	}
}