package main.java.com.yankov.repair_shop.data.entity;

import main.java.com.yankov.repair_shop.data.EntityType;
import main.java.com.yankov.repair_shop.data.UserType;
import main.java.com.yankov.repair_shop.data.component.ContactInfo;
import main.java.com.yankov.repair_shop.data.component.PersonalInfo;

/** 
 * Class User represents a employee with associated information about that employee.
 * 				
 * @author Zoran Jankov
 * @version 1.2
 */

public class User extends AbstractEntity
{
	private UserType userType;
	private PersonalInfo personalInfo;
	private ContactInfo contactInfo;
	private UserInfo userInfo;

	@Override
	public EntityType getType()
	{
		return EntityType.USER;
	}
		
	/**
	 * Getter for user username.
	 * @return User username.
	 */
	public String getUsername()
	{
		return username;
	}
	
	/**
	 * Setter for user username.
	 * @param username - User username.
	 */
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	/**
	 * Getter for user user type.
	 * @return User user type.
	 */
	public UserType getUserType()
	{
		return userType;
	}
	
	/**
	 * Setter for user user type.
	 * @param userType - User user type.
	 */
	public void setUserTypes(UserType userTypes)
	{
		this.userType = userTypes;
	}
	
	/**
	 * Getter for user password.
	 * @return User password.
	 */
	public char[] getPassword()
	{
		return password;
	}
	
	/**
	 * Setter for user password.
	 * @param password - User password.
	 */
	public void setPassword(char[] password)
	{
		this.password = password;
	}

	@Override
	public String getDisplayName()
	{
		return getUsername();
	}
}