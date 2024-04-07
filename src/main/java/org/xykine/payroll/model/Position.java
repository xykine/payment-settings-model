package org.xykine.payroll.model;

public record Position(
        Long positionID,
        String positionCode,
        String positionName,
        String createdDate,
        String lastModifiedDate,
        String createdBy,
        String lastModifiedBy,
        int version
) {
    public static Position of(
            String positionCode,
            String positionName
    ) {
        return new Position(
                null,
                positionCode,
                positionName,
                null, null, null, null, 0
        );
    }
}
