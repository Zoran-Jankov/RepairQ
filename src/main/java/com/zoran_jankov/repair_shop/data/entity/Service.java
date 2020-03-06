package main.java.com.zoran_jankov.repair_shop.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import main.java.com.zoran_jankov.repair_shop.data.EntityType;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "service")
public class Service extends AbstractEntity
{
	@Column(name = "price")
	private int price;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id")
	private Notification notification;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id")
	private ServiceType serviceType;

	@Override
	public EntityType getType()
	{
		return EntityType.SERVICE;
	}
}