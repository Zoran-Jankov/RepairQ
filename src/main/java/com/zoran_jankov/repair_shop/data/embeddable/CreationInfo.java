package main.java.com.zoran_jankov.repair_shop.data.embeddable;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.EqualsAndHashCode;
import main.java.com.zoran_jankov.repair_shop.data.entity.User;

@Data
@EqualsAndHashCode(callSuper = false)
@Embeddable
public class CreationInfo
{
	@Column(name = "user")
	private
	User user;
	
	@Column(name = "creation_date")
	@Temporal(TemporalType.TIMESTAMP)
	private
	LocalDateTime creationDate;
}