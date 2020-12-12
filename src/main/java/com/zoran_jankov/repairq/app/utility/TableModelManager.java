package com.zoran_jankov.repairq.app.utility;

import java.util.EnumMap;
import java.util.Map;

import javax.swing.table.TableModel;

import com.zoran_jankov.repairq.data.EntityType;

public class TableModelManager {
    public static TableModel NOTIFICATION_TYPE = loadModel(EntityType.NOTIFICATION_TYPE);
    public static TableModel SERVICE_TYPE = loadModel(EntityType.SERVICE_TYPE);
    public static TableModel TICKET = loadModel(EntityType.TICKET);
    public static TableModel STATUS = loadModel(EntityType.STATUS);
    public static TableModel CLIENT = loadModel(EntityType.CUSTOMER);
    public static TableModel MARKETING = loadModel(EntityType.MARKETING);
    public static TableModel DEVICE = loadModel(EntityType.DEVICE);
    public static TableModel MODEL = loadModel(EntityType.MODEL);
    public static TableModel DEVICE_TYPE = loadModel(EntityType.DEVICE_TYPE);
    public static TableModel BRAND = loadModel(EntityType.BRAND);
    public static TableModel USER = loadModel(EntityType.USER);

    private static Map<EntityType, TableModel> MODELS_MAP = new EnumMap<EntityType, TableModel>(EntityType.class);

    private static TableModel loadModel(EntityType entityType) {
	return MODELS_MAP.get(entityType);
    }
}