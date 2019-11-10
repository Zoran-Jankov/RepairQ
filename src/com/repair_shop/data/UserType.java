package com.repair_shop.data;

import com.repair_shop.utility.DataType;
import com.repair_shop.utility.SecurityLevel;

/** 
 * Class UserType inherits Property class, and represents
 * a user type with fields that describe that user type security level.
 * <p>
 * Inherits field:
 * <p>
 * (int) ID number - must be unique
 * <p>
 * (String) Property name - must be unique
 * <p>
 * (String) Property description
 * <p>
 * <p>
 * Fields:
 * <p>
 *		
 * @author Zoran Jankov
 * @version 1.2
 * @since 2019-10-15
 */

public class UserType extends Property
{
	private SecurityLevel securityLevel;
	
	@Override
	public DataType getDataType()
	{
		return DataType.USER_TYPE;
	}
	/**
	 * Getter for user's security level.
	 * @return (String) securityLevel.
	 * 	 */
	public SecurityLevel getSecurityLevel()
	{
		return securityLevel;
	}

	/**
	 * Setter for security level.
	 * @param (String) securityLevel - security level.
	 */
	public void setSecurityLevel(SecurityLevel securityLevel)
	{
		this.securityLevel = securityLevel;
	}
}