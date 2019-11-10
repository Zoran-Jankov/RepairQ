package com.repair_shop.data;

import com.repair_shop.utility.DataType;

public class LegalEntity extends AbstractDataElement
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

	@Override
	public boolean hasUniqueString()
	{
		return true;
	}

	@Override
	public boolean isReferencable()
	{
		return false;
	}
}