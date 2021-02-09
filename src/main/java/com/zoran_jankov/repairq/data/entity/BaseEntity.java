package com.zoran_jankov.repairq.data.entity;

import com.zoran_jankov.repairq.data.InputData;

public abstract class BaseEntity extends AbstractEntity {
    @Override
    public void initialize(InputData data) {
	super.initialize(data);
	setFields(data);
    }

    @Override
    public void update(InputData data) {
	super.update(data);
	setFields(data);
    }
    
    protected abstract void setFields(InputData data);
}