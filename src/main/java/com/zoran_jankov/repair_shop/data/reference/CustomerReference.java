package main.java.com.zoran_jankov.repair_shop.data.reference;

import java.util.HashMap;
import java.util.Map;

import main.java.com.zoran_jankov.repair_shop.data.EntityType;
import main.java.com.zoran_jankov.repair_shop.data.entity.Entity;

public class CustomerReference implements EntityReference
{
	private Map<Integer, Entity> tiketsReferencingCustomer = new HashMap<Integer, Entity>();

	@Override
	public Map<Integer, Entity> getReferenceMap(EntityType entityType)
	{
		return tiketsReferencingCustomer;
	}

	@Override
	public void setReferenceMap(Map<Integer, Entity> referenceMap)
	{
		this.tiketsReferencingCustomer = referenceMap;
	}

	@Override
	public void addReference(Entity entity)
	{
		tiketsReferencingCustomer.put(entity.getId(), entity);
	}

	@Override
	public void removeReference(int id)
	{
		tiketsReferencingCustomer.remove(id);
	}
}