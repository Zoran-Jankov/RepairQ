package com.zoran_jankov.repairq.app;

import com.zoran_jankov.repairq.data.entity.Entity;

import lombok.Data;

@Data
public class FieldProperties {
    private boolean required;
    private boolean unique;
    private String label;
    private Class<? extends Entity> type;
}