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
public class User extends AbstractEntity {
    @Embedded
    private PersonalInfo personalInfo;

    @Embedded
    private ContactInfo contactInfo;

    @Embedded
    private UserInfo userInfo;

    public User(InputData data) {
	super(data);
    }

    @Override
    public String getDisplayName() {
	return userInfo.getUsername();
    }

    @Override
    public void update(InputData data) {
	super.update(data);
    }
}