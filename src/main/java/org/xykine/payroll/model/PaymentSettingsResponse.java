package org.xykine.payroll.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.xykine.payroll.model.enums.CurrencyEnum;
import org.xykine.payroll.model.enums.PaymentFrequencyEnum;
import org.xykine.payroll.model.enums.PaymentTypeEnum;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaymentSettingsResponse implements Serializable {
        private String paymentSettingID;
        private String employeeID;
        private PaymentTypeEnum type;
        private String name;
        private BigDecimal value;
        CurrencyEnum currency;
        PaymentFrequencyEnum salaryFrequency;
        private boolean active;
        private boolean pensionable;
        private boolean prorated;
        private String createdDate;
        private String lastModifiedDate;
        private String createdBy;
        private String lastModifiedBy;
        private int version;
}