package org.xykine.payroll.model;

public record Address(
        Long addressId,
        String street,
        City city,
        LGA lga,
        State state,
        String postCode,
        Country country,
        String type,
        String createdDate,
        String lastModifiedDate,
        String createdBy,
        String lastModifiedBy,
        int version
) {
    public static Address of(String street, City city, LGA lga, State state, String postCode, Country country, String type) {
        return new Address(null, street, city, lga, state, postCode, country, type, null, null, null, null,  0 );
    }
}
