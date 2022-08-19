package com.ramkishore.pensionmanagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProcessPensionResponse {
	
	private PensionerDetail pensionerDetail; 	// Pensioner Details
	private double pensionAmount;            	// Pension Amount
	private double bankCharge;               	// Bank Charge
	
}
