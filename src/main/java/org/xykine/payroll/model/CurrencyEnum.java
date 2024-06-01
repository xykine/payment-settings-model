package org.xykine.payroll.model;

public enum CurrencyEnum {
    NAIRA("Naira"),
    DOLLAR("Dollar"),
    YUAN("Chinese Yuan"),
    YEN("Japanese Yen"),
    POUND("Pound sterling"),
    EURO("Euro"),
    CEDI("Ghanaian Cedi"),
    RAND("South African Rand"),
    CFA("West African CFA franc for Benin, Burkina Faso, Côte d'Ivoire, Guinea-Bissau, Mali, Niger, Senegal and Togo"),
    UNKNOWN("Unknown currency");;

    private final String description;

    CurrencyEnum(String aDescription){
        description = aDescription;
    }

    public String getDescription() {
        return description;
    }
}
