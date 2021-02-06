package com.zoran_jankov.repairq.data.embeddable;

import java.time.LocalDateTime;

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

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
@Embeddable
public class CreationInfo {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by_user_id", nullable = false, updatable = false, referencedColumnName = "id")
    @Setter(AccessLevel.PRIVATE)
    private User owner;

    @Column(name = "creation_date", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @Setter(AccessLevel.PRIVATE)
    private LocalDateTime creationDate;
    
    @SuppressWarnings("unused")
    private CreationInfo() {
    }

    public CreationInfo(InputData data) {
	setOwner((User) data.get(FieldType.USER));
	setCreationDate((LocalDateTime) data.get(FieldType.TIMESTAMP));
    }
}