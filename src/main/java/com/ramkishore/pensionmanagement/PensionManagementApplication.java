package com.ramkishore.pensionmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PensionManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(PensionManagementApplication.class, args);
	}

}
