package main.java.com.yankov.repair_shop.app.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.java.com.yankov.repair_shop.app.controller.WindowController;

/**
 * ActionListener for action of closing window.
 * 
 * @author Zoran Jankov
 */
public class CloseWindow implements ActionListener
{
	private WindowController controller;
	
	/**
	 * Action is performed on the controller that is passed as parameter.
	 * @param controller
	 */
	public CloseWindow(WindowController controller)
	{
		this.controller = controller;
	}
	
	/**
	 * Disposes opened window.
	 * @param ActionEvent
	 */
	@Override
	public void actionPerformed(ActionEvent e)
	{
		controller.getWindow().dispose();
	}
}