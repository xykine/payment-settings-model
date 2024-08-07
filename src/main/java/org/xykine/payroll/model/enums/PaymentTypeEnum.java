package org.xykine.payroll.model.enums;

public enum PaymentTypeEnum {
    ALLOWANCE_ANNUAL_TRANSPORT("ANNUAL TRANSPORT ALLOWANCE"),
    ALLOWANCE_ANNUAL_HOUSING("ANNUAL HOUSING ALLOWANCE"),
    ALLOWANCE_ANNUAL("ANNUAL ALLOWANCE"),
    ALLOWANCE_MONTHLY("MONTHLY ALLOWANCE"),
    DEDUCTION_ANNUAL("ANNUAL DEDUCTION"),
    DEDUCTION_MONTHLY("MONTHLY DEDUCTION"),
    BASIC_SALARY_ANNUAL("BASIC SALARY ANNUAL"),
    OFF_CYCLE_PAYMENT_AMOUNT("OFF CYCLE PAYMENT AMOUNT");


    private final String description;

    PaymentTypeEnum(String aDescription){
        description = aDescription;
    }

    public String getDescription() {
        return description;
    }
}