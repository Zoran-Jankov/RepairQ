package com.zoran_jankov.repairq.data.embeddable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.zoran_jankov.repairq.data.FieldType;
import com.zoran_jankov.repairq.data.InputData;
import com.zoran_jankov.repairq.data.UserRole;

import lombok.Data;

@Data
@Embeddable
public class UserInfo implements EmbeddableClass {
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "user_type", nullable = false)
    private UserRole userRole;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "password", nullable = false)
    private String passwordHash;
    
    @SuppressWarnings("unused")
    private UserInfo() {
    }

    public UserInfo(InputData data) {
	update(data);
    }

    @Override
    public void update(InputData data) {
	setUserRole((UserRole) data.get(FieldType.USER_ROLE));
	setUsername((String) data.get(FieldType.USER_ROLE));
	setPasswordHash((String) data.get(FieldType.PASSWORD));
    }
}