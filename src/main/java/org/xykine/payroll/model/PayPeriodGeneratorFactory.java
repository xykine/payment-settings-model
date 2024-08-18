package org.xykine.payroll.model;

public class PayPeriodGeneratorFactory {
    public static PayPeriodGenerator getPayPeriodGenerator(PaymentFrequencyEnum frequency) {
        return switch (frequency) {
            case WEEKLY -> new WeeklyPayPeriodGenerator();
            case BI_WEEKLY -> new BiWeeklyPayPeriodGenerator();
            case MONTHLY -> new MonthlyPayPeriodGenerator();
            default -> throw new IllegalArgumentException("Invalid frequency: " + frequency);
        };
    }
}

