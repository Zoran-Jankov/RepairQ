package com.zoran_jankov.repairq.data.embeddable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.zoran_jankov.repairq.data.FieldType;
import com.zoran_jankov.repairq.data.InputData;

import lombok.Data;

@Data
@Embeddable
public class ContactInfo implements EmbeddableClass {
    @Column(columnDefinition = "", name = "phone_number", nullable = true, unique = false, updatable = true)
    private String phoneNumber;

    @Column(columnDefinition = "", name = "email_address", nullable = true, unique = false, updatable = true)
    private String email;

    @Column(columnDefinition = "", name = "street_address", nullable = true, unique = false, updatable = true)
    private String address;
    
    public ContactInfo() {
    }

    public ContactInfo(InputData data) {
	update(data);
    }

    @Override
    public void update(InputData data) {
	setPhoneNumber((String) data.get(FieldType.PHONE_NUMBER));
	setEmail((String) data.get(FieldType.EMAIL));
	setAddress((String) data.get(FieldType.ADDRESS));
    }
}