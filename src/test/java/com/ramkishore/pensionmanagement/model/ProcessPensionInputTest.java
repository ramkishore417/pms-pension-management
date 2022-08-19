package com.ramkishore.pensionmanagement.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ramkishore.pensionmanagement.model.ProcessPensionInput;


@SpringBootTest
public class ProcessPensionInputTest {

	@Test
	public void beanCreationTest() {
		assertNotNull(new ProcessPensionInput()) ;
	}
	
	@Test
	public void noArgsConstructorTest() {
		ProcessPensionInput ppi = new ProcessPensionInput() ;
		assertNotNull(ppi) ;
	}
	
	@Test 
	public void allArgsConstructorTest() {
		ProcessPensionInput ppi = new ProcessPensionInput("4254362356623") ;
		assertNotNull(ppi) ;
	}
	
	@Test
	public void settersTest() {
		ProcessPensionInput ppi = new ProcessPensionInput() ;
		ppi.setAadhaarNumber("2432545236576245");
		assertNotNull(ppi) ;
	}
	
	@Test
	public void gettersTest() {
		ProcessPensionInput ppi = new ProcessPensionInput("4254362356623") ;
		String aadhaar = ppi.getAadhaarNumber() ;
		assertEquals("4254362356623", aadhaar) ;
	}
	
	
	
}
