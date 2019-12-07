package com.repair_shop.data.entity;

import com.repair_shop.data.DataType;

public class LegalEntity extends AbstractEntity
{
	private Client client;
	private String taxIDNumber;
	private String bankAccount;
	
	@Override
	public DataType getDataType()
	{
		return DataType.LEGAL_ENTITY;
	}
	
	public Client getClient()
	{
		return client;
	}

	public void setClient(Client client)
	{
		this.client = client;
	}
	
	public String getTaxIDNumber()
	{
		return taxIDNumber;
	}
	
	public void setTaxIDNumber(String taxIDNumber)
	{
		this.taxIDNumber = taxIDNumber;
	}
	
	public String getBankAccount()
	{
		return bankAccount;
	}
	
	public void setBankAccount(String bankAccount)
	{
		this.bankAccount = bankAccount;
	}

	@Override
	public String getUniqueString()
	{
		return getTaxIDNumber();
	}
}