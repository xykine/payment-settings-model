package org.xykine.payroll.model;

public record City(
        Long cityId,
        String cityName,
        String cityCode,
        String createdDate,
        String lastModifiedDate,
        String createdBy,
        String lastModifiedBy,
        int version
) {
    public static City of(String cityName, String cityCode) {
        return new City(null, cityName, cityCode, null, null,
                null, null, 0);
    }
}
