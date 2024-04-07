package org.xykine.payroll.model;

import java.math.BigDecimal;
import java.util.Date;

record T511KRecord(String constant, String description, Date startDate, Date endDate, BigDecimal amount){
};
