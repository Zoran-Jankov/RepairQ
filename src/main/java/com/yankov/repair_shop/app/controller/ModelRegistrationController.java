package main.java.com.yankov.repair_shop.app.controller;

import main.java.com.yankov.repair_shop.app.utility.ListenerFactory;
import main.java.com.yankov.repair_shop.app.utility.ComboBoxModelManager;
import main.java.com.yankov.repair_shop.data.DataManager;
import main.java.com.yankov.repair_shop.data.EntityType;
import main.java.com.yankov.repair_shop.data.entity.Brand;
import main.java.com.yankov.repair_shop.data.entity.DeviceType;
import main.java.com.yankov.repair_shop.data.entity.Entity;
import main.java.com.yankov.repair_shop.data.entity.Model;
import main.java.com.yankov.repair_shop.gui.dialog.ModelRegistrationDialog;
import main.java.com.yankov.repair_shop.gui.text.LabelName;

public class ModelRegistrationController extends InputDialogController
{
	private ModelRegistrationDialog modelGUI;
	private Model newModel;
	
	public ModelRegistrationController(WindowController owner, EntityType entityType)
	{
		super(owner, entityType);
		modelGUI = (ModelRegistrationDialog) super.gui;
		setComboBoxModels();
		setButtonActionListeners();
	}
	
	public ModelRegistrationController(WindowController owner, Entity entity)
	{
		super(owner, entity);
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
	protected boolean isNewEntityValid()
	{
		return isInputValid()
			&& isDisplayNameUniqe();
	}

	@Override
	protected boolean isUpdateValid()
	{
		return isInputValid()
			&& isDisplayNameUniqe(getDisplayName());
	}

	protected boolean isInputValid()
	{
		return isDeviceTypeSelected()
			&& isBrandSelected()
			&& isModelNameValid();
	}
	
	protected boolean isDisplayNameUniqe()
	{
		return DataManager.displayNameCollision(EntityType.MODEL, getDisplayName());
	}
	
	protected String getDisplayName()
	{
		return modelGUI.getPropertyPanel().getPropertyName();
	}
	
	protected boolean isDisplayNameUniqe(String displayName)
	{
		return isDisplayNameUniqe()
			|| (newModel.equals(DataManager.getEntity(EntityType.MODEL, displayName)));
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
	protected void getInput()
	{
		newModel.setPropertyName(modelGUI.getPropertyPanel().getPropertyName());
		
		newModel.setDescription(modelGUI.getPropertyPanel().getDescription());
		
		newModel.setDeviceType((DeviceType) DataManager.getEntity
				(EntityType.DEVICE_TYPE, modelGUI.getModelPanel().getDeviceType()));
				                                
		newModel.setBrand((Brand) DataManager.getEntity
				(EntityType.BRAND, modelGUI.getModelPanel().getBrand()));
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