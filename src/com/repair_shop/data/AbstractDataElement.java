package com.repair_shop.data;

import java.util.HashMap;

/** 
 * Abstract class DataElement represents a basic data element, 
 * and it is a superclass for all other data elements in the data structure. 
 * All data elements have unique ID number, a (int) field,
 * they inherit that from this class, together with getter and setter method for that field.
 * <p>
 * Field:
 * <p>
 * (int) number - must be unique
 * <p>
 * 
 * @author Zoran Jankov
 * @version 1.4
 * @since 2019-10-15
 */

public abstract class AbstractDataElement implements DataElement
{
	private int id;
	private HashMap<Integer, DataElement> referenceMap = new HashMap<Integer, DataElement>();
	
	/**
	 * Getter for data element ID number.
	 * @return (int) Data element ID number.
	 */
	@Override
	public int getID()
	{
		return id;
	}

	/**
	 * Setter for data element ID number.
	 * @param (int) id - Data element ID number.
	 */
	@Override
	public void setId(int id)
	{
		this.id = id;
	}
	
	@Override
	public HashMap<Integer, DataElement> getReferenceMap()
	{
		return referenceMap;
	}

	@Override
	public void setReferenceMap(HashMap<Integer, DataElement> referenceMap)
	{
		this.referenceMap = referenceMap;
	}
	
	@Override
	public void addReference(DataElement dataElement)
	{
		referenceMap.put(dataElement.getID(), dataElement);
	}
	
	@Override
	public void removeReference(int id)
	{
		referenceMap.remove(id);
	}
	
	@Override
	public abstract boolean hasUniqueString();
	
	@Override
	public String getUniqueString()
	{
		methodNotSupported();
		return null;
	}

	@Override
	public abstract boolean isReferencable();
	
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