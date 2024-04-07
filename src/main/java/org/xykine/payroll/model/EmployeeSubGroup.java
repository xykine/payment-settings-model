package org.xykine.payroll.model;

public record EmployeeSubGroup (
        Long employee_sub_group_id,
        String employee_sub_group_code,
        String employee_sub_group_name,
        String createdDate,
        String lastModifiedDate,
        String createdBy,
        String lastModifiedBy,
        int version
) {
    public static EmployeeSubGroup of(
            String employee_sub_group_code,
            String employee_sub_group_name
    ) {
        return new EmployeeSubGroup(
                null,
                employee_sub_group_code,
                employee_sub_group_name,
                null,
                null,
                null,
                null,
                0
        );
    }
}
