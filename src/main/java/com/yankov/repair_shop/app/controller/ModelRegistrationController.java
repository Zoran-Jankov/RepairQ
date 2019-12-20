package main.java.com.yankov.repair_shop.app.controller;

import main.java.com.yankov.repair_shop.app.utility.ListenerFactory;
import main.java.com.yankov.repair_shop.app.utility.ComboBoxModelManager;
import main.java.com.yankov.repair_shop.data.DataManager;
import main.java.com.yankov.repair_shop.data.EntityType;
import main.java.com.yankov.repair_shop.data.entity.Brand;
import main.java.com.yankov.repair_shop.data.entity.DeviceType;
import main.java.com.yankov.repair_shop.data.entity.Model;
import main.java.com.yankov.repair_shop.gui.dialog.ModelRegistrationDialog;
import main.java.com.yankov.repair_shop.gui.text.LabelName;

public class ModelRegistrationController extends InputDialogController
{
	private ModelRegistrationDialog modelGUI;
	
	public ModelRegistrationController(WindowController owner, EntityType entityType)
	{
		super(owner, entityType);
		modelGUI = (ModelRegistrationDialog) super.gui;
		setComboBoxModels();
		setButtonActionListeners();
	}
	
	private void setComboBoxModels()
	{
		modelGUI.getModelPanel()
		        .setDeviceTypeCmbModel(ComboBoxModelManager.DEVICE_TYPE);
		
		modelGUI.getModelPanel()
		        .setBrandCmbModel(ComboBoxModelManager.BRAND);
	}
	
	private void setButtonActionListeners()
	{
		modelGUI.getModelPanel()
				.setBtnNewDeviceTypeActionlistener
				(ListenerFactory.openWindow(this, EntityType.DEVICE_TYPE));
		
		modelGUI.getModelPanel()
		        .setBtnNewBrandActionlistener
		        (ListenerFactory.openWindow(this, EntityType.BRAND));
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
		return !(LabelName.NULL_ITEM.equals(modelGUI.getModelPanel().getDeviceType()));
	}
	
	private boolean isBrandSelected()
	{
		
		return !(LabelName.NULL_ITEM.equals(modelGUI.getModelPanel().getBrand()));
	}
	
	private boolean isModelNameValid()
	{
		String name = modelGUI.getPropertyPanel().getPropertyName();
		
		return !("".equals(name) 
			  || DataManager.modelsDataTable.displayNameCollision(name));
	}
	
	@Override
	protected Model createEntity()
	{
		Model newModel = new Model();
		
		newModel.setId(super.id);
		
		newModel.setPropertyName(modelGUI.getPropertyPanel().getPropertyName());
		
		newModel.setDescription(modelGUI.getPropertyPanel().getDescription());
		
		newModel.setDeviceType((DeviceType) DataManager.getEntity
				(EntityType.DEVICE_TYPE, modelGUI.getModelPanel().getDeviceType()));
				                                
		newModel.setBrand((Brand) DataManager.getEntity
				(EntityType.BRAND, modelGUI.getModelPanel().getBrand()));
		
		ComboBoxModelManager.updateModel(EntityType.MODEL, newModel.getPropertyName());
		
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