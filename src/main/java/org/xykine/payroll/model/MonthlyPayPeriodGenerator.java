package org.xykine.payroll.model;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MonthlyPayPeriodGenerator implements PayPeriodGenerator {

    @Override
    public Map<String, List<LocalDate>> generate(LocalDate startDate) {
        startDate = startDate.withDayOfMonth(PayPeriodConstant.START_OF_THE_MONTH);
        LocalDate endDate = startDate.withDayOfMonth(startDate.lengthOfMonth());

        Map<String, List<LocalDate>> periodMap = new HashMap<>();
        periodMap.put("PayPeriod", List.of(startDate, endDate));
        return periodMap;
    }
}
