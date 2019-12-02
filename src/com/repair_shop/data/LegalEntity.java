package com.repair_shop.data;

public class LegalEntity extends AbstractDataElement
{
	private Client client;
	private String taxIDNumber;
	private String bankAccount;
	
	public LegalEntity(int id,
					   Client client, 
					   String taxIDNumber, 
					   String bankAccount)
	{
		super(id);
		setClient(client);
		setTaxIDNumber(taxIDNumber);
		setBankAccount(bankAccount);
	}
	
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