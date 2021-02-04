package com.zoran_jankov.repairq.data.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.zoran_jankov.repairq.data.InputData;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "notification_type")
public class NotificationType extends BasicInfo {
    public NotificationType(InputData data) {
	super(data);
    }

    @Override
    public void update(InputData data) {
	super.basicUpdate(data);
    }
}