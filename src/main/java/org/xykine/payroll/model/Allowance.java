package org.xykine.payroll.model;

import java.math.BigDecimal;


public record Allowance(
        Long id,
        String allowanceCode,
        String name,
        BigDecimal value,

        boolean isActive,
        String createdDate,

        String lastModifiedDate,


        String createdBy,
        String lastModifiedBy,

        int version
) {
    public static Allowance of(
            String allowanceCode,
            String name,
            BigDecimal value,
            String createdDate,
            String lastModifiedDate
    ) {
        return new Allowance(
                null,
                allowanceCode,
                name,
                value,
                true,
                createdDate,
                lastModifiedDate,
                "test User", // createdBy set to a default value or determined by context
                "test User",
                0
        );
    }

}