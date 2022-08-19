package com.ramkishore.pensionmanagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankDetail {

	private String bankName; 			// Bank-Name of Pensioner
	private String accountNumber; 		// Account Number of Pensioner
	private String bankType; 			// Bank Type of pensioner Example: Private or Public

}
