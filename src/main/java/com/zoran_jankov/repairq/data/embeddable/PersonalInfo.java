package com.zoran_jankov.repairq.data.embeddable;

import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.zoran_jankov.repairq.data.FieldType;

import lombok.Data;

/**
 * The abstract class Person is a abstract entity data class that represents
 * personal information about a person.
 * 
 * @author Zoran Jankov
 */
@Data
@Embeddable
public class PersonalInfo {
    @Column(name = "first_name",
	    nullable = false,
	    unique = false,
	    updatable = true)
    private String firstName;

    @Column(name = "last_name",
	    nullable = false,
	    unique = false,
	    updatable = true)
    private String lastName;
    
    public String getDispalyName() {
	return firstName + " " + lastName;
    }
    
    @SuppressWarnings("unused")
    private PersonalInfo() {}
    
    public PersonalInfo(Map<FieldType, String> data) {
	this.firstName = data.get(FieldType.FIRST_NAME);
	this.lastName = data.get(FieldType.LAST_NAME);
    }
    
    public void update(Map<FieldType, String> data) {
	this.firstName = data.get(FieldType.FIRST_NAME);
	this.lastName = data.get(FieldType.LAST_NAME);
    }
}