
package com.repair_shop.controller;

import java.awt.Window;

import com.repair_shop.gui.ModelRegistrationWindow;
import com.repair_shop.utility.AccessData;
import com.repair_shop.utility.IDGenerator;

public class ModelRegistrationContoller extends InputDialogController
{
	private ModelRegistrationWindow gui;
	
	public ModelRegistrationContoller(Window owner)
	{
		gui = new ModelRegistrationWindow(owner);
	}

	public void scanWindowEntries()
	{
		IDGenerator.getNewClientID();
		  
		
	}
	

	public boolean isInputValid()
	{
		return isDeviceTypeSelected()
			&& isManufacturerSelected()
			&& isModelNameEntered()
			&& isModelNameUnique();
	}

	private boolean isDeviceTypeSelected()
	{
		return true;
	}
	
	private boolean isManufacturerSelected()
	{
		
		return true;
	}
	
	private boolean isModelNameEntered()
	{
		return name != null;
	}
	
	private boolean isModelNameUnique()
	{
		return !AccessData.modelsDataTable.containsKey(name);
	}
	
	@Override
	public Model getInput()
	{
		Model newModel = new Model();
		newModel.setId(id);
		newModel.setName(name);
		newModel.setDescription(description);
		newModel.setDeviceType(deviceType);
		newModel.setManufacturer(manufacturer);
		return newModel;
	}

	@Override
	public void showInputErrors()
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void closeWindow()
	{
		gui.getWindow().dispose();
	}

	@Override
	public void trySavingDataElement()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public Window getWindow()
	{
		// TODO Auto-generated method stub
		return null;
	}
}