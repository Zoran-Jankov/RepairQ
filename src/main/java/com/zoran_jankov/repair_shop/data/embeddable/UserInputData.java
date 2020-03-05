package main.java.com.zoran_jankov.repair_shop.data.embeddable;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import main.java.com.zoran_jankov.repair_shop.data.entity.User;

@Embeddable
public class UserInputData
{
	@Column(name = "user")
	User user;
	
	LocalDateTime timestmp;
}