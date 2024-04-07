package org.xykine.payroll.model;

public record Band(
                   Long bandID,
                   String bandCode,
                   String bandName,
                   String createdDate,
                   String lastModifiedDate,
                   String createdBy,
                   String lastModifiedBy,
                   int version
) {
    public static Band of(
            String bandCode,
            String bandName
    ) {
        return new Band(
                null,
                bandCode,
                bandName,
                null, null, null, null, 0
        );
    }
}
