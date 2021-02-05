package com.zoran_jankov.repairq.data.embeddable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.zoran_jankov.repairq.data.FieldType;
import com.zoran_jankov.repairq.data.InputData;

import lombok.Data;

/**
 * The abstract class Person is a abstract entity data class that represents
 * personal information about a person.
 *
 * @author Zoran Jankov
 */
@Data
@Embeddable
public class PersonalInfo implements EmbeddableClass {
    @Column(name = "first_name", nullable = false, unique = false, updatable = true)
    private String firstName;

    @Column(name = "last_name", nullable = false, unique = false, updatable = true)
    private String lastName;

    @SuppressWarnings("unused")
    private PersonalInfo() {
    }

    public PersonalInfo(InputData data) {
	update(data);
    }

    public String getDispalyName() {
	return firstName + " " + lastName;
    }

    @Override
    public void update(InputData data) {
	setFirstName((String) data.get(FieldType.FIRST_NAME));
	setLastName((String) data.get(FieldType.LAST_NAME));
    }
}