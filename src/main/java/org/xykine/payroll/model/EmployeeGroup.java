package org.xykine.payroll.model;

import java.util.Set;

public record EmployeeGroup(
        Long employee_group_id,
        String employee_group_code,
        String employee_group_name,
        Set<EmployeeSubGroup> employeeSubGroup,
        String createdDate,
        String lastModifiedDate,
        String createdBy,
        String lastModifiedBy,
        int version
) {
    public static EmployeeGroup of(
            String employee_group_code,
            String employee_group_name,
            Set<EmployeeSubGroup> employeeSubGroup
    ) {
        return new EmployeeGroup(
                null,
                employee_group_code,
                employee_group_name,
                employeeSubGroup,
                null,
                null,
                null,
                null,
                0
        );
    }
}
