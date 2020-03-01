package main.java.com.zoran_jankov.repair_shop.data;

public enum FieldType
{
	//Ticket information
	CUSTOMER,
	DEVICE,
	
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
	USER_TYPE,
	
	//Device information
	MODEL,
	SERIAL,
	
	//Model information
	DEVICE_TYPE,
	BRAND,
	
	//Basic information
	NAME,
	DESCRIPTION;
	
	public boolean isEntity(FieldType type)
	{
		switch(type)
		{
			case CUSTOMER:
			case DEVICE:
			case DEVICE_TYPE:
				return true;
			default:
				return false;
		}
	}
}