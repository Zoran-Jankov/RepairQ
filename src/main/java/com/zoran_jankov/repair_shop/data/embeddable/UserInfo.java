package main.java.com.zoran_jankov.repair_shop.data.embeddable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.Data;
import lombok.EqualsAndHashCode;
import main.java.com.zoran_jankov.repair_shop.data.UserType;

@Data
@EqualsAndHashCode(callSuper = false)
@Embeddable
public class UserInfo
{
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "user_type")
	private UserType userType;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private char[] password;
}