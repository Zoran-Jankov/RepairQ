package com.repair_shop.data;

public class LegalEntitie extends DataElement
{
	private Client client;
	private String taxIDNumber;
	private String bankAccount;
	
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