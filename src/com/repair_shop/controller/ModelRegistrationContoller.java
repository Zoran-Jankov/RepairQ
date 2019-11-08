package com.repair_shop.controller;

import com.repair_shop.data.Model;
import com.repair_shop.data.Property;
import com.repair_shop.gui.ModelRegistrationWindow;
import com.repair_shop.utility.AccessData;
import com.repair_shop.utility.DataType;

public class ModelRegistrationContoller extends InputDialogController
{
	private ModelRegistrationWindow modelGUI;
	
	public ModelRegistrationContoller(WindowController owner, DataType dataType)
	{
		super(owner, dataType);
		modelGUI = (ModelRegistrationWindow) gui;
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
		return modelGUI.comboBoxDeviceType.getSelectedItem() != null;
	}
	
	private boolean isManufacturerSelected()
	{
		
		return modelGUI.comboBoxDeviceType.getSelectedItem() != null;
	}
	
	private boolean isModelNameOK()
	{
		String name = modelGUI.textFieldModel.getText();
		return !("".equals(name) || AccessData.modelsDataTable
				                              .uniqueStringCollision(name));
	}
	
	@Override
	protected Model createDataElement()
	{
		Model newModel = new Model();
		
		newModel.setId(id);
		newModel.setName(modelGUI.textFieldModel.getText());
		newModel.setDescription(modelGUI.editorPaneSpecification.getText());
		newModel.setDeviceType((Property) AccessData.deviceTypesDataTable
				                                    .getByUniqueString((String) modelGUI.comboBoxDeviceType.getSelectedItem()));
		newModel.setBrand(null); //TODO set 
		
		return newModel;
	}

	@Override
	protected void showInputErrors()
	{
		// TODO Auto-generated method stub
	}
}