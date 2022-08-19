package com.ramkishore.pensionmanagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PensionerDetail {

	private String aadhaarNumber;     // AadhaarNumber of Pensioner
	private String name;              // Name of Pensioner
	private String dateOfBirth;       // DateOfBirth of Pensioner
	private String pan;               // PAN Number of Pensioner
	private double salaryEarned;      // SalaryEarned by Pensioner
	private double allowances;        // Allowances - Pensioner
	private String pensionType;       // PensionType - Self or Family

	private BankDetail bankDetail;    // Bank Detail of Pensioner

}
