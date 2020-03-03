package main.java.com.zoran_jankov.repair_shop.data.embeddable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Class CompanyInfo is a component of the Client class that is used 
 * to store data about a client if that is a company, legal entity.
 * It also contains tax identification number, and the bank account 
 * of the a company or a legal entity.
 * 
 * @author Zoran Jankov
 */
@Embeddable
public class CompanyInfo
{
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "tax_id")
	private String taxIDNumber;
	
	@Column(name = "bank_account")
	private String bankAccount;
	
	/**
	 * Getter for the name of this legal entity.
	 * @return (String) Company name
	 */
	public String getCompanyName()
	{
		return companyName;
	}

	/**
	 * Setter for the name of this legal entity.
	 * @param companyName - Company name
	 */
	public void setCompanyName(String companyName)
	{
		this.companyName = companyName;
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