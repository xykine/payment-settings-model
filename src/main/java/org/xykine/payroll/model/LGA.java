package org.xykine.payroll.model;

public record LGA(
        Long lgaId,
        String lgaName,
        String lgaCode,
        String createdDate,
        String lastModifiedDate,
        String createdBy,
        String lastModifiedBy,
        int version
) {
    public static LGA of(String lgaName, String lgaCode) {
        return new LGA(null, lgaName, lgaCode, null, null,
                null, null, 0);
    }
}
