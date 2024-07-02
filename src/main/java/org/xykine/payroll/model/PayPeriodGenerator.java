package org.xykine.payroll.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface PayPeriodGenerator {
    public Map<String, List<LocalDate>> generate(LocalDate startDate);
}
