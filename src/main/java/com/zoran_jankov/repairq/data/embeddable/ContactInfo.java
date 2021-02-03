package com.zoran_jankov.repairq.data.embeddable;

import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.zoran_jankov.repairq.data.FieldType;

import lombok.Data;

@Data
@Embeddable
public class ContactInfo {
    @Column(columnDefinition = "",
	    name = "phone_number",
	    nullable = true,
	    unique = false,
	    updatable = true)
    private String phoneNumber;

    @Column(columnDefinition = "",
	    name = "email_address",
	    nullable = true,
	    unique = false,
	    updatable = true)
    private String email;

    @Column(columnDefinition = "",
	    name = "street_address",
	    nullable = true,
	    unique = false,
	    updatable = true)
    private String address;
    
    @SuppressWarnings("unused")
    private ContactInfo() {}
    
    public ContactInfo(Map<FieldType, String> data) {
	update(data);
    }
    
    public void update(Map<FieldType, String> data) {
	setPhoneNumber(data.get(FieldType.PHONE_NUMBER));
	setEmail(data.get(FieldType.EMAIL));
	setAddress(data.get(FieldType.ADDRESS));
    }
}