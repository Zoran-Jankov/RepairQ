package com.zoran_jankov.repairq.data.embeddable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

/**
 * Class CompanyInfo is a component of the Customer class that is used to store
 * data about a customer if that is a company, legal entity. It also contains tax
 * identification number, and the bank account of the a company or a legal
 * entity.
 * 
 * @author Zoran Jankov
 */
@Data
@Embeddable
public class CompanyInfo {
    @Column(columnDefinition = "",
	    name = "company_name",
	    nullable = false,
	    unique = false,
	    updatable = true)
    private String companyName;

    @Column(columnDefinition = "",
	    name = "tax_id",
	    nullable = true,
	    unique = false,
	    updatable = true)
    private String taxIDNumber;

    @Column(columnDefinition = "",
	    name = "bank_account",
	    nullable = true,
	    unique = false,
	    updatable = true)
    private String bankAccount;
}