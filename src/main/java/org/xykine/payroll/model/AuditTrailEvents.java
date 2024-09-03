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
    CREATE_EMPLOYEE("Posted report to finance"),
    LOCK_EMPLOYEE("Posted report to finance"),
    UNLOCK_EMPLOYEE("Posted report to finance"),
    ACTIVATE_EMPLOYEE("Posted report to finance"),
    INACTIVATE_EMPLOYEE("Posted report to finance"),
    UPDATE_EMPLOYEE_PAYMENT_SETTING("Posted report to finance"),
    UPDATE_EMPLOYEE_ROLE("Posted report to finance"),
    UPDATE_EMPLOYEE_PROFILE("Posted report to finance"),
    CREATE_COMPANY("Posted report to finance"),
    UPDATE_COMPANY("Posted report to finance"),
    CREATE_LEGAL_ENTITY("Posted report to finance"),
    CREATE_FINANCE_CONFIG("Posted report to finance"),
    POST_TO_FINANCE("Posted report to finance");

    private final String description;

    AuditTrailEvents(String aDescription){
        description = aDescription;
    }

    public String getDescription() {
        return description;
    }
}
