package com.repair_shop.data.entity;

import com.repair_shop.data.DataType;
import com.repair_shop.data.UserType;

/** 
 * Class Employee extends class Person and represents a employee with associated information about that employee.
 * <p>
 * Inherits fields:
 * <p>
 * (int) ID number - must be unique
 * <p>
 * (String) First Name
 * <p>
 * (String) Last Name
 * <p>
 * (String) Primary Phone Number
 * <p>
 * (String) Second Phone Number
 * <p>
 * (String) Email Address
 * <p>
 * (String) Home Address
 * <p>
 * Fields:
 * <p>
 * (UserType) User Type
 * <p>
 * (String) Username - must be unique
 * <p>
 * (char[]) Password
 * <p>
 * 				
 * @author Zoran Jankov
 * @version 1.2
 * @since 2019-10-02
 */

public class User extends Person
{
	private UserType userType;
	private String username;
	private char[] password;

	@Override
	public DataType getDataType()
	{
		return DataType.USER;
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
	public String getUniqueString()
	{
		return getUsername();
	}
}