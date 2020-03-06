package main.java.com.zoran_jankov.repair_shop.data.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.Data;
import lombok.EqualsAndHashCode;

/** 
 * Class BasicInfo represents a basic information of various entity classes.
 * 
 * @author Zoran Jankov
 */

@Data
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
public abstract class BasicInfo extends AbstractEntity
{
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Override
	public String getDisplayName()
	{
		return name;
	}
}