package org.xykine.payroll.model;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeeklyPayPeriodGenerator implements PayPeriodGenerator {

    @Override
    public Map<String, List<LocalDate>> generate(LocalDate startDate) {
        // Align startDate to the Monday of the week it belongs to
        while (startDate.getDayOfWeek() != DayOfWeek.MONDAY) {
            startDate = startDate.minusDays(1);
        }
        LocalDate endDate = startDate.plusDays(4);  // End on Friday

        Map<String, List<LocalDate>> periodMap = new HashMap<>();
        periodMap.put("PayPeriod", List.of(startDate, endDate));
        return periodMap;
    }
}
