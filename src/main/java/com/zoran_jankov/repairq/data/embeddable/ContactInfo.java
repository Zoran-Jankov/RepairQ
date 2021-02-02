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
	this.phoneNumber = data.get(FieldType.PHONE_NUMBER);
	this.email = data.get(FieldType.EMAIL);
	this.address = data.get(FieldType.ADDRESS);
    }
    
    public void update(Map<FieldType, String> data) {
	this.phoneNumber = data.get(FieldType.PHONE_NUMBER);
	this.email = data.get(FieldType.EMAIL);
	this.address = data.get(FieldType.ADDRESS);
    }
}