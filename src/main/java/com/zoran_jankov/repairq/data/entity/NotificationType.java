package com.zoran_jankov.repairq.data.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "notification_type")
public class NotificationType extends BasicInfo {
    @OneToMany(cascade = CascadeType.ALL)
    private List<Notification> notifications;
}