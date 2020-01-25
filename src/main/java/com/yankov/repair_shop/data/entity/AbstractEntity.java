package main.java.com.yankov.repair_shop.data.entity;

import main.java.com.yankov.repair_shop.app.utility.IDGenerator;

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
	public String getDisplayName()
	{
		return IDGenerator.toString(type(), id);
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