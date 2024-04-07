package org.xykine.payroll.model;

public record IdType(
        Long idTypeID,
        String idTypeCode,
        String idTypeName,
        String createdDate,
        String lastModifiedDate,
        String createdBy,
        String lastModifiedBy,
        int version
) {
    public static IdType of(
            String idTypeCode,
            String idTypeName
    ) {
        return new IdType(
                null,
                idTypeCode,
                idTypeName,
                null, null, null, null, 0
        );
    }
}
