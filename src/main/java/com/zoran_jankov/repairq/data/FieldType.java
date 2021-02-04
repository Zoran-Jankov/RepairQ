package com.zoran_jankov.repairq.data;

public enum FieldType {
    TIMESTAMP,
    // Notification information
    COMMENT,

    // Ticket information
    DETAILS,

    // Personal information
    FIRST_NAME, LAST_NAME,

    // Contact information
    PHONE_NUMBER, EMAIL, ADDRESS,

    // Company information
    COMPANY_NAME, TAX_ID, BANK_ACCOUNT,

    // User information
    USERNAME, PASSWORD,

    // Device information
    SERIAL,

    // Basic information
    NAME, DESCRIPTION,

    // Foreign Keys
    NOTIFICATION, NOTIFICATION_TYPE, SERVICE, SERVICE_TYPE, TICKET, STATUS, CUSTOMER, MARKETING, LEGAL_ENTITY, DEVICE,
    MODEL, DEVICE_TYPE, BRAND, USER;

    public static boolean isRequired(FieldType type) {
	switch (type) {
	case EMAIL:
	case ADDRESS:
	case BANK_ACCOUNT:
	case DESCRIPTION:
	    return false;

	default:
	    return true;
	}
    }
}