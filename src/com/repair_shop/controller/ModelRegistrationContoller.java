package com.repair_shop.controller;

import com.repair_shop.data.Brand;
import com.repair_shop.data.DeviceType;
import com.repair_shop.data.Model;
import com.repair_shop.gui.ModelRegistrationDialog;
import com.repair_shop.utility.AccessData;
import com.repair_shop.utility.DataType;

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
		return !("".equals(name) || AccessData.modelsDataTable
				                              .uniqueStringCollision(name));
	}
	
	@Override
	protected Model createDataElement()
	{
		Model newModel = new Model();
		
		newModel.setId(id);
		newModel.setName(modelGUI.txtModel.getText());
		newModel.setDescription(modelGUI.txtSpecification.getText());
		newModel.setDeviceType((DeviceType) AccessData.deviceTypesDataTable
				                                    .getByUniqueString((String) modelGUI
				                                    .cmbDeviceType
				                                    .getSelectedItem()));
		
		newModel.setBrand((Brand) AccessData.brandsDataTable
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