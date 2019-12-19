package main.java.com.yankov.repair_shop.data.entity;

import java.util.HashMap;

/** 
 * Abstract class AbstractEntity represents a basic data entity, 
 * and it is a superclass for all other data entities in the data 
 * structure.n All data entities have unique ID number, an (int) field,
 * they inherit that from this class, together with getter and setter 
 * method for that field.
 * <p>
 * Field:
 * <p>
 * (int) number - must be unique
 * <p>
 * @author Zoran Jankov
 */
public abstract class AbstractEntity implements Entity
{
	private int id;
	private HashMap<Integer, Entity> referenceMap = new HashMap<Integer, Entity>();
	
	@Override
	public int getId()
	{
		return id;
	}

	@Override
	public void setId(int id)
	{
		this.id = id;
	}
	
	@Override
	public HashMap<Integer, Entity> getReferenceMap()
	{
		return referenceMap;
	}

	@Override
	public void setReferenceMap(HashMap<Integer, Entity> referenceMap)
	{
		this.referenceMap = referenceMap;
	}
	
	@Override
	public void addReference(Entity dataElement)
	{
		referenceMap.put(dataElement.getId(), dataElement);
	}
	
	@Override
	public void removeReference(int id)
	{
		referenceMap.remove(id);
	}
	
	@Override
	public String getDisplayName()
	{
		methodNotSupported();
		return null;
	}
	
	@Override
	public void createReferences()
	{
		methodNotSupported();
	}
	
	@Override
	public void deleteReferences()
	{
		methodNotSupported();
	}
	
	private void methodNotSupported()
	{
		throw new UnsupportedOperationException(this.getClass().getName() + " class does not support this method");
	}
}