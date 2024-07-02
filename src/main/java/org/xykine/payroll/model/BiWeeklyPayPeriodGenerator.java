package org.xykine.payroll.model;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BiWeeklyPayPeriodGenerator implements PayPeriodGenerator {

    @Override
    public Map<String, List<LocalDate>> generate(LocalDate startDate) {
        LocalDate endDate;
        if (startDate.getDayOfMonth() <= PayPeriodConstant.MIDDLE_OF_THE_MONTH) {
            startDate = startDate.withDayOfMonth(PayPeriodConstant.START_OF_THE_MONTH);
            endDate = startDate.withDayOfMonth(PayPeriodConstant.MIDDLE_OF_THE_MONTH);
        } else {
            startDate = startDate.withDayOfMonth(PayPeriodConstant.START_SECOND_HALF_OF_THE_MONTH);
            endDate = startDate.withDayOfMonth(startDate.lengthOfMonth());
        }

        Map<String, List<LocalDate>> periodMap = new HashMap<>();
        periodMap.put("PayPeriod", List.of(startDate, endDate));
        return periodMap;
    }
}
