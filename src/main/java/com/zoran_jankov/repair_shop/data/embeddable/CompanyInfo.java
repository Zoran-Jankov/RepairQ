package main.java.com.zoran_jankov.repair_shop.data.embeddable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Class CompanyInfo is a component of the Client class that is used 
 * to store data about a client if that is a company, legal entity.
 * It also contains tax identification number, and the bank account 
 * of the a company or a legal entity.
 * 
 * @author Zoran Jankov
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Embeddable
public class CompanyInfo
{
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "tax_id")
	private String taxIDNumber;
	
	@Column(name = "bank_account")
	private String bankAccount;
}