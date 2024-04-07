package org.xykine.payroll.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Set;

@Data
public class Employee implements Serializable {

    private Set<PaymentSettings> paymentSettings;
}