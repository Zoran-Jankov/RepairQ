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
 * @version 1.0
 * @since 2019-10-15
 */

public abstract class DataElement
{
	private int id;
	private HashMap<Integer, DataElement> referenceMap = new HashMap<Integer, DataElement>();
	
	/**
	 * Getter for data element ID number.
	 * @return (int) Data element ID number.
	 */
	public int getID()
	{
		return id;
	}

	/**
	 * Setter for data element ID number.
	 * @param (int) id - Data element ID number.
	 */
	public void setID(int id)
	{
		this.id = id;
	}
	
	public HashMap<Integer, DataElement> getReferenceMap()
	{
		return referenceMap;
	}

	public void setReferenceMap(HashMap<Integer, DataElement> referenceMap)
	{
		this.referenceMap = referenceMap;
	}
	
	public void addReference(DataElement dataElement)
	{
		referenceMap.put(dataElement.getID(), dataElement);
	}
	
	public void removeReference(int id)
	{
		referenceMap.remove(id);
	}
	
	public abstract boolean hasUniqueString();
	
	public String getUniqueString()
	{
		methodNotSupported();
		return null;
	}

	public abstract boolean isReferencable();
	
	public void createReferences()
	{
		methodNotSupported();
	}
	
	public void deleteReferences()
	{
		methodNotSupported();
	}
	
	private void methodNotSupported()
	{
		throw new UnsupportedOperationException(this.getClass().getName() + " class does not support this method");
	}
}