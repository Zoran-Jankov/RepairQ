package main.java.com.zoran_jankov.repair_shop.data.reference;

import java.util.Map;

import main.java.com.zoran_jankov.repair_shop.data.EntityType;
import main.java.com.zoran_jankov.repair_shop.data.entity.Entity;

public interface EntityReference
{
	public Map<Integer, Entity> getReferenceMap(EntityType entityType);

	public void setReferenceMap(Map<Integer, Entity> referenceMap);
	
	public void addReference(Entity entity);
	
	public void removeReference(int id);
}