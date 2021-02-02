package com.zoran_jankov.repairq.data.embeddable;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.zoran_jankov.repairq.data.DataManager;
import com.zoran_jankov.repairq.data.entity.User;

import lombok.Data;

@Data
@Embeddable
public class CreationInfo {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by_user_id",
    		nullable = false,
    		updatable = false,
    		referencedColumnName = "id")
    private User owner;

    @Column(name = "creation_date",
	    nullable = false,
	    updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime creationDate;
    
    public CreationInfo() {
	this.owner = DataManager.accessData().getLoggedInUser();
	creationDate = LocalDateTime.now();
    }
}