package com.ramkishore.pensionmanagement.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


import com.ramkishore.pensionmanagement.model.AuthRequest;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class AuthRequestTest {

	@Test
	public void beanCreationTest() {
		assertNotNull(new AuthRequest());
	}

	@Test
	public void noArgsConstructorTest() {
		AuthRequest authRequest = new AuthRequest();
		assertNotNull(authRequest);
	}

	@Test
	public void AllArgsConstructorTest() {
		AuthRequest authRequest = new AuthRequest("Iftak", "password1");
		assertNotNull(authRequest);
	}

	@Test
	public void settersTest() {
		AuthRequest authRequest = new AuthRequest();
		authRequest.setPassword("fwrgeqhte");
		authRequest.setUsername("Pratyush");
		assertNotNull(authRequest);
	}

	@Test
	public void gettersTest() {
		AuthRequest authRequest = new AuthRequest("Iftak", "password1");
		assertEquals("Iftak", authRequest.getUsername());
		assertEquals("password1", authRequest.getPassword());
	}

}
