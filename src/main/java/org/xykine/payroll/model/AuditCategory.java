package org.xykine.payroll.model;


public enum AuditCategory {

    EMPLOYEE("Log in"),
    PAYROLL("Log out"),
    COMPANY("Computed payroll"),
    FINANCE("Generated report");

    private final String description;

    AuditCategory(String aDescription){
        description = aDescription;
    }

    public String getDescription() {
        return description;
    }
}