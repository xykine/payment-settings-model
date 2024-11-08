package org.xykine.payroll.model;

public enum UserRole {
    EMPLOYEE("Employee"),
    ADMIN("ADMIN"),
    VENDOR("VENDOR"),
    CUSTOMER_MANAGER("Customer Manager"),
    CUSTOMER("Customer"),
    UNKNOWN("Unknown Role");

    private final String description;

    UserRole(String aDescription){
        description = aDescription;
    }

    public String getDescription() {
        return description;
    }
}