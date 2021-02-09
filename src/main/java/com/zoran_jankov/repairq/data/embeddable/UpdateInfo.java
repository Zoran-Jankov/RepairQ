package com.zoran_jankov.repairq.data.embeddable;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.zoran_jankov.repairq.data.FieldType;
import com.zoran_jankov.repairq.data.InputData;
import com.zoran_jankov.repairq.data.entity.User;

import lombok.Data;

@Data
@Embeddable
public class UpdateInfo implements EmbeddableClass {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user", nullable = false, updatable = true, referencedColumnName = "id")
    private User user;

    @Column(name = "last_update_date", nullable = false, updatable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar lastUpdateDate;
    
    @Override
    public void initialize(InputData data) {
	setUser((User) data.get(FieldType.USER));
	setLastUpdateDate((Calendar) data.get(FieldType.TIMESTAMP));
    }
}