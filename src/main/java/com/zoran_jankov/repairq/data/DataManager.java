package com.zoran_jankov.repairq.data;

import com.zoran_jankov.repairq.data.entity.User;

public class DataManager {
    private static final DataManager instance = new DataManager();

    private User logedinUser;

    public static DataManager accessData() {
	return instance;
    }

    public User getLoggedInUser() {
	return logedinUser;
    }
}