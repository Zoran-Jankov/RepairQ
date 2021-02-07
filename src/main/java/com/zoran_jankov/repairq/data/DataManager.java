package com.zoran_jankov.repairq.data;

import com.zoran_jankov.repairq.data.entity.User;

public class DataManager {
    private static final DataManager instance = new DataManager();
    
    private DataManager() {
    }

    public static DataManager accessData() {
	return instance;
    }

    private User logedinUser;

    public User getLoggedInUser() {
	return logedinUser;
    }
}