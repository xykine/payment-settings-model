package org.xykine.payroll.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.xykine.payroll.model.enums.CurrencyEnum;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExchangeInfo implements Serializable {
    private CurrencyEnum currency;
    private String rateDateAndTime;
    private BigDecimal exchangeRate;
}
