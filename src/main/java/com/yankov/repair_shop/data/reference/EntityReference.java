package main.java.com.yankov.repair_shop.data.reference;

import java.util.Map;

import main.java.com.yankov.repair_shop.data.EntityType;
import main.java.com.yankov.repair_shop.data.entity.Entity;
import main.java.com.yankov.repair_shop.data.entity.Model;

public interface EntityReference
{
	public Map<Integer, Model> getReferenceMap(EntityType entityType);

	public void setReferenceMap(Map<Integer, Entity> referenceMap);
	
	public void addReference();
	
	public void removeReference();
}