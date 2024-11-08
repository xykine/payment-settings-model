package org.xykine.payroll.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Serializable {
    private String employeeID;
    private String firstName;
    private String lastName;
    private String middleName;
    private String fullName;
    private String employeeCode;
    private String employeeExternalCode;
    private String title;
    private String maritalStatus;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String lga;
    private String postalCode;
    private String dob;
    private String phone1;
    private String phone2;
    private String email;
    private String officialEmail;
    private String gender;
    private String idType;
    private String managerID;
    private String isManager;
    private String employeeGroupID;
    private String employeeSubGroupID;
    private String grade;
    private String level;
    private String contractType;
    private String startDate;
    private String endDate;
    private String position;
    private String departmentID;
    private String unitID;
    private String dimensionID;
    private Set<BankInformation> bankInformation;
    private Set<UserRole> roles;
    private String wageEmployee;
    private String isTaxable;
    //TODO Date activated and deactived should be added
    //TODO change the isActive back to boolean
    private String isDirty;
    private String encodedImage;
    private String isDisable;
    private String disableDate;
    private String isMedical;
    private String medicalDate;
    private String locationID;
    private String taxStateID;
    private String taxStateName;
    private String isPensionable;
    private String changeStateID;
    private String businessUnitID;
    private String bvn;
    private String taxIDNo;
    private String taxClass;
    private String bankPaymentName;
    private String sfRecord;
    int nombreDePart;
    private BigDecimal basicSalary;
    private BigDecimal hourlyRate;
    private String band;
    private String paymentInfoId;
    private String employeeLockID;
    boolean employeeIsLocked;
    private Set<PaymentSettingsResponse> paymentSettings;
    private String companyID;
    private boolean active;
    private String payScaleID;
    private String createdDate;
    private String lastModifiedDate;
    private String createdBy;
    private String lastModifiedBy;
    private int version;
}