package org.xykine.payroll.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.xykine.payroll.model.enums.CurrencyEnum;
import org.xykine.payroll.model.enums.PaymentFrequencyEnum;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BankInformation {
    private String bankInfoID;
    private String costCenterID;
    private CurrencyEnum currency;
    private String bankName;
    private PaymentFrequencyEnum salaryFrequency;
    private String accountType;
    private String bankAccountNo;
}
