package main.java.com.zoran_jankov.repair_shop.data.embeddable;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import main.java.com.zoran_jankov.repair_shop.data.entity.User;

@Embeddable
public class CreationInfo
{
	@Column(name = "user")
	private
	User user;
	
	@Column(name = "creation_date")
	@Temporal(TemporalType.TIMESTAMP)
	private
	LocalDateTime timestmp;

	public User getUser() {
		return user;
	}

	public void setUser(User user)
	{
		this.user = user;
	}

	public LocalDateTime getTimestmp()
	{
		return timestmp;
	}

	public void setTimestmp(LocalDateTime timestmp)
	{
		this.timestmp = timestmp;
	}
}