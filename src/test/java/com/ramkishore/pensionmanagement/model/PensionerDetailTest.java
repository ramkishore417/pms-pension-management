package com.ramkishore.pensionmanagement.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class PensionerDetailTest {

	@Test
	public void NoArgsPensionDetailTest()
	{
		assertThat(new PensionerDetail()).isNotNull();
	}
	
	@Test
	public void AllArgsPensionDetailTest()
	{
		PensionerDetail pensionDetail=new PensionerDetail("19183857573", "Professor","06-11-1999" , "PIYTH7890L",40000,12000, "family", new BankDetail("SBI", "1930232384", "public"));
		assertThat(assertThat(pensionDetail).isNotNull());
	}

	@Test
	public void AllsetterPensionDetailTest()
	{
		PensionerDetail pensionerDetail=new PensionerDetail() ;
		pensionerDetail.setAadhaarNumber("32535245425452");
		pensionerDetail.setName("Nairobi");
		pensionerDetail.setDateOfBirth("11-5-1990");
		pensionerDetail.setPan("ILUPWS2341C");
		pensionerDetail.setPensionType("family");
		pensionerDetail.setSalaryEarned(500000);
		pensionerDetail.setAllowances(12000);
		pensionerDetail.setBankDetail(new BankDetail("HDFC","35346356456457", "private" ));
		assertThat(assertThat(pensionerDetail).isNotNull());
	}
	
	@Test
	public void getterPensionDetailTest()
	{
		PensionerDetail pensionDetail=new PensionerDetail("19183857573", "Professor","06-11-1999" , "PIYTH7890L",40000,12000, "family", new BankDetail("SBI", "1930232384", "public"));
		String adhaar = pensionDetail.getAadhaarNumber() ;
		assertEquals("19183857573", adhaar) ;
		assertEquals("Professor", pensionDetail.getName() ) ;
		assertEquals("06-11-1999", pensionDetail.getDateOfBirth() ) ;
		assertEquals("PIYTH7890L", pensionDetail.getPan() ) ;
		assertEquals(40000, pensionDetail.getSalaryEarned()) ;
		assertEquals(12000, pensionDetail.getAllowances()) ;
		assertEquals("family", pensionDetail.getPensionType()) ;

	}
	 
	
}
