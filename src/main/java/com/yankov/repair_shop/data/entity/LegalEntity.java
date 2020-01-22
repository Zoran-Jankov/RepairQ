package main.java.com.yankov.repair_shop.data.entity;

import main.java.com.yankov.repair_shop.data.EntityType;
/**
 * Class LegalEntity is an extended version of the Client class 
 * that is used to store data about legal entity. Alongside all 
 * Client's fields, it also contains tax identification number 
 * and the bank account of the legal entity.
 * 
 * @author Zoran Jankov
 */
public class LegalEntity extends AbstractEntity
{
	private Client client;
	private String taxIDNumber;
	private String bankAccount;
	
	@Override
	public EntityType getEntityType()
	{
		return EntityType.LEGAL_ENTITY;
	}
	
	/**
	 * Getter for the client related information of this legal entity.
	 * @return (Client) - All client information.
	 */
	public Client getClient()
	{
		return client;
	}
	
	/**
	 * Setter for the client related information of this legal entity.
	 * @param client - Client information.
	 */
	public void setClient(Client client)
	{
		this.client = client;
	}
	
	/**
	 * Getter for the tax identification number of this legal entity.
	 * @return (String) Tax identification number
	 */
	public String getTaxIDNumber()
	{
		return taxIDNumber;
	}
	
	/**
	 * Setter for the tax identification number of this legal entity.
	 * @param taxIDNumber - Tax identification number
	 */
	public void setTaxIDNumber(String taxIDNumber)
	{
		this.taxIDNumber = taxIDNumber;
	}
	
	/**
	 * Getter for the legal entity's bank account.
	 * @return (String)  Bank account.
	 */
	public String getBankAccount()
	{
		return bankAccount;
	}
	
	/**
	 * Setter for the legal entity's bank account.
	 * @param bankAccount - Bank account.
	 */
	public void setBankAccount(String bankAccount)
	{
		this.bankAccount = bankAccount;
	}

	/**
	 * Getter for legal entity's display name.
	 * @return (String) Name and tax identification number.
	 */
	@Override
	public String getDisplayName()
	{
		return getClient().getFullName()+ " " + getTaxIDNumber();
	}
}