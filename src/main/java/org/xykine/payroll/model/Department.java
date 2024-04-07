package org.xykine.payroll.model;

public record Department(
        Long DepartmentID,
        String departmentName,
        String departmentCode,
        String createdDate,
        String lastModifiedDate,
        String createdBy,
        String lastModifiedBy,
        int version
) {
    public static Department of(
            String departmentName,
            String departmentCode
    ) {
        return new Department(
                null,
                departmentName,
                departmentCode,
                null, null, null, null, 0
        );
    }
}
