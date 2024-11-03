package org.xykine.payroll.model;

import lombok.Data;
import org.xykine.payroll.model.enums.CurrencyEnum;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Set;

//private String departmentName;

@Data
public class PaymentInfo implements Serializable {
    private String id;
    private int numberOfDaysOfUnpaidAbsence;
    private int numberOfHours;
    private String departmentID;
    private Map<String, BigDecimal> deduction;
    private Map<String, BigDecimal> grossPay;
    private Map<String, BigDecimal> taxRelief;
    private Map<String, BigDecimal> payeeTax;
    private Map<String, BigDecimal> earning;
    private Map<String, BigDecimal> nhf;
    private Map<String, BigDecimal> others;
    private Map<String, BigDecimal> pension;
    private String startDate;
    private String endDate;
    private String bandCode;
    private BigDecimal basicSalary;
    private BigDecimal totalAmountDue;
    private String employeeID;
    private BigDecimal hourlyRate;
    private String companyID;
    private String departmentName;
    private Set<PaymentSettingsResponse> paymentSettings;
    private String fullName;
    private BigDecimal netPay;
    private boolean completed;
    private boolean employeeIsLock;
    private String createdDate;
    private String lastModifiedDate;
    private String createdBy;
    private String lastModifiedBy;
    private int version;
    private boolean isOffCycle;
    private boolean offCycleActualValueSupplied;
    private String offCycleID;
    private CurrencyEnum currency;
    private PaymentFrequencyEnum salaryFrequency;
    private ExchangeInfo exchangeInfo;
    private long totalNumberOfEmployees;
    private Map<String, BigDecimal> ytdReport;
    private String versionNumber;
    private String testField;
    private String testField2;
}
