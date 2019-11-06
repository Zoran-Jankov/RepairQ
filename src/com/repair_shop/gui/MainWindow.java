package com.repair_shop.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTabbedPane;
import javax.swing.Icon;
import java.awt.Font;
import javax.swing.JTable;

public class MainWindow extends JFrame 
{
	private static final long serialVersionUID = -4962525271717601574L;
	private JPanel contentPane;
	private JTable tblTickets;
	private JTable tblDevices;

	/**
	 * Create the frame.
	 */
	public MainWindow()
	{
		setTitle("Repair Shop Software");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 683);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tabbedPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.add(tabbedPane);
		
		JPanel panelTickets = new JPanel();
		panelTickets.setBorder(new EmptyBorder(0, 0, 0, 0));
		tabbedPane.addTab("Tickets", (Icon) null, panelTickets, null);
		panelTickets.setLayout(null);
		
		tblTickets = new JTable();
		tblTickets.setBounds(10, 11, 529, 345);
		panelTickets.add(tblTickets);
		
		JPanel panelDevices = new JPanel();
		tabbedPane.addTab("Devices", null, panelDevices, null);
		panelDevices.setLayout(null);
		
		tblDevices = new JTable();
		tblDevices.setBounds(10, 11, 371, 583);
		panelDevices.add(tblDevices);
		
		JPanel panelClients = new JPanel();
		tabbedPane.addTab("Clients", null, panelClients, null);
	}
}