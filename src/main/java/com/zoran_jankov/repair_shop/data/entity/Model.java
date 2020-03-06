package main.java.com.zoran_jankov.repair_shop.data.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import main.java.com.zoran_jankov.repair_shop.data.EntityType;
import main.java.com.zoran_jankov.repair_shop.data.embeddable.BasicInfo;

/** 
 * Class Model represents a device model with associated 
 * information about that model.
 *
 * @author Zoran Jankov
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "model")
public class Model extends AbstractEntity
{
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id", nullable = false)
	private DeviceType deviceType;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id", nullable = false)
	private Brand brand;
	
	@Embedded
	private BasicInfo basicInfo;
	
	@Override
	public final EntityType getType()
	{
		return EntityType.MODEL;
	}
	
	@Override
	public String getDisplayName()
	{
		return basicInfo.getName();
	}
}