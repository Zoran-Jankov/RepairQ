package main.java.com.zoran_jankov.repair_shop.data.component;

import main.java.com.zoran_jankov.repair_shop.data.UserType;

public class UserInfo
{
	private UserType userType;
	private String username;
	private char[] password;
	
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
}