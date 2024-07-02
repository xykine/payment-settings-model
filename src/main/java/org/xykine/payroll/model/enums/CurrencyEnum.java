package org.xykine.payroll.model.enums;

public enum CurrencyEnum {
    NGN("Nigerian Naira", "NGN", "₦"),
    USD("United states Dollar", "USD", "$"),
    EUR("Euro", "EUR", "€"),
    GBP("Great Britain Pounds", "GBP", "£"),
    CAD("Canadian Dollar", "CAD", "$"),
    AUD("Australian Dollar", "AUD", "$"),
    CNY("Chinese Yuan", "CNY", "¥"),
    JPY("Japanese Yen", "JPY", "¥"),
    CEDI("Ghanian Cedi", "GH₵", "₵"),
    RAND("South African Rand", "ZAR", "R"),
    CFA("West African CFA franc for Benin, Burkina Faso, Côte d'Ivoire, Guinea-Bissau, Mali, Niger, Senegal and Togo", "CFA", "CFA");

    private final String description;
    private final String code;
    private final String symbol;
    CurrencyEnum(String aDescription, String aCode, String aSymbol) {
        description = aDescription;
        code = aCode;
        symbol = aSymbol;
    }
    public String getDescription() {
        return description;
    }

    public String getCode() {
        return code;
    }

    public String getISymbol() {
        return symbol;
    }
}
