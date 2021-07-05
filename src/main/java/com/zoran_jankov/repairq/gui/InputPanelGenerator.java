package com.zoran_jankov.repairq.gui;

import java.lang.reflect.Field;

import org.hibernate.mapping.Column;

import com.zoran_jankov.repairq.app.FieldProperties;
import com.zoran_jankov.repairq.data.entity.BaseEntity;

public class InputPanelGenerator {  
    public InputPanelGenerator(Class<? extends BaseEntity> type) {
	 Field[] fields = type.getClass().getDeclaredFields();
	 for (Field field : fields) {
	     var column = field.getAnnotation(Column.class);
	     FieldProperties fieldProperties = new FieldProperties();
	}
    }
    
    
}