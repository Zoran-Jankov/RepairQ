package main.java.com.zoran_jankov.repair_shop.data.embeddable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;
import lombok.EqualsAndHashCode;

/** 
 * Class BasicInfo represents a basic information of various entity classes.
 * 
 * @author Zoran Jankov
 * @version 1.2
 * @since 2019-10-15
 */

@Data
@EqualsAndHashCode(callSuper = false)
@Embeddable
public class BasicInfo
{
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
}