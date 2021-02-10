package com.zoran_jankov.repairq.data.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.zoran_jankov.repairq.data.InputData;
import com.zoran_jankov.repairq.data.embeddable.ContactInfo;
import com.zoran_jankov.repairq.data.embeddable.PersonalInfo;
import com.zoran_jankov.repairq.data.embeddable.UserInfo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Class User represents a employee with associated information about that
 * employee.
 *
 * @author Zoran Jankov
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "user")
public class User extends BaseEntity {
    @Embedded
    private PersonalInfo personalInfo;

    @Embedded
    private ContactInfo contactInfo;

    @Embedded
    private UserInfo userInfo;
    
    @Override
    public void initialize(InputData data) {
	setPersonalInfo(new PersonalInfo());
	setContactInfo(new ContactInfo());
	setUserInfo(new UserInfo());
	super.initialize(data);
    }
    
    @Override
    protected void setFields(InputData data) {
	getPersonalInfo().initialize(data);
	getContactInfo().initialize(data);
	getUserInfo().initialize(data);
    }

    @Override
    public String getDisplayName() {
	return userInfo.getUsername();
    }
}