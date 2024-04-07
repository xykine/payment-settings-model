package org.xykine.payroll.model;

public record Country(
        Long country_id,
        String countryName,
        String countryCode,
        String countryFlag,
        String createdDate,
        String lastModifiedDate,
        String createdBy,
        String lastModifiedBy,
        int version
) {
    public static Country of(String countryName, String countryCode, String countryFlag) {
        return new Country(null, countryName, countryCode, countryFlag, null, null,
                null, null, 0);
    }
}
