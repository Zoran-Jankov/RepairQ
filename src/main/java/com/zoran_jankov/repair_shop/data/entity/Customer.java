package main.java.com.zoran_jankov.repair_shop.data.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import main.java.com.zoran_jankov.repair_shop.data.EntityType;
import main.java.com.zoran_jankov.repair_shop.data.embeddable.CompanyInfo;
import main.java.com.zoran_jankov.repair_shop.data.embeddable.ContactInfo;
import main.java.com.zoran_jankov.repair_shop.data.embeddable.PersonalInfo;

/** 
 * Class Client represents a client 
 * with associated information about that client.
 * @author Zoran Jankov
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "customer")
public class Customer extends AbstractEntity
{
	@Embedded
	private PersonalInfo personalInfo;
	@Embedded
	private ContactInfo contactInfo;
	@Embedded
	private CompanyInfo companyInfo;
	
	@Override
	public final EntityType getType()
	{
		return EntityType.CUSTOMER;
	}
	
	@Override
	public String getDisplayName()
	{	
		return super.getDisplayName() + " " + personalInfo.toString();
	}
}