package com.zoran_jankov.repairq.data.embeddable;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.zoran_jankov.repairq.data.entity.User;

import lombok.Data;

@Data
@Embeddable
public class UpdateInfo {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "last_updated_by_user_id", nullable = false, updatable = true)
    private User user;
    
    @Column(name = "version")
    private short version;

    @Column(name = "last_update_date")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime lastUpdateDate;
}