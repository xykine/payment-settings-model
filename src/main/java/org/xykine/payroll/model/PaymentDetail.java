package org.xykine.payroll.model;

import java.math.BigDecimal;


public record PaymentDetail(
        Long id,
        String name,
        BigDecimal value,
        String createdDate,
        String lastModifiedDate,
        String createdBy,
        String lastModifiedBy,
        int version
) {
    public static PaymentDetail of(
            String name,
            BigDecimal value
    ) {
        return new PaymentDetail(
                null,
                name,
                value,
                null,
                null,
                null,
                null,
                0
        );
    }
}
