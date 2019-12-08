package com.repair_shop.app.controller;

import com.repair_shop.app.utility.ActionFactory;
import com.repair_shop.app.utility.ComboBoxModelFactory;
import com.repair_shop.data.DataManager;
import com.repair_shop.data.DataType;
import com.repair_shop.data.entity.Brand;
import com.repair_shop.data.entity.DeviceType;
import com.repair_shop.data.entity.Model;
import com.repair_shop.gui.dialog.ModelRegistrationDialog;

public class ModelRegistrationController extends InputDialogController
{
	private ModelRegistrationDialog modelGUI;
	
	public ModelRegistrationController(WindowController owner, DataType dataType)
	{
		super(owner, dataType);
		modelGUI = (ModelRegistrationDialog) super.gui;
		setComboBoxModels();
		setButtonActionListeners();
	}
	
	private void setComboBoxModels()
	{
		modelGUI.getModelPanel()
		        .setDeviceTypeCmbModel
		        (ComboBoxModelFactory.getModel(DataType.DEVICE_TYPE));
		
		modelGUI.getModelPanel()
		        .setBrandCmbModel
		        (ComboBoxModelFactory.getModel(DataType.BRAND));
	}
	
	private void setButtonActionListeners()
	{
		modelGUI.getModelPanel()
				.setBtnNewDeviceTypeActionlistener(ActionFactory
		        .openWindow(this, DataType.DEVICE_TYPE));
		
		modelGUI.getModelPanel()
		        .setBtnNewBrandActionlistener(ActionFactory
		        .openWindow(this, DataType.BRAND));
	}

	@Override
	protected boolean isInputValid()
	{
		return isDeviceTypeSelected()
			&& isBrandSelected()
			&& isModelNameValid();
	}

	private boolean isDeviceTypeSelected()
	{
		return !("".equals(modelGUI.getModelPanel().getDeviceType()));
	}
	
	private boolean isBrandSelected()
	{
		
		return !("".equals(modelGUI.getModelPanel().getBrand()));
	}
	
	private boolean isModelNameValid()
	{
		String name = modelGUI.getPropertyPanel().getName();
		return !("".equals(name)) && DataManager.modelsDataTable
				                               .uniqueStringCollision(name);
	}
	
	@Override
	protected Model createDataElement()
	{
		Model newModel = new Model();
		
		newModel.setId(id);
		
		newModel.setName(modelGUI.getPropertyPanel().getName());
		
		newModel.setDescription(modelGUI.getPropertyPanel().getDescription());
		
		newModel.setDeviceType((DeviceType) DataManager.getDataElement
				(DataType.DEVICE_TYPE, modelGUI.getModelPanel().getDeviceType()));
				                                
		newModel.setBrand((Brand) DataManager.getDataElement
				(DataType.BRAND, modelGUI.getModelPanel().getBrand()));
		
		return newModel;
	}

	@Override
	protected void showInputErrors()
	{
		if(!isDeviceTypeSelected())
		{
			modelGUI.getModelPanel().showDeviceTypeError();
		}
		
		if(!isBrandSelected())
		{
			modelGUI.getModelPanel().showBrandError();
		}
		
		if(!isModelNameValid())
		{
			modelGUI.getPropertyPanel().showNameError();
		}
	}
}