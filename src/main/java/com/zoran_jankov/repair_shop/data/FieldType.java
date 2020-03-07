package main.java.com.zoran_jankov.repair_shop.data;

public enum FieldType
{	
	//Ticket information
	COMMENT,
	
	//Personal information
	FIRST_NAME,
	LAST_NAME,
	
	//Contact information
	PHONE_NUMBER,
	EMAIL,
	ADDRESS,
	
	//Company information
	COMPANY_NAME,
	TAX_ID,
	BANK_ACCOUNT,
	
	//User information
	USERNAME,
	PASSWORD,
	
	//Device information
	SERIAL,
	
	//Basic information
	NAME,
	DESCRIPTION;
	
	public static boolean isRequired(FieldType type)
	{
		switch (type)
		{
			case COMMENT:
			case FIRST_NAME:
			case PHONE_NUMBER:
			case COMPANY_NAME:
			case TAX_ID:
			case USERNAME:
			case PASSWORD:
			case SERIAL:
			case NAME:
				
				return true;

			default:
				return false;
		}
	}
}