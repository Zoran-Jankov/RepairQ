package com.repair_shop.controller;

import com.repair_shop.data.Brand;
import com.repair_shop.data.DataType;
import com.repair_shop.data.DeviceType;
import com.repair_shop.data.Model;
import com.repair_shop.gui.ModelRegistrationDialog;
import com.repair_shop.utility.DataManager;

public class ModelRegistrationContoller extends InputDialogController
{
	private ModelRegistrationDialog modelGUI;
	
	public ModelRegistrationContoller(WindowController owner, DataType dataType)
	{
		super(owner, dataType);
		modelGUI = (ModelRegistrationDialog) gui;
	}

	@Override
	protected boolean isInputValid()
	{
		return isDeviceTypeSelected()
			&& isManufacturerSelected()
			&& isModelNameOK();
	}

	private boolean isDeviceTypeSelected()
	{
		return modelGUI.cmbDeviceType.getSelectedItem() != null;
	}
	
	private boolean isManufacturerSelected()
	{
		
		return modelGUI.cmbDeviceType.getSelectedItem() != null;
	}
	
	private boolean isModelNameOK()
	{
		String name = modelGUI.txtModel.getText();
		return !("".equals(name) || DataManager.modelsDataTable
				                              .uniqueStringCollision(name));
	}
	
	@Override
	protected Model createDataElement()
	{
		Model newModel = new Model();
		
		newModel.setId(id);
		newModel.setName(modelGUI.txtModel.getText());
		newModel.setDescription(modelGUI.txtSpecification.getText());
		newModel.setDeviceType((DeviceType) DataManager.deviceTypesDataTable
				                                    .getByUniqueString((String) modelGUI
				                                    .cmbDeviceType
				                                    .getSelectedItem()));
		
		newModel.setBrand((Brand) DataManager.brandsDataTable
									           .getByUniqueString((String) modelGUI
									           .cmbManufacturer
									           .getSelectedItem()));
		
		return newModel;
	}

	@Override
	protected void showInputErrors()
	{
		//TODO Input erros
	}
}