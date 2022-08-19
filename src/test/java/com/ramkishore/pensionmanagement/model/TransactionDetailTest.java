package com.ramkishore.pensionmanagement.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
public class TransactionDetailTest {
	
	@Test
	public void beanCreationTest() {
		PensionTransactionDetail td = new PensionTransactionDetail();
		assertNotNull(td);
	}
	
	@Test
	public void noArgsConstructorTest() {
		PensionTransactionDetail td = new PensionTransactionDetail() ;
		assertNotNull(td) ;
	}
	
	@Test 
	public void allArgsConstructorTest() {
		PensionTransactionDetail td = new PensionTransactionDetail("4254362356623", 123.32, "12345678", "22-May-2022") ;
		assertNotNull(td) ;
	}
	
	@Test
	public void settersTest() {
		PensionTransactionDetail td = new PensionTransactionDetail() ;
		td.setAadhaarNumber("2432545236576245");
		td.setAccountNumber("12345678");
		td.setTransactionAmount(12345.22);
		td.setTransactionTimestamp("22-MAY-2022");
		assertNotNull(td) ;
	}
	
	@Test
	public void gettersTest() {
		PensionTransactionDetail td = new PensionTransactionDetail("4254362356623", 123.32, "12345678", "22-May-2022") ;
		String aadhaar = td.getAadhaarNumber() ;
		assertEquals("4254362356623", aadhaar) ;
		String account = td.getAccountNumber() ;
		assertEquals("12345678", account) ;
	}

}
