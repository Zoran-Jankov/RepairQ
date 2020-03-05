package main.java.com.zoran_jankov.repair_shop.data.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import main.java.com.zoran_jankov.repair_shop.app.utility.IDGenerator;

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
	@Id
	@GeneratedValue
	@Column(name = "id", updatable = false, nullable = false)
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
		return IDGenerator.toString(getType(), id);
	}
}