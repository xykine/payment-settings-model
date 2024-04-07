package org.xykine.payroll.model;

public record State(
        Long stateId,
        String stateName,
        String stateCode,
        String createdDate,
        String lastModifiedDate,
        String createdBy,
        String lastModifiedBy,

        int version
) {
    public static State of(String stateName, String stateCode) {
        return new State(null, stateName, stateCode, null, null,
                null, null, 0);
    }
}
