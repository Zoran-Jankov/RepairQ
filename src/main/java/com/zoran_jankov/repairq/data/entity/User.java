package com.zoran_jankov.repairq.data.entity;

import java.time.LocalDateTime;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.zoran_jankov.repairq.data.EntityType;
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
    
    public User(User user, LocalDateTime lastUpdateDate) {
	super(user, lastUpdateDate);
    }

    @Override
    public EntityType getType() {
	return EntityType.USER;
    }

    @Override
    public String getDisplayName() {
	return userInfo.getUsername();
    }
}