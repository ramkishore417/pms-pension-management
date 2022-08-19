package com.ramkishore.pensionmanagement.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PensionTransactionDetail {

    private String aadhaarNumber;           //AadhaarNumber
    private double transactionAmount;       //TransactionAmount = PensionAmount - BankCharge
    private String accountNumber;           //Bank Account Number
    private String transactionTimestamp;    //Transaction TimeStamp
}

