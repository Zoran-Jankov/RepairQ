package com.zoran_jankov.repairq.data.embeddable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class ContactInfo {
    @Column(columnDefinition = "",
	    name = "phone_number",
	    nullable = false,
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
}