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

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
@Embeddable
public class UpdateInfo {
    @Column(name = "version",
	    nullable = false,
	    updatable = true)
    @Setter(AccessLevel.PRIVATE)
    private short version = 1;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "last_updated_by_user_id",
    		nullable = false,
    		updatable = true)
    private User user;

    @Column(name = "last_update_date",
	    nullable = false,
	    updatable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime lastUpdateDate;
    
    public UpdateInfo(User user, LocalDateTime lastUpdateDate) {
	update(user, lastUpdateDate);
    }
    
    public void update(User user, LocalDateTime lastUpdateDate) {
	setVersion(version ++);
	setUser(user);
	setLastUpdateDate(lastUpdateDate);
    }
}