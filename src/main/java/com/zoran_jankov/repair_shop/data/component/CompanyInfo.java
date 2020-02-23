package main.java.com.zoran_jankov.repair_shop.data.component;

/**
 * Class CompanyInfo is a component of the Client class that is used 
 * to store data about a client if that is a company, legal entity.
 * It also contains tax identification number, and the bank account 
 * of the a company or a legal entity.
 * 
 * @author Zoran Jankov
 */
public class CompanyInfo
{
	private String taxIDNumber;
	private String bankAccount;
	
	public CompanyInfo(String taxIDNumber, String bankAccount)
	{
		this.taxIDNumber = taxIDNumber;
		this.bankAccount = bankAccount;
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
}