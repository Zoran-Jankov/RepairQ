package com.zoran_jankov.repairq.data.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.zoran_jankov.repairq.data.InputData;
import com.zoran_jankov.repairq.data.embeddable.ContactInfo;
import com.zoran_jankov.repairq.data.embeddable.PersonalInfo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Class Client represents a client with associated information about that
 * client.
 *
 * @author Zoran Jankov
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "customer")
public class Customer extends AbstractEntity {
    @Embedded
    private PersonalInfo personalInfo;

    @Embedded
    private ContactInfo contactInfo;
    
    @Override
    public void initialize(InputData data) {
	super.initialize(data);
	setPersonalInfo(new PersonalInfo());
	setContactInfo(new ContactInfo());
	setFields(data);
    }

    @Override
    public void update(InputData data) {
	super.update(data);
	setFields(data);
    }
    
    private void setFields(InputData data) {
	getPersonalInfo().initialize(data);
	getContactInfo().initialize(data);
    }
    
    @Override
    public String getDisplayName() {
	return super.getDisplayName() + " " + personalInfo.getDispalyName();
    }
}