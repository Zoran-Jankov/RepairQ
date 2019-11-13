package com.repair_shop.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JDialog;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Window;

public class TicketRegistrationDialog
{
	
	private JDialog window;
	private JLabel lblNewTicket = new JLabel("New Ticket");
	private JLabel lblTicketIDValue = new JLabel("Error");
	private JComboBox<String> comboBoxPriority = new JComboBox<String>();
	private JLabel lblDevice = new JLabel("Device");
	private JLabel lblDeviceID = new JLabel("ID");
	private JComboBox<String> comboBoxDeviceIDValue = new JComboBox<String>();
	private JButton btnAddNewDevice = new JButton("Add New Device");
	private JLabel lblClient = new JLabel("Client");
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
	public TicketRegistrationDialog(Window owner)
	{
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		window = new JDialog(owner);
		window.setResizable(false);
		window.setTitle("Ticket Registration");
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.setBounds(0, 0, 644, 700);
		window.setVisible(true);
		window.setContentPane(contentPane);
		
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
		
		btnAddNewDevice.setBounds(61, 289, 111, 23);
		contentPane.add(btnAddNewDevice);
		lblClient.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblClient.setBounds(349, 129, 239, 14);
		contentPane.add(lblClient);
		
		JLabel lblSearch = new JLabel("Search");
		lblSearch.setBounds(349, 164, 48, 14);
		contentPane.add(lblSearch);
		
		textFieldSearch = new JTextField();
		textFieldSearch.setBounds(444, 161, 144, 20);
		contentPane.add(textFieldSearch);
		textFieldSearch.setColumns(10);
		
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