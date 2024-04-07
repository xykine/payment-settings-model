package org.xykine.payroll.model;

public record BusinessUnit(
        Long businessUnitID,
        String businessUnitCode,
        String businessUnitName,
        String createdDate,
        String lastModifiedDate,
        String createdBy,
        String lastModifiedBy,
        int version
) {
    public static BusinessUnit of(
            String businessUnitCode,
            String businessUnitName
    ) {
        return new BusinessUnit(
                null,
                businessUnitCode,
                businessUnitName,
                null, null, null, null, 0
        );
    }
}