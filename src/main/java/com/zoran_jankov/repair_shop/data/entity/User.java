package main.java.com.zoran_jankov.repair_shop.data.entity;

import main.java.com.zoran_jankov.repair_shop.data.EntityType;
import main.java.com.zoran_jankov.repair_shop.data.component.ContactInfo;
import main.java.com.zoran_jankov.repair_shop.data.component.PersonalInfo;
import main.java.com.zoran_jankov.repair_shop.data.component.UserInfo;

/** 
 * Class User represents a employee with associated information about that employee.
 * 				
 * @author Zoran Jankov
 * @version 1.2
 */

public class User extends AbstractEntity
{
	private PersonalInfo personalInfo;
	private ContactInfo contactInfo;
	private UserInfo userInfo;

	@Override
	public EntityType getType()
	{
		return EntityType.USER;
	}

	public PersonalInfo getPersonalInfo()
	{
		return personalInfo;
	}

	public void setPersonalInfo(PersonalInfo personalInfo)
	{
		this.personalInfo = personalInfo;
	}

	public ContactInfo getContactInfo()
	{
		return contactInfo;
	}

	public void setContactInfo(ContactInfo contactInfo)
	{
		this.contactInfo = contactInfo;
	}

	public UserInfo getUserInfo()
	{
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo)
	{
		this.userInfo = userInfo;
	}
	
	@Override
	public String getDisplayName()
	{
		return userInfo.getUsername();
	}
}