package org.xykine.payroll.model;

public enum AuditTrailEvents {

    LOG_IN("Log in"),
    LOG_OUT("Log out"),
    COMPUTE_PAYROLL("Computed payroll"),
    GENERATE_REPORT("Generated report"),
    RETRIEVE_REPORT("Retrieved report"),
    DELETE_REPORT("Deleted report"),
    APPROVE_PAYROLL("Approved payroll"),
    DECLINE_PAYROLL("Declined payroll"),
    POST_TO_FINANCE("Posted report to finance");

    private final String description;

    AuditTrailEvents(String aDescription){
        description = aDescription;
    }

    public String getDescription() {
        return description;
    }
}
