package org.xykine.payroll.model;

public record ContractType(
        Long contractTypeID,
        String contractTypeCode,
        String contractTypeName,
        String createdDate,
        String lastModifiedDate,
        String createdBy,
        String lastModifiedBy,
        int version
) {
    public static ContractType of(
            String contractTypeCode,
            String contractTypeName
    ) {
        return new ContractType(
                null,
                contractTypeCode,
                contractTypeName,
                null, null, null, null, 0
        );
    }
}
