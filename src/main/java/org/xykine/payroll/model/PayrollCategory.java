package org.xykine.payroll.model;

public enum PayrollCategory {
    OFFCYLE("OFFCYCLE"),
    REGULAR("REGULAR");

    private final String description;

    PayrollCategory(String aDescription){
        description = aDescription;
    }

    public String getDescription() {
        return description;
    }
}
