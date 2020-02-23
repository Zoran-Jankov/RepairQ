package main.java.com.zoran_jankov.repair_shop.data.reference;

import java.util.HashMap;
import java.util.Map;

import main.java.com.zoran_jankov.repair_shop.data.EntityType;
import main.java.com.zoran_jankov.repair_shop.data.entity.Entity;
import main.java.com.zoran_jankov.repair_shop.data.entity.Model;

public class BrandReference implements EntityReference
{
	private Map<Integer, Model> modelsReferencingBrand = new HashMap<Integer, Model>();

	@Override
	public Map<Integer, Model> getReferenceMap(EntityType entityType)
	{

		return modelsReferencingBrand;
	}

	@Override
	public void setReferenceMap(Map<Integer, Entity> referenceMap)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void addReference() {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeReference() {
		// TODO Auto-generated method stub

	}

}
