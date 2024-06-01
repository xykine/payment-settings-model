package org.xykine.payroll.model;

public enum PaymentFrequencyEnum {
    MONTHLY("Monthly "),
    WEEKLY("Weekly"),
    BI_WEEKLY("Bi-weekly"),
    DAILY("Daily"),
    SEMI_MONTHLY("Semi-Monthly"),
    YEARLY("Yearly"),
    UNKNOWN("Unknown frequency");

    private final String description;

    PaymentFrequencyEnum(String aDescription){
        description = aDescription;
    }

    public String getDescription() {
        return description;
    }
}
