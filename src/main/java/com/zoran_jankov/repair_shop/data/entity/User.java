package main.java.com.zoran_jankov.repair_shop.data.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import main.java.com.zoran_jankov.repair_shop.data.EntityType;
import main.java.com.zoran_jankov.repair_shop.data.embeddable.ContactInfo;
import main.java.com.zoran_jankov.repair_shop.data.embeddable.PersonalInfo;
import main.java.com.zoran_jankov.repair_shop.data.embeddable.UserInfo;

/** 
 * Class User represents a employee with associated information about that employee.
 * 				
 * @author Zoran Jankov
 * @version 1.2
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "user")
public class User extends AbstractEntity
{
	@Embedded
	private PersonalInfo personalInfo;
	
	@Embedded
	private ContactInfo contactInfo;
	
	@Embedded
	private UserInfo userInfo;

	@Override
	public EntityType getType()
	{
		return EntityType.USER;
	}
	
	@Override
	public String getDisplayName()
	{
		return userInfo.getUsername();
	}
}