package org.xykine.payroll.model;

public record Grade(
                    Long gradeID,
                    String gradeCode,
                    String gradeName,
                    String createdDate,
                    String lastModifiedDate,
                    String createdBy,
                    String lastModifiedBy,
                    int version
) {
    public static Grade of(
            String gradeCode,
            String gradeName
    ) {
        return new Grade(
                null,
                gradeCode,
                gradeName,
                null, null, null, null, 0
        );
    }
}
