package com.repair_shop.controller;

import com.repair_shop.data.Brand;
import com.repair_shop.data.DataManager;
import com.repair_shop.data.DataType;
import com.repair_shop.data.DeviceType;
import com.repair_shop.data.Model;
import com.repair_shop.gui.ModelRegistrationDialog;
import com.repair_shop.utility.ActionListenerFactory;
import com.repair_shop.utility.CmbModelFactory;

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
		        (CmbModelFactory.getModel(DataType.DEVICE_TYPE));
		
		modelGUI.getModelPanel()
		        .setBrandCmbModel
		        (CmbModelFactory.getModel(DataType.BRAND));
	}
	
	private void setButtonActionListeners()
	{
		modelGUI.getModelPanel()
				.setBtnNewDeviceTypeActionlistener(ActionListenerFactory
		        .openNewWindow(this, DataType.DEVICE_TYPE));
		
		modelGUI.getModelPanel()
		        .setBtnNewBrandActionlistener(ActionListenerFactory
		        .openNewWindow(this, DataType.BRAND));
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
		return !("".equals(name) || DataManager.modelsDataTable
				                               .uniqueStringCollision(name));
	}
	
	@Override
	protected Model createDataElement()
	{
		Model newModel = new Model();
		
		newModel.setId(id);
		newModel.setName(modelGUI.getPropertyPanel().getName());
		newModel.setDescription(modelGUI.getPropertyPanel().getDescription());
		newModel.setDeviceType((DeviceType) DataManager.getDataElement(DataType.DEVICE_TYPE, 
				                               modelGUI.getModelPanel().getDeviceType()));
				                                
		newModel.setBrand((Brand) DataManager.getDataElement(DataType.BRAND, 
                                     modelGUI.getModelPanel().getBrand()));
		return newModel;
	}

	@Override
	protected void showInputErrors()
	{
		checkDeviceType();
		checkBrand();
		checkModelName();
	}

	private void checkDeviceType()
	{
		if(isDeviceTypeSelected())
		{
			modelGUI.getModelPanel().showDeviceTypeDefault();
		}
		else
		{
			modelGUI.getModelPanel().showDeviceTypeError();
		}
	}

	private void checkBrand()
	{
		if(isBrandSelected())
		{
			modelGUI.getModelPanel().showBrandDefault();
		}
		else
		{
			modelGUI.getModelPanel().showBrandError();
		}
	}

	private void checkModelName()
	{
		if(isModelNameValid())
		{
			modelGUI.getPropertyPanel().showNameDefault();
		}
		else
		{
			modelGUI.getPropertyPanel().showNameError();
		}
	}
}